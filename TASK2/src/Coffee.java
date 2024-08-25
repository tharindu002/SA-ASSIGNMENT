public class Coffee extends Beverages{

    @Override
    protected void brew() {
        System.out.println("Dipping Coffee through filter");
    }

    @Override
    protected void addCodiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void addExtra(){
        System.out.println("Adding vanilla syrup");
    }
}
