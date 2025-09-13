package org.example;

import javax.swing.*;


public class TextEditor {

    // Declaring properties of text editor
    JFrame frame;

    JMenuBar menuBar;

    JMenu file, edit;

    // File menu items
    JMenuItem newFile,openFile,saveFile;

    // Edit menu items
    JMenuItem cut, copy , paste , selectAll , close;

    // text area
    JTextArea textArea;

    TextEditor(){

        //Initialize a frame
        frame=new JFrame();

        //Initialize menubar
        menuBar=new JMenuBar();

        //Initialize text area
        textArea=new JTextArea();

        // Initialize Menus
        file=new JMenu("File");
        edit=new JMenu("Edit");

        // Initialize file menu items
        newFile =new JMenuItem("New Window");
        openFile=new JMenuItem("OPen File");
        saveFile=new JMenuItem("Save File");

        // add menu items to file menu
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        // Initialize edit menu items
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        selectAll=new JMenuItem("Select All");
        close=new JMenuItem("Close");

        // add items to edit menu
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        edit.add(close);

        // add menus to menu bar
        menuBar.add(file);
        menuBar.add(edit);

        //Set Menubar to frame
        frame.setJMenuBar(menuBar);

        //Add text area to frame
        frame.add(textArea);

        // Set dimensions of frame
        frame.setBounds(0,0,400,400);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public static void main(String[] args) {

        TextEditor textEditor=new TextEditor();

    }
}