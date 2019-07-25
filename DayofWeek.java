package firstproject;

import java.util.Scanner;

public class DayofWeek {
	
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String s[])
	{
   		System.out.println("Enter any number : ");
	    final int day = scanner.nextInt();
	    
	    switch(day)
	    {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            default:
	                System.out.println("Weekend");
	                break;
	        }
	    }
	}
