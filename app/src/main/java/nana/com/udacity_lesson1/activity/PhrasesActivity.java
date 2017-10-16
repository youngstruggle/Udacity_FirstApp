package nana.com.udacity_lesson1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import nana.com.udacity_lesson1.R;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        Toast.makeText(getApplicationContext(), "Welcome in Phrases Activity", Toast.LENGTH_LONG).show();
    }
}
