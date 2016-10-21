package alvaro.activitat1android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PantallaPrincipal extends AppCompatActivity {

    EditText txtNom;
    EditText txtCognom;
    EditText txtEdat;
    CheckBox accepta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        txtNom = (EditText)findViewById(R.id.name);
        txtCognom=(EditText)findViewById(R.id.surname);
        txtEdat = (EditText)findViewById(R.id.age);
        accepta = (CheckBox)findViewById(R.id.accept);



    }
    public void onClick(View v) {
        if(accepta.isChecked()){
            Bundle b = new Bundle();
            b.putString("Nom", txtNom.getText().toString());
            b.putString("Cognom", txtCognom.getText().toString());
            b.putString("Edat", txtEdat.getText().toString());
            Intent next = new Intent(PantallaPrincipal.this, SegonaPantalla.class);
            next.putExtras(b);
            startActivity(next);
        }
    }
}
