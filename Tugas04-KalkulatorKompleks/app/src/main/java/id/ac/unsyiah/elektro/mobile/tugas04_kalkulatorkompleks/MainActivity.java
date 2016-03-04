package id.ac.unsyiah.elektro.mobile.tugas04_kalkulatorkompleks;

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
    public void onClickBtnButton(View view){
        EditText bilanganReal1 = (EditText) findViewById(R.id.bilanganReal1);
        String bilangan1RealStr = String.valueOf(bilanganReal1.getText());
        int bilangan1Real = Integer.valueOf(bilangan1RealStr);

        EditText bilanganReal2 = (EditText) findViewById(R.id.bilanganReal2);
        String bilangan2RealStr = String.valueOf(bilanganReal2.getText());
        int bilangan2Real = Integer.valueOf(bilangan2RealStr);

        EditText bilanganImajiner1 = (EditText) findViewById(R.id.bilanganImajiner1);
        String bilangan1ImajinerStr = String.valueOf(bilanganImajiner1.getText());
        int bilangan1Imajiner = Integer.valueOf(bilangan1ImajinerStr);

        EditText bilanganImajiner2 = (EditText) findViewById(R.id.bilanganImajiner2);
        String bilangan2ImajinerStr = String.valueOf(bilanganImajiner2.getText());
        int bilangan2Imajiner = Integer.valueOf(bilangan2ImajinerStr);

        RadioButton Plus = (RadioButton) findViewById(R.id.radioButtontambah);
        RadioButton Minus = (RadioButton) findViewById(R.id.radioButtonkurang);
        RadioButton Kali = (RadioButton) findViewById(R.id.radioButtonkali);

        int Hasil1=0;
        int Hasil2=0;
        String simbol;

        if (Plus.isChecked()== true) {
            Hasil1 = bilangan1Real+bilangan2Real;
            Hasil2 = bilangan1Imajiner+bilangan2Imajiner;

        } else if (Minus.isChecked() == true) {
            Hasil1 = bilangan1Real-bilangan2Real;
            Hasil2 = bilangan1Imajiner-bilangan2Imajiner;

        } else if (Kali.isChecked() == true) {
            Hasil1 = bilangan1Real*bilangan2Real-bilangan1Imajiner*bilangan2Imajiner;
            Hasil2 = bilangan1Imajiner*bilangan2Real+bilangan1Real*bilangan2Imajiner;
        }

        String hasil1Str = String.valueOf(Hasil1);
        String hasil2Str = String.valueOf(Hasil2);

        if(Hasil2>=0){
            simbol="+";
        }
        else {
            simbol="";
        }

        TextView textJumlah = (TextView) findViewById(R.id.textJumlah);
        textJumlah.setText(hasil1Str+simbol+hasil2Str+"i");
    }
}


