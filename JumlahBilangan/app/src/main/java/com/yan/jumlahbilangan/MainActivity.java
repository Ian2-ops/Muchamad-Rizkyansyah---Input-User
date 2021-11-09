package com.yan.jumlahbilangan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bill1;
    private EditText bill2;
    private EditText jumlah;
    private Button btnhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI() {
        bill1 = (EditText) findViewById(R.id.txtBill1);
        bill2 = (EditText) findViewById(R.id.txtBill2);
        jumlah = (EditText) findViewById(R.id.hasil);
        btnhasil = (Button) findViewById(R.id.btnCekBill);
    }

    private void initEvent() {
        btnhasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }

            private void hitungJumlah() {
                int angka1 = Integer.parseInt(bill1.getText().toString());
                int angka2 = Integer.parseInt(bill2.getText().toString());
                int total = angka1 + angka2;
                jumlah.setText(total+"");
            }
        });
    }
}