
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class found 
{
    public ArrayList<String> b =new ArrayList<String>();//會員名字的陣列
    public ArrayList<Integer> e =new ArrayList<Integer>();//密碼的陣列
    public ArrayList<String> h =new ArrayList<String>();//職業的陣列
    int password3;
    public void founduser()
    {
        String membercareeString[]={"學生","教師","職員","民眾"};
        String username=JOptionPane.showInputDialog(null,"建立使用者名稱","Input",1);
        String password=JOptionPane.showInputDialog(null,"建立密碼","Input",1);
        
        password3=Integer.parseInt(password);
        
        Member_1(username,password,"學生");
        
        int input=JOptionPane.showOptionDialog(null, "你是哪一類別的人？", "選擇",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null, membercareeString,membercareeString[0]);
        if(password!=null)
        {
            b.add(username);
            e.add(password3);
            switch(input)
            {
                case 0:
                h.add("學生");
                break;
                case 1:
                h.add("教師");
                break;
                case 2:
                h.add("職員");
                break;
                case 3:
                h.add("民眾");
                break;
            }
            JOptionPane.showMessageDialog(null,username+"開始使用圖書館借書系統功能", "Output", 0);
        }
    }
}//////////found