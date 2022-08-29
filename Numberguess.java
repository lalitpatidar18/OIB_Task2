import java.util.Scanner;
import java.util.Random;
public class Numberguess
{
  public static void main(String[]args)
   {
	  int x=0,u=0,t=1,r=0,n=0,l=10,z=0;
	  Random rand = new Random();
	  Scanner S1 = new Scanner(System.in);
	  Random random = new Random(); 
	  while(z<=1)
	{	  
	  System.out.println("You Need 100 points to win");
	  
	  System.out.println("You will get 10 chances");
	  System.out.println("Game Start");
	  System.out.println("Enter Your Guess from 0 to 99");
	  
	    x = rand.nextInt(100);
	  
	   for(n=1;n<=10;n++)
	   {
		        System.out.println("Guess Number" +n+"");
			u=S1.nextInt();
			if(x==u)
			  {
				System.out.println("Congratulations your Guess is right");
				System.out.println("");
			    
				r=100;
				break;
			  }
			else if(u<x)
			  {
			  System.out.println("Your Guess is Less then Random Number");
			  System.out.println("");
			  
			  }	
			else if(u>x)
			  {
			  System.out.println("Your Guess is Higher then Random Number");
			  System.out.println("");
			  
			  }
			
			
	   }
	       r=r+l;
	  if(x==u)
	  {
		  System.out.println("Your Total Score is"+r+"");
	      System.out.println("You Won");
	  }
	  else
	  {
		  System.out.println("Your Total Score is"+n+"");
	   System.out.println("Random number was"+x+"");
	  }
	   System.out.println("");
	   System.out.println("-----------------------------------");
	   System.out.println("Press 1 to continue playing");
	   System.out.println("Press 2 to continue exit");
	    System.out.println("-----------------------------------");
	   z=S1.nextInt();
	   
		  
	   
	}   
   }
}   
			