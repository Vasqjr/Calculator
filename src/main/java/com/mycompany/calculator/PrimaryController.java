package com.mycompany.calculator;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.util.*;

public class PrimaryController {

    String calcValue = "";
    
    @FXML
    private Button buttonSeven;
    
    @FXML
    private TextField calcField;
    
    @FXML
    private void numberWrite(String v) throws IOException{
        calcValue += v;
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
