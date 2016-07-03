package ru.apache_maven;

import java.util.Scanner;

class IP
{
	private int[] m_ip = new int[4];

	IP()
	{
		for (int i= 0; i < 4; ++i)
			m_ip[i] = 0;
	}

	public void parse(String s)
	{
		String[] buf = s.split("\\.");
		for (int i = 0; i < 4; ++i)
		{
			m_ip[i] = (int)Integer.valueOf(buf[i]);
		}
		//m_ip.addAll(Integer.valueOf());
	}

	public void printIP()
	{
		for (int i = 0; i <3; ++i)
			System.out.print(m_ip[i] + ".");
		System.out.println(m_ip[3]);
	}
	public void incIP()
	{
		
	}	
}

public class App 
{
    public static void main( String[] args )
    {
        IP p = new IP();
	p.parse("123.333.333.333");
	p.printIP();
    }
}
