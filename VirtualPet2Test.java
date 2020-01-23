import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class VirtualPet2Test {

	VirtualPet2 underTest = new VirtualPet2(0, 0, 0, null, null);
	
	@Test
	public void HungerShouldBeZeroAtStart() {
		//Act
		int result = underTest.getHunger();
		//Assert
		assertEquals(0,result);
	}
	@Test
	public void ThirstShouldBeZeroAtStart() {
		//Act
		int result = underTest.getThirst();
		//Assert
		assertEquals(0,result);
	}
	@Test
	public void BoredomShouldBeZeroAtStart() {
		//Act
		int result = underTest.getBoredom();
		//Assert
		assertEquals(0,result);
}
	@Test
	public void HungerShouldDecreaseByOneAfterEat() {
		//Act
		int beforeEat = underTest.getHunger();
		underTest.eat();
		int result = underTest.getHunger();
		//Assert
		assertEquals(beforeEat -1, result);
	} 
	@Test
	public void ThirstShouldDecreaseByOneAfterDrink() {
        //Act
		int beforeDrink = underTest.getThirst();
		underTest.drink();
		int result = underTest.getThirst();
		//Assert
		assertEquals(beforeDrink -1, result);
	}
	@Test
	public void BoredomShouldDecreaseByOneAfterPlay() {
        //Act
		int beforePlay = underTest.getBoredom();
		underTest.play();
		int result = underTest.getBoredom();
		//Assert
		assertEquals(beforePlay -1, result);
	}
	@Test
	public void TickShouldIncreaseAllByOne() {
		int BoredombeforeTick = underTest.getBoredom();
		int HungerbeforeTick = underTest.getHunger();
		int ThirstbeforeTick = underTest.getThirst();
		underTest.tick();
		int BoredomResult = underTest.getBoredom();
		int HungerResult = underTest.getHunger();
		int ThirstResult = underTest.getThirst();
		
		assertEquals(BoredombeforeTick +1, BoredomResult);
		assertEquals(HungerbeforeTick +1, HungerResult);
		assertEquals(ThirstbeforeTick +1, ThirstResult);
	}
	@Test
	public void petStatusShouldBeDead() {
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		underTest.tick();
		String result = underTest.getStatus();
		assertEquals("Dead", result);
	}
    @Test
    public void ShelterPetHungerShouldAllBe5() {
    	underTest.shelterPet();
    	int result = underTest.getHunger();
    	assertEquals(5, result);
    }
    @Test
    public void ShelterPetThirstShouldAllBe5() {
    	underTest.shelterPet();
    	int result = underTest.getThirst();
    	assertEquals(5, result);
    }
    @Test
    public void ShelterPetBoredomShouldAllBe5() {
    	underTest.shelterPet();
    	int result = underTest.getBoredom();
    	assertEquals(5, result);
    }
}
