import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Book
{
Book[] book1=new Book[5];
public ArrayList<String> oldbook=new ArrayList<String>()
{
    {
        add("Java�ҥ�");
        add("�޼ƽҥ�");
        add("�^��ҥ�");
        add("���ҥ�");
        add("��|�ҥ�");
    }
};
public ArrayList<String> writters=new ArrayList<String>()
{
    {
        add("�d�f��");
        add("�d���");
        add("�L�T��");
        add("�O�w��");
        add("������");
    }
};
public ArrayList<String> onthedesks=new ArrayList<String>()
{
    {
        add("��");
        add("�L");
        add("��");
        add("�L");
        add("��");
    }
};
public ArrayList<String> Searchbooks=new ArrayList<String>();//���}�C�ΨӦs��|���n�d�䪺���y�W�٤�ǤJ�W�٦h�F�@��s
public String Searchbookname;
public String Searchbookwritter;
public String Searchinthedesk;
public String bookname;
public String bookwritter;
public String onthedesk;
public String returnbook;
public ArrayList<String>bookname1=new ArrayList<String>();
public int overdue;
public int booknumber;
public int overdate;
public int date1=7;
public double removebooknumber;
public String  removebookname;
public String  removebookwritter;
public int counter6=0;

public void book(String bookname,String bookwritter)//�޲z���s�W�Ѫ��غc�l
{ 
    setbookname(bookname);
    setbookwritter(bookwritter);
    //setonthedesk(onthedesk);

}
public void book(Double removebooknumber ,String removebookname ,String removebookwritter)//�޲z���R�����y���غc�l
{
    setremovebooknumber(removebooknumber);
    setremovebookname(removebookname);
    setremovebookwritter(removebookwritter);
}
public void book(String Searchbookname)//�|���ɮѪ��غc�l(�q�ѦW��)
{
    setSearchbookname(Searchbookname);
}
public void book(String returnbook,int overdue)//�ٮѪ��غc�l
{
    setreturnbook(returnbook);
    setoverdue(overdue);
}
public void book(int booknumber,ArrayList<String> bookname1)//�j�M�Ѫ��غc�l
{
    setbooknumber(booknumber);
    setbookname1(bookname1);
}
public void book(int overdate)//�@�ګغc�l
{
    setoverdate(overdate);
}
public void setbookname(String bookname)//�޲z���s�W���y���a��
{
    oldbook.add(bookname);
    this.bookname=bookname;
}
public String getbookname()
{
    int index0;
    index0=oldbook.indexOf(this.bookname);
//Searchbook//Searchbook�O���Ӧs��ϥΪ̭n�䪺��
//b�O���L�ȥu��true��false
    return oldbook.get(index0);//�^�Ƿs�W�����
}
public void setremovebookname(String removebookname)//�޲z���R�����y���a��
{
    boolean d=oldbook.contains(removebookname);
    if(d)
    {
        for( counter6=0;counter6<oldbook.size();counter6++)
        {
            if(oldbook.get(counter6)==removebookname)
            {
                    oldbook.remove(oldbook.get(counter6));
                    break;
            }
        }
    }
    this.removebookname=removebookname;
}
public String getremovebookname()
{
    int index1;
    index1=oldbook.indexOf(this.removebookname);
    return oldbook.get(index1);
}
public void setremovebookwritter(String removebookwritter)//�R�����y���@�̪��a��
{
    writters.remove(removebookwritter);
    this.removebookwritter=removebookwritter;
}
public String getremovebookwritter()
{
    int index2;
    index2=writters.indexOf(this.removebookwritter);
    return writters.get(index2);
}
public void setremovebooknumber(double removebooknumber)
{
    this.removebooknumber=removebooknumber;
}
public double getremovebooknumber()
{
    return this.removebooknumber;
}

public void setbookwritter(String bookwritter)//�޲z���s�W�Ѫ��@��
{
   writters.add(bookwritter);
}
public String getbookwritter()
{
    int index1;
    index1=writters.indexOf(this.bookwritter);
    return writters.get(index1);
}

public String admingetbbokname()
{
        String output0="";
    for(int counter3=0;counter3<oldbook.size();counter3++)
    {
        output0+=oldbook.get(counter3)+" "+writters.get(counter3)+"\n";
    }
    return output0;
}
public String admingetbookwritter()
{
    String output1="";
    for(int counter4=0;counter4<oldbook.size();counter4++)
    {
        output1+=writters.get(counter4)+"\n";
    }//�@�̰}�C�Ȯɤ��|�Ψ�
    return output1;
}
public void setSearchbookname(String Searchbookname)//���|���ɮѪ��a��
{
    Searchbooks.add(Searchbookname);
    this.Searchbookname=Searchbookname;
}
public String getSearchbbookname()
{   
    boolean a=oldbook.contains(this.Searchbookname);
    if(a)
    {
        oldbook.remove(this.Searchbookname);
        return this.Searchbookname;
    }
    else
    {
        return null;
    }
}
public void setreturnbook(String returnbook)//�ٮѪ��a��
{
    this.returnbook=returnbook;
    if(this.returnbook!=null)
    {
        oldbook.add(this.returnbook);
    }
}
public String getreturnbook()
{
    boolean b=oldbook.contains(this.returnbook);
    if(b)
    {
        return this.returnbook;
    }
    else
    {
        return null;
    }

}
public void setoverdue(int overdue)//�ٮѮɬd�ݦ��L�L�����a��
{
    this.overdue=overdue;
}
public int getoverdue()
{
    return overdue;
}
public void setbooknumber(int booknumber)
{
    this.booknumber=booknumber;
}
public int getbooknumber()
{
    return  this.booknumber;
}
public void setbookname1(ArrayList<String> bookname1)
{
    this.bookname1=bookname1;

}
public ArrayList<String> getbookname1()//��Ѫ��a��
{
    ArrayList<String>bookname2=new ArrayList<String>();
    for(int counter5=0;counter5<this.bookname1.size();counter5++)
    {
       boolean d=oldbook.contains(bookname1.get(counter5));
       if(d)
        {
           bookname2.add(bookname1.get(counter5));
        }
    }
    return bookname2;
}
public void setoverdate(int overdate)
{
    this.overdate=overdate;
    Student st=new Student(this.overdate-date1);
}
public int getoverdate()
{
    return this.overdate-date1;
}
}
/*public void setonthedesk(String onthedesk)//�O�_�b�[�W�o���٨S����
{
onthedesks.add(onthedesk);
}
public String getonthedesk()
{
    int y;
    int total2=0;
    boolean c;
    for(int counter2=0;counter2<onthedesks.size();counter2++)
    {
        c=Arrays.equals(writters.get(counter2),Searchbookonthedesk);//Searchbook�O�Q�޲z�����ӧ�O�_�b�[�W
        total2+=1;
        if(c){break;}//b�O���L�ȥu��true��false
    }
    return onthedesks.get(total2);
}*/
