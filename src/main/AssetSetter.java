package main;

import entity.Monster;
import object.*;

import java.util.ArrayList;
import java.util.Random;

public class AssetSetter {
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(ArrayList<OBJ> obj){
        OBJ key_1 = new OBJ_key();
        key_1.worldX = gp.tileSize * 19;
        key_1.worldY = gp.tileSize * 5;
        obj.add(key_1);
        OBJ door_1 = new OBJ_Door();
        door_1.worldX = gp.tileSize * 19;
        door_1.worldY = gp.tileSize * 10;
        obj.add(door_1);
        int ranNum = new Random().nextInt(3);
        if(Monster.killMonster()){
        switch (ranNum%4) {
            case 0:
                OBJ SpeedPotion_1 = new OBJ_SpeedPotion();
                SpeedPotion_1.worldX = gp.tileSize * 10;
                SpeedPotion_1.worldY = gp.tileSize * 10;
                obj.add(SpeedPotion_1);
                break;
            case 1:
                OBJ HpPotion_1 = new OBJ_HpPotion();
                HpPotion_1.worldX = gp.tileSize * 10;
                HpPotion_1.worldY = gp.tileSize * 5;
                obj.add(HpPotion_1);
                break;
        }
        }

    }
}
