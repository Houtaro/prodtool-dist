
package utils;

import java.util.Optional;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class AlertHelper {
    
    private static Alert alert = null;
    
    public static void show(AlertType alertType, String title, String headerText, String contentText) {
        Platform.runLater(() -> {
            alert = new Alert(alertType);
            
            if(alert.getAlertType() != AlertType.CONFIRMATION) {
                alert.initStyle(StageStyle.UTILITY);
                alert.setTitle(title);
                alert.setHeaderText(headerText);
                alert.setContentText(contentText);
                alert.show();
            }
        });
    }
    
    public static Optional showAndWait(AlertType alertType, String title, String headerText, String contentText) {
        alert = new Alert(alertType);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.setContentText(contentText);
        
        return alert.showAndWait();
    }
    
    public Optional uploadDialog() {
        alert = new Alert(AlertType.CONFIRMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResource("/images/upload-icon.png").toString()));
        alert.setTitle("Upload");
        alert.setHeaderText("");
        alert.setContentText("Are you sure? This cannot be undone.");
        return alert.showAndWait();
    }
    
}
