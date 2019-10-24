public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber guessNumber = new GuessNumber();

		Player firstPlayer = new Player(guessNumber.enterPlayerName());
		Player secondPlayer = new Player(guessNumber.enterPlayerName());

		while(true) {
			if(guessNumber.startTheGame(firstPlayer) || guessNumber.startTheGame(secondPlayer)) {
				if(!guessNumber.repeatTheGame()) {
					break;
				}
			}	
		}
	}
}