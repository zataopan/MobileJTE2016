package id.ac.unsyiah.elektro.mobile.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by superhero on 3/12/2016.
 */
public class AktivityKedua extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivitykedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView textLabel = (TextView) findViewById(R.id.textlabel);
        textLabel.setText(pesanStr);
    }

    }
