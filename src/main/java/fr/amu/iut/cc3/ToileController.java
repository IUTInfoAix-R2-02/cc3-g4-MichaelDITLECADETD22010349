package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;
    @FXML
    private TextField comp1 = new TextField();
    private TextField comp2 = new TextField();
    private TextField comp3 = new TextField();
    private TextField comp4 = new TextField();
    private TextField comp5 = new TextField();
    private TextField comp6 = new TextField();
    private Button tracer = new Button();

    private Circle circle1 = new Circle();
    private Circle circle2 = new Circle();
    private Circle circle3 = new Circle();
    private Circle circle4 = new Circle();
    private Circle circle5 = new Circle();
    private Circle circle6 = new Circle();


    private EventHandler<ActionEvent> gestionnaireEvenement;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }


    @FXML
    public void tracerPoints(){
        double X1 = getXRadarChart(Double.parseDouble(comp1.getText()), 1);
        double Y1 = getYRadarChart(Double.parseDouble(comp1.getText()), 1);
        // action event
            gestionnaireEvenement = (event) -> {
            {
                circle1.setCenterX(X1);
                circle1.setCenterY(Y1);
            }
        };
        double X2 = getXRadarChart(Double.parseDouble(comp2.getText()), 2);
        double Y2 = getYRadarChart(Double.parseDouble(comp2.getText()), 2);
        // action event
        gestionnaireEvenement = (event) -> {
            {
                circle2.setCenterX(X2);
                circle2.setCenterY(Y2);
            }
        };
        double X3 = getXRadarChart(Double.parseDouble(comp3.getText()), 3);
        double Y3 = getYRadarChart(Double.parseDouble(comp3.getText()), 3);
        // action event
        gestionnaireEvenement = (event) -> {
            {
                circle3.setCenterX(X3);
                circle3.setCenterY(Y3);
            }
        };
        double X4 = getXRadarChart(Double.parseDouble(comp4.getText()), 4);
        double Y4 = getYRadarChart(Double.parseDouble(comp4.getText()), 4);
        // action event
        gestionnaireEvenement = (event) -> {
            {
                circle4.setCenterX(X4);
                circle4.setCenterY(Y4);
            }
        };
        double X5 = getXRadarChart(Double.parseDouble(comp5.getText()), 5);
        double Y5 = getYRadarChart(Double.parseDouble(comp5.getText()), 5);
        // action event
        gestionnaireEvenement = (event) -> {
            {
                circle5.setCenterX(X5);
                circle5.setCenterY(Y5);
            }
        };
        double X6 = getXRadarChart(Double.parseDouble(comp6.getText()), 6);
        double Y6 = getYRadarChart(Double.parseDouble(comp6.getText()), 6);
        // action event
        gestionnaireEvenement = (event) -> {
            {
                circle6.setCenterX(X6);
                circle6.setCenterY(Y6);
            }
        };
// when button is pressed
        this.tracer.setOnAction(gestionnaireEvenement);
    }


}
