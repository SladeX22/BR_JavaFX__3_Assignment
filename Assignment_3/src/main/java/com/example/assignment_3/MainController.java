package com.example.assignment_3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController
{
    @FXML
    Label title_lbl;

    @FXML
    Label char_lbl;

    @FXML
    TextField text_txf;

    @FXML
    Button count_btn;

    @FXML
    Button clear_btn;

    @FXML
    void clearChars()
    {
        text_txf.clear();
        char_lbl.setText("Character count: ");
    }

    @FXML
    void countChars()
    {
        int charCount = text_txf.getLength();
        char_lbl.setText("Character count: " + charCount);
    }
}