import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class BoxFrame extends JFrame implements ActionListener {

    private BoxButton dtBox;
    private BoxButton jugBox;
    private BoxButton powerBox;
    private BoxButton tommyBox;
    private BoxButton resetButton;

    ArrayList<String> boxes = new ArrayList<>();


    BoxFrame(){
        this.getContentPane().setLayout(null);
        this.setSize(820,300);
        this.setTitle("Box Cycle Tracker: Made By yOJURT");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        resetButton = new BoxButton(this);
        resetButton.setBounds(365,200,70,20);
        this.addBoxes();
        this.setBox();
    }

    private void addBoxes(){
        boxes.add("DT Box");
        boxes.add("Jug Box");
        boxes.add("Power Box");
        boxes.add("<html>Tommy<br />  Box<html>");
    }


    private void setBox(){
        dtBox = new BoxButton(boxes.get(0), this);
        dtBox.setBounds(50,50,100,100);
        jugBox = new BoxButton(boxes.get(1),this);
        jugBox.setBounds(250, 50, 100, 100);
        powerBox = new BoxButton(boxes.get(2),this);
        powerBox.setBounds(450, 50, 100, 100);
        tommyBox = new BoxButton(boxes.get(3),this);
        tommyBox.setBounds(650, 50, 100, 100);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == dtBox){
           dtBox.setClick();
           dtBox.highlight();
       }
       if(e.getSource() == jugBox){
           jugBox.setClick();
           jugBox.highlight();
       }
       if(e.getSource() == powerBox){
           powerBox.setClick();
           powerBox.highlight();
       }
       if(e.getSource() == tommyBox) {
            tommyBox.setClick();
            tommyBox.highlight();
       }
       if(e.getSource() == resetButton){
           BoxButton.reset();
       }
    }
}
