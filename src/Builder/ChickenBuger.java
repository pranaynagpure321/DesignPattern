package Builder;

public class ChickenBuger extends  Burger{
    @Override
    public String name() {
        return "Chicken Buger";
    }

    @Override
    public float price() {
        return 150.00f;
    }
}
