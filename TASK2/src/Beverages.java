public abstract class Beverages {
    private boolean needsExtra;

    public void boilWater(){
        System.out.println("Boiling Water");
    }

    public void pourlnCup(){
        System.out.println("Pouring into Cup");
    }

    public void finalTemplateMethod(){
        boilWater();
        brew();
        pourlnCup();
        addCodiments();
        if(needsExtra){
            addExtra();
        }
    }

    public void setNeedsExtraExtra(boolean needsExtra){
        this.needsExtra = needsExtra;
    }

    protected abstract void addExtra();
    protected abstract void addCodiments();
    protected abstract void brew();
}

