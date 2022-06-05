public class Student extends Member_1
{
	Student [] store_student=new Student [20]; 
	
	public Student(String name,int password,String identity)
	{
		super(name,password,identity);
		
		setStudentArray();
		setBorrowedbook();
	}
	
	public void setBorrowedbook()
	{
		
	}
	
	public void setStudentArray()
	{
		for(int i=0;i<=19;i++)
		{
			if(store_student[i]==null)
			{
			  
			}
		}
	}
}