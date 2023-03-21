import strategies.RendererStrategy;

public class ImageManeger {
    private RendererStrategy renderer;

    public ImageManeger(RendererStrategy renderer) {
        this.renderer = renderer;
    }

    public void getRenderer(){
        renderer.mostrarImagem();
    }
}
