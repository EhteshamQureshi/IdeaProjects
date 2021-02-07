package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<Student> listView;

    private ObservableList<Student> studentObservableList;

    public Controller()  {

        studentObservableList = FXCollections.observableArrayList();

        //add some Students
        studentObservableList.addAll(
                new Student("John Doe", Student.GENDER.MALE),
                new Student("Jane Doe", Student.GENDER.FEMALE),
                new Student("Donte Dunigan", Student.GENDER.MALE),
                new Student("Gavin Genna", Student.GENDER.MALE),
                new Student("Darin Dear", Student.GENDER.MALE),
                new Student("Pura Petty", Student.GENDER.FEMALE),
                new Student("Herma Hines", Student.GENDER.FEMALE)
        );


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listView.setItems(studentObservableList);
        listView.setCellFactory(studentListView -> new StudentListViewCell());


    }

}
