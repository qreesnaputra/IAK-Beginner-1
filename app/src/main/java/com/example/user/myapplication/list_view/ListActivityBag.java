package com.example.user.myapplication.list_view;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.user.myapplication.OrderActivity;
import com.example.user.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivityBag extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(2);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onOrder (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.text1);
        TextView txtHarga = (TextView) findViewById(R.id.text1_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrder2 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.text2);
        TextView txtHarga = (TextView) findViewById(R.id.text2_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrder3 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.text3);
        TextView txtHarga = (TextView) findViewById(R.id.text2_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrder4 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.text4);
        TextView txtHarga = (TextView) findViewById(R.id.text4_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }
    public void onOrder5 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.text5);
        TextView txtHarga = (TextView) findViewById(R.id.text5_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrder6 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.text6);
        TextView txtHarga = (TextView) findViewById(R.id.text6_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderSweat (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat1);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat1_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderSweat2 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat2);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat2_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderSweat3 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat3);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat3_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderSweat4 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat4);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat4_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }
    public void onOrderSweat5 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat5);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat5_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderSweat6 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat6);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat6_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }


    public void onOrderSweat7 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textSweat7);
        TextView txtHarga = (TextView) findViewById(R.id.textSweat7_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderBag (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textB1);
        TextView txtHarga = (TextView) findViewById(R.id.textB1_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderBag2 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textB2);
        TextView txtHarga = (TextView) findViewById(R.id.textB2_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderBag3 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textB3);
        TextView txtHarga = (TextView) findViewById(R.id.textB3_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderBag4 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textB4);
        TextView txtHarga = (TextView) findViewById(R.id.textB4_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }
    public void onOrderBag5 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textB5);
        TextView txtHarga = (TextView) findViewById(R.id.textB5_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    public void onOrderBag6 (View v)
    {
        TextView txtNama = (TextView) findViewById(R.id.textB6);
        TextView txtHarga = (TextView) findViewById(R.id.textB6_2);
        Intent in = new Intent(this, OrderActivity.class);
        in.putExtra("namaBarang", txtNama.getText().toString());
        in.putExtra("hargaBarang", txtHarga.getText().toString());
        startActivity(in);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new FragmentTshirt(), "T-SHIRT");
        adapter.addFrag(new FragmentSweatshirt(), "SWEATSHIRT");
        adapter.addFrag(new FragmentBag(), "BAG");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

}