package sample;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OpcjeController {
    public void login()
    {
        System.out.println("Login");
        try {
            Parent root2 = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Stage opcje1 = new Stage();
            opcje1.setTitle("NICK");
            opcje1.setScene(new Scene(root2, 300, 400));
            opcje1.show();
        }
        catch(Exception e)
        {
            System.out.println("Nie mogę otworzyć login");
        }
    }
    public void ustawienia()
    {
        System.out.println("Ustawienia");
        try {
            Parent root3 = FXMLLoader.load(getClass().getResource("ustawienia.fxml"));
            Stage opcje2 = new Stage();
            opcje2.setTitle("Ustawienia");
            opcje2.setScene(new Scene(root3, 300, 400));
            opcje2.show();
        }
        catch(Exception e)
        {
            System.out.println("Nie mogę otworzyć ustawien");
        }
    }
}
