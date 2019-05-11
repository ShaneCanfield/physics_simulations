package blocks;

import blocks.render.BlockRenderer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    private Group root = new Group();
    private Scene scene = new Scene(root, 1200, 800, Color.GRAY);
    private final Canvas canvas = new Canvas(1200, 800);
    private GraphicsContext context = canvas.getGraphicsContext2D();

    private BlockRenderer blockRenderer = new BlockRenderer(context);
    private Block block1 = new Block(5, 5, 10);
    private Block block2 = new Block(5, 5, 300);

    private void render(Stage stage){
        // render objects
        blockRenderer.render(block1);
        blockRenderer.render(block2);

        // display canvas to screen
        root.getChildren().add(canvas);
        stage.setScene(scene);
        stage.show();
    }

    private void update() {

    }

    @Override
    public void start(Stage stage) {
        render(stage);
        update();
    }

    public static void main(String[] args) {
        launch();
    }

}

