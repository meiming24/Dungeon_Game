package dungeoncrawler.game.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import dungeoncrawler.framework.gamestates.GameState;
import dungeoncrawler.framework.gamestates.GameStateManager;

public class GameOver extends GameState {
	
	private String[] optionsMenu;
	private static final String YES  = "YES";
	private static final String NO = "NO";
	private int selected;
	private static BufferedImage gameover;
	
	protected GameOver(GameStateManager manager) {
		super(manager);
		this.optionsMenu = new String[] {YES, NO};
		this.selected = 0;
	}

	@Override
	protected void loop() {}

	@Override
	protected void render(Graphics graphics) {
		File imgBackground = new File("res/gameover.png");
		try {
			gameover = ImageIO.read(imgBackground);
		} catch (IOException e) {
			e.printStackTrace();
		}
		graphics.drawImage(gameover, 0, 0, 800, 450, null);
		graphics.setFont(new Font("Araial", Font.PLAIN, 25));
		for(int i=0;i<this.optionsMenu.length;i++) {
			if(i==this.selected) graphics.setColor(Color.RED);
			else graphics.setColor(Color.DARK_GRAY);
			graphics.drawString(this.optionsMenu[i], 265 + i * 230, 310);
		}
	}

	@Override
	protected void keyPressed(int keyCode) {
		switch(keyCode) {
		case KeyEvent.VK_LEFT:
			if(this.selected > 0) this.selected--;
			break;
		case KeyEvent.VK_RIGHT:
			if(this.selected < this.optionsMenu.length-1) this.selected++;
			break;
		case KeyEvent.VK_ENTER:
			switch(this.optionsMenu[selected]) {
			case YES:
				//Start game here
				super.gameStateManager.stackState(new PlayingState(gameStateManager));
				break;
			case NO:
				//Show Score .m./
				System.exit(0);
				break;
			}
			break;
		}		
	}

	@Override
	protected void keyReleased(int keyCode) {
		// TODO Auto-generated method stub
		
	}

}
