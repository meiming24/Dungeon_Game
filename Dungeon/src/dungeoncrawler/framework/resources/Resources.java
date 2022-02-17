package dungeoncrawler.framework.resources;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

public class Resources {
	
	public static final byte FLOOR = 0;
	public static final byte STONE = 1;
	public static final byte WALL = 2;
	public static final byte TILE = 3;
	public static final byte GRASS = 4;
	public static final byte PLAYER = 5;
	public static final byte PLAYER_2 = 6;
	public static final byte PLAYER_LEFT = 7;
	public static final byte PLAYER_LEFT_2 = 8;
	public static final byte PLAYER_RIGHT = 9;
	public static final byte PLAYER_RIGHT_2 = 10;
	public static final byte PLAYER_BACK = 11;
	public static final byte PLAYER_BACK_2 = 12;
	public static final byte STAIRS = 13;
	public static final byte CHEST = 14;
	public static final byte ENEMY = 15;
	public static final byte ENEMY_2 = 16;
//	public static final byte ATTACK = 17;
	public static final byte ATTACK_LEFT = 17;
	public static final byte ATTACK_RIGHT = 18;
	public static final byte ATTACK_UP = 19;
	public static final byte ATTACK_DOWN = 20;
	public static final byte HEART = 21;
	public static final byte ARMOR = 22;
	public static final byte GOLD = 23; 
	public static final byte SKULL = 24; 
	public static final byte SLIME = 25;
	public static final byte SLIME_2 = 26;
//	public static final HashMap<String, BufferedImage> ROOMS = new HashMap<>(); //Store Rooms Data
	public static final ArrayList<BufferedImage> TEXTURES = new ArrayList<>();  //Store Textures Data

}
