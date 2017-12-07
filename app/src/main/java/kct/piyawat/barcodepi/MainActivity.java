package kct.piyawat.barcodepi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kct.piyawat.barcodepi.utility.MyManager;

public class MainActivity extends AppCompatActivity {
    private MyManager myManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Create SQLite Database (First Time)
         myManager = new MyManager(MainActivity.this);

//        Test Add Value
//        testAddValue();


    }   //Main Method

    private void testAddValue() {
        String[] strings = new String[]{
                null,
                "testName",
                "testBar",
                "testPrice",
                "testDetail",
                "testPath",
                "testItem"};
        myManager.addNewValueToSQLite(strings);
    }


}   //Main Class
