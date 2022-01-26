import java.awt.*;
import java.awt.event.*;

public class awt_button_change_color implements ActionListener{
    
    Frame f;
    Button b1;
    Button b2;

    // constructor 
    public awt_button_change_color(){

        // creating a frame using Frame object
        f = new Frame("My GUI");
        
        // creating a button
        b1 = new Button("To Yellow");
        b1.setBounds(20, 40, 250, 60);
        b1.setBackground(Color.red);             //color of background
        b1.setForeground(Color.white);           //color of text in it

        // creating a button
        b2 = new Button("To Green");
        b2.setBounds(20, 120, 250, 60);
        b2.setBackground(Color.red);             //color of background
        b2.setForeground(Color.white);           //color of text in it


        // adding components to the frame
        f.add(b1);
        f.add(b2);
        
        // setting properties of the frame
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
        f.setBackground(Color.yellow);
        }

        else if(e.getSource() == b2){
            f.setBackground(Color.green);
        }

    }

    
    public static void main(String[] args){
        // initializing new frame
        new awt_button_change_color();
    }






}