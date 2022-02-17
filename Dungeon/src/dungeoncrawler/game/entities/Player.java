package dungeoncrawler.game.entities;


import java.awt.Graphics;
import java.awt.Rectangle;

import dungeoncrawler.framework.resources.Resources;
import dungeoncrawler.framework.utils.MathHelper;
import dungeoncrawler.game.world.Tile;

public class Player extends Entity {

	private static final long serialVersionUID = 1L;

	private int hp;
	private int maxHp;
	private byte regenDelay;
	private int armor;
	private int maxArmor;
	private int gold;
	
	private byte attackTime;
	private byte damageTime;
	
	private byte attackType;
	
	public Player() {
		super(Resources.PLAYER, MathHelper.randomInt(2, 14), MathHelper.randomInt(2, 7));
		this.hp = 10;
		this.maxHp = 10;
		this.regenDelay = 0;
		this.armor = 10;
		this.maxArmor = 10;
		this.gold = 0;
		this.attackTime = 0;
		this.damageTime = 0;
	}
	
	public void replaceRandomly() {
		super.x = MathHelper.randomInt(2, 14) * Tile.SIZE;
		super.y = MathHelper.randomInt(2, 7) * Tile.SIZE;
	}

	public int getHp() {
		return hp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}
	
	public void instantHeal(int amount) {
		this.hp += amount;
		if(this.hp > this.maxHp) this.hp = this.maxHp;
	}
	
	public void regenerateArmor() {
		if(this.armor < this.maxArmor) this.regenDelay++;
		else this.regenDelay = 0;
			
		if(this.regenDelay == 50) {
			this.armor++;
			this.regenDelay = 0;
		}
	}
	
	public boolean checkHp() {
		if(this.hp <= 0) return true;
		else return false;
	}
	
	public int getArmor() {
		return armor;
	}
	
	public void addArmor(int amount) {
		this.armor += amount;
		if(this.armor > 75) this.armor = 75;
	}
	
	public int getGold() {
		return gold;
	}
	
	public void giveGold(int amount) {
		this.gold += amount;
	}
	
	@Override
	public void move() {
		if(this.attackTime == 0) {
			super.move();
			switch(super.facing) {
			case NORTH: super.entityID = Resources.PLAYER_BACK; break;
			case SOUTH: super.entityID = Resources.PLAYER; break;
			case WEST: super.entityID = Resources.PLAYER_LEFT; break;
			case EAST: super.entityID = Resources.PLAYER_RIGHT; break;
			}
		}
	}
	
	public void decreaseTime() {
		if(this.attackTime > 0) this.attackTime--;
		if(this.damageTime > 0) this.damageTime--;
	}
	
	public void renderAttack(Graphics g) {
		g.drawImage(Resources.TEXTURES.get(attackType), getAttackBox().x, getAttackBox().y, getAttackBox().width, getAttackBox().height, null);
		
	}
	
	public void attack() {
		if(this.attackTime == 0) this.attackTime = 30;
		switch(super.facing) {
		case NORTH: this.attackType = Resources.ATTACK_UP; break;
		case SOUTH: this.attackType = Resources.ATTACK_DOWN; break;
		case WEST: this.attackType = Resources.ATTACK_LEFT; break;
		case EAST: this.attackType = Resources.ATTACK_RIGHT; break;
		}
	}
	
	public Rectangle getAttackBox() {
		if(this.attackTime == 20) {
			switch(super.facing) {
			case NORTH:
				return new Rectangle(super.x, super.y - super.height, super.width, super.height);
			case SOUTH:
				return new Rectangle(super.x, super.y + super.height, super.width, super.height);
			case WEST:
				return new Rectangle(super.x - super.width, super.y, super.width, super.height);
			case EAST:
				return new Rectangle(super.x + super.width, super.y, super.width, super.height);
			default:
				break;
			}
		}
		return new Rectangle(0, 0, 0, 0);
	}
	
	
	@Override
	public void render(Graphics graphics) {
		if((up || down || left || right) && this.attackTime == 0) {
			super.animationDelay++;
			if(super.animationDelay == 50) {
				super.animationDelay = 0;
				super.animationFrame = (byte) (1 - super.animationFrame);
			}
		}
		graphics.drawImage(Resources.TEXTURES.get(entityID + animationFrame), super.x, super.y, super.width, super.height, null);
	}
	
	public void damage(int amount) {
		if(this.damageTime == 0 && this.armor <= 0) {
			this.hp -= amount;
			this.damageTime = 50;
		}
		else if(this.damageTime == 0 && this.armor > 0) {
			this.armor -= amount;
			this.damageTime = 50;
		}
	}
	
}
