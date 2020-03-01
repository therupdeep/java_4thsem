import java.util.Scanner;
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
class baby
{
	String name;
	int dd;
	int mm;
	int yyyy;
	int ddp;
	int mmp;
	int yyyyp;
	baby(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yyyy=y;
		int n=(dd+45)/30;
		if((dd+45)%30==0)
		{
			n=1;
			ddp=30;
		}
		else ddp=(dd+45)%30;
		if(mm+n>12)
		{
			mmp=(mm+n)%12;
			yyyyp=yyyy+1;
		}
		else 
		{
			mmp=mm+n;
			yyyyp=yyyy;
		}

		
	}
	void display()
	{
		System.out.println("Date of birth : "+dd+"/"+mm+"/"+yyyy);
		System.out.println("Polio drops date : "+ddp+"/"+mmp+"/"+yyyyp);
	}
}