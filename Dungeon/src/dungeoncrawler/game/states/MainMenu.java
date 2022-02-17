package dungeoncrawler.game.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import dungeoncrawler.framework.gamestates.GameState;
import dungeoncrawler.framework.gamestates.GameStateManager;
import dungeoncrawler.framework.gui.WindowManager;
import dungeoncrawler.game.world.generator.LevelGenerator;

public class MainMenu extends GameState {
	private String[] optionsMenu;
	private static final String START_GAME = "Start Game";
	private static final String QUIT_GAME = "Quit Game";
	private int selected;
	private static BufferedImage background;
		
	public MainMenu(GameStateManager manager) {
		super(manager);
		this.optionsMenu = new String[] {START_GAME, QUIT_GAME};
		this.selected = 0;
	}

	@Override
	protected void loop() {
	}

	@Override
	protected void render(Graphics graphics) {
		File imgBackground = new File("res/background.png");
		try {
			background = ImageIO.read(imgBackground);
		} catch (IOException e) {
			e.printStackTrace();
		}
		graphics.drawImage(background, 0, 0, 800, 450, null);
		graphics.setFont(new Font("Araial", Font.PLAIN, 25));
		for(int i=0;i<this.optionsMenu.length;i++) {
			if(i==this.selected) graphics.setColor(Color.RED);
			else graphics.setColor(Color.DARK_GRAY);
			graphics.drawString(this.optionsMenu[i], 340, 215 + i * 70);
		}
	}

	@Override
	protected void keyPressed(int keyCode) {
		switch(keyCode) {
		case KeyEvent.VK_UP:
			if(this.selected > 0) this.selected--;
			break;
		case KeyEvent.VK_DOWN:
			if(this.selected < this.optionsMenu.length-1) this.selected++;
			break;
		case KeyEvent.VK_ENTER:
			switch(this.optionsMenu[selected]) {
			case START_GAME:
				//Start game here
				super.gameStateManager.stackState(new PlayingState(gameStateManager));
				break;
			case QUIT_GAME:
				System.exit(0);
				break;
			}
			break;
		}
	}

	@Override
	protected void keyReleased(int keyCode) {}
}
