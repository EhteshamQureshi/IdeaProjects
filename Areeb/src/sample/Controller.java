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
import java.util.ResourceBundle;


public class Controller implements Initializable {

        @FXML
        private ListView<Course> listView;

        private ObservableList<Course> courseObservableList;

        @FXML
        Text name;
        @FXML
        Text price;
        @FXML
        Text calories;
        @FXML
        Text description;

        public Controller(){

                courseObservableList = FXCollections.observableArrayList();

                //add some Students
                courseObservableList.addAll(
                        new Course("starter", "Gamberi", 5.99, 350000,
                                "Succulent king prawns baked in garlic & chilli butter, with ciabatta"),
                        new Course("starter", "Bruschetta", 3.99, 200000,
                                "Plum tomatoes, rocket, red onion, garlic, olive oil and fresh basil on toasted ciabatta"),
                        new Course("starter", "Polpette", 8.99, 500000,
                                "Baked spiced pork & beef meatballs in a rich tomato sauce, topped with melting mozzarella, served with ciabatta"),
                        new Course("starter", "Polpette", 8.99, 500000,
                                "Baked spiced pork & beef meatballs in a rich tomato sauce, topped with melting mozzarella, served with ciabatta")
                );


        }

        @FXML
        public void goToOrderScreen(ActionEvent event)  {
                Window window =   ((Node)(event.getSource())).getScene().getWindow();
                if (window instanceof Stage){
                        ((Stage) window).close();
                }
                try{
                        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("OrderScreen.fxml"));
                        Parent root1 = (Parent) fxmlloader.load();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root1));
                        stage.show();


                }catch (Exception e){
                        System.err.println(e.getMessage());
                }
        }

        @FXML
        public void startNewOrder(ActionEvent event)  {
                Window window =   ((Node)(event.getSource())).getScene().getWindow();
                if (window instanceof Stage){
                        ((Stage) window).close();
                }
                try{
                        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Welcome.fxml"));
                        Parent root1 = (Parent) fxmlloader.load();
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
