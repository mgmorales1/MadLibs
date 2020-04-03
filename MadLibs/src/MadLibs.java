import java.util.Scanner;
import java.util.Random;

public class MadLibs {
	
	Scanner scanner = new Scanner(System.in);
	String story;
	String name;
	String adjective1;
	String adjective2;
	String noun1;
	String noun2;
	String noun3;
	String adverb;
	String randomNums;
	Random rand = new Random();
	
	// Getters;
	
	public String getStory() {
		return story;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAdjective() {
		return adjective1;
	}
	
	public String getAdjective2() {
		return adjective2;
	}
	
	public String getNoun1() {
		return noun1;
	}
	
	public String getNoun2() {
		return noun2;
	}
	
	public String getNoun3() {
		return noun3;
	}
	
	public String getAdverb() {
		return adverb;
	}
	
	public String getRandomNums() {
		return randomNums;		
	}
	
	public void setStory(String newStory) {
		this.story = newStory;
	}
	
	public void setName (String newName) {
		this.name = newName;
	}
	
	public void setAdjective (String newAdj1) {
		this.adjective1 = newAdj1;
	}
	
	public void setAdjective2 (String newAdj2) {
		this.adjective2 = newAdj2;
	}
	
	public void setNoun1(String newNoun1 ) {
		this.noun1 = newNoun1;		
	}
	
	public void setNoun2(String newNoun2 ) {
		this.noun2 = newNoun2;		
	}
	
	public void setNoun3(String newNoun3 ) {
		this.noun3 = newNoun3;		
	}
	
	public void setAdverb(String newAdverb) {
		this.adverb = newAdverb;
	}
	
	public void setRandomNums() {
		int num = Math.abs(rand.nextInt() % 100);
		int index = 0;
		int [] numberHolder = new int[3];
		while (index < numberHolder.length) {
			numberHolder[index] = num + index;
			index++;
		}
		randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1] +
				", but " + numberHolder[2];
	}
	//Print instructions to play
	public void printInstructions() {
		System.out.println("Welcome to the MadLibs game.\nIf you type in "
				+ "words, we'll give you a story. Start by typing in a name");
	}
	
	// Methods to read user input 
	public void enterName() {
		setName(scanner.nextLine());
	}
	
	public void enterNoun1() {
		System.out.println("Now type a noun\t");
		setNoun1(scanner.nextLine());
	
	}
	
	public void enterNoun2() {
		System.out.println("Now another noun\t");
		setNoun2(scanner.nextLine());
	
	}
	public void enterNoun3() {
		System.out.println("We're almost done, one last noun\t");
		setNoun3(scanner.nextLine());
	
	}
	
	public void enterAdjective1() {
		System.out.println("We need an adjective now\t");
		setAdjective(scanner.nextLine());
	}
	
	public void enterAdjective2() {
		System.out.println("Another adjective\t");
		setAdjective2(scanner.nextLine());
	}
	
	public void enterAdverb() {
		System.out.println("We need an adverb\t");
		setAdverb(scanner.nextLine());
	}
	
	
	// Inserts user input into the story
	public void putTogetherTheStory() {
		String story;
		int num = Math.abs(rand.nextInt()) % 2;
		if(num == 0) {
			story = "Anna and her bestfriend " + getName() + " went to Disney World today!\n"
					+ "They saw a " + getNoun1() + " in a show at the Magic Kingdom\n"
					+ "and ate a " + getAdjective() + " feast for dinner. The next day they\n"
					+ "ran " + getAdverb() + " to meet Minnie Mouse and her\n" 
					+ getNoun2() + "and then that night they gazed at the " + getRandomNums() +
					"\n" + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
		} else {
			story = "Jacob and his friend " + getName() + " went to the moon last summer.\n"+
		"They found a huge " + getNoun1() + " and a tiny little " + getNoun2() + ".\nDuring their trip "
		+ "they decided to jump "+ getAdverb() + " into the " + getNoun3() + " to get a "
		+ " closer look.\nThe moon was " + getAdjective() + " at night, but they didn't care... until\n"+
	    getRandomNums()+ " " + getAdjective2() + " aliens sent them to Mars, making Jacob and\n" +
		getName() + " run all the way back home.";
		
		}
		setStory(story); 
	}
	
	
	
	public void play() {
		enterName();
		enterNoun1();
		enterAdjective1();
		enterAdjective2();
		enterNoun2();
		enterAdverb();
		enterNoun3();
		setRandomNums();
		putTogetherTheStory();
		System.out.println(getStory());
	}

	public static void main(String[] args) {

		MadLibs game = new MadLibs();
		game.printInstructions();
		game.play();
		
	}

}
