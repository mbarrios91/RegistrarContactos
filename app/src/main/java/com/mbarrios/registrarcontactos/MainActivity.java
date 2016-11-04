package com.mbarrios.registrarcontactos;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button siguiente;
    private TextView objEditTextNombre, objEditTextTelefono, objEditTextEmail, objEditTextDescripcion;
    private DatePicker datePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        objEditTextNombre = (TextView)  findViewById (R.id.editNombre);
        objEditTextTelefono = (TextView) findViewById(R.id.editTelefono);
        objEditTextEmail = (TextView) findViewById(R.id.editEmail);
        objEditTextDescripcion = (TextView) findViewById(R.id.editDesContacto);
        datePicker = (DatePicker) findViewById(R.id.datePicker);
        siguiente = (Button) findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        int year = datePicker.getYear();
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();

        Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
        intent.putExtra("nombre", objEditTextNombre.getText().toString());
        intent.putExtra("telefono", objEditTextTelefono.getText().toString());
        intent.putExtra("email", objEditTextEmail.getText().toString());
        intent.putExtra("descripcion", objEditTextDescripcion.getText().toString());
        intent.putExtra("fecha", day + "/" + month + "/" + year);

        startActivity(intent);
    }

}
