// Super Class - General Class
public class Monster {

	//variables
	String name; 
	String eyes;
	String skin; 
	//number of arms
	int arms; 
	//number of legs
	int legs; 
	//height in feet
	int height;
	//weight in pounds
	int weight;
	
	boolean strongEnough; 
	
	//methods for the Monster down below
	public Monster() {
		
	}
	public void displayInfo() {
		System.out.println("\n\nYour Monsters Name is " + name);
		System.out.println("Your Monsters Eyes are " + eyes);
		System.out.println("Your Monsters Skin Color is " + skin);
		System.out.println("Your Monster has " + arms +" arms");
		System.out.println("Your Monster has " + legs + " legs");
		System.out.println("Your Monster is " + height + " feet tall");
		System.out.println("Your Monster is " + weight + " pounds"); 
		System.out.println("Do you want me to Destroy the world?");
		System.out.println("Yes or No"); 
	}
		
		public boolean tryToSaveWorld() {
			if (strongEnough) {
				System.out.println("I will Destroy... everythinggggg.....");
				return true;
			}else {
				System.out.println("I tried but I was conqured.\n");
				System.out.println("Let's rewind time and try again."); 
				return false;
			}	
	}
		
		public boolean askToSaveWorld(String choice) {
			boolean wasDestroyed = false; 
			if (choice.toLowerCase().equals("yes") || choice.toLowerCase().equals("y")) {
				System.out.println("Okay, I'll give it a shot. \n"); 
				wasDestroyed = tryToSaveWorld(); 
			}else {
				System.out.println("Yeah, that's probably for the best"); 
			}
			return wasDestroyed; 
		}
		
		
	public void run(){
		System.out.println("\n\nYour Monster Ran Away....!");
	}
	public void bite(){
		System.out.println("\n\nYour Monster Bit Me.... Ouch!"); 
	}
	public void fly(){
		System.out.println("\n\nYour Monster Flew Over Gothem!"); 
	}
	public void breathFire(){
		System.out.println("\n\nYour Monster Set the House on Fire!"); 
	}
	
}
