package com.tordstandnes.CSVEditor.View;

import java.awt.*;

public class CSVFileView{
    private Panel panel;


    public CSVFileView(){
        System.out.println("CSVFileView init");

        //Create a open space in the frame
         panel = new Panel();
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
    }

    public void render(Frame mainFrame){
        //Renders or re-render panel on frame
        System.out.println("ho");
        mainFrame.add(panel);
    }

}
