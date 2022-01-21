package assignment2;

public class Main {

	public static void main(String[] args) {
		
		Game game= new Game();
		game.setRandom();
		game.run();
		System.out.println("The number was: " + game.randomNumber);
		System.out.println("You were off by:" + game.difference);
	}

}
