import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public  class realmember 
{
    public void function()
    {
        
        String option[]={"借書","還書","查書"};
        String option1[]={"一本","兩本","三本"};
        int input=JOptionPane.showOptionDialog(null, "選擇一項功能","輸入", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null, option,option[0]);
        switch(input)
        {
            case 0://借書
            String input1=JOptionPane.showInputDialog(null,"請問要借哪本書","輸入",0);
            String input2=JOptionPane.showInputDialog(null,"書的作者是誰","輸入",0);//先做一個從書名找從作者找之後再做
            book func=new book(input1);
            if(func.getSearchbbookname()!=null)
            {
                JOptionPane.showMessageDialog(null,"借書成功!","輸出",0);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"找不到此書","輸出",0);
            }
            break;
            case 1://還書
            String output[]={"是","否"};
            String input3=JOptionPane.showInputDialog(null,"請問要還哪本書","輸入",0);
            String input4=JOptionPane.showInputDialog(null, "書作者是誰","輸入",0);//之後再補
            int question=JOptionPane.showOptionDialog(null,"是否過期","輸入", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,output,output[0]);
            book func1=new book(input3,question);
            if(func1.getreturnbook()!=null)
            {
                JOptionPane.showMessageDialog(null,"恭喜還書成功你還的書是"+func1.getreturnbook(),"輸出",0);
            }
            if(question==0){}//罰金到期的東西給吳昀蓁跟圖安弟打
            else{}//還沒打完
            break;
            case 2://搜尋書
            ArrayList<String>input8=new ArrayList<String>();
            String input6=JOptionPane.showInputDialog(null, "書作者是誰","輸入",0);//之後再補
            int input7=JOptionPane.showOptionDialog(null,"想找幾本書(最多三本書最少一本書)","輸出", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,option1, option1[0]);
            for(int counter=0;counter<input7+1;counter++)
            {
                String input5=JOptionPane.showInputDialog(null,"請問要搜尋哪本書","輸入",0);
                input8.add(input5);
            }
            book func2=new book(input7,input8);            
            JOptionPane.showMessageDialog(null, "你要找的書是"+func2.getbookname1(),"輸出",0);
            break;
        }
    }
}
