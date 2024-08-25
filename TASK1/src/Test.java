public class Test {
    public static void main(String[] args) {
        RemoteContraol remoteContraol=new RemoteContraol(2);
        Light KitchenLight=new KitchenRoom();
        Light livingRoomLight=new LivingRoomLight();

        LightOnCommand KitchenLightOnCommand=new LightOnCommand(KitchenLight);
        LightOffCommand KitchenLightOffCommand=new LightOffCommand(KitchenLight);
        LightDimCommand KitchenLightDim=new LightDimCommand(KitchenLight,50);

        LightOnCommand livingRoomLightOnCommand=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand=new LightOffCommand(livingRoomLight);
        LightDimCommand livingRoomLightDim=new LightDimCommand(livingRoomLight,30);

        remoteContraol.onButtonWasPressed(0);
        remoteContraol.offButtonWasPressed(0);
        remoteContraol.undoButtonWasPressed();

        remoteContraol.onButtonWasPressed(1);
        remoteContraol.offButtonWasPressed(1);
        remoteContraol.undoButtonWasPressed();

        KitchenLightDim.execute();
        KitchenLightDim.undo();

        livingRoomLightDim.execute();
        livingRoomLightDim.undo();
    }
}
