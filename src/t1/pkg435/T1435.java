/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1.pkg435;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author NewUser
 */
public class T1435 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Componentes
        Text texto = new Text(20, 20, "A");
        
        Pane root = new Pane();
        root.getChildren().add(texto);
        
        Scene scene = new Scene(root, 205, 80);
        
        //Eventos
        scene.setOnKeyPressed(keyEvent -> {
            
           switch ( keyEvent.getCode() )
           {
               //Mueve la tecla 10 píxeles abajo/arriba/izquierda/derecha
               case DOWN:
                   texto.setY( (texto.getY() )+10);
                   break;
               case UP:
                   texto.setY( (texto.getY() ) -10);
                   break;
               case LEFT:
                   texto.setX( (texto.getX() )-10);
                   break;
               case RIGHT:
                   texto.setX( (texto.getX() )+10);
           }
        }
        );
       
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
