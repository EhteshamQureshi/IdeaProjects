package sample;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;




public class Controller_OrderScreen  {

    @FXML
    private Label orderNo;

    @FXML
    private Label cost;

    @FXML
    private Label calories;
    //Creating list of itemsIterations
    List<itemsIterations> listofItems=new ArrayList<itemsIterations>();

    public double calori;
    public double cosst;
    public  String itemType;
    public  String itemname;
    public  String itemdescription;

    @FXML
    private Label tableNo;
    @FXML
    void generateReceipt(ActionEvent event) {
        Window window =   ((Node)(event.getSource())).getScene().getWindow();
        if (window instanceof Stage){
            ((Stage) window).close();
        }
        try{
            FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Receipt.fxml"));
            Parent root1 = (Parent) fxmlloader.load();
            //            Getting controller of Next Screen
            Controller_Receipt Receipt_controller = fxmlloader.getController();
//
            Receipt_controller.showInformation(1,1,calori,cosst,itemType,itemname,itemdescription);

            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public
    @FXML
    void initialize() {

    }
    public void showInformation(int order,int table,double calor,double costt){
        this.calori=calor;
        this.cosst=costt;
        orderNo.setText(""+order);
        tableNo.setText(""+table);
        calories.setText(""+calor);
        cost.setText(""+costt);

    }
    public void showItemsInformation(String itemType,String itemName,String itemDescription){
        this.itemType=itemType;
        this.itemname=itemName;
        this.itemdescription=itemDescription;
        System.out.println(itemType+itemName+itemDescription);
    }

    public void showItemsInformation(List<itemsIterations> listofItems){

    }

}





