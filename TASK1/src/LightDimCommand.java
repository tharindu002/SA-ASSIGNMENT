public class LightDimCommand implements Command{
    private Light light;
    private int presentlevel;
    private int previouslevel;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.presentlevel = level;
    }

    @Override
    public void execute() {
        previouslevel = light.getBrightness();
        light.dim(presentlevel);
    }

    @Override
    public void undo() {
        light.dim(previouslevel);
    }
}
