import javax.swing.JOptionPane;
public class Admin
{ 
public void adminuser()
{
        String input=JOptionPane.showInputDialog(null,"�n�W�[���ѦW","��J",0);
        String input1=JOptionPane.showInputDialog(null,"�Ѫ��@�̦W��","��J",0);
        Book adminfunc=new book(input,input1);
        JOptionPane.showMessageDialog
        (null,"�ثe�]�æ�:"+"\n"+adminfunc.admingetbbokname(),"��X",0);
}
public void adminuser1()
{
    String input3=JOptionPane.showInputDialog(null,"�n�����Ѫ��ƶq(�п�J���ԧB�Ʀr)","��J",0);//�@�w�n��J���ԧB�Ʀr
    String input2=JOptionPane.showInputDialog(null,"�n�������ѦW","��J",0);
    String input5=JOptionPane.showInputDialog(null,"�n�������Ѫ��@�̩m�W","��J",0);
    double input4=Double.parseDouble(input3);
    Book adminfunc1=new book(input4,input5,input2);
    JOptionPane.showMessageDialog(null,"�ثe�]�æ�"+"\n","��X",0);//������



}
}
