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
    private TextView t1, t2, t3, t4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadena = (EditText) findViewById(R.id.txtvoto);
        t1 = (TextView) findViewById(R.id.txt_voto1);
        t2 = (TextView) findViewById(R.id.txt_voto2);
        t3 = (TextView) findViewById(R.id.txt_voto3);
        t4 = (TextView) findViewById(R.id.txt_voto4);
    }

    public void Calculo(View View) {
        String valor = cadena.getText().toString();
        String[] contador = valor.split(",");

          int voto1 = 0, voto2=0, voto3=0, voto4=0, nulo=0;

          String c1 = "1";
        Toast.makeText(this, contador[0]  ,Toast.LENGTH_SHORT).show();

        if (contador[0] == c1 || contador[0].equals(c1) || contador[0].contentEquals(c1)){
            Toast.makeText(this, "Funciona"  ,Toast.LENGTH_SHORT).show();
        }

        for (int i =0; i < contador.length ; i++){

            if (contador[i] == "1"){ voto1++;}
            if (contador[i] == "2"){ voto2++;}
            if (contador[i] == "3"){ voto3++;}
            if (contador[i] == "4"){ voto4++;}
            else{nulo++;}

        }

        String v1 =  String.valueOf(voto1);
        t1.setText(v1);

        String v2 =  String.valueOf(voto2);
        t2.setText(v2);

        String v3 =  String.valueOf(voto3);
        t3.setText(v3);

        String v4 =  String.valueOf(voto4);
        t4.setText(v4);



    }
}