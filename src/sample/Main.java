package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception{
        Group root = new Group();
        Scene scene = new Scene(root, Color.RED);
        stage.setScene(scene);
        //the following code is used for the exit full screen for our desktop application
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("press a to exit");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("a"));
       Text text = new Text();
       text.setText("What is your name? ");
       text.setX(10);
       text.setY(20);
       text.setFont(Font.font("verdana",20));
//adding the image to the top stage of the our stage title
        Image img = new Image("profilem.jpg");
        stage.getIcons().add(img);
        stage.setX(00);
        stage.setY(00);
        stage.setWidth(600);
        stage.setHeight(600);
        stage.setTitle("miretu jaleta chala");
//        adding the line to our projects
        Line line = new Line();
        line.setStartX(0);
        line.setStartY(30);
        line.setEndX(500);
        line.setEndY(30);
        line.setStrokeWidth(5);
        line.setStroke(Color.BLACK);
        line.setRotate(360);
//creating the rectangle in the java
        Rectangle rec = new Rectangle();
        rec.setX(50);
        rec.setY(40);
        rec.setHeight(200);
        rec.setWidth(300);
        rec.setFill(Color.BLUE);
        rec.setStrokeWidth(5);
        rec.setStroke(Color.BLACK);
//creating triangles in javafx
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0);
        triangle.setFill(Color.BLUE);
//creating circle in javafx
        Circle circle = new Circle();
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setRadius(100);
//adding image to the body of javafx body
        Image img1 = new Image("profilem.jpg");
        ImageView imageView = new ImageView(img1);
        imageView.setX(20);
        imageView.setY(350);
        imageView.setFitHeight(100);
        imageView.setFitWidth(200);



        //adding children of the root
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rec);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

//for displaying the whole scene stage and root
        stage.show();
    }

}
