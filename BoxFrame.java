import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.awt.event.InputEvent;

import static java.awt.event.MouseEvent.*;

public class BoxFrame extends JFrame implements ActionListener {

    private BoxButton box1;
    private BoxButton box2;
    private BoxButton box3;
    private BoxButton box4;
    private BoxButton box5;
    private BoxButton box6;
    private BoxButton box7;
    private BoxButton box8;
    private BoxButton box9;
    private BoxButton resetButton;

    ArrayList<String> boxNames = new ArrayList<>();
    ArrayList<BoxButton> boxes;
    //HashMap<String, ArrayList<String>> mapsAndBoxes;


    BoxFrame(ArrayList boxLocations){
        this.getContentPane().setLayout(null);
        init();
        this.boxNames = boxLocations;
        resetButton = new BoxButton(this);
        resetButton.setBounds(((boxNames.size()*180)/2),185,80,30);
        //resetButton.setBounds(458,200,80,30);
        this.boxes = new ArrayList<>();
        Collections.addAll(boxes,box1,box2,box3,box4,box5,box6,box7,box8,box9);
        setFrameSize();
        this.removeEmpty();
    } //Constructor for frame of tracker

    private void init(){
        this.setTitle("Box Cycle Tracker: Made By yOJURT");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
    } //Sets basic things for Jframe

    private void removeEmpty(){
        for(int i = boxes.size() - 1; i > boxNames.size() - 1; i--) {
            boxes.remove(i);
        }
    } //Removes any boxes that do not get instantiated from the boxes ArrayList


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == box1){
           box1.setClick();
           box1.highlight();
       }
       if(e.getSource() == box2){
           box2.setClick();
           box2.highlight();
       }
       if(e.getSource() == box3){
           box3.setClick();
           box3.highlight();
       }
       if(e.getSource() == box4) {
            box4.setClick();
            box4.highlight();
       }

       if (e.getSource() == box5){
           box5.setClick();
           box5.highlight();
       }
        if (e.getSource() == box6){
            box6.setClick();
            box6.highlight();
        }
        if (e.getSource() == box7){
            box7.setClick();
            box7.highlight();
        }
        if (e.getSource() == box8){
            box8.setClick();
            box8.highlight();
        }
        if (e.getSource() == box9){
            box9.setClick();
            box9.highlight();
        }
       if(e.getSource() == resetButton){
           BoxButton.reset();
       }
    } //Registers what buttons have been clicked and performs the related action

    /*
    Everything below is related to gui
     */

    private void setBox(){
        box1 = new BoxButton(boxNames.get(0), this);
        box1.setBounds(50,50,100,100);
        box2 = new BoxButton(boxNames.get(1),this);
        box2.setBounds(250, 50, 100, 100);
        box3 = new BoxButton(boxNames.get(2),this);
        box3.setBounds(450, 50, 100, 100);
        box4 = new BoxButton(boxNames.get(3),this);
        box4.setBounds(650, 50, 100, 100);
        if (boxNames.size() < 5){
            return;
        }
        box5 = new BoxButton(boxNames.get(4), this);
        box5.setBounds(850,50,100,100);
        if (boxNames.size() < 6){
            return;
        }
        box6 = new BoxButton(boxNames.get(5),this);
        box6.setBounds(1050,50,100,100);
    } //Method to set box positions on maps with 6 or fewer box locations

    private void setLargerBox(){
        box1 = new BoxButton(boxNames.get(0), this);
        box1.setBounds(50,50,100,100);
        box2 = new BoxButton(boxNames.get(1),this);
        box2.setBounds(250, 50, 100, 100);
        box3 = new BoxButton(boxNames.get(2),this);
        box3.setBounds(450, 50, 100, 100);
        box4 = new BoxButton(boxNames.get(3),this);
        box4.setBounds(650, 50, 100, 100);
        box5 = new BoxButton(boxNames.get(4), this);
        box5.setBounds(5,250,100,100);
        box6 = new BoxButton(boxNames.get(5),this);
        box6.setBounds(205,250,100,100);
        box7 = new BoxButton(boxNames.get(6),this);
        box7.setBounds(405,250,100,100);
        if (boxNames.size() < 8){
            return;
        }
        box8 = new BoxButton(boxNames.get(7),this);
        box8.setBounds(605,250,100,100);
        if (boxNames.size() < 9){
            return;
        }
        box9 = new BoxButton(boxNames.get(8),this);
        box9.setBounds(803,250,100,100);
    }

    private void setFrameSize(){
        if(boxNames.size() <= 6){
            this.setSize((boxNames.size()*205),(boxNames.size()*65));
            this.setBox();
        }else{
            this.setSize(((boxNames.size()*205)/2),(boxNames.size()*55));
            this.setLargerBox();
        }
    } //Method to set correct frame size
}
