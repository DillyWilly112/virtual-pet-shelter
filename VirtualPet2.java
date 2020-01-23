public class VirtualPet2 {
	
	int hunger = 0;
	int thirst = 0;
	int boredom = 0;
	String petName;
	String status = "Alive";
	
	public VirtualPet2(int hunger, int thirst, int boredom, String petName, String status) {
	}
	public void shelterPet() {
		this.hunger = 5;
		this.thirst = 5;
		this.boredom = 5;
	}
	public int getHunger() {
		
		return this.hunger;
	}
	public int getThirst() {
		
		return this.thirst;
	}
	public int getBoredom() {
		
		return this.boredom;
	}
	public String getPetName() {
		
		return this.petName;
	}
	public String getStatus() {
		if (this.hunger >= 10 && this.thirst >= 10) {
		this.status ="Dead";
		//Relocated your pet has died to VirtualPet2App
	}
	return this.status;
	}
	public int eat() {
		this.hunger = this.hunger - 2;
		if(this.hunger < 0) {
			this.hunger = 0;
	}
		return this.hunger--;
	}
	public int drink() {
		this.thirst = this.thirst - 5;
		if(this.thirst < 0) {
			this.thirst = 0;
	}
		return this.thirst;
	}
	public int play() {
	this.boredom = this.boredom - 2;
	if(this.boredom < 0) {
		this.boredom = 0;
	}
		return this.boredom;	
	}
	String fetchThing = null;
	public Object shelterPet;
	
	public String fetch() {
		int fetchRand = (int) (Math.random() * 10 + 1);
		if(fetchRand <= 3) {
			fetchThing = petName + " brings you a red ball.";
		}
		if(fetchRand == 4) {
			fetchThing = petName + " drags over a large branch.";
		}
		if(fetchRand == 5) {
			fetchThing = petName + 
					" crouches in front of you and regurgitates some bright yellow bile with rubber bits in it.";
		}
		if(fetchRand == 6) {
			fetchThing = petName + " stares at you in confusion.";
		}
		if(fetchRand == 7) {
			fetchThing = petName + " fetches the thing you threw, but now its covered in slobber.";
		}
		if(fetchRand == 9) {
			fetchThing = petName + " is gone for a very long time.";
		}
		if(fetchRand == 10) {
			fetchThing = petName + " you play a loving game of catch.";
		}
		return fetchThing;
	}
	public void tick() {
		this.hunger++;
		this.thirst++;
		this.boredom++;
	}
	
	public static String hungerwarning;
	public static String thirstwarning;
	public static String boredomwarning;
	
	public void currentHungerStats() {
		if(this.hunger > 7) {
			hungerwarning = petName + " is starving.";
		}
			else {
				hungerwarning = petName + " is saciated.";
			}
		}
	public void currentThirstStats() {
		if(this.thirst > 7) {
			thirstwarning = petName + " is thisrty.";
		}
		else {
			thirstwarning = petName + " is hydrated.";
		}
	}
	public void currentBoredomStats() {
		if(this.boredom > 11) {
			boredomwarning = petName + " looks bored.";
		}
		else {
			boredomwarning = petName + " looks content.";
		}
	}
	public void testPet() {
		this.hunger = 1;
		this.thirst = 1;
		this.boredom = 1;
	}
}
