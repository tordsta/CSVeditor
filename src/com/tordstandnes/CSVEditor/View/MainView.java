package com.tordstandnes.CSVEditor.View;

import javax.swing.*;
import java.awt.*;


public class MainView extends Frame {
    private CSVFileView fileView;
    private CSVEditingView editView;

    public MainView(){
        Frame mainFrame = new Frame();
        mainFrame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(2,2,2,2);

        Button button1 = new Button();
        constraints.gridx = 0;
        constraints.gridy = 0;
        mainFrame.add(button1, constraints);
        Button button2 = new Button();
        constraints.gridx = 1;
        constraints.gridy = 1;
        mainFrame.add(button2, constraints);

        //Initiates the View objects
        editView = new CSVEditingView();
        fileView = new CSVFileView();

        //Renders the views
        editView.render(mainFrame, constraints);
        fileView.render(mainFrame, constraints);

        mainFrame.setTitle("Comma-separated values document editor");
//gridbag layout funker sikkert her
//        mainFrame.setLayout(new FlowLayout());
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        mainFrame.setUndecorated(true);    //removes edge of window, with window buttons
        mainFrame.setVisible(true);
    }
}

