public class Member_1
{
	public static String username;
	public static int  password;
	public static String identity;
	
	//Member_1 [] store_member =new Member_1 [20];
    	
    public Member_1(String name,int password,String identity)
    {
    	setName(name);
    	setPassword(password);
    	setIdentity(identity);
    }
    
    public void setName(String name)
    {
    	username=name;
    }
    
    public String getName()
    {
    	return username;
    }
    
    public void setPassword(int pass)
    {
    	password=pass;
    }
    
    public int getPassword()
    {
    	return password;
    }
    
    public void setIdentity(String iden)
    {
    	identity=iden;
    }
    
    public static boolean checkAccount(int account)   //檢查此帳號是不是對應類別的帳號，回傳true&false
	{
		//未完...
		{return true;}
		
		//return false;
	}
	
	public static boolean checkPassword(int password) //檢查此密碼是不是對應類別的密碼，回傳true&false
	{
		//未完...
		{return true;}
		
		//return false;
	}
	
	public static String checkPersonalInfo()
	{
		String output="";
		//未完...
		
		return output;
	}
    
    public String getIdentity()
    {
    	return identity;
    }
}