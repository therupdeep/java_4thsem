//Polio Drops 

/*Question:-
Define class baby with attributes:-
a. Name  b. Date of birth  c. Polio Drops Date(45 days from date of birth)

Constructor must find out the polio drops date from date of birth. 
Also in main program define a baby and display its result. */

import java.util.Scanner;
class baby
{
	String name;
	int dd,mm,yy,ddp,mmp,yyp;
	baby(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;

		// Date = 15
		if((dd+45)%30==0)
		{
			ddp=(dd+45)-30;
			mmp=mm+1;
		}

		//For all other dates
		else 
		{
			ddp=(dd+45)%30;
			mmp=mm+(dd+45)/30;
		}

		//For 16 Nov Onwards Polio Date falls in new year
		if(mmp>12)
		{
			mmp=mmp%12;
			yyp=yy+1;
		}

		//For all other dates
		else yyp=yy;
	}
	void display()
	{
		System.out.println("Date of birth : "+dd+"/"+mm+"/"+yy);
		System.out.println("Polio drops date : "+ddp+"/"+mmp+"/"+yyp);
	}
}
class driver
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter date of birth in dd,mm,yyyy format");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		baby b1=new baby(d,m,y);
		b1.display();
	}
}