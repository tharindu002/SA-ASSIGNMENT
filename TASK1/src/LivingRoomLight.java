public class LivingRoomLight implements Light {
    int brightnessLevel_LivingRoom;

    @Override
    public void on() {
       brightnessLevel_LivingRoom = 100;
       System.out.println("Living Room Light is ON at full brightness");
    }

    @Override
    public void off() {
        brightnessLevel_LivingRoom = 0;
        System.out.println("Living Room Light is OFF at full brightness");
    }

    @Override
    public void dim(int level) {
        brightnessLevel_LivingRoom = level;
        System.out.println("Living Room Light dimmed to + is ON at full brightness");

    }

    @Override
    public int getBrightness() {
        return brightnessLevel_LivingRoom;
    }
}
