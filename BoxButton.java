import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoxButton extends JButton {
    private String name;
    private boolean isClicked;
    private static int numClicks = 0;
    private static ArrayList<BoxButton> boxes = new ArrayList<>();
    BoxButton(String name, BoxFrame frame){
        this.name = name;
        this.addActionListener(frame);
        this.setVisible(true);
        this.setText(name);
        frame.add(this);
        isClicked = false;
        this.setBackground(Color.magenta);
        boxes.add(0,this);
    }

    BoxButton(BoxFrame frame){
        this.addActionListener(frame);
        this.setVisible(true);
        this.setText("Reset");
        frame.add(this);
        this.setFont(new Font("Arial",Font.BOLD,8));
    }

    void setClick(){
        if(isClicked == true){
            return;
        }
        this.isClicked = true;
        numClicks++;
        if(numClicks == boxes.size()){
            BoxButton.reset();
        }
    }

    void resetClick(){
        this.isClicked = false;
    }

    void highlight(){
        if(numClicks == 4){
            resetNumClicks();
            return;
        }
        this.setBackground(Color.RED);
    }

    static void reset(){
        if(numClicks < 4){
            resetNumClicks();
        }
        for(int i = 0;i < boxes.size();i++){
            boxes.get(i).setBackground(Color.magenta);
            boxes.get(i).resetClick();
        }
    }

    static void resetNumClicks(){
        numClicks = 0;
    }

}


