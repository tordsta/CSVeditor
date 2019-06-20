package com.tordstandnes.CSVEditor.View;

import javax.swing.*;
import java.awt.*;


public class MainView extends Frame {
    private CSVFileView fileView;
    private CSVEditingView editView;

    public MainView(){
        Frame mainFrame = new Frame();

        //Initiates the View objects
        editView = new CSVEditingView();
        fileView = new CSVFileView();

        //Renders the views
        editView.render(mainFrame);
        fileView.render(mainFrame);
        editView.render(mainFrame);
        fileView.render(mainFrame);

        mainFrame.setTitle("Comma-separated values document editor");
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        mainFrame.setUndecorated(true);    //removes edge of window, with window buttons
        mainFrame.setVisible(true);
    }
}

