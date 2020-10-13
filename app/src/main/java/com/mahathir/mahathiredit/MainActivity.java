package com.mahathir.mahathiredit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1,editText2;
    private Button addButton,subButton,multipleButton,divideButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1 = (EditText) findViewById(R.id.edit_text_1_ID);
        editText2 = (EditText) findViewById(R.id.edit_text_2_ID);

        addButton = (Button) findViewById(R.id.add_button_ID);
        subButton = (Button) findViewById(R.id.sub_button_ID);
        multipleButton = (Button) findViewById(R.id.multiple_button_ID);
        divideButton = (Button) findViewById(R.id.divide_button_ID);

        resultTextView = (TextView) findViewById(R.id.result_text_view_ID);


        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multipleButton.setOnClickListener(this);
        divideButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        try {
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            //Converting Str int Double

            Double num1 = Double.parseDouble(number1);
            Double num2 = Double.parseDouble(number2);

            if (view.getId()==R.id.add_button_ID){
                Double sum = num1 + num2;
                resultTextView.setText("Result is : "+sum);

            }if (view.getId()==R.id.sub_button_ID){
                Double sub = num1 - num2;
                resultTextView.setText("Result is : "+sub);
            }if (view.getId()==R.id.multiple_button_ID) {
                Double mul = num1 * num2;
                resultTextView.setText("Result is : " + mul);
            }if (view.getId()==R.id.divide_button_ID) {
                Double div = num1 / num2;
                resultTextView.setText("Result is : " + div);
            }
        }catch (Exception e){
            Toast.makeText(MainActivity.this,"Please Enter Numbers",Toast.LENGTH_SHORT).show();

        }





    }
}