/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex11;

/**
 *
 * @author shrimeenatchi
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int c=0;
   venue b=new venue();
   x a1=new x(b,c);
   y b2=new y(b,c);
   z c3=new z(b,c);
   w d4=new w(b,c);
   a1.start();
   b2.start();
   c3.start();
   d4.start();
	}

}
class venue
{
	int count=0;
	x a;
	int getcount()
	{
		return count;
	}
	synchronized public void resort(int c) {
		if(count<2)
		{
			System.out.println("successfully booked");
			count++;
		}
		else
		{
			System.out.println("fully booked");
		}
	}
}
class x extends Thread
{
	venue vb;
	int t=0;
	public x(venue vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		vb.getcount();
		int c=t+1;
		vb.resort(c);
	}
}
class y extends Thread
{
	venue vb;
	int t=0;
	public y(venue vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		
		int c=t+1;
		vb.resort(c);
	}
}
class z extends Thread
{
	venue vb;
	int t=0;
	public z(venue vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		
		int c=t+1;
		vb.resort(c);
	}
}
class w extends Thread
{
	venue vb;
	int t=0;
	public w(venue vb,int t)
	{
		this.vb=vb;
		this.t=t;
	}
	public void run()
	{
		
		int c=t+1;
		vb.resort(c);
	}
}
