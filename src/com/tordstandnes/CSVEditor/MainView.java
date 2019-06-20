package com.tordstandnes.CSVEditor;

import java.awt.*;
import com.tordstandnes.CSVEditor.CSVFileView;


public class MainView extends Frame {
    private Label test;
    private CSVFileView fileView;

    public MainView(){
        Frame mainFrame = new Frame();
        test = new Label("test");
        mainFrame.add(test);

        fileView = new CSVFileView();
        fileView.render(mainFrame);

        mainFrame.setTitle("HelloView");
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setSize(400,200);
        mainFrame.setVisible(true);
    }

}

