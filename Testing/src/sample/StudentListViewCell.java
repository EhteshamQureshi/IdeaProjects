package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.io.IOException;


/**
 * Created by Johannes on 23.05.16.
 *
 */

public class StudentListViewCell extends ListCell<Student> {

    @FXML
    private Label label1, label2, label3, label4;

    private Button nextButton;


//    @FXML
//    private FontAwesomeIconView fxIconGender;

    @FXML
    private GridPane gridPane;

    private FXMLLoader mLLoader;

    @Override
    protected void updateItem(Student student, boolean empty) {
        super.updateItem(student, empty);

        if(empty || student == null) {

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

            label1.setText(String.valueOf(student.getStudentId()));
            label2.setText(student.getName());
            label3.setText("testing3");
            label4.setText("testing4");


//            if(student.getGender().equals(Student.GENDER.MALE)) {
//                fxIconGender.setIcon(FontAwesomeIcon.MARS);
//            } else if(student.getGender().equals(Student.GENDER.FEMALE)) {
//                fxIconGender.setIcon(FontAwesomeIcon.VENUS);
//            } else {
//                fxIconGender.setIcon(FontAwesomeIcon.GENDERLESS);
//            }

            setText(null);
            setGraphic(gridPane);
        }

    }
}
