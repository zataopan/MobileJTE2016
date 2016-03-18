package id.ac.unsyiah.elektro.mobile.tugas_08;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by superhero on 3/18/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivity_kedua);

        Intent pesan = getIntent();
        String pesan1Str = pesan.getStringExtra("varl");
        int pesan2Str = pesan.getIntExtra("var2", 0);

        TextView txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtHasil.setText(pesan1Str);

        ImageView imgPilih = (ImageView) findViewById(R.id.imgHasil);
        imgPilih.setImageResource(pesan2Str);
    }
}
