package com.omar;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class App {
    public static void main(String[] args) {
        System.out.println("Hell World!");
        JFrame mainWindow = new JFrame();
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(800, 800);
        mainWindow.setVisible(true);
    }
}
