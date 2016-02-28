package id.ac.unsyiah.elektro.mobile.kalkulator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

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

    public void onClickTombolHasil(View view) {
        EditText txtAngka1 = (EditText) findViewById(R.id.numAngka1);
        String angka1Str = String.valueOf(txtAngka1.getText());
        float angka1 = Integer.valueOf(angka1Str);

        EditText txtAngka2 = (EditText) findViewById(R.id.numAngka2);
        String angka2Str = String.valueOf(txtAngka2.getText());
        float angka2 = Integer.valueOf(angka2Str);

        RadioButton tambah = (RadioButton) findViewById(R.id.optTambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.optKurang);
        RadioButton kali = (RadioButton) findViewById(R.id.optKali);
        RadioButton bagi = (RadioButton) findViewById(R.id.optBagi);

        float Hasil = 0;

        if (tambah.isChecked() == true) {
            Hasil = angka1 + angka2;

        } else if (kurang.isChecked() == true) {
            Hasil = angka1 - angka2;

        } else if (kali.isChecked() == true) {
            Hasil = angka1 * angka2;

        } else if (bagi.isChecked() == true) {
            Hasil = angka1 / angka2;
        }

        String hasilStr = String.valueOf(Hasil);
        TextView lblHasil = (TextView) findViewById(R.id.lblHasil);
        lblHasil.setText(hasilStr);
        }
    }

