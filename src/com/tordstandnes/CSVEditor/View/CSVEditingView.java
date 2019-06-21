package com.tordstandnes.CSVEditor.View;

import java.awt.*;

public class CSVEditingView {
    private Panel panel;


    public CSVEditingView(){
        System.out.println("CSVEditingMenu init");

        //Create a open space in the frame
        panel = new Panel();
//boxlayout er sikkert best her
//      panel.setLayout(null);
        panel.setSize(200,200);

        //Fills open space with content

        //Lode file button
        Button lodeFileButton = new Button("Load File");
        lodeFileButton.setSize(100, 30);
        panel.add(lodeFileButton);

        //Save file button
        Button saveFileButton = new Button("Save File");
        saveFileButton.setSize(100, 30);
        panel.add(saveFileButton);

        //Original separator selector
        Label originalSeparatorLabel = new Label("Select the separator from the loaded file:");
        TextField originalSeparator = new TextField("For example ; or ,");
        originalSeparator.setSize(200, 15);
        panel.add(originalSeparatorLabel);
        panel.add(originalSeparator);

        //Wanted separator selector
        Label wantedSeparatorLabel = new Label("Select the separator you want in the final file:");
        TextField wantedSeparator = new TextField("For example ; or ,");
        wantedSeparator.setSize(200, 15);
        panel.add(wantedSeparatorLabel);
        panel.add(wantedSeparator);

        //Swap x list...
        Choice xList = new Choice();
        xList.setSize(100, 50);
        xList.add("X list");
        panel.add(xList);

        //...With Y list
        Choice yList = new Choice();
        yList.setSize(100, 50);
        yList.add("Y list");
        panel.add(yList);
    }


    public void render(Frame mainFrame, GridBagConstraints constraints){
        //Renders or re-render panel on frame
        constraints.gridx = 0;
        constraints.gridy = 1;
        mainFrame.add(panel, constraints);
    }

}
