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
			if (m_ip[i] < 0 || m_ip[i] > 255)
			{
				System.out.println("Wrong format of IP");
				System.exit(0);
			}
		}
	}

	public void printIP()
	{
		for (int i = 0; i <3; ++i)
			System.out.print(m_ip[i] + ".");
		System.out.println(m_ip[3]);
	}
	
	public void incIP()
	{
		int buf = 1;
		for (int i = 3; i >= 0; --i)
		{
			m_ip[i]+=buf;
			buf = m_ip[i] / 256;
			m_ip[i] %= 256;
		}
	}

	public boolean equalIP(IP ip)
	{
		boolean flag = true;

		for (int i = 0; i < 4; ++i)
			flag = flag && (ip.m_ip[i] == this.m_ip[i]);
		return flag;
	}

	public void printAllIPTo(IP endIP)
	{
		while (! this.equalIP(endIP))
		{
			this.incIP();
			this.printIP();
		}
	}	
}

public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
	
        IP p1 = new IP();
	IP p2 = new IP();
	System.out.print("Enter Begin ");
	String s1;
	s1 = sc.nextLine();
	p1.parse(s1);	
	System.out.print("Enter End ");
	String s2;	
	s2 = sc.nextLine();
	p2.parse(s2);
	p1.printAllIPTo(p2);

    }
}
