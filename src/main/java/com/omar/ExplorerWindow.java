package com.omar;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class ExplorerWindow extends JFrame implements ActionListener {

    public ExplorerWindow() {
        /*
        Each folder/file is its own button? 
        They can share the click event but 
        Make own object that saves information of folder/file?
        */

        Box box = new Box(BoxLayout.PAGE_AXIS);
        JLabel usernameField = new JLabel("Patata");
        box.add(usernameField);

        add(box);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);
        getFolderFileList();
    }

    public void getFolderFileList() {
        //how to ignore system files and folders ????
        File rootPath = new File("C:\\");
        for (String file : rootPath.list()) {
            System.out.println(file);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
