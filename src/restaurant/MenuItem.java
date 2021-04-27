package restaurant;

public class MenuItem {
    String name;
    double price;
    String description;
    String category;

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory) {
        name = aName;
        price = aPrice;
        description = aDescription;
        category = aCategory;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
}
