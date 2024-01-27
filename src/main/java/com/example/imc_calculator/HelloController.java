package com.example.imc_calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import static java.lang.String.format;


public class HelloController {
    @FXML
    //label that changes depending from the imc
    private Label IMCLABEL;

    @FXML
    //weight text field
    private TextField weight1;

    @FXML
    //height textfield
    private TextField height1;

    //weight read from textfield
    int weight2;

    //height read from textfield
    float height2;

    @FXML
    //the circle that gets colourd once the imc is calculated and stated the imc status
    Circle circle;

    //this function read the data from the gui , and call the function calculates with the data read.
    public void submit(ActionEvent event){
        try {
            weight2 = Integer.parseInt(weight1.getText());
            height2 = Float.parseFloat(height1.getText());
            System.out.println(Calculate(weight2, height2));
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }

    //the function that calculates the imc and fills the circle
    protected float Calculate(int a , float b){
        float imc=(float) a / (b * b);

        if(imc <18.5 ){
            IMCLABEL.setText(imc +"  UnderWeight !");
            circle.setFill(Color.BLUE);
        }
        if(imc >= 18.5 && imc < 25){
            IMCLABEL.setText(imc +"  Normal !");
            circle.setFill(Color.GREEN);
        }
        if(imc >=25 && imc < 30){
            IMCLABEL.setText(imc + "  OverWeight !");
            circle.setFill(Color.YELLOW);
        }
        if(imc >=30 && imc <40){

            IMCLABEL.setText(imc + " Obese ! ");
            circle.setFill(Color.ORANGE);
        }
        if(imc > 40 ){
            IMCLABEL.setText(imc + "  Extremly Obese ! ");
            circle.setFill(Color.RED);
        }

        return imc;


    }

    // protected void



}