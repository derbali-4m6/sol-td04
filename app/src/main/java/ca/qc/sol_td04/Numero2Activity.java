package ca.qc.sol_td04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Numero2Activity extends AppCompatActivity {

    TextView lblMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
        //init
        lblMessage = findViewById(R.id.numero2_lbl_message);
        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String login = extra.getString("login");
            String password = extra.getString("password");
            lblMessage.setText("Bonjour " + login + ", votre mot de passe est de taille " + password.length());
        }

    }

    public void btnClickRetour(View view) {
        Intent intent =  new Intent(this, Numero1_1Activity.class);
        startActivity(intent);
    }
}