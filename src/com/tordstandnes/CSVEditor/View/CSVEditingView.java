package com.tordstandnes.CSVEditor.View;

import javax.swing.*;
import java.awt.*;

public class CSVEditingView {
    private Panel panel;


    public CSVEditingView(){
        System.out.println("CSVEditingMenu init");

        //Create a open space in the frame
        panel = new Panel();

        //Orders the elements below eachother
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        //Fills open space with content

        //Lode file button
        Button lodeFileButton = new Button("Load File");
        panel.add(lodeFileButton);

        //Save file button
        Button saveFileButton = new Button("Save File");
        panel.add(saveFileButton);

        //Original separator selector
        Label originalSeparatorLabel = new Label("Select the separator from the loaded file:");
        TextField originalSeparator = new TextField("For example ; or ,");
        panel.add(originalSeparatorLabel);
        panel.add(originalSeparator);

        //Wanted separator selector
        Label wantedSeparatorLabel = new Label("Select the separator you want in the final file:");
        TextField wantedSeparator = new TextField("For example ; or ,");
        panel.add(wantedSeparatorLabel);
        panel.add(wantedSeparator);

        //Swap x list...
        Choice xList = new Choice();
        xList.add("X list");
        panel.add(xList);

        //...With Y list
        Choice yList = new Choice();
        yList.add("Y list");
        panel.add(yList);
    }


    public void render(Frame mainFrame, GridBagConstraints constraints){
        //Renders or re-render panel on frame
        constraints.gridx = 0;
        constraints.gridy = 0;
        mainFrame.add(panel, constraints);
    }

}
