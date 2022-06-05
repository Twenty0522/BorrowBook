public abstract class Admin 
{
	public static void setBook()  //使用JOptionPane來接續功能，將書籍的資料利用showInputDialog來建立物件(難)
	{
		
	}
	
	public abstract boolean checkPassword(int password);  //抽象方法，會交由Boss與Employee進行override
	
	public abstract boolean checkAccount(int account);    //抽象方法，會交由Boss與Employee進行override
	
}
