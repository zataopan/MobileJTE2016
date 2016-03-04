package id.ac.unsyiah.elektro.mobile.tugas05_spreadsheet;

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

    public void onClickSamaDengan(View view) {
        EditText z11 = (EditText) findViewById(R.id.z11);
        String z11Str = String.valueOf(z11.getText());
        float cellz11 = Float.valueOf(z11Str);

        EditText z12 = (EditText) findViewById(R.id.z12);
        String z12Str = String.valueOf(z12.getText());
        float cellz12 = Float.valueOf(z12Str);

        EditText z21 = (EditText) findViewById(R.id.z21);
        String z21Str = String.valueOf(z21.getText());
        float cellz21 = Float.valueOf(z21Str);

        EditText z22 = (EditText) findViewById(R.id.z22);
        String z22Str = String.valueOf(z22.getText());
        float cellz22 = Float.valueOf(z22Str);

        RadioButton tambah = (RadioButton) findViewById(R.id.tambah);
        RadioButton kurang = (RadioButton) findViewById(R.id.kurang);
        RadioButton kali = (RadioButton) findViewById(R.id.kali);
        RadioButton bagi = (RadioButton) findViewById(R.id.bagi);

        float Hasil1=0;
        float Hasil2=0;
        float Hasil3=0;
        float Hasil4=0;


        if (tambah.isChecked()== true) {
            Hasil1=cellz11+cellz12;
            Hasil2=cellz21+cellz22;
            Hasil3=cellz12+cellz22;
            Hasil4=cellz11+cellz21;

        } else if (kurang.isChecked() == true) {
            Hasil1=cellz11-cellz12;
            Hasil2=cellz21-cellz22;
            Hasil3=cellz12-cellz22;
            Hasil4=cellz11-cellz21;

        } else if (kali.isChecked() == true) {
            Hasil1=cellz11*cellz12;
            Hasil2=cellz21*cellz22;
            Hasil3=cellz12*cellz22;
            Hasil4=cellz11*cellz21;

        } else if (bagi.isChecked() == true) {
            Hasil1=cellz11/cellz12;
            Hasil2=cellz21/cellz22;
            Hasil3=cellz12/cellz22;
            Hasil4=cellz11/cellz21;
        }

        String z13Str = String.valueOf(Hasil1);
        String z23Str = String.valueOf(Hasil2);
        String z31Str = String.valueOf(Hasil3);
        String z32Str = String.valueOf(Hasil4);

        TextView z13 = (TextView) findViewById(R.id.z13);
        z13.setText(z13Str);
        TextView z23 = (TextView) findViewById(R.id.z23);
        z23.setText(z23Str);
        TextView z31 = (TextView) findViewById(R.id.z31);
        z31.setText(z31Str);
        TextView z32 = (TextView) findViewById(R.id.z32);
        z32.setText(z32Str);
    }
}
