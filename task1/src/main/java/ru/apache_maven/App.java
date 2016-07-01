package ru.apache_maven;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class PhoneBook
{
	private Map<String, ArrayList> m_rec = new HashMap<String, ArrayList>();
	
	PhoneBook(String name, ArrayList phones)
	{
		m_rec.put(name, phones);
		
	}
	public void parseAndSet(String data)
	{
		String[] tmp = data.split("\\+");
		String name = tmp[0].trim();
		ArrayList phones = new ArrayList();
		for (int i = 1; i <= tmp.length-1; ++i)
		{
		    phones.add("+"+tmp[i].trim());
		}
		m_rec.put(name, phones);
		
	}
	public void printPhone(){
	    for (Map.Entry entry : m_rec.entrySet()) 
	    {
           System.out.println(entry.getKey() + " " + entry.getValue());
        }
 
	}
	public void findByName(String name)
	{
	    
	    if (m_rec.containsKey(name))
	        System.out.println(m_rec.get(name));
	        
	   else
	    System.out.println(name + " not found");
	}
}

public class App 
{
    public static void main( String[] args )
    {
	
	PhoneBook p = new PhoneBook("", new ArrayList());

	p.parseAndSet("Papandopulos Eugenie +888 666");
	p.parseAndSet("Harry Potter +123 345 678 +987 765 555");
	p.parseAndSet("Darth Wayder +666 666 666");
	p.parseAndSet("Pupkin V. V. +1234567890 +56789");
	p.parseAndSet("Sharikov P. P. +11111 +1111 +111111");
	p.parseAndSet(" Albus Percival Wulfric Brian Dumbledore +lemon sherbet");//TODO phoneNumber check
	p.printPhone();
	
	Scanner sc = new Scanner(System.in);
	String s;
	System.out.println( "Enter data " );
    s = sc.nextLine();
    p.findByName(s);
    }
}
