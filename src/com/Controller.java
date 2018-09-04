package com;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label lab_UserNo;
    @FXML
    private TextField txtUserNo;
    @FXML
    private PasswordField txtUserPwd;
    @FXML
    private Button btnLoginIn;
    @FXML
    private Button btnReset;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("init......");
        //lab_UserNo.setFont(new Font(AppConstant.APP_FONT_SIZE));
    }

    @FXML
    public void btnLoginInOnClick(ActionEvent actionEvent){
        /*Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setContentText(txtUserNo.getText());
        alert.show();*/
    }

}
