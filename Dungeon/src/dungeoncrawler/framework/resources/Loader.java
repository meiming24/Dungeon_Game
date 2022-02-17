package dungeoncrawler.framework.resources;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Loader {
	
	//Load the img from res folder add indexes and Image to the Resources
	public static void load() {
		try {
			Resources.TEXTURES.add(Resources.FLOOR, ImageIO.read(new File("res/textures/floor.png")));
			Resources.TEXTURES.add(Resources.STONE, ImageIO.read(new File("res/textures/stone.png")));
			Resources.TEXTURES.add(Resources.WALL, ImageIO.read(new File("res/textures/wall.png")));
			Resources.TEXTURES.add(Resources.TILE, ImageIO.read(new File("res/textures/tile.png")));
			Resources.TEXTURES.add(Resources.GRASS, ImageIO.read(new File("res/textures/grass.png")));
			Resources.TEXTURES.add(Resources.PLAYER, ImageIO.read(new File("res/textures/player.png")));
			Resources.TEXTURES.add(Resources.PLAYER_2, ImageIO.read(new File("res/textures/player_2.png")));
			Resources.TEXTURES.add(Resources.PLAYER_LEFT, ImageIO.read(new File("res/textures/player_left.png")));
			Resources.TEXTURES.add(Resources.PLAYER_LEFT_2, ImageIO.read(new File("res/textures/player_left_2.png")));
			Resources.TEXTURES.add(Resources.PLAYER_RIGHT, ImageIO.read(new File("res/textures/player_right.png")));
			Resources.TEXTURES.add(Resources.PLAYER_RIGHT_2, ImageIO.read(new File("res/textures/player_right_2.png")));
			Resources.TEXTURES.add(Resources.PLAYER_BACK, ImageIO.read(new File("res/textures/player_back.png")));
			Resources.TEXTURES.add(Resources.PLAYER_BACK_2, ImageIO.read(new File("res/textures/player_back_2.png")));
			Resources.TEXTURES.add(Resources.STAIRS, ImageIO.read(new File("res/textures/stairs.png")));
			Resources.TEXTURES.add(Resources.CHEST, ImageIO.read(new File("res/textures/chest.png")));
			Resources.TEXTURES.add(Resources.ENEMY, ImageIO.read(new File("res/textures/enemy.png")));
			Resources.TEXTURES.add(Resources.ENEMY_2, ImageIO.read(new File("res/textures/enemy_2.png")));
			Resources.TEXTURES.add(Resources.ATTACK_LEFT, ImageIO.read(new File("res/textures/attack_left.png")));
			Resources.TEXTURES.add(Resources.ATTACK_RIGHT, ImageIO.read(new File("res/textures/attack_right.png")));
			Resources.TEXTURES.add(Resources.ATTACK_UP, ImageIO.read(new File("res/textures/attack_up.png")));
			Resources.TEXTURES.add(Resources.ATTACK_DOWN, ImageIO.read(new File("res/textures/attack_down.png")));
			Resources.TEXTURES.add(Resources.HEART, ImageIO.read(new File("res/textures/heart.png")));
			Resources.TEXTURES.add(Resources.ARMOR, ImageIO.read(new File("res/textures/armor.png")));
			Resources.TEXTURES.add(Resources.GOLD, ImageIO.read(new File("res/textures/gold.png")));
			Resources.TEXTURES.add(Resources.SKULL, ImageIO.read(new File("res/textures/skull.png")));
			Resources.TEXTURES.add(Resources.SLIME, ImageIO.read(new File("res/textures/slime.png")));
			Resources.TEXTURES.add(Resources.SLIME_2, ImageIO.read(new File("res/textures/slime_2.png")));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
