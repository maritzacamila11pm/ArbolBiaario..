package com.arboles.arbolbinariofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        int canvasWidth = 1000;
        int canvasHeight = 600;
        double nodeRadius = 10;
        double verticalSeparation = 40;

        ArbolVisual arbol = new ArbolVisual(nodeRadius, verticalSeparation);

        Canvas canvas = new Canvas(canvasWidth, canvasHeight);
        arbol.setCanvas(canvas);

        BorderPane root = new BorderPane();
        root.setCenter(canvas);

        Scene scene = new Scene(root, canvasWidth, canvasHeight);

        /*arbol.insertar(9);
        arbol.insertar(4);
        arbol.insertar(85);
        arbol.insertar(7);
        arbol.insertar(40);
        arbol.insertar(90);
        arbol.insertar(6);
        arbol.insertar(22);
        arbol.insertar(47);
        arbol.insertar(88);
        arbol.insertar(94);
        arbol.insertar(11);
        arbol.insertar(37);
        arbol.insertar(39);


        // Datos en el orden del árbol binario completo
        int[] datos = {
                97, 88, 95, 66, 55, 95, 48, 66, 35, 48, 55, 62, 77, 25, 38, 18, 40, 30, 26, 24
        };
        int[][] matriz = new int[20][20];
        matriz[0][1] = 1;  // 97 -> 88
        matriz[0][2] = 1;  // 97 -> 95
        matriz[1][3] = 1;  // 88 -> 66
        matriz[1][4] = 1;  // 88 -> 55
        matriz[2][5] = 1;  // 95 -> 95
        matriz[2][6] = 1;  // 95 -> 48
        matriz[3][7] = 1;   // 66 -> 66
        matriz[3][8] = 1;   // 66 -> 35
        matriz[4][9] = 1;   // 55 -> 48
        matriz[4][10] = 1;  // 55 -> 55
        matriz[5][11] = 1;  // 95 -> 62
        matriz[5][12] = 1;  // 95 -> 77
        matriz[6][13] = 1;  // 48 -> 25
        matriz[6][14] = 1;  // 48 -> 38
        matriz[7][15] = 1;  // 66 -> 18
        matriz[7][16] = 1;  // 66 -> 40
        matriz[8][17] = 1;  // 35 -> 30
        matriz[8][18] = 1;  // 35 -> 26
        matriz[9][19] = 1;  // 48 -> 24

        arbol.construirDesdeMatrizConDatos(matriz,datos);
*/
        arbol.insertar(97);
        arbol.insertar(88);
        arbol.insertar(95);
        arbol.insertar(66);
        arbol.insertar(55);
        arbol.insertar(95);
        arbol.insertar(48);
        arbol.insertar(66);
        arbol.insertar(35);
        arbol.insertar(48);
        arbol.insertar(55);
        arbol.insertar(62);
        arbol.insertar(77);
        arbol.insertar(25);
        arbol.insertar(38);
        arbol.insertar(18);
        arbol.insertar(40);
        arbol.insertar(30);
        arbol.insertar(26);
        arbol.insertar(24);


        arbol.dibujarArbol(canvasWidth);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Árbol Binario Visual");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
