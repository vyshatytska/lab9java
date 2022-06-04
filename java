//Main.cpp

package lab9;
import java.util.Scanner;

import lab9.Body;
import lab9.Parallelepiped;
import lab9.Cylinder;

import java.lang.Math;

public class lab9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Parallelepiped:");
		Body parallelepiped = new Parallelepiped(2, 3, 5);
        System.out.println(parallelepiped.Area());
        System.out.println(parallelepiped.Volume());
        parallelepiped.Print();

        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("");

        System.out.println("Cylinder:");
        Body cylinder = new Cylinder(2, 3);
        System.out.println((double) Math.round(cylinder.Area() * 100) / 100);
        System.out.println((double) Math.round(cylinder.Volume() * 100) / 100);
        cylinder.Print();

	}

}
//Body.cpp
package lab9;
import java.util.Scanner;
import java.lang.Math;
public abstract class Body {
	 public double a;
     public double b;

     public abstract double Area();
  
     public abstract double Volume();
     
     public abstract void Print();
   
}
//Parallelepiped.cpp
package lab9;

public class Parallelepiped extends Body {
	private double area;
    private double volume;
    private double c;
    public double getA() {
    	return a;
    }
    public void setA(double a)  {
    	this.a = a;
    }
    public double getB() {
    	return a;
    }
    public void setB(double b) {
    	this.b = b;
    }
    public double getC() {
    	return c;
    }
    public void setC(double c)  {
    	this.c = c;
    }
    
    public Parallelepiped(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public  double Area()
    {
        area = 2*(a + c + b);
        return area;
    }
    @Override
    public  double Volume()
    {
        volume = 2 * c + a + b;
        return volume;
    }
    @Override
    public  void Print()
    {
    	System.out.println("-------------------------");
    	System.out.print("Parallelepiped Area: ");
    	System.out.println(area);
    	System.out.println("-------------------------");
    	System.out.print("Parallelepiped Volume: ");
    	System.out.println(volume);
    }
}
//Cylinder.cpp
package lab9;

public class Cylinder extends Body {
	private double area2;
    private double volume2;

    public double getA() {
    	return a;
    }
    public void setA(double a)  {
    	this.a = a;
    }
    public double getB() {
    	return a;
    }
    public void setB(double b) {
    	this.b = b;
    }
 
    public Cylinder(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
	@Override
    public double Area()
    {
        area2 =  a * a * Math.PI;
        return area2;
    }
	@Override
    public double Volume()
    {
        volume2 = Math.PI * a * a * b; //a-радіус, b-висота
        return volume2;
    }
	@Override
    public void Print()
    {
		System.out.println("-------------------------");
		System.out.print("Cylinder Area: ");
		System.out.println((double) Math.round(area2 * 100) / 100);
		System.out.print("Cylinder Volume: ");
		System.out.println((double) Math.round(volume2 * 100) / 100);
		System.out.println("-------------------------");
    }
}
Завдання 2.
//Main.cpp
package lab9_2;
import java.util.Scanner;

import lab9_2.Body;
import lab9_2.Parallelepiped;
import lab9_2.Cylinder;
import java.lang.Math;
public class lab9_2 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Parallelepiped:");
			Body parallelepiped2 = new Parallelepiped(2, 3, 5);
	        System.out.println(parallelepiped2.Area());
	        System.out.println(parallelepiped2.Volume());
	        Print parallelepiped3 = new Parallelepiped(2, 3, 5);
	        parallelepiped3.Print();
	        
	        System.out.println("");
	        System.out.println("-------------------------");
	        System.out.println("");

	        System.out.println("Cylinder:");
	        Body cylinder2 = new Cylinder(2, 3);
	        System.out.println((double) Math.round(cylinder2.Area()));
	        System.out.println((double) Math.round(cylinder2.Volume() * 100) / 100);
	       // System.out.println((double) Math.round(cylinder2.Area_bichne() * 100) / 100);
            Print cylinder3 = new Cylinder(2, 3);
            cylinder3.Print();

	}

}
//Body.cpp
package lab9_2;

public interface Body {
     double Area();
  
     double Volume();
     
     double Area_bichne();
}
//Parallepiped.cpp
package lab9_2;

import lab9_2.Body;
import java.util.Scanner;
import java.lang.Math;
public class Parallelepiped implements Body, Print {
	private double area;
    private double volume;
    private double c;
    private double a;
    private double b;
    private double area_bichne;
    
    public double getA() {
    	return a;
    }
    public void setA(double a)  {
    	this.a = a;
    }
    public double getB() {
    	return a;
    }
    public void setB(double b) {
    	this.b = b;
    }
    public double getC() {
    	return c;
    }
    public void setC(double c)  {
    	this.c = c;
    }
    
    public Parallelepiped(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double Area_bichne() 
    {
    	area_bichne = 2*c * (a + b);
        return area_bichne;
    }
    @Override
    public  double Area()
    {
        area = 2*(a + c + b);
        return area;
    }
    @Override
    public  double Volume()
    {
        volume = 2 * c + a + b;
        return volume;
    }
    @Override
    public  void Print()
    {
    	System.out.println("-------------------------");
    	System.out.print("Parallelepiped Area: ");
    	System.out.println(area);
    	System.out.println("-------------------------");
    	System.out.print("Parallelepiped Volume: ");
    	System.out.println(volume);
    }
}
//Cylinder.cpp
package lab9_2;

import lab9_2.Body;
import java.util.Scanner;
import java.lang.Math;
public class Cylinder implements Body, Print {
	private double area2;
    private double volume2;
    private double c;
    private double a;
    private double b;
    private double area_bichne;
    public double getA() {
    	return a;
    }
    public void setA(double a)  {
    	this.a = a;
    }
    public double getB() {
    	return a;
    }
    public void setB(double b) {
    	this.b = b;
    }
 
    public Cylinder(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public double Area_bichne()
    {
        area_bichne = 2*(a+b) * c ;
        return area_bichne;
    }
	@Override
    public double Area()
    {
        area2 =  a * a * Math.PI;
        return area2;
    }
	@Override
    public double Volume()
    {
        volume2 = Math.PI * a * a * b; //a-радіус, b-висота
        return volume2;
    }
	@Override
    public void Print()
    {
		System.out.println("-------------------------");
		System.out.print("Cylinder Area: ");
		System.out.println((double) Math.round(area2 * 100) / 100);
		System.out.print("Cylinder Volume: ");
		System.out.println((double) Math.round(volume2 * 100) / 100);
		System.out.println("-------------------------");
    }
}

//Print.cpp
package lab9_2;

import java.util.Scanner;
import java.lang.Math;

public interface Print {
	void Print();
}
