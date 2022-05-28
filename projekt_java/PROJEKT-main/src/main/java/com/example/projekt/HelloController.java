package com.example.projekt;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.io.File;
import java.lang.constant.Constable;
import java.net.URL;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;

import static java.sql.Types.NULL;
import static javafx.scene.layout.GridPane.getColumnIndex;
import static javafx.scene.layout.GridPane.getRowIndex;

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
    private AnchorPane haha;
    @FXML
    private AnchorPane lols;
    @FXML
    private AnchorPane kuba;
    @FXML
    private Text qwe;
    @FXML
    public ImageView zdjecie1;
    @FXML
    public ImageView zdjecie3;

    @FXML
    public ImageView zdjecie2;
    @FXML
    private GridPane kkk;
    String id="";
    ImageView aa;



    public void wynik(MouseEvent mouseEvent) {
        int[] tabela = new int[3];
        int pozycja=0;
        String ourString ="";
        AnchorPane lipa;
        String slowo;
        for (int i=0;i<3;i++) {
           if (pla[i].photo!=null) {
               lipa = (AnchorPane) pla[i].photo.getParent();
               pla[i].setWiersz(Integer.parseInt(String.valueOf(getRowIndex(lipa))));
               pla[i].setKolumna(Integer.parseInt(String.valueOf(getColumnIndex(lipa))));
               if (pla[i].wiersz != 16 && pla[i].uzyty != true) {
                   tabela[pozycja] = i;
                   pozycja++;
               }
           }
        }
        if (tabela.length == 1) {
            ourString=pla[tabela[0]].literka;
            System.out.println("\n Nasze slowo to: " + ourString);
        }else {
            if (pla[tabela[0]].equals(pla[tabela[1]], 1)) {
                System.out.println("Rowne kolumny");
                int i, j, temp;
                for (i = 0; i < pozycja; ++i) {
                    for (j = 0; j < pozycja - 1 - i; ++j) {
                        if (pla[tabela[j]].wiersz > pla[tabela[j + 1]].wiersz) {

                            temp = tabela[j + 1];
                            tabela[j + 1] = tabela[j];
                            tabela[j] = temp;
                        }
                    }
                }
                //tabela[i]
                for (i = 0; i < pozycja; ++i) {
                    pla[tabela[i]].setUzyty(true);
                    ourString += pla[tabela[i]].literka;

                }
                System.out.println("\n Nasze slowo to: " + ourString);
            }


            if (pla[tabela[0]].equals(pla[tabela[1]], 2)) {
                System.out.println("Rowne wiersze");
                int i, j, temp;
                for (i = 0; i < pozycja; ++i) {
                    for (j = 0; j < pozycja - 1 - i; ++j) {
                        if (pla[tabela[j]].kolumna > pla[tabela[j + 1]].kolumna) {
                            temp = tabela[j + 1];
                            tabela[j + 1] = tabela[j];
                            tabela[j] = temp;
                        }
                    }
                }

                for (i = 0; i < pozycja; ++i) {
                    pla[tabela[i]].setUzyty(true);
                    ourString += pla[tabela[i]].literka;

                }
                System.out.println("\n Nasze slowo to: " + ourString);
            }
        }
    }
    AnchorPane id2;
    class plansz{
        int wiersz;
        int kolumna;
        ImageView photo;
        String literka;
        boolean uzyty;


        public void setUzyty(boolean uzyty) {
            this.uzyty = uzyty;
        }

        public void setKolumna(int kolumna) {
            this.kolumna = kolumna;
        }
        public void setWiersz(int wiersz) {
            this.wiersz = wiersz;
        }
        public boolean equals(Object obj, int i) {
            if (obj == null) {
                return false;
            }
            if (obj.getClass() != this.getClass()) {
                return false;
            }
            final plansz other1 = (plansz) obj;
            if(i==1) {
                if (!Objects.equals(this.kolumna, other1.kolumna)) {
                    return false;
                }
            }
            else if(i==2){
                if (!Objects.equals(this.wiersz, other1.wiersz)) {
                    return false;
                }

            }
            return true;
        }
    }
    //String id="testa";


    AnchorPane dawid;

    String imageSource = "http://yourImageURL";

    plansz[] pla = new plansz[3];
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        pla[0]=new plansz();
        pla[1]=new plansz();
        pla[2]=new plansz();
        Random generator = new Random();
        String[] slowa = {"A", "B","C"};
        button_one.setText(slowa[generator.nextInt(3)]);
        String a =button_one.getText();
        File file = new File("C:\\Users\\hp\\Desktop\\projekt_java\\PROJEKT-main\\src\\main\\java\\com\\example\\projekt\\"+a+".png");

        zdjecie1.setImage( new Image(file.toURI().toString()));
        button_one.setText(slowa[generator.nextInt(3)]);
        String b =button_one.getText();
        File file2 = new File("C:\\Users\\hp\\Desktop\\projekt_java\\PROJEKT-main\\src\\main\\java\\com\\example\\projekt\\"+b+".png");
        button_one.setText(slowa[generator.nextInt(3)]);
        String c =button_one.getText();
        File file3 = new File("C:\\Users\\hp\\Desktop\\projekt_java\\PROJEKT-main\\src\\main\\java\\com\\example\\projekt\\"+c+".png");

        pla[0].literka=a;
        pla[1].literka=b;
        pla[2].literka=c;
        zdjecie2.setImage( new Image(file2.toURI().toString()));
        zdjecie3.setImage( new Image(file3.toURI().toString()));


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
            @Override
            public void handle(MouseEvent mouseEvent) {
                //String id = mouseEvent.getSource().toString();
                //zwroc(mouseEvent);
                //pla.id = idd;
                System.out.println(zwroc(mouseEvent));
                id2.getChildren().add(aa);
               // System.out.println(GridPane.getRowIndex(id2));
              //  AnchorPane lipa = (AnchorPane) aa.getParent();
               // System.out.println(GridPane.getColumnIndex(lipa));
               // System.out.println(GridPane.getColumnIndex(id2));

            }
            public Object zwroc(MouseEvent mouseEvent){
                id2 = (AnchorPane) mouseEvent.getPickResult().getIntersectedNode();
                dawid=id2;


                return id2;

            }

            //id2.formatted(change);
            //id2.formatted(pla.id);
            //System.out.println(id);



        });
        }

    public Object zdjecie(MouseEvent mouseEvent) {
        pla[0].photo=zdjecie1;
        if(pla[0].uzyty!=true) {
            aa = zdjecie1;
        }
        else aa=null;
            return aa;

    }

    public Object zdjeciee(MouseEvent mouseEvent) {
        pla[1].photo=zdjecie2;
        if(pla[1].uzyty!=true) {
            aa = zdjecie2;
        }
        else aa=null;
            return aa;

    }
    public Object zdjecieee(MouseEvent mouseEvent) {
        pla[2].photo=zdjecie3;
        if(pla[2].uzyty!=true) {
            aa = zdjecie3;
        }
        else aa=null;
            return aa;

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

