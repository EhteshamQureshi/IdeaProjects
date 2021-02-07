package sample;


public class Course {

    private String itemType;
    private String name;
    private double price;
    private int calories;
    private String description;

    public Course(String itemType, String name, double price, int calories, String description) {
        this.itemType = itemType;
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.description = description;
    }

    public String getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getDescription() {
        return description;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
