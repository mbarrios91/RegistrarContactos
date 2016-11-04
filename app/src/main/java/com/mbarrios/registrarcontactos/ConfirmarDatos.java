package com.mbarrios.registrarcontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity implements View.OnClickListener{

    private TextView tvNombre, tvTelefono, tvEmail, tvDescripcion, tvFecha;
    private Button btnEditar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        String telefono = parametros.getString("telefono");
        String email = parametros.getString("email");
        String descripcion = parametros.getString("descripcion");
        String fecha = parametros.getString("fecha");

        btnEditar = (Button) findViewById(R.id.btnEditar);
        tvNombre = (TextView) findViewById(R.id.tvNombreConfirm);
        tvTelefono = (TextView) findViewById(R.id.tvTelefonoDato);
        tvEmail = (TextView) findViewById(R.id.tvEmailDato);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcionDato);
        tvFecha = (TextView) findViewById(R.id.tvFechaDato);


        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
        tvFecha.setText(fecha);

        btnEditar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        onBackPressed();
    }


}
