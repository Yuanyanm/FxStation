package com.lqyfby.app.led.stage;

import com.LoginStage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ledStage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pkStage) throws Exception {
        //Step.2 获取系统数据(用以动态生成led排号界面)
        //Step.3 初始化并“渲染”界面要素
        //initUI(pkStage);

        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        //Application.setUserAgentStylesheet((getClass().getResource("MainStyle.css").toExternalForm()));//全局CSS
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ledStation.fxml"));
        //pkStage.setTitle("我是窗口标题");//窗口标题
        //pkStage.setScene(new Scene(root, 320, 200));
        pkStage.getIcons().add(new Image("assets/imgs/title/yl_.png"));//标题Icon图标
        Scene pkScene = new Scene(root);
        //pkScene.getStylesheets().add(getClass().getResource("MainStyle.css").toExternalForm());
        pkStage.setScene(pkScene);
        //pkStage.setAlwaysOnTop(true);//始终位于顶层显示
        pkStage.setResizable(true);//禁止调整窗口大小
        //pkStage.setFullScreen(true);
        //pkStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);//退出全屏模式按键
        //pkStage.setFullScreenExitKeyCombination(KeyCombination.Modifier(KeyCode.F11));//退出全屏模式按键
        //pkStage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        pkStage.initStyle(StageStyle.DECORATED);//全屏时默认无边框，ESC后显示边框
        //pkStage.widthProperty().addListener(new LoginStage.StageChangeListener(pkStage));//窗口大小改变事件
        pkStage.show();

    }

    public void func(Stage pkStage){
        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-background-color: rgb(78.0,163.0,248.0);");
        gridPane.setPrefHeight(32);
        gridPane.setAlignment(Pos.CENTER_LEFT);
        Label label = new Label("title");
        label.setFont(Font.font(14));
        label.setTextFill(Paint.valueOf("white"));
        //ImageView imageView = new ImageView(MixunResourcesManager.getInstance().getDataImage(StringResource.DEFAULT_ICON));
        ImageView imageView = new ImageView();
        imageView.setFitHeight(24);
        imageView.setFitWidth(24);
        label.setGraphic(imageView);
        Button minButton = new Button("—");
        Button amxButton = new Button("口");
        Button closeButton = new Button("X");
        minButton.setStyle("-fx-base: rgb(243,243,243); -fx-border-color: rgb(243,243,243); -fx-border-width: 0.1; "
                + "-fx-max-height: infinity;-fx-text-fill: white ; -fx-border-image-insets: 0;");
        amxButton.setStyle("-fx-base: rgb(243,243,243); -fx-border-color: rgb(243,243,243); -fx-border-width: 0.1; "
                + "-fx-max-height: infinity;-fx-text-fill: white ; -fx-border-image-insets: 0;");
        closeButton.setStyle("-fx-base: rgb(255,128,128); -fx-border-color: rgb(243,243,243); -fx-border-width: 0.1; "
                + "-fx-max-height: infinity;-fx-text-fill: white ; -fx-border-image-insets: 0;");
        minButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pkStage.setIconified(true);
            }
        });
        amxButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pkStage.setMaximized(!pkStage.isMaximized());
            }
        });
        closeButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                pkStage.close();
            }
        });
        gridPane.addColumn(0, label);
        GridPane.setHgrow(label, Priority.ALWAYS);
        gridPane.addColumn(1, minButton);
        gridPane.addColumn(2, amxButton);
        gridPane.addColumn(3, closeButton);
        //box.getChildren().add(gridPane);
        Scene scene = new Scene(gridPane);
        pkStage.setScene(scene);
        pkStage.show();
    }

    public void initUI(Stage pkStage) throws IOException {
        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        //Application.setUserAgentStylesheet((getClass().getResource("MainStyle.css").toExternalForm()));//全局CSS
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        pkStage.setTitle("我是窗口标题");//窗口标题
        //pkStage.setScene(new Scene(root, 320, 200));
        pkStage.getIcons().add(new Image("assets/imgs/title/yl_.png"));//标题Icon图标
        Scene pkScene = new Scene(root);
        //pkScene.getStylesheets().add(getClass().getResource("MainStyle.css").toExternalForm());
        pkStage.setScene(pkScene);
        //pkStage.setAlwaysOnTop(true);//始终位于顶层显示
        pkStage.setResizable(true);//禁止调整窗口大小
        //pkStage.setFullScreen(true);
        //pkStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);//退出全屏模式按键
        //pkStage.setFullScreenExitKeyCombination(KeyCombination.Modifier(KeyCode.F11));//退出全屏模式按键
        //pkStage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        pkStage.initStyle(StageStyle.DECORATED);//全屏时默认无边框，ESC后显示边框
        //pkStage.widthProperty().addListener(new LoginStage.StageChangeListener(pkStage));//窗口大小改变事件
        pkStage.show();
    }
}
