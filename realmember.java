import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public  class realmember 
{
    public void function()
    {
        
        String option[]={"�ɮ�","�ٮ�","�d��"};
        String option1[]={"�@��","�⥻","�T��"};
        int input=JOptionPane.showOptionDialog(null, "��ܤ@���\��","��J", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, option,option[0]);
        switch(input)
        {
            case 0://�ɮ�
            String input1=JOptionPane.showInputDialog(null,"�аݭn�ɭ�����","��J",0);
            String input2=JOptionPane.showInputDialog(null,"�Ѫ��@�̬O��","��J",0);//�����@�ӱq�ѦW��q�@�̧䤧��A��
            book func=new book(input1);
            if(func.getSearchbbookname()!=null)
            {
                JOptionPane.showMessageDialog(null,"�ɮѦ��\!","��X",0);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"�䤣�즹��","��X",0);
            }
            break;
            case 1://�ٮ�
            String output[]={"�O","�_"};
            String input3=JOptionPane.showInputDialog(null,"�аݭn�٭�����","��J",0);
            String input4=JOptionPane.showInputDialog(null, "�ѧ@�̬O��","��J",0);//����A��
            int question=JOptionPane.showOptionDialog(null,"�O�_�L��","��J", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,output,output[0]);
            book func1=new book(input3,question);
            if(func1.getreturnbook()!=null)
            {
                JOptionPane.showMessageDialog(null,"�����ٮѦ��\�A�٪��ѬO"+func1.getreturnbook(),"��X",0);
            }
            if(question==0){}//�@��������F�赹�d��㸸�Ϧw�̥�
            else{}//�٨S����
            break;
            case 2://�j�M��
            ArrayList<String>input8=new ArrayList<String>();
            String input6=JOptionPane.showInputDialog(null, "�ѧ@�̬O��","��J",0);//����A��
            int input7=JOptionPane.showOptionDialog(null,"�Q��X����(�̦h�T���ѳ̤֤@����)","��X", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option1, option1[0]);
            for(int counter=0;counter<input7+1;counter++)
            {
                String input5=JOptionPane.showInputDialog(null,"�аݭn�j�M������","��J",0);
                input8.add(input5);
            }
            book func2=new book(input7,input8);            
            JOptionPane.showMessageDialog(null, "�A�n�䪺�ѬO"+func2.getbookname1(),"��X",0);
            break;
        }
    }
}
