package com.pradyumna.binarycalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText edtBinary = findViewById(R.id.edtBinary);
        final EditText edtDecimal = findViewById(R.id.edtDecimal);
        final TextView txtBinary = findViewById(R.id.txtBinary);
        final TextView txtDecimal = findViewById(R.id.txtDecimal);
        Button btnBinary = findViewById(R.id.btnBinary);
        Button btnDecimal = findViewById(R.id.btnDecimal);
        Button btnClearD = findViewById(R.id.btnClearD);
        Button btnClearB = findViewById(R.id.btnClearB);

        btnBinary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer num = Integer.parseInt(edtDecimal.getText().toString());
                String result = Integer.toBinaryString(num);
                txtBinary.setText(result);
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = edtBinary.getText().toString();
                String result = Integer.parseInt(num, 2)+"";
                txtDecimal.setText(result);
            }
        });

        btnClearD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtDecimal.setText(null);
                txtBinary.setText("Binary = ");
            }
        });

        btnClearB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtBinary.setText(null);
                txtDecimal.setText("Decimal = ");
            }
        });

    }
}