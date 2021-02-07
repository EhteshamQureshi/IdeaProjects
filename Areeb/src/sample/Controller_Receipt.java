package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_Receipt implements Initializable {
    public  String itemType="abc";
    public  String itemname="def";
    public  String itemdescription="ghi";
    @FXML
    private TextArea textareaReceipt;
    @FXML
    void startNewOrder(ActionEvent event) {
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
    public void showInformation(int order,int table,double calor,double cost,String itemType,String itemName,String itemDescription){
        String course="Items Type  :         "+itemType+"\n"+
                      "Items Name  :       "+itemName+"\n"+
                        "Description : \n"+itemDescription+"\n";
     String receipt="Order No : " +order+"\n" +
             "Table No : " +table+"\n" +
             "Calories : " +cost+"\n" +
             "Total Cost : " +calor+"\n" ;
        System.out.println(receipt);
        textareaReceipt.setText("Your Receipt Here \n"+course+"\n"+receipt+
                "\n"+"Thanks For coming");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
