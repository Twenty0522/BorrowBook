import javax.swing.*;      //note:�i�H�H����c��ArrayList;             
                                        
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
	
		String option1[]={"�޲z��","�ɾ\��"};
	
		String option2_1[]={"�]��","�]��"};
		String option3_1[]={"�M�w�O�_���]","������u���~","�����y��T"};
		String option3_2[]={"�d�ݤ��~","�d�ݤ���Z��","�����y��T"};
		String option3_3[]={"���U���|��","�ϥάd�ѥ\��"};

		String option2_2[]={"�H�|�������n�J","�H�D�|�������n�J"};
		String option3_4[]={"�ǥ�","�Юv","¾��"};
		String option4_1[]={"�d�ݭӤH���","�d�ݭ��ٮѬ���","�ٮ�","�ɮ�"};
	
		Admin a;
		Boss boss=new Boss();
		Employee emp=new Employee();
		User user=new User();
	
		operation1=JOptionPane.showOptionDialog(null,"�w��Ө�Ϯ��]���٨t�ΡA�аݧA�O�ɾ\�̩κ޲z��","���j�Ϯ��]���٨t��",1,1,null,option1,null);
		//��ܨϥΪ̨���
		if(operation1==0)  //�i�J�޲z��
		{
			operation2=JOptionPane.showOptionDialog(null,"�аݧA�O�]���٬O�]��","�����T�{",1,1,null,option2_1,null);
			if(operation2==0)  //�i�J�]��
			{
				do
				{
					account_boss=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�]���b��","�]������I"));
					a=new Boss();
					if(a.checkAccount(account_boss)==true)  //�Q��boss����k�ˬd�b��:True
					{
						password_boss=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�K�X","�]������II"));
					
						if(a.checkPassword(password_boss)==true)  //�����ⶥ�q����! �i�J�]��
						{
							operation3=JOptionPane.showOptionDialog(null,"�]���z�n�A���I���A�n�ϥΪ��\��","�]���t��",1,1,null,option3_1,null);
							//�]���i�J�\��ﶵ
							if(operation3==0)     //�ϥΥ\��:�O�_���]						    
								{boss.Rest();}
							if(operation3==1)     //�ϥΥ\��:������~
								{boss.Salary();}
							if(operation3==2)     //�ϥΥ\��:�����y
								{boss.setBook();}
						}
					}
			
					if(a.checkAccount(account_boss)==false) //�Q��boss����k�ˬd�b��:False
					{JOptionPane.showMessageDialog(null,"���b�����O�]���b��! �ЦA��@��");}
				}while(a.checkAccount(account_boss)==false);  //��J���~�b����i�H���ƿ�J
			}
		
			if(operation2==1)  //�i�J�]��
			{
				do
				{
					account_employee=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�]���b��","�]������I"));
					a=new Employee();
					if(a.checkAccount(account_employee)==true)  //�Q��employee����k�ˬd�O�_�����b��:True
					{
						password_employee=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�K�X","�]������II"));
					
						if(a.checkPassword(password_employee)==true)  //�T�{�b���������K�X�ۦP�A�����ⶥ�q����! �i�J�]��
						{
							operation3=JOptionPane.showOptionDialog(null,"�аݤ��ѭn�ϥάƻ�\��O?","�]���t��",1,1,null,option3_2,null);
							//�]���i�J�\��ﶵ
							if(operation3==0)     //�ϥΥ\��:�d�ݤ��~					    
								{emp.checkSalary();}
							if(operation3==1)     //�ϥΥ\��:�d�ݤ���Z��
								{emp.checkWork();}
							if(operation3==2)     //�ϥΥ\��:�����y
								{emp.setBook();}
						}
					}
			
					if(a.checkAccount(account_employee)==false) //�Q��employee����k�ˬd�b��:False
					{JOptionPane.showMessageDialog(null,"���b�����O�]���b��! �ЦA��@��");}
				}while(a.checkAccount(account_employee)==false);  //��J���~�b����i�H���ƿ�J
			}
		}
	
		if(operation1==1)  //�i�J�ɾ\��
		{
			operation2=JOptionPane.showOptionDialog(null,"�˷R���Τ�z�n�A�аݱz�O�|����?","�ϥΪ̨t��",1,1,null,option2_2,null);
			if(operation2==0)        //��ܡy�|���z����
			{
				operation3=JOptionPane.showOptionDialog(null,"�˷R���|���z�n�A�аݧA�n�n�J����������?","�|���t��",1,1,null,option3_4,null);
				switch(operation3)   
				{
				case 0:  //��ܡy�ǥ͡z�����n�J
					do
					{
						account_student=JOptionPane.showInputDialog(null,"�п�J�ǥͷ|���b��","�|���w�w�ǥ�����I");
						if(Student.checkName(account_student)==true)  //�Q��student����k�ˬd�O�_�����b��:True
						{
							password_student=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�K�X","�|���w�w�ǥ�����II"));
							if(Student.checkPassword(password_student)==true)  //�T�{�b���������K�X�ۦP�A�����ⶥ�q����! �i�J�ǥͨt��
							{
								for(int i=0;i<Student.store_student.length;i++)
								{
									if(account_student==Student.store_student[i].username)
									{
										int u=i;
									}
								}
								operation4=JOptionPane.showOptionDialog(null,"�P�Ǳz�n�A���I���A�n�ϥΪ��\��","(�|��)�ǥͨt��",1,1,null,option4_1,null);
								//�ǥͶi�J�\��ﶵ
								switch(operation4)
								{
								case 0:  //�ϥΥ\��:�d�ݭӸ�
									Student.store_student[u].checkPersonalInfo();
									break;
								case 1:  //�ϥΥ\��:�d���ٮѬ���
									//Student.store_student[u].
									break;
								case 2:  //�ϥΥ\��:�ٮ�
								
									break;
								case 3:  //�ϥΥ\��:�ɮ�
								
									break;
								}
							
							}
						}
						if(Student.checkName(account_student)==false)  //�Q��student����k�ˬd�O�_�����b��:false
	                    	{JOptionPane.showMessageDialog(null,"���b�����s�b! �ЦA��@��");}       
					}while(Student.checkName(account_student)==false);
				case 1:  //��ܡy�Юv�z�����n�J
					do
					{
						account_teacher=JOptionPane.showInputDialog(null,"�п�J�Юv�|���b��","�|���w�w�Юv����I");
						if(Teacher_1.checkName(account_teacher)==true)  //�Q��teacher����k�ˬd�O�_�����b��:True
						{
							password_teacher=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�K�X","�|���w�w�Юv����II"));
							if(Teacher_1.checkPassword(password_teacher)==true)  //�T�{�b���������K�X�ۦP�A�����ⶥ�q����! �i�J�Юv�t��
							{
								operation4=JOptionPane.showOptionDialog(null,"�Ѯv�z�n�A���I���A�n�ϥΪ��\��","(�|��)�Юv�t��",1,1,null,option4_1,null);
								//�Ѯv�i�J�\��ﶵ
								switch(operation4)
								{
								case 0:  //�ϥΥ\��:�d�ݭӸ�
							
									break;
								case 1:  //�ϥΥ\��:�d���ٮѬ���
							
									break;
								case 2:  //�ϥΥ\��:�ٮ�
							
									break;
								case 3:  //�ϥΥ\��:�ɮ�
							
									break;
								}
							}
						}
						if(Teacher_1.checkName(account_teacher)==false)  //�Q��teacher����k�ˬd�O�_�����b��:false
						{JOptionPane.showMessageDialog(null,"���b�����s�b! �ЦA��@��");}	
					}while(Student.checkName(account_teacher)==false);
				case 2:  //��ܡy¾���z�����n�J
					do
					{
						account_staff=JOptionPane.showInputDialog(null,"�п�J¾���|���b��","�|���w�w¾������I");
						if(Staff_1.checkName(account_staff)==true)  //�Q��staff����k�ˬd�O�_�����b��:True
						{
							password_staff=Integer.parseInt(JOptionPane.showInputDialog(null,"�п�J�K�X","�|���w�w¾������II"));
							if(Staff_1.checkPassword(password_staff)==true)  //�T�{�b���������K�X�ۦP�A�����ⶥ�q����! �i�J¾���t��
							{
								operation4=JOptionPane.showOptionDialog(null,"¾���z�n�A���I���A�n�ϥΪ��\��","(�|��)�Юv�t��",1,1,null,option4_1,null);
								//¾���i�J�\��ﶵ
								switch(operation4)
								{
								case 0:  //�ϥΥ\��:�d�ݭӸ�
								
									break;
								case 1:  //�ϥΥ\��:�d���ٮѬ���
								
									break;
								case 2:  //�ϥΥ\��:�ٮ�
								
									break;
								case 3:  //�ϥΥ\��:�ɮ�
								
									break;
								}
							}
						}
						if(Staff_1.checkName(account_staff)==false)  //�Q��staff����k�ˬd�O�_�����b��:false
		            		{JOptionPane.showMessageDialog(null,"���b�����s�b! �ЦA��@��");}	
					}while(Staff_1.checkName(account_staff)==false);
				}
			}
	
			if(operation2==1)  //��ܡy�D�|���z����
			{
				operation3=JOptionPane.showOptionDialog(null,"�аݭn���U���|���Ψϥάd�ѥ\��?","�D�|������",1,1,null,option3_3,null);
				if(operation3==0)  //�i�J���U�t��
				{
					username_newAccount=JOptionPane.showInputDialog(null,"��J�ϥΪ̦W��","���U�t��I");
					password_newAccount=Integer.parseInt(JOptionPane.showInputDialog(null,"��J�z�n���K�X","���U�t��II"));
					operation4=JOptionPane.showOptionDialog(null,"�аݧA�O���ب���?","���U�t��III",1,1,null,option3_4,null);
					switch(operation4)  //�N���P�������H�жi���P�������
					{
					case 0:  
						Student stu=new Student(username_newAccount,password_newAccount,"�ǥ�");
						Student.storeStudent(stu);
						break;
					case 1:
						Teacher_1 teacher=new Teacher_1(username_newAccount,password_newAccount,"�Юv");
						Teacher_1.storeTeacher(teacher);
						break;
					case 2:
						Staff_1 staff=new Staff_1(username_newAccount,password_newAccount,"¾��");
						Staff_1.storeStaff(staff);
						break;
					}
				}
				if(operation3==1)  //�i�J�d�Ѩt��
				{
					user.Search();
				}
			}
		}
	}
}

