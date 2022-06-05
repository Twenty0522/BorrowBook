import javax.swing.*;

public class Boss extends Admin
{
	
	public boolean checkAccount(int account)   //檢查此帳號是不是預設的Boss帳號，回傳true&false
	{
		if(account==0001)
			{return true;}
		else
			{return false;}
	}
	
	public boolean checkPassword(int password) //檢查此密碼是不是對應的Boss密碼，回傳true&false
	{
		//未完
		{return true;}
		
		//return false;
	}
	
	public void Rest()        //使用JOptionPane來接續功能，控制員工是否休假(?)
	{
		Employee.signal_rest=1;
		UserClass.EnterUser();
	}
	
	public void Salary()      //使用JOptionPane來接續功能，控制員工薪水
	{
		Employee.bonus=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入員工的加薪幅度","加薪系統"));
		UserClass.EnterUser();
	}
	
}
