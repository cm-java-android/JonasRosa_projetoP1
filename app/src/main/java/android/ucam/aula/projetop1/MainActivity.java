package android.ucam.aula.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button acessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acessar = (Button) findViewById(R.id.buttonMainAcessar);

        acessar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent trocarTela = new Intent(MainActivity.this, ActivitySegunda.class);
                startActivity(trocarTela);
            }
        });
    }
}
