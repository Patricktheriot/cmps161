/*Patrick Theriot W# 0702809 Assignment 2
   
   This program is a game in which a player must make there own choices */
import java.util.Scanner;
public class myGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//This gives yourHealth and cpuHealth a value of 0
		int yourHealth = 0, cpuHealth = 0;
		
		//This gives the background of the story
		System.out.println("You are Wolf Comrad a member of The Guardians Of The Galaxy, an elite team of soldiers who have special abilities.\n ");
		System.out.println("The Gardians Of The Past were sent to the planet Vestonia in order to stop Greygnare,the leader of the Vestonians,\n"
							+ "from using The Eye Of The Galaxy, a diamond that has the power to turn back time.\n");
		
		
		//difficulty time!
		System.out.print("Please select difficulty:\n 1: Easy... Really.\n 2: Normal... Ok so you want to make it even.\n 3: Hard... Bring it on!\nAnswer here:");
		int difficulty = input.nextInt();
		
		
		//these if and else if give a value to yourHealth and cpuHealth depending on the players answer in line 18-19
		if (difficulty == 1) {
			System.out.println("\nYou have chosen to relax and go easy... boring. You have 75% health and Greygnare has 40% health.\n");
			yourHealth = 75;
			cpuHealth = 40;
		}
		else if (difficulty == 2) {
			System.out.println("\nYou decided to play evenly matched: You have 50% health and Greygnare has 50% health.\n");
			yourHealth = 50;
			cpuHealth = 50;
		}
		else if (difficulty == 3) {
			System.out.println("\nYou have made a decision to be a true hero! You have 50% health and Greygnare has 75% health.\n");
			yourHealth = 50;
			cpuHealth = 75;
		}
		else {
			System.out.println("\nYou have put in an answer that is not there... what is wrong with you?\n");
		}
		
		//this comment brings you through the battle
		System.out.println("During the battle, there have been many allies that have died and you realize that you have the chance to stop the battle.\n"
							+ "You run into a big open-roofed building and spot a big ugly Vestonian, Greygnare, in the middle of the room holding\n"
							+ "The Eye Of The Galaxy in his hand.\n");
		
		
		//this explains the players options
		System.out.println("You have three choices:\nchoice 1: Yell at Greygnare and try to stall him until your partner can help you:\n"
							+ "choice 2: Take a chance and try to hit Greygnare with the last bullet in your gun:\n"
				+ "choice 3: Or use your special power of invisibility to try and steal The Eye Of The Galexy from Greygnare:\n");
		
		
		//this is where the player puts their answer in
		System.out.print("So... what do you do: ");
		int answer = input.nextInt();
		
		
		//this if and else if subtracts the cpuHealth depending on the players answer in line 52-53
		if (answer == 1) {
			cpuHealth = cpuHealth - 10;
			System.out.println("You decided to stall him... and your partner attacked Greygnare from behind.");
		}
		else if (answer == 2) {
			cpuHealth = cpuHealth - 5;
			System.out.println("You decided to try and shoot him... but you hit him in the shoulder");
		}
		else if (answer == 3) {
			cpuHealth = cpuHealth - 15;
			System.out.println("You decided to sneak up on him... and as you stole The Eye Of The Galaxy from him, you stabbed him.");
		}
		else {
			System.out.print("You have put in an invalide answer.");
		}
		
		//this states the current game status
		System.out.println("\nCurrent game status: Greygnare " + cpuHealth + "% you " + yourHealth + "%.");
		
		
		//this gives the cpuAttack a random number from 0-9
		int cpuAttack = (int) (Math.random() * 10);
		
		
		//this if and else if subtracts yourHealth depending on the number generated in line 77
		if (cpuAttack >= 0 && cpuAttack <= 3) {
			System.out.println("\nGreygnare punched you. oof");
			yourHealth = yourHealth - 5;
		}
		else if (cpuAttack > 3 && cpuAttack <= 6) {
			yourHealth = yourHealth - 10;
			System.out.println("\nGreygnare cut you with a knife.");
		}
		else if (cpuAttack > 6 && cpuAttack <= 9) {
			yourHealth = yourHealth - 15;
			System.out.println("\nGreygnare shot you... how are you still standing!");
		}
		
		//this states the current game status
		System.out.println("\nCurrent game status: you " + yourHealth + "% Greygnare " + cpuHealth + "%.");
	}

}
