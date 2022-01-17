package assignment2;

import java.util.Random;
import java.util.Scanner;

public class Game {

	int iConInput;
	int randomNumber;
	int life = 4;
	int difference;

	public void game() {

		this.getInput();
		this.getDifference();
		if (iConInput < 1 || iConInput > 100) {
			this.errorHandler();
		} else if (difference == 0) {
			System.out.println("Congratulations you guessed right, the number was " + randomNumber);
		} else if (life > 0) {
			this.loop();
		} else {
			System.out.println("The number was: " + randomNumber);
			System.out.println("You were off by:" + difference);
		}
	}

	public void getInput() {

		Scanner input = new Scanner(System.in);
		System.out.print("Please guess a number between and including 1 and 100:\n>");
		String userInput = input.nextLine();
		iConInput = Integer.parseInt(userInput);
	}

	public void errorHandler() {

		System.out.println("Your guess is not between 1 and 100, please try again.");
		this.game();
	}

	public void loop() {

		while (iConInput != randomNumber && life > 0) {
			if (randomNumber < iConInput) {
				System.out.println("You should guess lower!");
			} else {
				System.out.println("You should guess higher!");
			}
			--life;
			this.game();
		}
	}

	public void getDifference() {

		difference = iConInput - randomNumber;
		if (difference < 0) {
			difference = randomNumber - iConInput;
		}
	}

	public void run() {
		
		this.game();
	}

	public void setRandom() {

		Random random = new Random();
		randomNumber = random.nextInt(100);
	}
}
