package udb.parcial01.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText cadena;
    private TextView t1, t2, t3, t4, p1, p2, p3, p4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadena = (EditText) findViewById(R.id.txtvoto);
        t1 = (TextView) findViewById(R.id.txt_voto1);
        t2 = (TextView) findViewById(R.id.txt_voto2);
        t3 = (TextView) findViewById(R.id.txt_voto3);
        t4 = (TextView) findViewById(R.id.txt_voto4);

        p1 = (TextView) findViewById(R.id.txt_p1);
        p2 = (TextView) findViewById(R.id.txt_p2);
        p3 = (TextView) findViewById(R.id.txt_p3);
        p4 = (TextView) findViewById(R.id.txt_p4);
    }

    public void Calculo(View View) {
        String valor = cadena.getText().toString();
        String[] contador = valor.split(",");

          int voto1 = 0, voto2=0, voto3=0, voto4=0, nulo=0;



        for (int i =0; i < contador.length ; i++){

            if (contador[i].equals("1")){ voto1++;}
            if (contador[i].equals("2")){ voto2++;}
            if (contador[i].equals("3")){ voto3++;}
            if (contador[i].equals("4")){ voto4++;}
            else{nulo++;}

        }

        String v1 =  String.valueOf(voto1);
        t1.setText(v1 + " Votos");
        double porce1  = Double.valueOf(voto1);
        porce1 = (voto1 * 100) / contador.length;
        String re1 = String.valueOf(porce1);
        p1.setText(re1 + "%");



        String v2 =  String.valueOf(voto2);
        t2.setText(v2 + " Votos");
        double porce2  = Double.valueOf(voto2);
        porce2 = (voto2 * 100) / contador.length;
        String re2 = String.valueOf(porce2);
        p2.setText(re2 + "%");

        String v3 =  String.valueOf(voto3);
        t3.setText(v3 + " Votos");
        double porce3  = Double.valueOf(voto3);
        porce3 = (voto3 * 100) / contador.length;
        String re3 = String.valueOf(porce3);
        p3.setText(re3 + "%");

        String v4 =  String.valueOf(voto4);
        t4.setText(v4 + " Votos");
        double porce4  = Double.valueOf(voto4);
        porce4 = (voto4 * 100) / contador.length;
        String re4 = String.valueOf(porce4);
        p4.setText(re4 + "%");



    }
}