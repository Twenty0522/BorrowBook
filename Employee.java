import javax.swing.JOptionPane;

public class Employee extends Admin
{
	public static int signal_rest=0;
	private int salary=30000;
	public static int bonus=0;
	
	public void checkSalary()  //�Q��JOptionPane�ӱ���{���A���u�i�H�d�ݦۨ����~��
	{
		
	}
	
	public void checkWork()    //�Q��JOptionPane�ӱ���{���A�����u�i�H�ˬd�ۨ��Z��
	{
		if(signal_rest==1)
		{
			JOptionPane.showMessageDialog(null,"���Ѥ��W�Z!,�����r��~");
		}
		if(signal_rest==0)
		{
			JOptionPane.showMessageDialog(null,"���Ѫ��u�@�����@�P�չ���y!");
			Employee.setBook();
		}
	}
	
	public boolean checkAccount(int account)    //�ˬd���b���O���O�w�]��Employee�b��(�h��)�A�^��true&false
	{
		//����
		return true;
	}
	
	public boolean checkPassword(int password)  //�ˬd���K�X�O���O������Employee�K�X�A�^��true&false
	{
		//����
		return true;
	}
}
