public class lab4{
	public static void main(String[] args) {
		gameOfLife new_game = new gameOfLife(Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[3]));
		new_game.start(Integer.parseInt(args[2]));
	}
}

