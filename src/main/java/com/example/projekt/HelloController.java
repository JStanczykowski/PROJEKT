package com.example.projekt;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
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
    public Text slowo1;
    @FXML
    public Text slowo2;
    @FXML
    public Text slowo3;
    @FXML
    public Text slowo4;
    @FXML
    public Text slowo5;
    @FXML
    public Text slowo6;
    @FXML
    public Button losujemyxd;
    @FXML
    public Text slowo7;
    @FXML
    public Text slowo8;
    @FXML
    public Text slowo9;
    @FXML
    private AnchorPane dragi;
    @FXML
    private AnchorPane haha;
    @FXML
    private AnchorPane lols;
    @FXML
    private AnchorPane kuba;
    @FXML
    private AnchorPane pierwsze;
    @FXML
    private AnchorPane drugie;
    @FXML
    private AnchorPane trzecie;
    @FXML
    private AnchorPane czwarte;
    @FXML
    private AnchorPane piate;
    @FXML
    private AnchorPane abcda;
    @FXML
    private AnchorPane szoste;
    @FXML
    private AnchorPane siedem;
    @FXML
    private AnchorPane osiem;
    @FXML
    private Text qwe;
    @FXML
    public ImageView zdjecie1;
    @FXML
    public ImageView zdjecie3;
    @FXML
    public ImageView zdjecie2;
    @FXML
    public ImageView zdjecie4;
    @FXML
    public ImageView zdjecie5;
    @FXML
    public GridPane mainPane;
    @FXML
    public GridPane GridPlansza;
    @FXML
    public ImageView zdjecie6;

    String id = "";
    ImageView aa;
    int punkty=0;
    int kolejnosc = 0;

    public int wynik(MouseEvent mouseEvent) throws InterruptedException {
        Alert a = new Alert(Alert.AlertType.NONE);
        int[] tabela = new int[8];
        a.setAlertType(Alert.AlertType.ERROR);
        a.setContentText("ZLE USTAWIENIE LITER!! POPRAW");
        Alert koniec = new Alert(Alert.AlertType.NONE);

        koniec.setAlertType(Alert.AlertType.ERROR);
        koniec.setContentText("KONIEC GRY! WYSTARCZAJACA ILOSC SLOW \nTwoja ilosc punktow: "+punkty);
        int k = 0, w = 0;
        int pozycja = 0;
        int i = 0, j = 0;
        int temp;
        int suma_pkt=0;
        String ourString = "";
        AnchorPane lipa;
        String slowo;
        for (i = 0; i < 8; i++) {
            if (pla[i].photo != null) {

                lipa = (AnchorPane) pla[i].photo.getParent();
                if(getColumnIndex(lipa)==null)
                    pla[i].setKolumna(0);
                else
                    pla[i].setKolumna(Integer.parseInt(String.valueOf(getColumnIndex(lipa))));

                if(getRowIndex(lipa)==null)
                    pla[i].setWiersz(0);
                else
                    pla[i].setWiersz(Integer.parseInt(String.valueOf(getRowIndex(lipa))));




                if (pla[i].wiersz != 16 && pla[i].uzyty != true) {
                    String jeden= "javafx.scene.layout.Background@25f3c682";
                    String dwa="javafx.scene.layout.Background@cf280c82";
                    String piec="javafx.scene.layout.Background@dc52c682";
                    String osiem="javafx.scene.layout.Background@af3d6782";
                    String plusJeden= "javafx.scene.layout.Background@c6f3c682";
                    String c= String.valueOf(lipa.getBackground());
                    if(c.equals(jeden))
                        suma_pkt += 1;
                    else if(c.equals(dwa))
                        suma_pkt += 3;
                    else if(c.equals(piec))
                        suma_pkt += 6;
                    else if(c.equals(osiem))
                        suma_pkt += 9;
                    else if(c.equals(plusJeden))
                        suma_pkt += 2;
                    tabela[pozycja] = i;

                    pozycja++;
                }

            }
        }
        if (pozycja == 1) {
            ourString = pla[tabela[0]].literka;
            slowkaxd[kolejnosc].setText(ourString);
            kolejnosc++;
            lit.setIm(ind.getIndex(),tabIV[ind.getIndex()]);

            lit.setPhoto(tabIV[ind.getIndex()],ind.getIndex(),pla[tabela[0]].getOld());

            lit.setImage(pla[tabela[0]].getOld(),lit.getIm(ind.getIndex()));

            ind.powieksz();
            if(kolejnosc>=7) {
                koniec.showAndWait();
                Platform.exit();
                System.exit(0);

            }
            punkty+=suma_pkt;
            slowkaxd[kolejnosc].setText(ourString.toUpperCase()+" "+suma_pkt);
            return kolejnosc;
        } else {
            for (i = 0; i < pozycja - 1; i++) {
                if (pla[tabela[i]].equals(pla[tabela[i + 1]], 1) == true) {
                    k++;
                } else if (pla[tabela[i]].equals(pla[tabela[i + 1]], 2) == true)
                    w++;
            }
            if (k == pozycja - 1) {
                System.out.println("Rowne kolumny");

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

                    ourString += pla[tabela[i]].literka;
                    lit.setIm(ind.getIndex(),tabIV[ind.getIndex()]);

                    lit.setPhoto(tabIV[ind.getIndex()],ind.getIndex(),pla[tabela[i]].getOld());

                    lit.setImage(pla[tabela[i]].getOld(),lit.getIm(ind.getIndex()));

                    ind.powieksz();
                }
                if(kolejnosc>=7) {

                    koniec.showAndWait();

                    Platform.exit();
                    System.exit(0);

                }
                punkty+=suma_pkt;
                slowkaxd[kolejnosc].setText(ourString.toUpperCase()+" "+suma_pkt);
                kolejnosc++;

                System.out.println("\n Nasze slowo to: " + ourString);
                System.out.println("wiersze \n" + w + "\n kolumn: " + k + "\n pozycja " + pozycja);
                return kolejnosc;
            } else if (w == pozycja - 1) {

                AnchorPane tempA = new AnchorPane();

                ObservableList<Node> childrens = GridPlansza.getChildren();
                for (Node node : childrens){
                    if(GridPlansza.getRowIndex(node)!=null&&GridPlansza.getColumnIndex(node)!=null) {
                        if (GridPlansza.getRowIndex(node) == 7&&GridPlansza.getColumnIndex(node)==2) {
                            System.out.println(node);
                            tempA= (AnchorPane) node;
                            ImageView tempIV = new ImageView();
                            if(  tempA.getChildren() !=null) {
                                //    tempIV = (ImageView)tempA.getChildren().get(0);
                                //  System.out.println(tempIV.getId());
                            }
                        }
                    }
                }
                System.out.println("Rowne wiersze");


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

                    ourString += pla[tabela[i]].literka;
                    lit.setIm(ind.getIndex(),tabIV[ind.getIndex()]);

                    lit.setPhoto(tabIV[ind.getIndex()],ind.getIndex(),pla[tabela[i]].getOld());

                    lit.setImage(pla[tabela[i]].getOld(),lit.getIm(ind.getIndex()));

                    ind.powieksz();
                }
                if(kolejnosc>=7) {
                    koniec.showAndWait();

                    Platform.exit();
                    System.exit(0);

                }
                punkty+=suma_pkt;
                slowkaxd[kolejnosc].setText(ourString.toUpperCase()+" "+suma_pkt);
                kolejnosc++;

                return kolejnosc;
            }
        }


        if (w != pozycja - 1 && k != pozycja - 1) {
            for(i=0;i<pozycja;i++)
                pla[tabela[i]].getOld().getChildren().add(pla[tabela[i]].getPhoto());

            a.show();
        }

        return 0;


    }

    AnchorPane id2;

    public Object zdjecieKub(MouseEvent mouseEvent) {
        mouseEvent.consume();
        aa=(ImageView) pierwsze.getChildren().get(0);
        return aa;
    }
    int losowania = 2;
    public void losujemy(MouseEvent mouseEvent) {
        Alert error = new Alert(Alert.AlertType.NONE);

        error.setAlertType(Alert.AlertType.ERROR);
        error.setContentText("KONIEC MOZLIWOSCI LOSOWANIA");
        if(losowania>0) {
            losowania--;
            for (int i = ind.getIndex()-1; i > ind.getIndex() - 9; i--) {
                AnchorPane temp = (AnchorPane) tabIV[i].getParent();
                lit.setPhoto(tabIV[i], i, temp);
            }
        }
        else
            error.show();
    }

    class plansz {
        int wiersz;
        int kolumna;
        ImageView photo;
        String literka;
        boolean uzyty;
        AnchorPane old;

        public void setOld(AnchorPane old) {
            this.old = old;
        }

        public AnchorPane getOld() {
            return old;
        }

        public ImageView getPhoto() {
            return photo;
        }

        public void setUzyty(boolean uzyty) {
            this.uzyty = uzyty;
        }

        public void setKolumna(int kolumna) {
            this.kolumna = kolumna;
        }

        public void setWiersz(int wiersz) {
            this.wiersz = wiersz;
        }

        public int getKolumna() {
            return kolumna;
        }

        public int getWiersz() {
            return wiersz;
        }

        public boolean equals(Object obj, int i) {
            if (obj == null) {
                return false;
            }
            if (obj.getClass() != this.getClass()) {
                return false;
            }
            final plansz other1 = (plansz) obj;
            if (i == 1) {
                if (!Objects.equals(this.kolumna, other1.kolumna)) {
                    return false;
                }
            } else if (i == 2) {
                if (!Objects.equals(this.wiersz, other1.wiersz)) {
                    return false;
                }

            }
            return true;
        }
    }

    //String id="testa";
    public class litery {
        int width = 48;
        int height = 48;
        ImageView[] im = new ImageView[100];

        public void setIm(int position, ImageView im) {
            this.im[position] = im;
            this.im[position].setFitHeight(getHeight());
            this.im[position].setFitWidth(getWidth());
        }

        public ImageView getIm(int position) {
            return im[position];
        }

        public int getHeight() {
            return height;
        }

        public int getWidth() {
            return width;
        }


        public  void setImage(AnchorPane a, ImageView b) {
            a.getChildren().add(b);
        }

        public  void setPhoto(ImageView pho, int index,AnchorPane anch) {
            Random generator = new Random();
            int pozycja=0;
            String[] slowa = {"a", "b", "c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","t","u","v","w","x","y","z"};

            String a = slowa[generator.nextInt(25)];
            File file = new File("C:\\Users\\komp\\Desktop\\serwer_skrable\\PROJEKT-28_05_2022\\projekt_java\\PROJEKT-main\\img\\" + a + ".png");
            pho.setImage(new Image(file.toURI().toString()));
            if(anch==drugie) {
                pozycja=1;
            }
            else if(anch==trzecie) {
                pozycja=2;
            }
            else if(anch==czwarte) {
                pozycja=3;
            }
            else if(anch==piate) {
                pozycja=4;
            }
            else if(anch==szoste) {
                pozycja=5;
            }
            else if(anch==siedem) {
                pozycja=6;
            }
            else if(anch==osiem) {
                pozycja=7;
            }
            else if(anch==abcda)
                pozycja=index;
            pla[pozycja].literka = a;
            pla[pozycja].photo = pho;
            pho.setId(a);

        }
    }
    static class thisIndex{
        int index=8;
        void powieksz(){
            this.index++;
        }

        public int getIndex() {
            return index;
        }

    }
    public static class dodawanie{
        public int dodaj(int a, int b){
            return a+b;
        }


    }




    ImageView iv1 = new ImageView();
    ImageView iv2 = new ImageView();
    ImageView iv3 = new ImageView();
    ImageView iv4 = new ImageView();
    ImageView iv5 = new ImageView();
    ImageView iv6 = new ImageView();
    ImageView iv7 = new ImageView();
    ImageView iv8 = new ImageView();
    ImageView iv9 = new ImageView();
    ImageView iv10 = new ImageView();
    ImageView iv11 = new ImageView();
    ImageView iv12 = new ImageView();
    ImageView iv13 = new ImageView();
    ImageView iv14 = new ImageView();
    ImageView iv15 = new ImageView();
    ImageView iv16 = new ImageView();
    ImageView iv17 = new ImageView();
    ImageView iv18 = new ImageView();
    ImageView iv19 = new ImageView();
    ImageView iv20 = new ImageView();
    ImageView iv21 = new ImageView();
    ImageView iv22 = new ImageView();
    ImageView iv23 = new ImageView();
    ImageView iv24 = new ImageView();
    ImageView iv25 = new ImageView();
    ImageView iv26 = new ImageView();
    ImageView iv27 = new ImageView();
    ImageView iv28 = new ImageView();
    ImageView iv29 = new ImageView();
    ImageView iv30 = new ImageView();
    ImageView iv31 = new ImageView();
    ImageView iv32 = new ImageView();
    ImageView iv33 = new ImageView();
    ImageView iv34 = new ImageView();
    ImageView iv35 = new ImageView();
    ImageView iv36 = new ImageView();
    ImageView iv37 = new ImageView();
    ImageView iv38 = new ImageView();
    ImageView iv39 = new ImageView();
    ImageView iv40 = new ImageView();
    ImageView iv41 = new ImageView();
    ImageView iv42 = new ImageView();
    ImageView iv43 = new ImageView();
    ImageView iv44 = new ImageView();
    ImageView iv45 = new ImageView();
    ImageView iv46 = new ImageView();
    ImageView iv47 = new ImageView();
    ImageView iv48 = new ImageView();
    ImageView iv49 = new ImageView();
    ImageView iv50 = new ImageView();
    ImageView iv51 = new ImageView();
    ImageView iv52 = new ImageView();
    ImageView iv53 = new ImageView();
    ImageView iv54 = new ImageView();
    ImageView iv55 = new ImageView();
    ImageView iv56 = new ImageView();
    ImageView iv57 = new ImageView();
    ImageView iv58 = new ImageView();
    ImageView iv59 = new ImageView();
    ImageView iv60 = new ImageView();
    ImageView iv61 = new ImageView();
    ImageView iv62 = new ImageView();
    ImageView iv63 = new ImageView();
    ImageView iv64 = new ImageView();
    ImageView iv65 = new ImageView();
    ImageView iv66 = new ImageView();
    ImageView iv67 = new ImageView();
    ImageView iv68 = new ImageView();
    ImageView iv69 = new ImageView();
    ImageView iv70 = new ImageView();
    ImageView iv71 = new ImageView();
    ImageView iv72 = new ImageView();
    ImageView[] tabIV = {iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12,iv13,iv14,iv15,iv16,iv17,iv18,iv19,iv20,iv21,iv22,iv23,iv24,iv25,iv26,iv27,iv28,iv29,iv30,iv31,iv32,iv33,iv34,iv35,iv36,
            iv37,iv38,iv39,iv40,iv41,iv42,iv43,iv44,iv45,iv46,iv47,iv48,iv49,iv50,iv51,iv52,iv53,iv54,iv55,iv56,iv57,iv58,iv59,iv60,iv61,iv62,iv63,iv64,iv65,iv66,iv67,iv68,iv69,iv70,iv71,iv72};
    //tabIV[0]=iv1;tabIV[1]=iv2;tabIV[2]=iv3;tabIV[3]=iv4;tabIV[4]=iv5;tabIV[5]=iv6;tabIV[6]=iv7;
    String imageSource = "http://yourImageURL";
    Text[] slowkaxd = new Text[20];
    ImageView[] img = new ImageView[100];
    thisIndex ind = new thisIndex();
    litery lit = new litery();
    plansz[] pla = new plansz[8];
    public void sprawdz()  {
        var xdxd = new HelloController.dodawanie();

        if(xdxd.dodaj(2,2)!=4)
            System.out.println("blad");
        else
            System.out.println("dobrze");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sprawdz();

        /*try {
            client = new Client(new Socket("localhost", 1234));

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        slowkaxd[0] = slowo1;
        slowkaxd[1] = slowo2;
        slowkaxd[2] = slowo3;
        slowkaxd[3] = slowo4;
        slowkaxd[4] = slowo5;
        slowkaxd[5] = slowo6;
        slowkaxd[6] = slowo7;
        slowkaxd[7] = slowo8;
        slowkaxd[8] = slowo9;

        pla[0]=new plansz();
        pla[1]=new plansz();
        pla[2]=new plansz();
        pla[3]=new plansz();
        pla[4]=new plansz();
        pla[5]=new plansz();
        pla[6]=new plansz();
        pla[7]=new plansz();
        // button_one.setText(slowa[generator.nextInt(4)]);
        String a =button_one.getText();


        lit.setIm(0,iv1);
        lit.setIm(1,iv2);
        lit.setIm(2,iv3);
        lit.setIm(3,iv4);
        lit.setIm(4,iv5);
        lit.setIm(5,iv6);
        lit.setIm(6,iv7);
        lit.setIm(7,iv8);

        // lit.setPhoto(iv7,6);
        lit.setPhoto(iv1,0,abcda);
        lit.setImage(pierwsze,lit.getIm(0));
        lit.setPhoto(iv2,1,abcda);
        lit.setImage(drugie,lit.getIm(1));
        lit.setPhoto(iv3,2,abcda);
        lit.setImage(trzecie,lit.getIm(2));
        lit.setPhoto(iv4,3,abcda);
        lit.setImage(czwarte,lit.getIm(3));
        lit.setPhoto(iv5,4,abcda);
        lit.setImage(piate,lit.getIm(4));
        lit.setPhoto(iv6,5, abcda);
        lit.setImage(szoste,lit.getIm(5));
        lit.setPhoto(iv7,6, abcda);
        lit.setImage(siedem,lit.getIm(6));
        lit.setPhoto(iv8,7, abcda);
        lit.setImage(osiem,lit.getIm(7));

/*
        GridPlansza.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                //id2.getChildren().add(aa);

            }
        });*/
        //client.receiveMessageFromServer(GridPlansza, id2);
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


        GridPlansza.setOnMouseClicked(new EventHandler<MouseEvent>() {
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
                GridPane temp = new GridPane();
                Alert test = new Alert(Alert.AlertType.NONE);
                test.setAlertType(Alert.AlertType.ERROR);
                test.setContentText("TO NIES JEST PLANSZA!!");


                id2 = (AnchorPane) mouseEvent.getPickResult().getIntersectedNode();

                temp = (GridPane) id2.getParent();
                if(GridPlansza.getId().equals(temp.getId()))
                    return id2;
                else {
                    test.showAndWait();
                    return null;
                }




            }

            //id2.formatted(change);
            //id2.formatted(pla.id);
            //System.out.println(id);



        });
    }

    public Object zdjecie(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[0].photo= (ImageView) pierwsze.getChildren().get(0);
        pla[0].setOld(pierwsze);
        if(pla[0].uzyty!=true) {
            aa=(ImageView) pierwsze.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;
    }

    public Object zdjeciee(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[1].photo= (ImageView) drugie.getChildren().get(0);
        pla[1].setOld(drugie);
        if(pla[1].uzyty!=true) {
            aa=(ImageView) drugie.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;

    }
    public Object zdjecieee(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[2].photo= (ImageView) trzecie.getChildren().get(0);
        pla[2].setOld(trzecie);
        if(pla[2].uzyty!=true) {
            aa=(ImageView) trzecie.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;

    }
    public Object zdjecie4(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[3].photo= (ImageView) czwarte.getChildren().get(0);
        pla[3].setOld(czwarte);
        if(pla[3].uzyty!=true) {
            aa=(ImageView) czwarte.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;

    }
    public Object zdjecie5(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[4].photo= (ImageView) piate.getChildren().get(0);
        pla[4].setOld(piate);
        if(pla[4].uzyty!=true) {
            aa=(ImageView) piate.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;

    }
    public Object zdjecie6(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[5].photo= (ImageView) szoste.getChildren().get(0);
        pla[5].setOld(szoste);
        if(pla[5].uzyty!=true) {
            aa=(ImageView) szoste.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;

    }
    public Object zdjecie7(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[6].photo= (ImageView) siedem.getChildren().get(0);
        pla[6].setOld(siedem);
        if(pla[6].uzyty!=true) {
            aa=(ImageView) siedem.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
        return aa;

    }
    public Object zdjecie8(MouseEvent mouseEvent) {
        mouseEvent.consume();
        pla[7].photo= (ImageView) osiem.getChildren().get(0);
        pla[7].setOld(osiem);
        if(pla[7].uzyty!=true) {
            aa=(ImageView) osiem.getChildren().get(0);
        }
        else aa=null;
        System.out.println(aa);
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

