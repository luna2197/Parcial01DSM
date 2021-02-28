package udb.parcial01.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nombre, apellido, cargo, horas;
    private ListView datos;
    private Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.txt_nombre);
        apellido = (EditText) findViewById(R.id.txt_apellido);
        cargo = (EditText) findViewById(R.id.txt_cargo);
        horas = (EditText) findViewById(R.id.txt_horas);
        datos = (ListView) findViewById(R.id.lv_datos);


    }

    ArrayList<Empleado> lista = new ArrayList<Empleado>();
    int contador =0;

    public void Ingresar(View View){
        String nom  = nombre.getText().toString();
        String ape = apellido.getText().toString();
        String car = cargo.getText().toString();
        int hrs = Integer.parseInt(horas.getText().toString());


        lista.add(new Empleado(nom, ape, car, hrs));
        contador++;
        if(contador ==3){
            Button  ingresar = (Button) findViewById(R.id.btn_ingresar);
            ingresar.setEnabled(false);
        }
    }
}