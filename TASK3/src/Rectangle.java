public class Rectangle implements Shape{

    @Override
    public void draw() {
        int length=6;
        int width=4;

        for (int x=0;x<length;x++){
            for (int y=0;y<width;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
