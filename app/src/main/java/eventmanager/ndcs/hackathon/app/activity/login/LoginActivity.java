package eventmanager.ndcs.hackathon.app.activity.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import eventmanager.ndcs.hackathon.app.R;
import eventmanager.ndcs.hackathon.app.activity.MainActivity;
import eventmanager.ndcs.hackathon.app.application.EventmanagerApplication;
import eventmanager.ndcs.hackathon.app.model.User;
import eventmanager.ndcs.hackathon.app.sqlite.database.SQLiteController;

import android.support.v7.widget.AppCompatEditText;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by miguel on 30/9/17.
 */

@EActivity(R.layout.activity_login)
public class LoginActivity extends AppCompatActivity {

    @ViewById(R.id.email)
    AppCompatEditText emailTextField;

    @ViewById(R.id.password)
    AppCompatEditText passTextField;

    @AfterViews
    public void initViews(){}

    @Click(R.id.log_in_button)
    public void logIn(){
        SQLiteController sqLiteController = new SQLiteController(this);
        User user = sqLiteController.getUserData(emailTextField.getText().toString());
        if(user != null) {
            if (user.getPass().equals(passTextField.getText().toString())) {
                EventmanagerApplication.getInstance().setUser(user);
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        } else {
            Toast.makeText(getApplicationContext(), "E-mail o contraseña incorrectas,\nvuelva a intentarlo",
                    Toast.LENGTH_SHORT).show();
        }

    }

}
