import javax.swing.*;      //note:可以以物件構成ArrayList;             
                                        
public class UserClass
{
	public static void main(String[] args) 
	{
		EnterUser();
	}


	public static void EnterUser()
	{
		int operation1,operation2,operation3,operation4;
		int account_boss,account_employee;
		String account_student,account_teacher,account_staff;
		int password_boss,password_employee,password_student,password_teacher,password_staff;
	
		String username_newAccount;
		int password_newAccount;
	
		String option1[]={"管理員","借閱者"};
	
		String option2_1[]={"館長","館員"};
		String option3_1[]={"決定是否休館","控制員工月薪","更改書籍資訊"};
		String option3_2[]={"查看月薪","查看今日班表","更改書籍資訊"};
		String option3_3[]={"註冊成會員","使用查書功能"};

		String option2_2[]={"以會員身分登入","以非會員身分登入"};
		String option3_4[]={"學生","教師","職員"};
		String option4_1[]={"查看個人資料","查看借還書紀錄","還書","借書"};
	
		Admin a;
		Boss boss=new Boss();
		Employee emp=new Employee();
		User user=new User();
	
		operation1=JOptionPane.showOptionDialog(null,"歡迎來到圖書館借還系統，請問你是借閱者或管理員","中大圖書館借還系統",1,1,null,option1,null);
		//選擇使用者身分
		if(operation1==0)  //進入管理員
		{
			operation2=JOptionPane.showOptionDialog(null,"請問你是館長還是館員","身分確認",1,1,null,option2_1,null);
			if(operation2==0)  //進入館長
			{
				do
				{
					account_boss=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入館長帳號","館長驗證I"));
					a=new Boss();
					if(a.checkAccount(account_boss)==true)  //利用boss內方法檢查帳號:True
					{
						password_boss=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入密碼","館長驗證II"));
					
						if(a.checkPassword(password_boss)==true)  //完成兩階段驗證! 進入館長
						{
							operation3=JOptionPane.showOptionDialog(null,"館長您好，請點擊你要使用的功能","館長系統",1,1,null,option3_1,null);
							//館長進入功能選項
							if(operation3==0)     //使用功能:是否休館						    
								{boss.Rest();}
							if(operation3==1)     //使用功能:控制月薪
								{boss.Salary();}
							if(operation3==2)     //使用功能:更改書籍
								{boss.setBook();}
						}
					}
			
					if(a.checkAccount(account_boss)==false) //利用boss內方法檢查帳號:False
					{JOptionPane.showMessageDialog(null,"此帳號不是館長帳號! 請再輸一次");}
				}while(a.checkAccount(account_boss)==false);  //輸入錯誤帳號後可以重複輸入
			}
		
			if(operation2==1)  //進入館員
			{
				do
				{
					account_employee=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入館員帳號","館員驗證I"));
					a=new Employee();
					if(a.checkAccount(account_employee)==true)  //利用employee內方法檢查是否有此帳號:True
					{
						password_employee=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入密碼","館員驗證II"));
					
						if(a.checkPassword(password_employee)==true)  //確認帳號對應的密碼相同，完成兩階段驗證! 進入館員
						{
							operation3=JOptionPane.showOptionDialog(null,"請問今天要使用甚麼功能呢?","館員系統",1,1,null,option3_2,null);
							//館員進入功能選項
							if(operation3==0)     //使用功能:查看月薪					    
								{emp.checkSalary();}
							if(operation3==1)     //使用功能:查看今日班表
								{emp.checkWork();}
							if(operation3==2)     //使用功能:更改書籍
								{emp.setBook();}
						}
					}
			
					if(a.checkAccount(account_employee)==false) //利用employee內方法檢查帳號:False
					{JOptionPane.showMessageDialog(null,"此帳號不是館長帳號! 請再輸一次");}
				}while(a.checkAccount(account_employee)==false);  //輸入錯誤帳號後可以重複輸入
			}
		}
	
		if(operation1==1)  //進入借閱者
		{
			operation2=JOptionPane.showOptionDialog(null,"親愛的用戶您好，請問您是會員嗎?","使用者系統",1,1,null,option2_2,null);
			if(operation2==0)        //選擇『會員』身分
			{
				operation3=JOptionPane.showOptionDialog(null,"親愛的會員您好，請問你要登入的身分為何?","會員系統",1,1,null,option3_4,null);
				switch(operation3)   
				{
				case 0:  //選擇『學生』身分登入
					do
					{
						account_student=JOptionPane.showInputDialog(null,"請輸入學生會員帳號","會員──學生驗證I");
						if(Student.checkName(account_student)==true)  //利用student內方法檢查是否有此帳號:True
						{
							password_student=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入密碼","會員──學生驗證II"));
							if(Student.checkPassword(password_student)==true)  //確認帳號對應的密碼相同，完成兩階段驗證! 進入學生系統
							{
								for(int i=0;i<Student.store_student.length;i++)
								{
									if(account_student==Student.store_student[i].username)
									{
										int u=i;
									}
								}
								operation4=JOptionPane.showOptionDialog(null,"同學您好，請點擊你要使用的功能","(會員)學生系統",1,1,null,option4_1,null);
								//學生進入功能選項
								switch(operation4)
								{
								case 0:  //使用功能:查看個資
									Student.store_student[u].checkPersonalInfo();
									break;
								case 1:  //使用功能:查看還書紀錄
									//Student.store_student[u].
									break;
								case 2:  //使用功能:還書
								
									break;
								case 3:  //使用功能:借書
								
									break;
								}
							
							}
						}
						if(Student.checkName(account_student)==false)  //利用student內方法檢查是否有此帳號:false
	                    	{JOptionPane.showMessageDialog(null,"此帳號不存在! 請再輸一次");}       
					}while(Student.checkName(account_student)==false);
				case 1:  //選擇『教師』身分登入
					do
					{
						account_teacher=JOptionPane.showInputDialog(null,"請輸入教師會員帳號","會員──教師驗證I");
						if(Teacher_1.checkName(account_teacher)==true)  //利用teacher內方法檢查是否有此帳號:True
						{
							password_teacher=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入密碼","會員──教師驗證II"));
							if(Teacher_1.checkPassword(password_teacher)==true)  //確認帳號對應的密碼相同，完成兩階段驗證! 進入教師系統
							{
								operation4=JOptionPane.showOptionDialog(null,"老師您好，請點擊你要使用的功能","(會員)教師系統",1,1,null,option4_1,null);
								//老師進入功能選項
								switch(operation4)
								{
								case 0:  //使用功能:查看個資
							
									break;
								case 1:  //使用功能:查看還書紀錄
							
									break;
								case 2:  //使用功能:還書
							
									break;
								case 3:  //使用功能:借書
							
									break;
								}
							}
						}
						if(Teacher_1.checkName(account_teacher)==false)  //利用teacher內方法檢查是否有此帳號:false
						{JOptionPane.showMessageDialog(null,"此帳號不存在! 請再輸一次");}	
					}while(Student.checkName(account_teacher)==false);
				case 2:  //選擇『職員』身分登入
					do
					{
						account_staff=JOptionPane.showInputDialog(null,"請輸入職員會員帳號","會員──職員驗證I");
						if(Staff_1.checkName(account_staff)==true)  //利用staff內方法檢查是否有此帳號:True
						{
							password_staff=Integer.parseInt(JOptionPane.showInputDialog(null,"請輸入密碼","會員──職員驗證II"));
							if(Staff_1.checkPassword(password_staff)==true)  //確認帳號對應的密碼相同，完成兩階段驗證! 進入職員系統
							{
								operation4=JOptionPane.showOptionDialog(null,"職員您好，請點擊你要使用的功能","(會員)教師系統",1,1,null,option4_1,null);
								//職員進入功能選項
								switch(operation4)
								{
								case 0:  //使用功能:查看個資
								
									break;
								case 1:  //使用功能:查看還書紀錄
								
									break;
								case 2:  //使用功能:還書
								
									break;
								case 3:  //使用功能:借書
								
									break;
								}
							}
						}
						if(Staff_1.checkName(account_staff)==false)  //利用staff內方法檢查是否有此帳號:false
		            		{JOptionPane.showMessageDialog(null,"此帳號不存在! 請再輸一次");}	
					}while(Staff_1.checkName(account_staff)==false);
				}
			}
	
			if(operation2==1)  //選擇『非會員』身分
			{
				operation3=JOptionPane.showOptionDialog(null,"請問要註冊成會員或使用查書功能?","非會員介面",1,1,null,option3_3,null);
				if(operation3==0)  //進入註冊系統
				{
					username_newAccount=JOptionPane.showInputDialog(null,"輸入使用者名稱","註冊系統I");
					password_newAccount=Integer.parseInt(JOptionPane.showInputDialog(null,"輸入您要的密碼","註冊系統II"));
					operation4=JOptionPane.showOptionDialog(null,"請問你是哪種身分?","註冊系統III",1,1,null,option3_4,null);
					switch(operation4)  //將不同身分的人創進不同的物件裡
					{
					case 0:  
						Student stu=new Student(username_newAccount,password_newAccount,"學生");
						Student.storeStudent(stu);
						break;
					case 1:
						Teacher_1 teacher=new Teacher_1(username_newAccount,password_newAccount,"教師");
						Teacher_1.storeTeacher(teacher);
						break;
					case 2:
						Staff_1 staff=new Staff_1(username_newAccount,password_newAccount,"職員");
						Staff_1.storeStaff(staff);
						break;
					}
				}
				if(operation3==1)  //進入查書系統
				{
					user.Search();
				}
			}
		}
	}
}

