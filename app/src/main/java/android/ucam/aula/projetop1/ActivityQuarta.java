package android.ucam.aula.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityQuarta extends AppCompatActivity {

    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_quarta);

        voltar = (Button) findViewById(R.id.buttonQuartaVoltar);

        voltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent trocarTela = new Intent(ActivityQuarta.this, ActivitySegunda.class);
                startActivity(trocarTela);
            }
        });
    }
}
