package id.ac.unsyiah.elektro.mobile.pin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by superhero on 3/19/2016.
 */
public class ActivityKedua extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtLabel = (TextView) findViewById(R.id.txtHasil);
        txtLabel.setText(pesanStr);
    }
}
