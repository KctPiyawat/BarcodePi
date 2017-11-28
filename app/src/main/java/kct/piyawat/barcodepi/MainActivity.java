package kct.piyawat.barcodepi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kct.piyawat.barcodepi.utility.MyManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Create SQLite Database (First Time)
        MyManager myManager = new MyManager(MainActivity.this);

    }   //Main Method

}   //Main Class
