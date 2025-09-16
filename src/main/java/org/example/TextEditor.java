package org.example;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.Buffer;


public class TextEditor implements ActionListener {

    // Declaring properties of text editor
    JFrame frame;
    JMenuBar menuBar;
    JMenu file, edit;

    // File menu items
    JMenuItem newFile, openFile, saveFile;

    // Edit menu items
    JMenuItem cut, copy, paste, selectAll, close;

    // text area
    JTextArea textArea;

    TextEditor() {

        //Initialize a frame
        frame = new JFrame();

        //Initialize menubar
        menuBar = new JMenuBar();

        //Initialize text area
        textArea = new JTextArea();

        // Initialize Menus
        file = new JMenu("File");
        edit = new JMenu("Edit");

        // Initialize file menu items
        newFile = new JMenuItem("New Window");
        openFile = new JMenuItem("Open File");
        saveFile = new JMenuItem("Save File");

        // Add action Listener to file menu items
        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);

        // add menu items to file menu
        file.add(newFile);
        file.add(openFile);
        file.add(saveFile);

        // Initialize edit menu items
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectAll = new JMenuItem("Select All");
        close = new JMenuItem("Close");

        // Adding action Listeners to edit menu items
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        close.addActionListener(this);

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

        // create content pane
        JPanel panel=new JPanel();
        panel.setBorder(new EmptyBorder(5,5,5,5));
        panel.setLayout(new BorderLayout(0,0));


        //Add text area to panel
        panel.add(textArea,BorderLayout.CENTER);

        //create Scroll pane
        JScrollPane scrollPane=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // add scroll pane to panel
        panel.add(scrollPane);

        //Adding frame to pannel
        frame.add(panel);



        // Set dimensions of frame
        frame.setBounds(0, 0, 400, 400);
        frame.setTitle("Text Editor");
        frame.setVisible(true);
        frame.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == cut) {
            //perform cut operation
            textArea.cut();
        }
        if (actionEvent.getSource() == copy) {
            //perform copy operation
            textArea.copy();
        }

        if (actionEvent.getSource() == paste) {
            //perform paste operation
            textArea.paste();
        }

        if (actionEvent.getSource() == selectAll) {

            //perform Select all Operation
            textArea.selectAll();
        }

        if (actionEvent.getSource() == close) {
            //perform close editor Operation
            System.exit(0);
        }

        if (actionEvent.getSource() == openFile) {

            //Open File chooser
            JFileChooser fileChooser = new JFileChooser("users/");

            int chooseOption = fileChooser.showOpenDialog(null);

            // if we have choose Open Button
            if (chooseOption == JFileChooser.APPROVE_OPTION) {

                // Getting the selected file
                File file = fileChooser.getSelectedFile();

                //get path of file
                String filePath = file.getPath();

                try {

                    // initialize file reader
                    FileReader fileReader = new FileReader(filePath);

                    // Initialize Buffer Reader
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String intermediate = "", output = "";

                    // Read content line by line
                    while ((intermediate = bufferedReader.readLine()) != null) {
                        output += intermediate + "\n";
                    }

                    // Set the output string to text area
                    textArea.setText(output);

                } catch (IOException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();

                }

            }

        }

        // if we chose save file button
        if (actionEvent.getSource() == saveFile) {

            // Initialize file picker
            JFileChooser fileChooser1 = new JFileChooser();

            //get choose option from file chooser
            int chooseOption1 = fileChooser1.showSaveDialog(null);

            //Check we clicked on save button
            if (chooseOption1 == JFileChooser.APPROVE_OPTION) {

                // choose a new file with chosen directory path and file name
                File file = new File(fileChooser1.getSelectedFile().getAbsolutePath() + ".txt");

                try {
                    //Initialize file writer
                    FileWriter fileWriter = new FileWriter(file);

                    //buffer writer
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                    // write the context of the text area to the file
                    textArea.write(bufferedWriter);
                    bufferedWriter.close();

                } catch (IOException ioException) {

                    ioException.getStackTrace();
                }
            }
        }

        // new file
        if(actionEvent.getSource()==newFile){
            TextEditor textEditor=new TextEditor();
        }
    }

    public static void main(String[] args) {

        TextEditor newTextEditor = new TextEditor();

    }
}
