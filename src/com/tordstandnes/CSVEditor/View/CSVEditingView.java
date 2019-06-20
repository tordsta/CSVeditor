package com.tordstandnes.CSVEditor.View;

import java.awt.*;

public class CSVEditingView {
    private Panel panel;


    public CSVEditingView(){
        System.out.println("CSVEditingMenu init");

        //Create a open space in the frame
        panel = new Panel();
        panel.setLayout(null);
        panel.setSize(200,50);

        //Fills open space with content
        Button button = new Button("button");
        button.setSize(200, 50);
        panel.add(button);
    }

    public void render(Frame mainFrame){
        //Renders or re-render panel on frame
        System.out.println("hey");
        mainFrame.add(panel);
    }

}
