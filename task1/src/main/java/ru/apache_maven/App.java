package ru.apache_maven;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
        System.out.println( "Enter data " );
	String s;
	s = sc.nextLine();
	System.out.println( s );
    }
}
