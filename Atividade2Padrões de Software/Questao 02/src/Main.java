import strategies.RendererStrategy;
import strategies.TVRenderer;

public class Main {
    public static void main(String[] args) {
        RendererStrategy rendererStrategy = new TVRenderer();
        ImageManeger imageManeger = new ImageManeger(rendererStrategy);
        imageManeger.getRenderer();
    }
}