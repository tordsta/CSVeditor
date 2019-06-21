package com.tordstandnes.CSVEditor.View;

import javax.swing.*;
import java.awt.*;


public class MainView extends Frame {
    private CSVFileView fileView;
    private CSVEditingView editView;

    public MainView(){
        Frame mainFrame = new Frame();

        //Init grid layout
        mainFrame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(2,2,2,2);

        //Initiates the View objects
        editView = new CSVEditingView();
        fileView = new CSVFileView();

        //Renders the views
        editView.render(mainFrame, constraints);
        fileView.render(mainFrame, constraints);

        mainFrame.setTitle("Comma-separated values document editor");
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        mainFrame.setUndecorated(true);    //removes edge of window, with window buttons
        mainFrame.setVisible(true);
    }
}

