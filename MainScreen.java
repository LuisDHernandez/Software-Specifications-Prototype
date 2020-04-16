package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainScreen {

  @FXML
  private Label lblAccount;

  @FXML
  private Label lblName;

  @FXML
  private Button btnStartLoan;

  @FXML
  private TextField txfStudentID;

  @FXML
  private Label lblLoanHistory;

  @FXML
  private ScrollBar vscrollHistory;

  @FXML
  private ListView<?> lsvHistory;

  @FXML
  void LoanStart(ActionEvent event) throws IOException {
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("loanScreen.fxml"));
    primaryStage.setTitle("Loan Screen");
    primaryStage.setScene(new Scene(root,700,700));
    primaryStage.show();
  } // load the loan screen for a student
}
