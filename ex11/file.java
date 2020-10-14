/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shrimeenatchi
 */
public class file {
	public static void main(String args[]) {
		countword m=new countword();
		a f1=new a(m,args[0]);
                f1.start();
		b f2=new b(m,args[1]);
                f2.start();
		c f3=new c(m,args[2]);
                f3.start();
	}

}
class countword
{
	public void  count(String fname) throws IOException, FileNotFoundException
	{
		File f=new File(fname);
		BufferedReader fd=new BufferedReader (new FileReader(f));
		String read;
		int count=0;
		while((read=fd.readLine())!=null)
		{
			int i;
			String s[]=read.split(" ");
			for(i=0;i<s.length;i++)
			{
				count++;
			}
		}
		System.out.println(f.getName()+":"+count+"words");
		fd.close();
		
	}
}
class a extends Thread
{
	countword w;
	String filename;
	public a(countword w,String fname) {
		this.w=w;
		this.filename=fname;
	}
	public void run()
	{
		try
		{
			w.count(filename);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class b extends Thread
{
	countword w;
	String filename;
	public b(countword w,String fname) {
		this.w=w;
		this.filename=fname;
	}
	public void run()
	{
		try
		{
			w.count(filename);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class c extends Thread
{
	countword w;
	String filename;
	public c(countword w,String fname) {
		this.w=w;
		this.filename=fname;
	}
	public void run()
	{
		try
		{
			w.count(filename);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

