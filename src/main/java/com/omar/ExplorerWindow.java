package com.omar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ExplorerWindow extends JFrame implements ActionListener {

    public ExplorerWindow() {
        /*
        Each folder/file is its own button? 
        They can share the click event but 
        Make own object that saves information of folder/file?
        */

        Box box = new Box(BoxLayout.PAGE_AXIS);

        getFolderFileList("C:\\", box);

        add(box);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
    }

    public void getFolderFileList(String path, Box containerBox) {
        //how to ignore system files and folders ????
        File pathFolder = new File("C:\\");

        if (!pathFolder.isDirectory()) {
            //TODO: Launch exception
        } else {
            for (String file : pathFolder.list()) {
                JButton testButton = new JButton(file);
                testButton.setBackground(Color.red);
                testButton.addActionListener(this);
                containerBox.add(testButton);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton sourceButton = (JButton) e.getSource();
            System.out.println(sourceButton.getText());
        }
    }

}
