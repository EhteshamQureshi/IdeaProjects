package sample;
import java.util.ArrayList;
import java.util.List;



public class Menu {

	private List<Item> menuItems = new ArrayList<Item>();

	/**
	 * Constructor
	 */
	public Menu() {

	}

	/**
	 * Gets a list of all courses in the menu.
	 *
	 * @return list of courses
	 */
	public List<Item> getMenuItems() {
		if (this.menuItems.size() == 0) {
			System.out.println("EmptyMenuException");
		}

		return menuItems;
	}

	/**
	 * It sets a new courses list to the menu.
	 *
	 * @param menuItemsList List with Course objects.
	 */
	public void setMenuItemsList(List<Item> menuItemsList) {
		this.menuItems = menuItemsList;
	}

	/**
	 * Adds a Item to menu
	 *
	 * @param itemType
	 * @param name
	 * @param price
	 * @param calories
	 * @param description
	 */
	public void addItem(String itemType, String name, double price, int calories, String description) {

		Item newItem = new Item(itemType, name, price, calories, description);

		this.addItem(newItem);
	}

	public void addItem(Item item) {
		this.menuItems.add(item);
	}

	/**
	 * Deletes a Item from the menu.
	 *
	 * @param item
	 */
	public void removeItem(Item item) {
		this.menuItems.remove(item);
	}

	/**
	 * Deletes a item by its index in the courses list.
	 *
	 * @param index
	 * @return returns a Item instance if it has been deleted.
	 */
	public Item removeItem(int index) {
		return this.menuItems.remove(index);
	}

	/**
	 * Returns an index in the Item list of a specified course instance.
	 *
	 * @param item
	 * @return index
	 */
	public int indexOf(Item item) {
		return this.menuItems.indexOf(item);
	}

//	Adding

	/**
	 * Add starters to the menu.
	 */
	private void addItems() {
		menuItems.add(new Item("starter", "Gamberi", 5.99, 350000,
				"Succulent king prawns baked in garlic & chilli butter, with ciabatta"));

		menuItems.add(new Item("starter", "Bruschetta", 3.99, 200000,
				"Plum tomatoes, rocket, red onion, garlic, olive oil and fresh basil on toasted ciabatta"));

		menuItems.add(new Item("starter", "Polpette", 8.99, 500000,
				"Baked spiced pork & beef meatballs in a rich tomato sauce, topped with melting mozzarella, served with ciabatta"));

		menuItems.add(new Item("starter", "Arancini Funghi", 7.50, 350000,
				"Mushroom risotto balls with  melting mozzarella, served with rocket leaves and a pomodoro sauce"));

			//Mains
		menuItems.add(new Item("Main", "Margherita Pizza", 9.25, 650000, "Tomato, mozzarella and fresh basil"));

		menuItems.add(new Item("Main", "Pepperoni Pizza", 12.30, 800000,
				"Spicy Italian pizza with pepperoni and hot green chillies"));

		menuItems.add(new Item("Main", "Lamb Shank", 18.99, 1200000,
				"Lamb shank slow-cooked in a garlic, red wine & rosemary sauce, served with mashed potatoes and green beans"));

		menuItems.add(new Item("Main", "Burger Americano", 12.99, 900000,
				"Chargrilled Aberdeen Angus beef burger, baby gem leaves, tomato, red onion and mayonnaise"));

		menuItems.add(new Item("Main", "Carbonara", 10.99, 825000,
				"Spaghetti with crispy smoked pancetta, egg and pecorino cheese with a splash of cream"));

		menuItems.add(new Item("Main", "Tagliatelle Pomodoro", 8.99, 500000,
				"Fresh egg tagliatelle with pomodoro sauce, fresh basil and basil oil"));

		//		Dessert

		menuItems.add(new Item("Dessert", "Gelato", 5.00, 700000, "3-scoop"));

		menuItems.add(new Item("Dessert", "Tiramisu Mousse", 8.00, 200000,
				"Layers of coffee mousse with sweet mascarpone mousse"));

		menuItems.add(new Item("Dessert", "Vanilla Cheesecake", 6.00, 500000,
				"Vanilla cheesecake with mascarpone topped with chocolate tagliatelle and served with a pot of fresh cream"));

		menuItems.add(new Item("Dessert", "Pannacotta", 5.00, 500000,
				"Creamy vanilla pannacotta served with morello cherry sauce"));

	}
}
