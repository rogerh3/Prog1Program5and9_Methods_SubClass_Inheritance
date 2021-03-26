///Project: Project 5
//Author: Roger H Hayden III
//Desc: Using Methods
//Version: 2.0
//Last Update: 11/4 - We used this for project 9
//We added monster subclasses and used inheritance

import java.util.Scanner;




public class Monster_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner keyboard = new Scanner (System.in);
		
		//Create instance for Class Monster
		Vampire Vampire = new Vampire();
		Zombie Zombie = new Zombie(); 
		
		//variables to input
		int menuChoice = 0;
		String yesOrNo = ""; 
		boolean destroyed = false;
		// I kept all other methods that the monsters had and i just commented them out
		//obviously i could be more creative with the methods and say like the zombie cant do some stuff but the vampire can
		//But i followed how we did with saving the world but we destroyed it
		do {
			System.out.println("Choose a Monster to destroy earth"); 
			System.out.println("=============================================");
			System.out.println("1.) Vampire");
			System.out.println("2.) Zombie");
			
			menuChoice = keyboard.nextInt();
			
			switch(menuChoice) {
			case 1:
				Vampire.displayInfo();
				yesOrNo = keyboard.next(); 
				destroyed = Vampire.askToSaveWorld(yesOrNo); 
				break; 
			case 2:
				Zombie.displayInfo();
				yesOrNo = keyboard.next();
				destroyed = Zombie.askToSaveWorld(yesOrNo); 
				break;
		} 
		}while (destroyed != true);
		
		/*do {
			System.out.println("\n\nPick what you want your monster to do!");
			System.out.println("---------------------");
			System.out.println("1.) Display Monster Information."); 
			System.out.println("2.) Make Your Monster Run"); 
			System.out.println("3.) Make Your Monster Bite.");
			System.out.println("4.) Make your Monster fly."); 
			System.out.println("5.) Make Your Monster Breath Fire.");
			System.out.println("6.) Exit");
			System.out.println("What would you like to do?"); 
			menuChoice = keyboard.nextInt(); 
			//giving user a choice of what they would like to do
			switch(menuChoice)
			{
			case 1:
				monsterOne.displayInfo(); 
				break;
			case 2:
				monsterOne.run(); 
				break;
			case 3: 
				monsterOne.bite(); 
				break;
			case 4:
				monsterOne.fly(); 
				break;
			case 5:
				monsterOne.breathFire(); 
				break; 
			case 6:
				System.out.println("Thank you for playing. Your monster is going to bed.");
				break; 
			default:
				System.out.println("Please enter a valid choice."); 
			}
			
		}while (menuChoice != 6);  */
		
		
		
	}

}
