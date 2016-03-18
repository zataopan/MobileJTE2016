package id.ac.unsyiah.elektro.mobile.tebakangka_18;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickBtnTebak(View view) {
        EditText inputAngka = (EditText) findViewById(R.id.inputAngka);
        String inputAngkaStr = inputAngka.getText().toString();
        Integer inputAngkaStrHasil = Integer.valueOf(inputAngkaStr);
        Random rand = new Random();
        int benar = rand.nextInt(2);
        if (inputAngkaStrHasil == benar) {
            Intent pesan = new Intent(getApplication(), ActivityKedua.class);
            String hasil = Integer.toString(benar);
            pesan.putExtra("varl", "Selamat, Tebakan Anda Benar, adalah " + hasil);
            startActivity(pesan);
        } else {
            Intent pesan = new Intent(getApplication(), ActivityKedua.class);
            String hasil = Integer.toString(benar);
            pesan.putExtra("varl", "Maaf, Tebakan Anda Salah, yang benar " + hasil);
            startActivity(pesan);
        }
    }
}
