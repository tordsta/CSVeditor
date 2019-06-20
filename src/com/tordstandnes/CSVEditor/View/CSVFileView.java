package com.tordstandnes.CSVEditor.View;

import java.awt.*;

public class CSVFileView{

    public CSVFileView(){
        System.out.println("CSVFileView init");
    }

    public void render(Frame mainFrame){
        //Create a open space in the frame
        Panel panel = new Panel();
        panel.setLayout(null);
        panel.setSize(75,75);

        //Fills open space with content
        List l1=new List(5);
        l1.setSize(75,75);
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");
        panel.add(l1);

        //adds to frame
        mainFrame.add(panel);
    }

}
