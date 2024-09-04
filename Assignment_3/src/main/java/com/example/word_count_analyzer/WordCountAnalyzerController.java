package com.example.word_count_analyzer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class WordCountAnalyzerController
{
    //Labels
    @FXML
    Label title_lbl;

    @FXML
    Label word_lbl;

    @FXML
    Label char_lbl;

    //Text Areas
    @FXML
    TextArea text_txa;

    //Buttons
    @FXML
    Button wordCount_btn;

    @FXML
    Button charCount_btn;

    //Functions
    @FXML
    void countWords()
    {
        int wordCount = text_txa.getText().split(" ").length;
        word_lbl.setText("Word Count: " + wordCount);
    }

    @FXML
    void countChars()
    {
        int charCount = text_txa.getLength();
        char_lbl.setText("Character Count: " + charCount);
    }

}