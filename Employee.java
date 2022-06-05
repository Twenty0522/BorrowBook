import javax.swing.JOptionPane;

public class Employee extends Admin
{
	public static int signal_rest=0;
	private int salary=30000;
	public static int bonus=0;
	
	public void checkSalary()  //利用JOptionPane來接續程式，員工可以查看自身的薪水
	{
		
	}
	
	public void checkWork()    //利用JOptionPane來接續程式，讓員工可以檢查自身班表
	{
		if(signal_rest==1)
		{
			JOptionPane.showMessageDialog(null,"今天不上班!,假期愉快~");
		}
		if(signal_rest==0)
		{
			JOptionPane.showMessageDialog(null,"今天的工作為維護與校對書籍!");
			Employee.setBook();
		}
	}
	
	public boolean checkAccount(int account)    //檢查此帳號是不是預設的Employee帳號(多個)，回傳true&false
	{
		//未完
		return true;
	}
	
	public boolean checkPassword(int password)  //檢查此密碼是不是對應的Employee密碼，回傳true&false
	{
		//未完
		return true;
	}
}
