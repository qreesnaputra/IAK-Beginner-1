package com.example.user.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.MenuItemHoverListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20/05/2017.
 */

public class OrderActivity extends AppCompatActivity {
    EditText mTextNama;
    EditText mTextNmBrg;
    EditText mAlamat;
    EditText mKodePos;
    EditText mTelepon;
    EditText mEmail;
    TextView mTextHarga, mTextQty;
    Button mButtonOrder, mButtonPlus, mButtonMin;
    //spinner
    Spinner mSpinnerMenu;
    List<String> mListMenu = new ArrayList<>();
    String harga;
    int qty = 0;
    String namaBarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();

        mTextNmBrg = (EditText) findViewById(R.id.mTextNmBrg);
        mTextNama = (EditText) findViewById(R.id.mTextNama);
        mAlamat = (EditText) findViewById(R.id.mAlamat);
        mKodePos = (EditText) findViewById(R.id.mKodePos);
        mTelepon = (EditText) findViewById(R.id.mTelepon);
        mEmail = (EditText) findViewById(R.id.mEmail);
        mTextHarga = (TextView) findViewById(R.id.mTextHarga);
        mButtonOrder = (Button) findViewById(R.id.mButtonOrder);
        mTextQty = (TextView) findViewById(R.id.mTextQty);
        mButtonPlus = (Button) findViewById(R.id.mButtonPlus);
        mButtonMin= (Button) findViewById(R.id.mButtonMin);

        mSpinnerMenu = (Spinner) findViewById(R.id.mSpinnerMenu);
        mListMenu.add("------------");
        mListMenu.add("S");
        mListMenu.add("M");
        mListMenu.add("L");
        mListMenu.add("XL");
        mListMenu.add("XXL");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mListMenu);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mSpinnerMenu.setAdapter(dataAdapter);

        namaBarang = extras.getString("namaBarang");
        harga = extras.getString("hargaBarang");

        mTextNmBrg.setText("" +  namaBarang);
        mTextHarga.setText("" + harga);
        mTextNmBrg.setFocusable(false);

    }

    public void onClickOrder(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"qreesna.putra17@gmail.com"});
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, mTextNama.getText().toString());
        emailIntent.putExtra(Intent.EXTRA_TEXT,
                "Saya pesan "
                        + mTextNmBrg.getText()
                        + " ukuran: "
                        + mSpinnerMenu.getSelectedItem()
                        + " atas nama: "
                        + mTextNama.getText()
                        + " \nAlamat: "
                        + mAlamat.getText()
                        + " \nKode pos: "
                        + mKodePos.getText()
                        + " \nTelepon: "
                        + mTelepon.getText()
                        + " \nEmail: "
                        + mEmail.getText()
                        + "\nSebanyak "
                        + mTextQty.getText()
                        + "pcs, seharga "
                        + mTextHarga.getText());
        try {
            startActivity(Intent.createChooser(emailIntent, "Kirim email dengan.."));
        }
        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(this, "There is no email client installed,", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickPlus(View view){
        int hasil = 0;
        qty = qty +1;
        hasil = qty * Integer.parseInt(harga);
        mTextQty.setText(qty+"");
        mTextHarga.setText(""+hasil);
    }

    public void onClickMin(View view){
        int hasil = 0;
        if(harga !="0") {
            qty = qty - 1;
            hasil = qty * Integer.parseInt(harga);
            mTextQty.setText(qty+"");
            mTextHarga.setText(""+hasil);
        }
        else {
            harga = "0";
            qty = 0;
            mTextNama.setText("");
            mTextQty.setText(qty+"");
            mTextHarga.setText(""+harga);
        }
    }

    public void onClickReset (View v){
        harga = "0";
        qty = 0;
        mTextNama.setText("");
        mAlamat.setText("");
        mKodePos.setText("");
        mTelepon.setText("");
        mEmail.setText("");
        mSpinnerMenu.setSelected(true);
        mTextHarga.setText("$"+harga);
        mTextQty.setText(qty+"");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}