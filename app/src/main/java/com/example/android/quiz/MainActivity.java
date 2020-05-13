package com.example.android.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void display(View view) {

        score = Quiz_Answer_1() + Quiz_Answer_2() + Quiz_Answer_3() + Quiz_Answer_4() + Quiz_Answer_5() + Quiz_Answer_6() + Quiz_Answer_7();

    }

    public int Quiz_Answer_1() {
        RadioButton radioButtonQ1_1 = findViewById(R.id.Quiz1_1);
        RadioButton radioButtonQ1_2 = findViewById(R.id.Quiz1_2);
        RadioButton radioButtonQ1_3 = findViewById(R.id.Quiz1_3);
        RadioButton radioButtonQ1_4 = findViewById(R.id.Quiz1_4);
        return (radioButtonQ1_4.isChecked() && !radioButtonQ1_1.isChecked() && !radioButtonQ1_2.isChecked() && !radioButtonQ1_3.isChecked()) ? 1 : 0;
    }

    public int Quiz_Answer_2() {
        RadioButton radioButtonQ2_1 = findViewById(R.id.Quiz2_1);
        RadioButton radioButtonQ2_2 = findViewById(R.id.Quiz2_2);
        RadioButton radioButtonQ2_3 = findViewById(R.id.Quiz2_3);
        RadioButton radioButtonQ2_4 = findViewById(R.id.Quiz2_4);
        return (radioButtonQ2_2.isChecked() && !radioButtonQ2_1.isChecked() && !radioButtonQ2_3.isChecked() && !radioButtonQ2_4.isChecked()) ? 1 : 0;
    }

    public int Quiz_Answer_3() {
        RadioButton radioButtonQ3_1 = findViewById(R.id.Quiz3_1);
        RadioButton radioButtonQ3_2 = findViewById(R.id.Quiz3_2);
        RadioButton radioButtonQ3_3 = findViewById(R.id.Quiz3_3);
        RadioButton radioButtonQ3_4 = findViewById(R.id.Quiz3_4);
        return (radioButtonQ3_2.isChecked() && !radioButtonQ3_1.isChecked() && !radioButtonQ3_3.isChecked() && !radioButtonQ3_4.isChecked()) ? 1 : 0;
    }
    //Each checkbox correct entry corresponds to one extra point

    public int Quiz_Answer_4() {
        CheckBox checkBoxQ4_1 = findViewById(R.id.Quiz4_1);
        CheckBox checkBoxQ4_2 = findViewById(R.id.Quiz4_2);
        CheckBox checkBoxQ4_3 = findViewById(R.id.Quiz4_3);
        CheckBox checkBoxQ4_4 = findViewById(R.id.Quiz4_4);
        return (checkBoxQ4_1.isChecked() && checkBoxQ4_2.isChecked() && !checkBoxQ4_3.isChecked() && !checkBoxQ4_4.isChecked()) ? 1 : 0;
    }

    public int Quiz_Answer_5() {
        RadioButton radioButtonQ5_1 = findViewById(R.id.Quiz5_1);
        RadioButton radioButtonQ5_2 = findViewById(R.id.Quiz5_2);
        RadioButton radioButtonQ5_3 = findViewById(R.id.Quiz5_3);
        RadioButton radioButtonQ5_4 = findViewById(R.id.Quiz5_4);
        return (radioButtonQ5_1.isChecked() && !radioButtonQ5_2.isChecked() && !radioButtonQ5_3.isChecked() && !radioButtonQ5_4.isChecked()) ? 1 : 0;
    }

    public int Quiz_Answer_6() {
        RadioButton radioButtonQ6_1 = findViewById(R.id.Quiz6_1);
        RadioButton radioButtonQ6_2 = findViewById(R.id.Quiz6_2);
        RadioButton radioButtonQ6_3 = findViewById(R.id.Quiz6_3);
        RadioButton radioButtonQ6_4 = findViewById(R.id.Quiz6_4);
        return (radioButtonQ6_2.isChecked() && !radioButtonQ6_4.isChecked() && !radioButtonQ6_3.isChecked() && !radioButtonQ6_1.isChecked()) ? 1 : 0;
    }

    public int Quiz_Answer_7() {
        RadioButton radioButtonQ7_1 = findViewById(R.id.Quiz7_1);
        RadioButton radioButtonQ7_2 = findViewById(R.id.Quiz7_2);
        RadioButton radioButtonQ7_3 = findViewById(R.id.Quiz7_3);
        RadioButton radioButtonQ7_4 = findViewById(R.id.Quiz7_4);
        return (radioButtonQ7_2.isChecked() && !radioButtonQ7_4.isChecked() && !radioButtonQ7_3.isChecked() && !radioButtonQ7_1.isChecked()) ? 1 : 0;
    }


    public void FinalScore(View view) {
        EditText FinalScore = findViewById(R.id.applicant_Name);
        Editable Name = FinalScore.getText();


        Context context = getApplicationContext();
        CharSequence text = Name + " you scored " + score + " out of 7 ";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
