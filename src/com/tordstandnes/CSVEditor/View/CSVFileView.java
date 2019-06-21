package com.tordstandnes.CSVEditor.View;

import java.awt.*;
import java.util.ArrayList;

public class CSVFileView{
    private Panel panel;
    ArrayList<ArrayList<String>> listOfColumns = new ArrayList<>();
    ArrayList<Label> labels = new ArrayList<>();


    public CSVFileView(){
        System.out.println("CSVFileView init");

        //Create a open space in the frame
        panel = new Panel();
            // flowlayout er sikkert beste løsning innad i panelet her
            //sammen med scroll panel?
            //        panel.setLayout(null);
        panel.setSize(200,200);


        //Imports file into array - TODO
        ArrayList<String> column1 = new ArrayList<>();
        column1.add("h1");
        column1.add("h2");
        column1.add("h3");
        column1.add("h4");
        ArrayList<String> column2 = new ArrayList<>();
        column2.add("h1");
        column2.add("h2");
        column2.add("h3");
        column2.add("h4");
        ArrayList<String> column3 = new ArrayList<>();
        column3.add("h1");
        column3.add("h2");
        column3.add("h3");
        column3.add("h4");

        Label column1Label = new Label(column1.remove(0));
        Label column2Label = new Label(column2.remove(0));
        Label column3Label = new Label(column3.remove(0));

        labels.add(column1Label);
        labels.add(column2Label);
        labels.add(column3Label);

        listOfColumns.add(column1);
        listOfColumns.add(column2);
        listOfColumns.add(column3);

//        for(int i=0;i==1;i++){
//            listOfColums.add(column1);
//        }

        //Fills open space with content from listOfColumns
        for(int i=0;i<listOfColumns.size();i++){
            List viewList = new List();
            int lengthOfColumn = listOfColumns.get(i).size();
            for(int j=0;j<lengthOfColumn;j++){
                String item = listOfColumns.get(i).get(j);
                viewList.add(item);
            }
            panel.add(labels.get(i));
            panel.add(viewList);
        }



    }

    public void render(Frame mainFrame, GridBagConstraints constraints){
        //Renders or re-render panel on frame
        constraints.gridx = 1;
        constraints.gridy = 0;
        mainFrame.add(panel, constraints);
    }

}
