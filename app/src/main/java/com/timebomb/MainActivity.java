package com.timebomb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimeBomb.enableLogging(BuildConfig.DEBUG);
        long timeLeft = TimeBomb.bombAfterDays(this, BuildConfig.BUILD_DATE, 1);

        ((TextView) findViewById(R.id.label)).setText(timeLeft + " days left until bombing.");
    }
}

