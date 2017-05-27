package com.example.user.myapplication.home_view;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.user.myapplication.AboutActivity;
import com.example.user.myapplication.ContactActivity;
import com.example.user.myapplication.OrderActivity;
import com.example.user.myapplication.R;
import com.example.user.myapplication.list_view.ListActivity;
import com.example.user.myapplication.list_view.ListActivityBag;
import com.example.user.myapplication.list_view.ListActivitySweatshirt;

public class HomeActivity extends AppCompatActivity {

    boolean doubleBackToExitPresserOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onTshirt (View v)
    {
        Intent in = new Intent(this, ListActivity.class);
        startActivity(in);
    }

    public void onSweat(View v)
    {
        Intent in = new Intent(this, ListActivitySweatshirt.class);
        startActivity(in);
    }

    public void onBag(View v)
    {
        Intent in = new Intent(this, ListActivityBag.class);
        startActivity(in);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.contact:
                Intent intent = new Intent(this, ContactActivity.class);
                startActivity(intent);
                break;
            case R.id.about:
                Intent i = new Intent(this, AboutActivity.class);
                startActivity(i);
                break;
            case R.id.exit:
                //TODO exit apps
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Anda yakin ingin keluar?");
                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog quit = builder.create();
                quit.show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        //Checking for fragment count to backstack
        if(getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else if (!doubleBackToExitPresserOnce) {
            this.doubleBackToExitPresserOnce = true;
            Toast.makeText(this, "Please click BACK again to exit apps.", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPresserOnce = false;
                }
            }, 2000);
        } else {
            super.onBackPressed();
            return;
        }
    }
}