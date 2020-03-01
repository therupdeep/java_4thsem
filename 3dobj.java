//box: area: 2(lb+bh+lh), vol: lbh
//cube: area: 6a^2, vol: a^3
//cylinder: area: 2pi*r*h+2pi*r^2, vol: pi*r^2*h
//cone: area: pi*r*(r+sqrt(h^2+r^2)),vol: 1/3pi*r^2*h
import java.lang.Math;
abstract class ThreeDObject
{
	protected double l,b,h,r;
	abstract void wholesurfacearea();
	abstract void volume();
}
class box extends ThreeDObject
{
	box(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	void wholesurfacearea()
	{
		System.out.println("Surface area of Box : "+2*(l*b+b*h+l*h));
	}
	void volume()
	{
		System.out.println("Volume of Box : "+l*b*h);
	}
}
class cube extends ThreeDObject
{
	cube(double r)
	{
		this.r=r;
	}
	void wholesurfacearea()
	{
		System.out.println("Surface area of Cube : "+6*r*r);
	}
	void volume()
	{
		System.out.println("Volume of Cube : "+r*r*r);
	}
}
class cylinder extends ThreeDObject
{
	cylinder(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	void wholesurfacearea()
	{
		System.out.println("Surface area of Cylinder : "+2*3.14*r*(r+h));
	}
	void volume()
	{
		System.out.println("Volume of Cylinder : "+3.14*r*r*h);
	}
}
class cone extends ThreeDObject
{
	cone(double r,double h)
	{
		this.r=r;
		this.h=h;
	}
	void wholesurfacearea()
	{
		System.out.println("Surface area of Cone : "+3.14*r*(r+Math.sqrt(h*h+r*r)));
	}
	void volume()
	{
		System.out.println("Volume of Cone : "+3.14*r*r*h/3.0);
	}
}
class driver
{
	public static void main(String[] args) 
	{
		box b1=new box(2.0,3.0,2.0);
		cube c1=new cube(2.0);
		cylinder c2=new cylinder(2.0,2.0);
		cone c3=new cone(2.0,2.0);
		b1.wholesurfacearea();
		b1.volume();
		System.out.println("");
		c1.wholesurfacearea();
		c1.volume();
		System.out.println("");
		c2.wholesurfacearea();
		c2.volume();
		System.out.println("");
		c3.wholesurfacearea();
		c3.volume();
	}
}