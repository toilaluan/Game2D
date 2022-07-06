/*package entity;

import main.GamePanel;
import java.util.Random;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class NPC_1 extends Entity{
    public NPC_1(GamePanel gp){
        super(gp);
        direction = "down";
        int ranNum;
        ranNum = new Random().nextInt(100) + 1;
        speed = 2;
        public void updateNPC_1() {
                if (ranNum>0&&ranNum<=25) {
                    direction = "up";
                }
                if (ranNum>25&&ranNum<=50) {
                    direction = "down";
                }
                if (ranNum>50&&ranNum<=75) {
                    direction = "right";
                }

                if (ranNum>75&&ranNum<=100) {
                    direction = "left";
                }

    }
}
*/