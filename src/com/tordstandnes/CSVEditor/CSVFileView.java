package com.tordstandnes.CSVEditor;

import java.awt.*;

public class CSVFileView{
//    private CSVFileView singleton = new CSVFileView();
//    private boolean isInit = false;

    public CSVFileView(){
        System.out.println("CSVFileView init");
    }

    public void render(Frame mainFrame){
        List l1=new List(5);
        l1.setBounds(100,100, 75,75);
        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");
        mainFrame.add(l1);
    }

}
