package application;

/**
 * Created by Amr on 7/28/2015.
 */
import dataaccess.Auth;
import dataaccess.Authentication;
import dataaccess.User;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginController {
    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    protected void loginAction(ActionEvent event)
    {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        Authentication auth = new Authentication();

        Object user = auth.isAuth(username, password);

        if(user instanceof User)
        {
            System.out.println(((User) user).getAuthorization());
        }else{
            System.out.println("user is not authenticate");
        }


    }
}
