public class Teacher_1 extends Member_1
{
	Teacher_1 [] store_teacher=new Teacher_1 [20];
	
	public Teacher_1(String name,int password,String identity)
	{
		super(name,password,identity);
		
		setTeacherArray();
		setBorrowedbook();
	}
	
	public void setBorrowedbook()
	{
		
	}
	
	public void setTeacherArray()
	{
		for(int i=0;i<=19;i++)
		{
			if(store_teacher[i]==null)
			{
			  
			}
		}
	}
}
