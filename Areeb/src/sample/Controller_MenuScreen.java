package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller_MenuScreen implements Initializable {
    @FXML
    private ListView<Course> listView;

    public static double cost=0;
    public static double calories=0;
    public static String itemType="";
    public static String itemname="";
    public static String itemdescription="";
//Creating list of itemsIterations
//public List<itemsIterations> listofItems=new ArrayList<itemsIterations>();

    private ObservableList<Course> courseObservableList;
    @FXML
    Text name;
    @FXML
    Text price;
//    @FXML
//    Text calories;
    @FXML
    Text description;
    public int orderNo=0;
    public int tableNo=0;
    public Controller_MenuScreen(){
//        itemsIterations b1=new itemsIterations("a","b","c");
        courseObservableList = FXCollections.observableArrayList();

        //add some Students
        courseObservableList.addAll(
                new Course("Starter", "Gamberi", 5.99, 350000,
                        "Succulent king prawns baked in garlic & chilli butter, with ciabatta"),
                new Course("Starter", "Bruschetta", 3.99, 200000,
                        "Plum tomatoes, rocket, red onion, garlic, olive oil and fresh basil on toasted ciabatta"),
                new Course("Starter", "Polpette", 8.99, 500000,
                        "Baked spiced pork & beef meatballs in a rich tomato sauce"),
                //Mains

                new Course("Main", "Pepperoni Pizza", 12.30, 800000,
                        "Spicy Italian pizza with pepperoni and hot green chillies"),

                new Course("Main", "Carbonara", 10.99, 825000,
                        "Spaghetti with crispy smoked pancetta"),
                new Course("Main", "Tagliatelle Pomodoro", 8.99, 500000,
                        "Fresh egg tagliatelle with pomodoro sauce, fresh basil and basil oil"),
        //		Dessert

                new Course("Dessert", "Gelato", 5.00, 700000, "3-scoop"),
                new Course("Dessert", "Tiramisu Mousse", 8.00, 200000,
                        "Layers of coffee mousse with sweet mascarpone mousse"),

                new Course("Dessert", "Pannacotta", 5.00, 500000,
                        "Creamy vanilla pannacotta served with morello cherry sauce")
        );

    }

    @FXML
    void goToOrderScreen(ActionEvent event) {
        Window window =   ((Node)(event.getSource())).getScene().getWindow();
        if (window instanceof Stage){
            ((Stage) window).close();
        }
        try{
            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("OrderScreen.fxml"));
            Parent root1 = (Parent) fxmlloader.load();
//            Getting controller of Next Screen
            Controller_OrderScreen orderScreen_controller = fxmlloader.getController();
//
            if (tableNo==6){tableNo=1;} //counter
            orderScreen_controller.showInformation(++orderNo,++tableNo,cost,calories/1000);
            orderScreen_controller.showItemsInformation(itemType,itemname,itemdescription);
//            orderScreen_controller.showItemsInformation(listofItems);
            Stage stage = new Stage();

            stage.setScene(new Scene(root1));
            stage.show();

        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(courseObservableList);
        listView.setCellFactory(studentListView -> new CourseListViewCell());


    }
}

