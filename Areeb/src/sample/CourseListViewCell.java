package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CourseListViewCell extends ListCell<Course> {
int counter=0;
    @FXML
    private Label label1, label2, label3, label4, label5;
    @FXML
    private GridPane gridPane;

    public int table=1;
    public int order=1001;

    private FXMLLoader mLLoader;
    @FXML
    private Button addToCart;
    //Creating list of itemsIterations
//    List<itemsIterations> listofItems=new ArrayList<itemsIterations>();
    @FXML
    void addToCartItems(ActionEvent event) {

    }

    @Override
    protected void updateItem(Course course, boolean empty) {
        super.updateItem(course, empty);



        if(empty || course == null) {

            setText(null);
            setGraphic(null);

        } else {
            if (mLLoader == null) {
                mLLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                mLLoader.setController(this);

                try {
                    mLLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            label1.setText(course.getItemType());
            label2.setText(course.getName());
            label3.setText(String.valueOf(course.getPrice()));
            label4.setText(String.valueOf(course.getCalories()));
            label5.setText(course.getDescription());

            addToCart.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent actionEvent) {
//                    System.out.println("Yes working");

                    Controller_MenuScreen.cost+=course.getPrice();
                    Controller_MenuScreen.calories+= course.getCalories();
                    Controller_MenuScreen.itemType+=course.getItemType()+"      ";
                    Controller_MenuScreen.itemname+=course.getName()+"  ";
                    Controller_MenuScreen.itemdescription+=course.getDescription()+"  \n";
                    System.out.println(Controller_MenuScreen.cost+"\n"+Controller_MenuScreen.calories+Controller_MenuScreen.itemType+
                            Controller_MenuScreen.itemname+Controller_MenuScreen.itemdescription);
                }
            });

            setText(null);
            setGraphic(gridPane);
        }

    }
}
class itemsIterations{
    public String a="a";
    public String b="b";
    public String c="c";

    public itemsIterations(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
