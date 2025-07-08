package UI;

import javax.swing.*;

public class UIExamples {





     JFrame window = new JFrame("Example App");

    JPanel myPanel = new JPanel();

     JTextField emailField = new JTextField();

     JButton myButton = new JButton("Click here");

     void drawUi(){
         myPanel.add(emailField);
         myPanel.add(myButton);
         window.add(myPanel);

         window.setSize(300,500);
         window.setVisible(true);
         window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

     }

     public static void main(String[] args){
         UIExamples uiExamples = new UIExamples();
         uiExamples.drawUi();
     }


}
