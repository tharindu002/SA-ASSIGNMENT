public class Triangle implements Shape {

    @Override
    public void draw() {
        int height = 8;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("");
            }
            for (int k = 0; k < height; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
