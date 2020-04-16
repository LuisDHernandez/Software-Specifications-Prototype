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
import javafx.stage.Stage;

public class LoanScreen {

  @FXML
  private Label lblaccountName;

  @FXML
  private Label lbldateLoaned;

  @FXML
  private Label lblStaff;

  @FXML
  private Label lblResident;

  @FXML
  private Label lblItem;

  @FXML
  private Label lblSignType;

  @FXML
  private Label lblStaffSign;

  @FXML
  private Label lblStudentSign;

  @FXML
  private Label lblReturned;

  @FXML
  private Button btnReturnItem;

  @FXML
  private Button btnReturnMain;

  @FXML
  void BackToMainScreen(ActionEvent event) throws IOException {
    Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Parent root = FXMLLoader.load(getClass().getResource("mainScreen.fxml"));
    primaryStage.setTitle("Equipment Loan System");
    primaryStage.setScene(new Scene(root,700,700));
    primaryStage.show();
  }

  @FXML
  void LoanReturn(ActionEvent event) {
    System.out.println("Item has been returned! Thank you for being our customer!");
  }

}
