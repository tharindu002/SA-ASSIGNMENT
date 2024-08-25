public class KitchenRoom implements Light {
    int brightnesslevel_Kitchen;

    @Override
    public void on() {
      brightnesslevel_Kitchen = 100;
      System.out.println("Kitchen Room Light is ON at full brightness");
    }

    @Override
    public void off() {
        brightnesslevel_Kitchen = 0;
        System.out.println("Kitchen Room Light is OFF at full brightness");
    }

    @Override
    public void dim(int level) {
        brightnesslevel_Kitchen = level;
        System.out.println("Kitchen Room Light Diamond to " + brightnesslevel_Kitchen + "%");
    }

    @Override
    public int getBrightness() {
        return brightnesslevel_Kitchen;
    }
}
