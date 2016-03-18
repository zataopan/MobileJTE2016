package id.ac.unsyiah.elektro.mobile.tugas_08;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

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


    public void onClickTebakGambar(View view) {

        final Intent pesan = new Intent(getApplicationContext(), ActivityKedua.class);
        Random rand = new Random();
        int[] daftarGambar = {R.drawable.mobil, R.drawable.sepedamotor, R.drawable.becakmotor, R.drawable.becakdayung, R.drawable.sepeda};
        int jawaban = rand.nextInt(daftarGambar.length);

        switch (view.getId()) {
            case R.id.imgmobil:
                if (R.drawable.mobil == daftarGambar[jawaban]) {
                    pesan.putExtra("varl", "Selamat Tebakan Anda Benar, adalah Gambar :");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                } else {
                    pesan.putExtra("varl", "Maaf Tebakan Anda Salah, yang Benar adalah Gambar : ");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                }
                break;

            case R.id.imgsepedamotor:
                if (R.drawable.sepedamotor == daftarGambar[jawaban]) {
                    pesan.putExtra("varl", "Selamat Tebakan Anda Benar, adalah Gambar :");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                } else {
                    pesan.putExtra("varl", "Maaf Tebakan Anda Salah, yang Benar adalah Gambar : ");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                }
                break;

            case R.id.imgbecakmotor:
                if (R.drawable.becakmotor == daftarGambar[jawaban]) {
                    pesan.putExtra("varl", "Selamat Tebakan Anda Benar, adalah Gambar :");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                } else {
                    pesan.putExtra("varl", "Maaf Tebakan Anda Salah, yang Benar adalah Gambar : ");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                }
                break;

            case R.id.imgbecakdayung:
                if (R.drawable.becakdayung == daftarGambar[jawaban]) {
                    pesan.putExtra("varl", "Selamat Tebakan Anda Benar, adalah Gambar :");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                } else {
                    pesan.putExtra("varl", "Maaf Tebakan Anda Salah, yang Benar adalah Gambar : ");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                }
                break;

            case R.id.imgsepeda:
                if (R.drawable.sepeda == daftarGambar[jawaban]) {
                    pesan.putExtra("varl", "Selamat Tebakan Anda Benar, adalah Gambar :");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                } else {
                    pesan.putExtra("varl", "Maaf Tebakan Anda Salah, yang Benar adalah Gambar : ");
                    pesan.putExtra("var2", daftarGambar[jawaban]);
                    startActivity(pesan);
                }
                break;
        }
    }
}

