package object;

import javax.imageio.ImageIO;
import java.util.Objects;

public class OBJ_Door extends OBJ{

    public OBJ_Door(){
        name = "Door";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/objects/door.png")));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
