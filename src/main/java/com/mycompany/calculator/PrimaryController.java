package com.mycompany.calculator;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.*;

public class PrimaryController {

    String calcString1 = "";
    String calcString2 = "";
    double value1 = 0.0;
    double value2 = 0.0;
    double answer = 0.0;
    
    @FXML
    private TextField calcField1;
    
    @FXML
    private TextField calcField2;
    
    @FXML
    private TextField calcField3;
    
    @FXML
    private TextField answerField;
    
    @FXML
    private void numberWrite(String v) throws IOException{
        if(calcField2.getText() == ""){
            calcString1 += v;
            calcField1.setText(calcString1);
        }
        else{
            calcString2 += v;
            calcField3.setText(calcString2);
        }
    }
    
    @FXML
    private void numberAdd(){
        calcField2.setText("+");
    }
    
    @FXML
    private void numberMult(){
        calcField2.setText("x");
    }
    
    @FXML
    private void numberDivide(){
        calcField2.setText("/");
    }
    
    @FXML
    private void numberSub(){
        calcField2.setText("-");
    }
    
    @FXML
    private void numberEquals(){
        value1 = Double.parseDouble(calcString1);
        value2 = Double.parseDouble(calcString2);
        
        if(calcField2.getText().equalsIgnoreCase("+") == true){
            answer = value1 + value2;
            answerField.setText(Double.toString(answer));
        }
        else if(calcField2.getText().equalsIgnoreCase("x") == true){
            answer = value1 * value2;
            answerField.setText(Double.toString(answer));
        }
        else if(calcField2.getText().equalsIgnoreCase("-") == true){
            answer = value1 - value2;
            answerField.setText(Double.toString(answer));
        }
        else if(calcField2.getText().equalsIgnoreCase("/") == true){
            answer = value1 / value2;
            answerField.setText(Double.toString(answer));
        }
    }
    
    @FXML
    public void handleButtonOne() throws IOException{
        numberWrite("1");
    }
    
    @FXML
    public void handleButtonTwo() throws IOException{
        numberWrite("2");
    }
    
    @FXML
    public void handleButtonThree() throws IOException{
        numberWrite("3");
    }
    
    @FXML
    public void handleButtonFour() throws IOException{
        numberWrite("4");
    }
    
    @FXML
    public void handleButtonFive() throws IOException{
        numberWrite("5");
    }
    
    @FXML
    public void handleButtonSix() throws IOException{
        numberWrite("6");
    }
    
    @FXML
    public void handleButtonSeven() throws IOException{
        numberWrite("7");
    }
    
    @FXML
    public void handleButtonEight() throws IOException{
        numberWrite("8");
    }
    
    @FXML
    public void handleButtonNine() throws IOException{
        numberWrite("9");
    }
    
    @FXML
    public void handleButtonZero() throws IOException{
        numberWrite("0");
    }
}
