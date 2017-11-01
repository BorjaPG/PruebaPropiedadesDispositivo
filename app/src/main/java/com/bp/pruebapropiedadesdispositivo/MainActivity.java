package com.bp.pruebapropiedadesdispositivo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        // 0 = PHONE_TYPE_NONE, 1 = PHONE_TYPE_GSM, 2 = PHONE_TYPE_CDMA, 3 =
        // PHONE_TYPE_SIP
        int phoneType = tm.getPhoneType();
        Log.v(MainActivity.this.getClass()
                .getName(), "phoneType = " + phoneType);
        // DATA_SUSPENDED
        int dataState = tm.getDataState();
        Log.v(MainActivity.this.getClass()
                .getName(), "dataState = " + dataState);
        String operator = tm.getSimOperator();
        Log.v(MainActivity.this.getClass()
                .getName(), "operator = " + operator);
    }
}
