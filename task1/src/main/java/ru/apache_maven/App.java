package ru.apache_maven;


import java.util.Scanner;
import java.util.Vector;


class PhoneBook
{
	String m_name = new String("");
	Vector m_phones = new Vector();
	
	PhoneBook(String name, Vector phones)
	{
		m_name += name;
		m_phones.addAll(phones);
		
	}
	public void parseAndSet(String data)
	{
		String[] tmp = data.split(" +");
		m_name = tmp[0];
		for (int i = 1; i <= tmp.length-1; ++i)
		{
		    m_phones.add(tmp[i]);
		}
		
	}
	public void printPhone(){
		System.out.println(m_name + " "); 
	}
	//serch
}


public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter data " );
	String s;
	s = sc.nextLine();
	PhoneBook p = new PhoneBook("", new Vector());
	p.parseAndSet(s);
	p.printPhone();
    }
}
