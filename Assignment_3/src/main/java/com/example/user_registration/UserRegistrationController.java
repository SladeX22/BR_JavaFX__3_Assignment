package com.example.user_registration;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UserRegistrationController
{
    //Labels
    @FXML
    Label title_lbl;

    @FXML
    Label name_lbl;

    @FXML
    Label email_lbl;

    @FXML
    Label password_lbl;

    @FXML
    Label valid_lbl;


    //TextFields
    @FXML
    TextField name_txf;

    @FXML
    TextField email_txf;

    @FXML
    TextField password_txf;


    //Buttons
    @FXML
    Button submit_btn;


    //Functions
    @FXML
    void validateFields()
    {
        boolean emptyName = name_txf.getCharacters().isEmpty();
        boolean emptyEmail = email_txf.getCharacters().isEmpty();
        boolean emptyPassword = password_txf.getCharacters().isEmpty();

        String validText = "";

        if(emptyName || emptyEmail || emptyPassword)
        {
            validText = "Please fill in all text boxes. Missing boxes:";

            if(emptyName)
                validText += " Name";
            if(emptyEmail)
                validText += " Email";
            if(emptyPassword)
                validText += " Password";
        }
        else
        {
            validText = "User Registration Successful";
            name_txf.clear();
            email_txf.clear();
            password_txf.clear();
        }

        valid_lbl.setText(validText);
    }
}