package es.miguel.ejercicioformas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
       scene = new Scene(loadFXML("primary"), 640, 480);

        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
         //Cuadrado
         gc.strokeRect(20, 50, 100, 100);
         //Círculo
         gc.strokeOval(150, 50, 100, 100);
         //Circunferencia
         gc.setFill(Color.BLACK);
         gc.fillOval(300, 50, 100, 100);
         //Hexágono
         
         double[] x = {50, 25, 50, 100, 125, 100};
         double[] y = {250, 300, 350, 350, 300, 250};
         int unir = 6;
         gc.strokePolygon(x, y, unir);
         // Figura de Hexágonos
         double[] ejex = {250,225,250,300,325,300};
         double[] ejey = {250, 300, 350, 350, 300, 250};
         int unirPuntos = 6;
         gc.setLineWidth(5);
         gc.strokePolygon(ejex,ejey,unirPuntos);
         
         
         double[] ejex2 = {256,238,256,292,312,292};
         double[] ejey2 = {263, 300, 337, 337, 300, 263};
         int unirPuntos2 = 6;
         gc.setLineWidth(5);
         gc.strokePolygon(ejex2,ejey2,unirPuntos2);
                
         
         double[] ejex3 = {265,250,265,285,300,285};
         double[] ejey3 = {275, 300, 325, 325, 300, 275};
         int unirPuntos3 = 6;
         gc.setLineWidth(5);
         gc.strokePolygon(ejex3,ejey3,unirPuntos3);
         
       
         double[] ejex4 = {273,263,273,278,287,278};
         double[] ejey4 = {287,300,312,312,300,287};
         int unirPuntos4 = 6;
         gc.setLineWidth(5);
         gc.strokePolygon(ejex4,ejey4,unirPuntos4);
         gc.fillPolygon(ejex4,ejey4,unirPuntos4);
         
         
         

        StackPane root = new StackPane();
        root.getChildren().add(canvas);
        scene.setRoot(root);

        stage.setScene(scene);
        stage.show();
        
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
