package XAND0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XANDO {


    ArrayList<Integer> playerOne = new ArrayList<>();

    ArrayList<Integer> playerTwo = new ArrayList<>();

    JFrame xando = new JFrame("X and O Game");
    JButton btn1 = new JButton();
    JButton btn2 = new JButton();
    JButton btn3 = new JButton();
    JButton btn4 = new JButton();
    JButton btn5 = new JButton();
    JButton btn6 = new JButton();
    JButton btn7 = new JButton();
    JButton btn8 = new JButton();
    JButton btn9 = new JButton();
    JPanel mypanel  = new JPanel(new GridBagLayout());

    int flag = 0;

    void drawGrid(){
        mypanel.add(btn1);
        mypanel.add(btn2);
        mypanel.add(btn3);
        mypanel.add(btn4);
        mypanel.add(btn5);
        mypanel.add(btn6);
        mypanel.add(btn7);
        mypanel.add(btn8);
        mypanel.add(btn9);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag == 0){
                    playerOne.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("X");
                    flag = 1;
                } else if  (flag == 1){
                    playerTwo.add(1);
                    btn1.setEnabled(false);
                    btn1.setText("0");
                    flag = 0

                }
           
            }
        });
        playerOne.add(1);
        playerTwo.add(2);



        xando.add(mypanel);
        xando.setSize(300,300);
        xando.setVisible(true);
        xando.setDefaultCloseOperation(WindowConstants);




    }
}
