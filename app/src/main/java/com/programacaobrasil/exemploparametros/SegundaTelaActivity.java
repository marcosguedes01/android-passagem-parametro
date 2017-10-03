package com.programacaobrasil.exemploparametros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class SegundaTelaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtValor;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        edtValor = (EditText)findViewById(R.id.edtValor);
        btnFechar = (Button)findViewById(R.id.btnFechar);
        btnFechar.setOnClickListener(this);

        Bundle bundle = getIntent().getExtras();

        if (bundle.containsKey("VALOR"))
        {
            String valor = bundle.getString("VALOR");
            edtValor.setText(valor);
        }
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
