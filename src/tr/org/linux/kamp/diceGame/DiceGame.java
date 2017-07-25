package tr.org.linux.kamp.diceGame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	private static Random rgen =new Random();
	
	
	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("1.oyuncunun ismini girin");
		 String user1=sc.next();
		 
		 System.out.println("2.oyuncunun ismini girin");
		 String user2=sc.next();
		 
		 int dice1= roll();
		 int dice2= roll();
		 
		 if (dice1<dice2)
			 System.out.println(user2+"2.oyuncu kazandı."+dice2);
		 else if (dice1==dice2)
			 System.out.println("Berabere"+dice1+dice2);
		 else 
			 System.out.println(user1+"1. oyuncu kazandı"+dice1);
	}
	
	 public static int roll() {
		 int number=rgen.nextInt(6)+1;		//return rgen.nextInt(5)+1; diyebiliriz.switch iptal olur.
		 
		return number;
		 }
	
	 }
	

