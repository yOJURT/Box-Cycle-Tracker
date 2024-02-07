import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoxButton extends JButton {
    private String name;
    //private boolean isClicked;
    BoxButton(String name, BoxFrame frame){
        this.name = name;
        this.addActionListener(frame);
        this.setVisible(true);
        this.setText(name);
        frame.add(this);
        //isClicked = false;
        this.setBackground(Color.magenta);
        Verruckt.boxes.add(0,this);
    }

    BoxButton(BoxFrame frame){
        this.addActionListener(frame);
        this.setVisible(true);
        this.setText("Reset");
        frame.add(this);
        this.setFont(new Font("Arial",Font.BOLD,8));
    }

    void setClick(){
        //this.isClicked = true;
        Verruckt.numClicks++;
        if(Verruckt.numClicks == Verruckt.boxes.size()){
            Verruckt.reset();
        }
    }

    void highlight(){
        if(Verruckt.numClicks == 4){
            Verruckt.resetNumClicks();
            return;
        }
        this.setBackground(Color.RED);
    }

}


