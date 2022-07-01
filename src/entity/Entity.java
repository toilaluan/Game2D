package entity;

import object.OBJ;
import object.OBJ_SpeedPotion;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Entity {
	public int worldX = 100;
	public int worldY = 100;
	public int monsterSpeed;
	public static int speed = 4;
	public static int speeds() {
		if (Player.checkSpeedPT==1) {
			Player.checkSpeedPT = 0;
			speed = speed+ OBJ_SpeedPotion.speedBonus;
			return speed;
		}
		else return speed;
	}
	public int mp = 100;
	public int hp = 100;
	public int Attack;
	public int Defense;
	public BufferedImage up1, up2, down1, down2, right1, right2, left1, left2;
	public String direction;

	public Rectangle solidArea;

	public int solidAreaDefaultX, solidAreaDefaultY;
	public boolean colissionOn = false;

	public ArrayList<OBJ> item;
}
