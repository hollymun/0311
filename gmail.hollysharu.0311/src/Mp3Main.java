import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Mp3Main {

	public static void main(String[] args) {

		try {
			Player player = new Player(new FileInputStream("/Users/mac/Downloads/gyjazz.mp3"));
			player.play();
		} catch (Exception e) {
			System.out.printf("%s\n", e.getMessage());
			e.getStackTrace();
		}
		
		
	}
}
