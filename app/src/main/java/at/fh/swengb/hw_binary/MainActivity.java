package at.fh.swengb.hw_binary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private TextView showResult;
    private int byteActive = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input1 = (EditText) findViewById(R.id.number);

        TextView showResult = (TextView) findViewById(R.id.textViewResult);

    }

    public void calcBit(View view) {

        EditText input1 = (EditText) findViewById(R.id.number);

        TextView showResult = (TextView) findViewById(R.id.textViewResult);

        try {
            int num1 = Integer.parseInt(input1.getText().toString());

            int result = num1*8;
            showResult.setText(" " + result + " bit");
        } catch (NumberFormatException e) {
            showResult.setText("Wrong Input");
            e.printStackTrace();
        }


    }

    public void calcByte(View view) {

        EditText input1 = (EditText) findViewById(R.id.number);

        TextView showResult = (TextView) findViewById(R.id.textViewResult);
        try {
            int num2 = Integer.parseInt(input1.getText().toString());

            int result2 = num2/8;

            showResult.setText(" " + result2 + " Byte");
        } catch (NumberFormatException e) {
            showResult.setText("Wrong Input");
            e.printStackTrace();
        }


    }

    public void resetFields(View view) {

        EditText input1 = (EditText) findViewById(R.id.number);
        TextView showResult = (TextView) findViewById(R.id.textViewResult);
        input1.setText("");
        showResult.setText("");

    }

    public void showAbout(View view) {

        TextView input1 = (TextView) findViewById(R.id.textViewResult);
        Intent intent = new Intent(this,DisplayAboutActivity.class);
        String string1 = input1.getText().toString();

        intent.putExtra("data",string1);
        startActivity(intent);

    }

}
