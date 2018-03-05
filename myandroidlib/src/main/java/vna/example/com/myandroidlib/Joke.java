package vna.example.com.myandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Joke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke);
        String joke = getIntent().getStringExtra("test");
        ((TextView) findViewById(R.id.txt)).setText(joke);

    }
}
