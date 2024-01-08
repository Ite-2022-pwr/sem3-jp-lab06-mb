package pwr.ite.bedrylo.keeper.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pwr.ite.bedrylo.BaseServer;
import pwr.ite.bedrylo.RequestHandler;
import pwr.ite.bedrylo.keeper.logic.KeeperLogic;

import java.io.IOException;

public class HelloController {
    
    private RequestHandler keeperLogic = KeeperLogic.getInstance();
    
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        BaseServer keeperServer = new BaseServer(2137,"localhost", keeperLogic);
        Platform.runLater(()->{
            try {
                keeperServer.start(false);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        welcomeText.setText("server wstał");
    }
}