package udb.parcial01.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nombre, apellido, cargo, horas;
    private ListView datos;

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
        double sueldob = 0, isss= 0, afp=0, renta =0, sueldol=0;

        if(hrs <= 0){  Toast msg = Toast.makeText(this, "Las hora no pueden ser menores a 0", Toast.LENGTH_LONG);
            msg.show(); }
        else{

            if (hrs <= 160){ sueldob =hrs*9.75;}
            if (hrs > 160){ sueldob =1560 +(hrs-160) * 11.75;}

            isss = (sueldob * 5.25)/100;
            afp = (sueldob * 6.8)/100;
            renta = (sueldob * 10)/100;

            sueldol = sueldob - isss -afp - renta;

            if(car == "Gerente"){ sueldol = sueldol + ((sueldol*0.1));}
            if(car == "Asistente"){ sueldol = sueldol + ((sueldol*0.05));}
            if(car == "Secretaria"){ sueldol = sueldol + ((sueldol*0.03));}
            else{ sueldol = sueldol + ((sueldol*0.02)); }



        lista.add(new Empleado(nom, ape, car, hrs, sueldol, isss, afp, renta));
        contador++;

            Toast msg = Toast.makeText(this, "Datos Ingresados", Toast.LENGTH_LONG);
            msg.show();

        if(contador == 3){
            Button  ingresar = (Button) findViewById(R.id.btn_ingresar);
            ingresar.setEnabled(false);
        }

        nombre.setText("");
        apellido.setText("");
        cargo.setText("");
        horas.setText("");
        }

    }

    public void Mostar(View view){
        ArrayAdapter <Empleado> adaptador = new ArrayAdapter<Empleado>(MainActivity.this, android.R.layout.simple_list_item_1, lista);
        datos.setAdapter(adaptador);
    }
}