package com.example.projekt;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.lang.constant.Constable;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
  @FXML
  private Button button_one;

    @FXML
    private Button xd;
    @FXML
    public Text testa;
    @FXML
    private AnchorPane one;
    @FXML
    private Text one1;
    @FXML
    public Text tekst;
    @FXML
    public Text lol;
    @FXML
    public Text point1;
    @FXML
    public Text point2;
    @FXML
    private AnchorPane dragi;
    @FXML
    private AnchorPane lols;
    @FXML
    private AnchorPane kuba;
    @FXML
    private Text qwe;
    @FXML
    public ImageView zdjecie1;

    @FXML
    public ImageView zdjecie2;
    @FXML
    private GridPane kkk;
    String id="";
    ImageView aa;
    class plansz{
        String pobrano;
        AnchorPane id2;
    }
    //String id="testa";
    plansz pla = new plansz();
    AnchorPane dawid;
    public Object zdjecie(MouseEvent mouseEvent) {
        aa=zdjecie1;
        return aa;
    }

    public Object zdjeciee(MouseEvent mouseEvent) {
        aa=zdjecie2;
        return aa;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Random generator = new Random();
        String[] slowa = {"a", "b","c"};
        button_one.setText(slowa[generator.nextInt(3)]);
        String a = button_one.getText();
        //System.out.println(a);

        button_one.setOnAction(new EventHandler<ActionEvent>() {

           // public void testaa(MouseEvent mouseEvent) {

           // }
            @Override

            public void handle(ActionEvent event) {

                //String a=testa.getId();
                System.out.println("\n ID zwrocone "+id);
                Text id = new Text();
                id.setText("a");

            }

        });


        kkk.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public Object zwroc(MouseEvent mouseEvent){
                pla.id2 = (AnchorPane) mouseEvent.getPickResult().getIntersectedNode();
                dawid=pla.id2;
                return pla.id2;

            }
            @Override
            public void handle(MouseEvent mouseEvent) {
                //String id = mouseEvent.getSource().toString();
                //zwroc(mouseEvent);
                //pla.id = idd;
                System.out.println(zwroc(mouseEvent));
                pla.id2.getChildren().add(aa);


            }
            //id2.formatted(change);
            //id2.formatted(pla.id);
            //System.out.println(id);



        });
        }


    public void przeciag(DragEvent dragEvent) {
        dragEvent.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        System.out.println("Adsasdadad");
        double curr = dragEvent.getX();
        dragi.getChildren().add(tekst);
       // dragi.translateXProperty();
        dragEvent.consume();
    }

    public void przesun(MouseEvent mouseEvent) {
        Dragboard db = dragi.startDragAndDrop(TransferMode.COPY_OR_MOVE);
        ClipboardContent content = new ClipboardContent();
        content.putString("Sdsaasd");
        db.setContent(content);
        mouseEvent.consume();
    }
        double x,y;
    public double take(MouseEvent mouseEvent) {
        x= mouseEvent.getX();
        System.out.println(point1.getX()+"\n");
        System.out.println(x);
       return x;
    }

    public void change(MouseEvent mouseEvent) {
        
                kuba.getChildren();



        System.out.println(mouseEvent.getX());
    }
    public Constable testaa(MouseEvent mouseEvent) {
        id=testa.getId();
        System.out.println(id);
        qwe.setText("a");
        return id;
    }
    public void kubus(MouseEvent mouseEvent) {
        lols.getChildren().add((ImageView) aa);
        System.out.println(aa);
    }
    AnchorPane b;

}



    /*  @FXML
    private Label userid;

    @FXML
    private Button button_login;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        button_login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DBUtils.changeScene(event,"login.fxml", "kuba", null);
            }
        });
    }
    public void setUserInformation(String username){
        userid.setText("witam kuba "+ username);
   */

