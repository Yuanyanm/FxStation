package com;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginStage extends Application {

    @Override
    public void start(Stage pkStage) throws Exception{

        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
        //Application.setUserAgentStylesheet((getClass().getResource("MainStyle.css").toExternalForm()));//全局CSS
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        pkStage.setTitle("我是窗口标题");//窗口标题
        //pkStage.setScene(new Scene(root, 320, 200));
        pkStage.getIcons().add(new Image("assets/imgs/title/yl_.png"));//标题Icon图标
        Scene pkScene = new Scene(root);
        pkScene.getStylesheets().add(getClass().getResource("MainStyle.css").toExternalForm());
        pkStage.setScene(pkScene);
        //pkStage.setAlwaysOnTop(true);//始终位于顶层显示
        pkStage.setResizable(true);//禁止调整窗口大小
        //pkStage.setFullScreen(true);
        //pkStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);//退出全屏模式按键
        //pkStage.setFullScreenExitKeyCombination(KeyCombination.Modifier(KeyCode.F11));//退出全屏模式按键
        //pkStage.initStyle(StageStyle.UNDECORATED);//设定窗口无边框
        pkStage.initStyle(StageStyle.DECORATED);//全屏时默认无边框，ESC后显示边框
        pkStage.widthProperty().addListener(new StageChangeListener(pkStage));//窗口大小改变事件
        pkStage.show();
    }

    public static void main(String[] args) {
        //testFunc();
        launch(args);
        // 创建与微软应用程序的新连接。传入的参数是注册表中注册的程序的名称。
        /*ActiveXComponent sap = new ActiveXComponent("Sapi.SpVoice");
        Dispatch sapo = sap.getObject();
        try {
            // 音量 0-100
            sap.setProperty("Volume", new Variant(100));
            // 语音朗读速度 -10 到 +10(越小语速越慢-1,-2最适宜)
            sap.setProperty("Rate", new Variant(-2.6));
           // Variant defalutVoice = sap.getProperty("Voice");
           // Dispatch dispdefaultVoice = defalutVoice.toDispatch();
           // Variant allVoices = Dispatch.call(sapo, "GetVoices");
            //Dispatch dispVoices = allVoices.toDispatch();
            //Dispatch setvoice = Dispatch.call(dispVoices, "Item", new Variant(2)).toDispatch();
            //ActiveXComponent voiceActivex = new ActiveXComponent(dispdefaultVoice);
            //ActiveXComponent setvoiceActivex = new ActiveXComponent(setvoice);
            //Variant item = Dispatch.call(setvoiceActivex, "GetDescription");
            // 执行朗读
            Dispatch.call(sapo, "Speak", new Variant("请25号兰静到儿保诊室2就诊"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭应用程序连接
            sapo.safeRelease();
            sap.safeRelease();
        }*/
        //System.exit(0);

    }
    public static void testFunc(){
        try {
            //Runtime run = Runtime.getRuntime();
            //Process exec = run.exec("net time \\\\201.10.10.196 /set /y");
            System.out.println("=================");
           // Runtime.getRuntime().exec("cmd /c date 2013-05-06");//Windows 系统
            Runtime.getRuntime().exec("runas /user:administrator cmd /c time 22:35:00");//Windows 系统
            System.out.println("设置成功");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           /* String webUrl = "http://201.10.10.196";// bjTime
        URL url = new URL(webUrl);
        URLConnection conn = null;
            conn = url.openConnection();
            conn.connect();
            long dateL = conn.getDate();
            Date date = new Date(dateL);
            SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
            System.out.println(dateFormat.format(date));*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // StageChangeListener窗体变化监听
    class StageChangeListener implements ChangeListener<Number> {
        Stage stage;
        public StageChangeListener(Stage stage){
            this.stage = stage;
        }
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            double stageWidth = stage.getWidth();
            Scene scene = stage.getScene();
            //窗体宽度大于400，自动设置为全屏模式,且去掉外边框
            System.out.println("width:"+stage.getWidth() +"  height:"+stage.getHeight());
            ObservableList<String> stylesheets = scene.getStylesheets();
            if(stageWidth > 600){
                stage.setFullScreen(true);//无边框全屏，ESC退出
                scene.getStylesheets().clear();
                scene.getStylesheets().add(getClass().getResource("MainStyle_max.css").toExternalForm());
                /*Application.setUserAgentStylesheet(null);
                Application.setUserAgentStylesheet(STYLESHEET_MODENA);*/
               // Application.setUserAgentStylesheet(getClass().getResource("MainStyle_max.css").toExternalForm());
                for (int i = 0; i < stylesheets.size(); i++) {
                    System.out.println("000000 "+stylesheets.get(i));
                }
            }else{
                //清除所有样式，重新添加样式
                scene.getStylesheets().clear();
                scene.getStylesheets().add(getClass().getResource("MainStyle.css").toExternalForm());
                /*Application.setUserAgentStylesheet(null);
                Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);*/
                //Application.setUserAgentStylesheet((getClass().getResource("MainStyle.css").toExternalForm()));//全局CSS
                for (int i = 0; i < stylesheets.size(); i++) {
                    System.out.println("1111111 "+stylesheets.get(i));
                }
            }
            //stage.getIcons().add(new Image("imgs/title/ww_.png"));
        }
    }

    // KeyKeyEventListener键盘事件监听
    class KeyKeyEventHandler implements EventHandler<KeyEvent> {
        Stage stage;
        public KeyKeyEventHandler(Stage stage){
            this.stage = stage;
        }
        @Override
        public void handle(KeyEvent event) {
            System.out.println("键盘事件："+event.getCode().getName());
        }
    }
}
