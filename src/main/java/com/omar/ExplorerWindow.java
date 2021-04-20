package com.omar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExplorerWindow extends JFrame implements ActionListener {

    public ExplorerWindow() {
        Box box = new Box(BoxLayout.PAGE_AXIS);
        JLabel usernameField = new JLabel("Patata");
        box.add(usernameField);

        add(box);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
