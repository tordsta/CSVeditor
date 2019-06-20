package com.tordstandnes.CSVEditor.View;

import java.awt.*;

public class CSVEditingView {


    public CSVEditingView(){
        System.out.println("CSVEditingMenu init");
    }

    public void render(Frame mainFrame){
        //Create a open space in the frame
        Panel panel = new Panel();
        panel.setLayout(null);
        panel.setSize(200,50);

        //Fills open space with content
        Button button = new Button("button");
        button.setSize(200, 50);
        panel.add(button);

        //adds to frame
        mainFrame.add(panel);
    }

}
