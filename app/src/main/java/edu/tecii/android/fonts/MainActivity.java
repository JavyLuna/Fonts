package edu.tecii.android.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
    TextView tipo1,tipo2;
    Typeface batmfa, Saiyan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tipo1 = (TextView)findViewById(R.id.tipo1);
        tipo2= (TextView)findViewById(R.id.tipo2);

        batmfa = Typeface.createFromAsset(getAssets(), "batmfa.ttf");
        Saiyan = Typeface.createFromAsset(getAssets(), "Saiyan.ttf");

        tipo1.setTypeface(batmfa);
        tipo2.setTypeface(Saiyan);
    }
}
