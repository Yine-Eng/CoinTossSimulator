import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import java.util.Random;


public class Main extends Application
{
  private ImageView coinImageView;
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
   
      // Load the coin images.
     Image headsImage = new Image("Heads1.png");
     Image tailsImage = new Image("Tails1.png");

      
      // Create the ImageView control.
     coinImageView = new ImageView();
     coinImageView.setFitHeight(200);
     coinImageView.setFitWidth(200);
     

      
      // Create the tossButton control.
     Button tossButton = new Button("Toss");

      
      // Register the event handler.
      tossButton.setOnAction(e ->
      {
         // Create a Random object.
        Random random = new Random();

         
         // Get a random value, 0 or 1.
        int tossResult = random.nextInt(2);

         
         // Set the coin image.
         // 0 = "heads" or 1 = "tails"
        if (tossResult == 0)
        {
          coinImageView.setImage(headsImage);
        }
        else
        {
          coinImageView.setImage(tailsImage);
        }

      });
      
      // Put everything into a VBox
     VBox mainVBox = new VBox(15);
     mainVBox.setAlignment(Pos.CENTER);
     mainVBox.setPadding(new Insets(30));
     mainVBox.getChildren().addAll(coinImageView, tossButton);

      
      // Add the main VBox to a scene.
     Scene scene = new Scene(mainVBox, 300, 300);

      
      // Set the scene to the stage aand display it.
     primaryStage.setTitle("Sampson's Coin Toss Simulator");
     primaryStage.setScene(scene);
     primaryStage.show();

   }
}