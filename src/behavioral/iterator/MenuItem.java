package behavioral.iterator;


// MenuItem 은 모든 레스토랑이 협약되어 있다
public class MenuItem {

    private String name;
    private String desc;
    private boolean isVegeterian;
    private double price;

    public MenuItem(String name, String desc, boolean isVegeterian, double price) {
        this.name = name;
        this.desc = desc;
        this.isVegeterian = isVegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
