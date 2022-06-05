public class Staff_1 extends Member_1
{
    Staff_1 [] store_staff=new Staff_1 [20];
	
	public Staff_1(String name,int password,String identity)
	{
		super(name,password,identity);
		
		setStaffArray();
		setBorrowedbook();
	}
	
	public void setBorrowedbook()
	{
		
	}
	
	public void setStaffArray()
	{
		for(int i=0;i<=19;i++)
		{
			if(store_staff[i]==null)
			{
			  
			}
		}
	}
}
