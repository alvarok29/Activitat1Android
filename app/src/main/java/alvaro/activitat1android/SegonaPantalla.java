package alvaro.activitat1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegonaPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segona_pantalla);

        TextView nomv = (TextView)findViewById(R.id.nomv);
        TextView cognomv = (TextView)findViewById(R.id.cognomv);
        TextView edatv = (TextView)findViewById(R.id.edatv);

        Bundle b = getIntent().getExtras();
        nomv.setText(b.getString("Nom"));
        cognomv.setText(b.getString("Cognom"));
        edatv.setText(b.getString("Edat"));
    }
}
