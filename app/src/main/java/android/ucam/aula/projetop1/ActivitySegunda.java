package android.ucam.aula.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySegunda extends AppCompatActivity {

    private Button sair;
    private Button cadastro;
    private Button progresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_segunda);

        sair = (Button) findViewById(R.id.buttonSegundaSair);
        cadastro = (Button) findViewById(R.id.buttonSegundaCadastro);
        progresso = (Button) findViewById(R.id.buttonSegundaProgresso);

        sair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent trocarTela = new Intent(ActivitySegunda.this, MainActivity.class);
                startActivity(trocarTela);
            }
        });

        cadastro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent trocarTela = new Intent(ActivitySegunda.this, ActivityTerceira.class);
                startActivity(trocarTela);
            }
        });

        progresso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent trocarTela = new Intent(ActivitySegunda.this, ActivityQuarta.class);
                startActivity(trocarTela);
            }
        });
    }
}
