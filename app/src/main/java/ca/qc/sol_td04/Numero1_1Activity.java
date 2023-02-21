package ca.qc.sol_td04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Numero1_1Activity extends AppCompatActivity {

    EditText txtLogin, txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero11);
        //init
        txtLogin = findViewById(R.id.numero2_txt_login);
        txtPassword = findViewById(R.id.numero2_txt_password);
    }

    public void clickBtnNumero1(View view) {
        Intent intent = new Intent(this, Numero1_2Activity.class);
        startActivity(intent);
        //finish();
    }

    public void clickBtnNumero2(View view) {
        String login = "", password = "";
        if(txtLogin.getText() != null)
            login =  txtLogin.getText().toString();
        if(txtPassword.getText() != null)
            password =  txtPassword.getText().toString();

        Intent intent = new Intent(this, Numero2Activity.class);
        intent.putExtra("login", login);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}