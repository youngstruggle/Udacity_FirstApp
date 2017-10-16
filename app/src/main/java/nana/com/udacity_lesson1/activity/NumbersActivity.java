package nana.com.udacity_lesson1.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import nana.com.udacity_lesson1.R;

public class NumbersActivity extends AppCompatActivity {

    /*private String[] words = new String[10];*/
    private ArrayList<String> words = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        Toast.makeText(getApplicationContext(), "Welcome in Numbers Activity", Toast.LENGTH_LONG).show();

        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        for (String temp : words) {
            Log.i("Iterasi ke " + temp.hashCode() + " :", temp.toString());
        }

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rootView);

        /*
        int index= 0;
        while (index < words.size()){
            TextView textView = new TextView (this);
            textView.setText(words.get(index));
            linearLayout.addView(textView);
            index++;
        }*/

        for (int i =0; i< words.size(); i++){
            TextView textView = new TextView (this);
            textView.setText(words.get(i));
            linearLayout.addView(textView);
        }
    }
}
