package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button button = new Button("Abrir dialogo con opciones");//creo el boton para mostrar la seleccion

        button.setOnAction(event -> {
            ChoiceDialog<String> dialog = new ChoiceDialog<>("Programacion",//opcion default
                    List.of("Programacion", "Bases de datos", "Entornos de desarrollo"));//lista de opciones
            dialog.setTitle("Selección de opciones");//titulo el dialogo
            dialog.setHeaderText("Elige una Asignatura");//despues el contenido de la ventana
            dialog.setContentText("Asignatura:");

            dialog.showAndWait().ifPresent(opcion ->
                    System.out.println("Asignatura elegida: " + opcion)
            );
        });

        VBox vbox = new VBox(10, button);//coloco el boton

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Eje 22 - ChoiceDialog");
        primaryStage.setScene(scene);
        primaryStage.show();//creo la escena, la titulo, le asigno la ventana y doy visibilidad
    }

    public static void main(String[] args) {
        launch(args); //metodo de aplication para arrancar el programa
    }
}