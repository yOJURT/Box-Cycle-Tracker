import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoxButton extends JButton {
    private String boxName;
    private boolean isClicked;
    private static int numClicks = 0;
    private static ArrayList<BoxButton> boxes = new ArrayList<>();
    BoxButton(String name, BoxFrame frame){
        this.boxName = name;
        if(boxName.length() >= 9){ //Used to see if a html line break is needed or not
            String[] parts = boxName.split(" ");
            boxName = ("<html>" + parts[0] + " <br />" + parts[1] + "<html>");
        }
        this.addActionListener(frame);
        this.setVisible(true);
        this.setText(boxName);
        frame.add(this);
        isClicked = false;
        this.setBackground(Color.magenta);
        boxes.add(this);
    } //Constructor for box buttons

    BoxButton(BoxFrame frame){
        this.addActionListener(frame);
        this.setVisible(true);
        this.setText("Reset");
        frame.add(this);
        this.setFont(new Font("Arial",Font.BOLD,8));
    } //Constructor for reset button

    void setClick(){
        if(isClicked == true){
            return;
        } //Will not increment if the button is already clicked
        this.isClicked = true;
        numClicks++;
        if(numClicks == boxes.size()){
            BoxButton.reset();
        }
    } //Used to increment numClicks each time a button is pressed

    void resetClick(){
        this.isClicked = false;
    }

    public String getBoxName(){
        return this.boxName;
    }

    static void resetNumClicks(){
        numClicks = 0;
    } //Used to reset numClicks after reset is called

    /*
    Everything below is related to gui
     */

    static void reset(){
        if(numClicks < boxes.size()){
            resetNumClicks();
        }
        for(int i = 0;i < boxes.size();i++){
            boxes.get(i).setBackground(Color.magenta);
            boxes.get(i).resetClick();
        }
    } //Used to reset all boxButtons back to original color


    void highlight(){
        if(numClicks == boxes.size()){
            resetNumClicks();
            return;
        }
        this.setBackground(Color.RED);
    } //Changes the color of button after it has been pressed

    void setSkippedBox(){
        this.setBackground(Color.GREEN);
    }

}


