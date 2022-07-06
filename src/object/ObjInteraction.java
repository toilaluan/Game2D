package object;

import entity.Player;
import main.GamePanel;

public class ObjInteraction {
	public void ObjInteraction(GamePanel gp, int i) {
		if (i != 999) {
			String objectName = gp.obj.get(i).name;
			switch (objectName) {
				case "Key":
					Player.hasKey = true;
					gp.obj.remove(gp.obj.get(i));
					break;
				case "Door":
					if (Player.hasKey) {
						for (int k = 0; k < gp.player.item.size(); k++){
							if ( gp.player.item.get(k) != null){
								gp.tileM.getMap("/maps/Rung.txt");
								gp.player.item.remove(k);
							}
						}
					}
					break;
				case "SpeedPotion":
					Player.checkSpeedPT = 1;
					gp.obj.remove(gp.obj.get(i));
					break;
				case "HpPotion":
					Player.checkSpeedPT = 1;
					gp.obj.remove(gp.obj.get(i));
					break;
			}
		}
	}
}
