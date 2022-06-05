import javax.swing.JOptionPane;
public class Admin
{ 
public void adminuser()
{
        String input=JOptionPane.showInputDialog(null,"要增加的書名","輸入",0);
        String input1=JOptionPane.showInputDialog(null,"書的作者名稱","輸入",0);
        Book adminfunc=new book(input,input1);
        JOptionPane.showMessageDialog
        (null,"目前館藏有:"+"\n"+adminfunc.admingetbbokname(),"輸出",0);
}
public void adminuser1()
{
    String input3=JOptionPane.showInputDialog(null,"要移除書的數量(請輸入阿拉伯數字)","輸入",0);//一定要輸入阿拉伯數字
    String input2=JOptionPane.showInputDialog(null,"要移除的書名","輸入",0);
    String input5=JOptionPane.showInputDialog(null,"要移除的書的作者姓名","輸入",0);
    double input4=Double.parseDouble(input3);
    Book adminfunc1=new book(input4,input5,input2);
    JOptionPane.showMessageDialog(null,"目前館藏有"+"\n","輸出",0);//未打完



}
}
