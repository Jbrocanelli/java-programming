public class Pizza {
    private String bread;
    private String sauce;
    private String cheese;
    private String topping;

    public Pizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    public Pizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    @Override
    public String toString(){
        if (this.topping == null){
            return "Here are the ingredients of your pizza: " + "\n" + bread + "\n" + sauce + "\n" + cheese;
        }
        else {
            return "Here are the ingredients of your pizza: " + "\n" + bread + "\n" + sauce + "\n" + cheese + "\n" + topping;
        }

    }
}
