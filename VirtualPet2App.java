import java.util.Scanner;

public class VirtualPet2App {
	
     
	public static void main(String[] args) {
		   
		VirtualPet2 newpet = new VirtualPet2(0, 0, 0, null, "Alive");
		System.out.println("Welcome to Virtual Pet.");
		System.out.println("Would you like a baby or to adopt a pet from the shelter?");
		System.out.println("Type \"baby\" or \'\"shelter\".");
		
		Scanner input = new Scanner(System.in);
		String userChoice = input.nextLine();
		if(userChoice.contains("shelter")) {
			newpet.shelterPet();
		}
		System.out.println("Name your new buddy.");
		String username = input.nextLine();
		newpet.petName = username;
		System.out.println("Hello " + newpet.petName);
	
		for(newpet.getStatus(); newpet.status.contentEquals("Alive"); newpet.tick()) {
          System.out.println("");
          newpet.currentHungerStats();
          System.out.println(VirtualPet2.hungerwarning);
          newpet.currentThirstStats();
          System.out.println(VirtualPet2.thirstwarning);
          newpet.currentBoredomStats();
          System.out.println(VirtualPet2.boredomwarning);
          System.out.println("");
          
          if(newpet.getBoredom() > 15) {
        	  System.out.println(newpet.petName + " has ran away");
        	  System.exit(0);
          }
          System.out.println("");
          System.out.println("What would you like to do with your pet?");
          System.out.println("Choose a cooresponding number below");
          System.out.println("1. feed");
          System.out.println("2. water");
          System.out.println("3. play");
          System.out.println("4. fetch");
          System.out.println("");
          
          String action = input.nextLine();
          
          if(action.contentEquals("1")) {
        	  newpet.eat();
          }
          if(action.contentEquals("2")) {
        	  newpet.drink();
          }
          if(action.contentEquals("3")) {
        	  newpet.play();
          }
          if(action.contentEquals("4")) {
        	  newpet.fetch();
        	  System.out.println(newpet.fetchThing);
          }
          newpet.getStatus();
		}
		System.out.println("Your pet has died.");
		System.exit(0);
		input.close();
	}
	}




