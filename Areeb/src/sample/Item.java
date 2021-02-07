package sample;


public class Item {

	private String itemType;
	private String name;
	private double price;
	private int calories;
	private String description;
//We were here
	/**
	 * Constructor method for a course.
	 * 
	 * @param name
	 * @param price
	 * @param calories
	 * @param description
	 */

	public Item(String itemType, String name, double price, int calories, String description) {
		this.setItemType(itemType);
		this.setName(name);
		this.setPrice(price);
		this.setCalories(calories);
		this.setDescription(description);
	}

	/**
	 * Accesses name attribute.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name attribute.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		if(name == null) {
			throw new NullPointerException();
		}
		
		if(name.length() < 1) {
			throw new IllegalArgumentException("Name must consist from at least 1 character.");
		}
		this.name = name;
	}

	/**
	 * Gets price attribute.
	 * 
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets price attribute.
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		if(price < 0.0) {
			throw new IllegalArgumentException("Price cannot be less than zero.");
		}
		
		this.price = price;
	}

	/**
	 * Gets calories attribute.
	 * 
	 * @return calories
	 */
	public int getCalories() {
		return this.calories;
	}

	/**
	 * Gets calories and converts them to kilocalories.
	 * 
	 * @return kilocalories
	 */
	public int getKiloCalories() {
		return this.calories / 1000;
	}

	/**
	 * Sets calories.
	 * 
	 * @param calories
	 */
	public void setCalories(int calories) {
		if(calories < 0) {
			throw new IllegalArgumentException("Calories cannot be less than zero");
		}
		
		this.calories = calories;
	}

	/**
	 * Gets description attribute.
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets description attribute.
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Accessor for course type
	 * @return courseType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * @param itemType type of course
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public String toString() {
		return this.name;
	}
}
