package blocks.render;

import blocks.Block;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;

public class BlockRenderer {
    private GraphicsContext m_context;

    public BlockRenderer(GraphicsContext context) {
        m_context = context;
    }

    public void render(Block block) {
        m_context.setFill(Color.BLUE);
        m_context.fillRect(block.getLocation(), 75, 100, 100);
    }
}
