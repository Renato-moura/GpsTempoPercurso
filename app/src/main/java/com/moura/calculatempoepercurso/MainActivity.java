package com.moura.calculatempoepercurso;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_PERMISSION_GPS = 1001;

    private Button bt_requestGPS;
    private Button bt_enableGPS;
    private Button bt_disableGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_requestGPS = (Button) findViewById(R.id.bt_requestGPS);
        bt_enableGPS = (Button) findViewById(R.id.bt_enableGPS);
        bt_disableGPS = (Button) findViewById(R.id.bt_disableGPS);
    }
}
