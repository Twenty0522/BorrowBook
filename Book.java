import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Book
{
Book[] book1=new Book[5];
public ArrayList<String> oldbook=new ArrayList<String>()
{
    {
        add("Java課本");
        add("管數課本");
        add("英文課本");
        add("國文課本");
        add("體育課本");
    }
};
public ArrayList<String> writters=new ArrayList<String>()
{
    {
        add("吳柏毅");
        add("吳昀蓁");
        add("林俊廷");
        add("屠安弟");
        add("陳重言");
    }
};
public ArrayList<String> onthedesks=new ArrayList<String>()
{
    {
        add("有");
        add("無");
        add("有");
        add("無");
        add("有");
    }
};
public ArrayList<String> Searchbooks=new ArrayList<String>();//此陣列用來存放會員要查找的書籍名稱比傳入名稱多了一個s
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

public void book(String bookname,String bookwritter)//管理員新增書的建構子
{ 
    setbookname(bookname);
    setbookwritter(bookwritter);
    //setonthedesk(onthedesk);

}
public void book(Double removebooknumber ,String removebookname ,String removebookwritter)//管理員刪除書籍的建構子
{
    setremovebooknumber(removebooknumber);
    setremovebookname(removebookname);
    setremovebookwritter(removebookwritter);
}
public void book(String Searchbookname)//會員借書的建構子(從書名找)
{
    setSearchbookname(Searchbookname);
}
public void book(String returnbook,int overdue)//還書的建構子
{
    setreturnbook(returnbook);
    setoverdue(overdue);
}
public void book(int booknumber,ArrayList<String> bookname1)//搜尋書的建構子
{
    setbooknumber(booknumber);
    setbookname1(bookname1);
}
public void book(int overdate)//罰款建構子
{
    setoverdate(overdate);
}
public void setbookname(String bookname)//管理員新增書籍的地方
{
    oldbook.add(bookname);
    this.bookname=bookname;
}
public String getbookname()
{
    int index0;
    index0=oldbook.indexOf(this.bookname);
//Searchbook//Searchbook是拿來存放使用者要找的書
//b是布林值只有true跟false
    return oldbook.get(index0);//回傳新增什麼書
}
public void setremovebookname(String removebookname)//管理員刪除書籍的地方
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
public void setremovebookwritter(String removebookwritter)//刪除書籍的作者的地方
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

public void setbookwritter(String bookwritter)//管理員新增書的作者
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
    }//作者陣列暫時不會用到
    return output1;
}
public void setSearchbookname(String Searchbookname)//給會員借書的地方
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
public void setreturnbook(String returnbook)//還書的地方
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
public void setoverdue(int overdue)//還書時查看有無過期的地方
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
public ArrayList<String> getbookname1()//找書的地方
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
/*public void setonthedesk(String onthedesk)//是否在架上這邊還沒做完
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
        c=Arrays.equals(writters.get(counter2),Searchbookonthedesk);//Searchbook是被管理員拿來找是否在架上
        total2+=1;
        if(c){break;}//b是布林值只有true跟false
    }
    return onthedesks.get(total2);
}*/
