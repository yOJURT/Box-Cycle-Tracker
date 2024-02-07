import java.awt.*;
import java.util.ArrayList;


public class Verruckt {
    public static int numClicks = 0;
    public static ArrayList<BoxButton> boxes = new ArrayList<>();

    public static void main(String[] args) {

        BoxFrame verrucktBox = new BoxFrame();

    }

    static void reset(){
        if(numClicks < 4){
            resetNumClicks();
        }
        for(int i = 0;i < boxes.size();i++){
            boxes.get(i).setBackground(Color.magenta);
        }
    }

    static void resetNumClicks(){
        numClicks = 0;
    }

}