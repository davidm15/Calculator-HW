package at.fh.swengb.hw_binary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText getBit;
    private EditText getByte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText getBit = (EditText) findViewById(R.id.bitNumber);
        EditText getByte = (EditText) findViewById(R.id.byteNumber);

    }

    public void reset(View view) {

        EditText getBit = (EditText) findViewById(R.id.bitNumber);
        EditText getByte = (EditText) findViewById(R.id.byteNumber);

        getBit.setText("");
        getByte.setText("");

    }

    public void calculate(View view) {

        EditText getBit = (EditText) findViewById(R.id.bitNumber);
        EditText getByte = (EditText) findViewById(R.id.byteNumber);

        String num1String = getBit.getText().toString();
        String num2String = getByte.getText().toString();

        if ((TextUtils.isEmpty(num1String)) && (TextUtils.isEmpty(num2String))) {
                getBit.setText("Enter at least one field!");

        }

        if ((!TextUtils.isEmpty(num1String)) && (TextUtils.isEmpty(num2String))) {
            try {
                int num1 = Integer.parseInt(num1String);
                int result = num1/8;
                getByte.setText(String.valueOf(result));
            } catch (NumberFormatException e) {
                getByte.setText("Wrong Input!!");
                e.printStackTrace();
            }
        }

        if ((!TextUtils.isEmpty(num2String)) && (TextUtils.isEmpty(num1String))) {
            try {
                int num2 = Integer.parseInt(num2String);
                int result2 = num2*8;
                getBit.setText(String.valueOf(result2));
            } catch (NumberFormatException e) {
                getBit.setText("Wrong Input!!");
                e.printStackTrace();
            }
        }

    }
}
