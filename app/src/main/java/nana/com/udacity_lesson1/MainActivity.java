package nana.com.udacity_lesson1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import nana.com.udacity_lesson1.activity.ColorsActivity;
import nana.com.udacity_lesson1.activity.FamilyActivity;
import nana.com.udacity_lesson1.activity.NumbersActivity;
import nana.com.udacity_lesson1.activity.PhrasesActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtNumbers, txtFamily, txtColor, txtPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumbers = (TextView) findViewById(R.id.numbers);
        txtFamily = (TextView) findViewById(R.id.familyMembers);
        txtColor = (TextView) findViewById(R.id.colors);
        txtPhrases = (TextView) findViewById(R.id.pharases);

        txtNumbers.setOnClickListener(this);
        txtFamily.setOnClickListener(this);
        txtColor.setOnClickListener(this);
        txtPhrases.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.numbers:
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
                break;
            case R.id.familyMembers:
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
                break;
            case R.id.colors:
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
                break;
            case R.id.pharases:
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
                break;
            default:
        }
    }
}
