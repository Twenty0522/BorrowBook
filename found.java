
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class found 
{
    public ArrayList<String> b =new ArrayList<String>();//�|���W�r���}�C
    public ArrayList<Integer> e =new ArrayList<Integer>();//�K�X���}�C
    public ArrayList<String> h =new ArrayList<String>();//¾�~���}�C
    int password3;
    public void founduser()
    {
        String membercareeString[]={"�ǥ�","�Юv","¾��","����"};
        String username=JOptionPane.showInputDialog(null,"�إߨϥΪ̦W��","Input",1);
        String password=JOptionPane.showInputDialog(null,"�إ߱K�X","Input",1);
        
        password3=Integer.parseInt(password);
        
        Member_1(username,password,"�ǥ�");
        
        int input=JOptionPane.showOptionDialog(null, "�A�O���@���O���H�H", "���",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, membercareeString,membercareeString[0]);
        if(password!=null)
        {
            b.add(username);
            e.add(password3);
            switch(input)
            {
                case 0:
                h.add("�ǥ�");
                break;
                case 1:
                h.add("�Юv");
                break;
                case 2:
                h.add("¾��");
                break;
                case 3:
                h.add("����");
                break;
            }
            JOptionPane.showMessageDialog(null,username+"�}�l�ϥιϮ��]�ɮѨt�Υ\��", "Output", 0);
        }
    }
}//////////found