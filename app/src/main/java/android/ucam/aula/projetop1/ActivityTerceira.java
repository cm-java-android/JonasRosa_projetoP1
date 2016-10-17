package android.ucam.aula.projetop1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTerceira extends AppCompatActivity {

    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_terceira);

        ok = (Button) findViewById(R.id.buttonTerceiraOk);

        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent trocarTela = new Intent(ActivityTerceira.this, ActivitySegunda.class);
                startActivity(trocarTela);
            }
        });
    }
}
