package com.tordstandnes.CSVEditor;

import java.awt.*;

public class MainView extends Frame {
    private Label test;

    public MainView(){
        setLayout(new FlowLayout());
        test = new Label("test");
        add(test);


        setTitle("HelloView");
        setSize(400,200);
        setVisible(true);
    }

}

