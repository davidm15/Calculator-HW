package at.fh.swengb.hw_binary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayAboutActivity extends AppCompatActivity {

    private TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);

        TextView showResult = (TextView) findViewById(R.id.textViewResult);

        String data = getIntent().getExtras().getString("data");

        showResult.setText(data);

    }
}
