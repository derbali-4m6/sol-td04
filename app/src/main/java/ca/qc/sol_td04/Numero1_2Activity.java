package ca.qc.sol_td04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Numero1_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero12);
    }

    public void clickBtnRetour(View view) {
        Intent intent =  new Intent(this, Numero1_1Activity.class);
        startActivity(intent);
        //finish();
    }
}