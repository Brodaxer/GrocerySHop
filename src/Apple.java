public class Apple extends Fruit {
    public static final String TYPE ="JAblkowate";
    private String varieties;

    public Apple(int weight,String varieties) {
        super(weight, TYPE);
        this.varieties=varieties;
        
    }
    public String getInfo(){
        return super.getInfo()+", odmiana: "+varieties;
    }
}
