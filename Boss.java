import javax.swing.*;

public class Boss extends Admin
{
	
	public boolean checkAccount(int account)   //�ˬd���b���O���O�w�]��Boss�b���A�^��true&false
	{
		if(account==0001)
			{return true;}
		else
			{return false;}
	}
	
	public boolean checkPassword(int password) //�ˬd���K�X�O���O������Boss�K�X�A�^��true&false
	{
		//����
		{return true;}
		
		//return false;
	}
	
	public void Rest()        //�ϥ�JOptionPane�ӱ���\��A������u�O�_��(?)
	{
		Employee.signal_rest=1;
		UserClass.EnterUser();
	}
	
	public void Salary()      //�ϥ�JOptionPane�ӱ���\��A������u�~��
	{
		Employee.bonus=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J���u���[�~�T��","�[�~�t��"));
		UserClass.EnterUser();
	}
	
}
