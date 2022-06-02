package sg.edu.rp.c346.id21024750.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        spnYesNo = findViewById(R.id.spinner);

spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(MainActivity.this, position + " is selected", Toast.LENGTH_SHORT);
        switch (position) {
            case 0:
                tv.setText("Spinner Item, Yes Selected");
                break;
            case 1:
                tv.setText("Spinner Item, No Selected");
                break;

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        }
    });
    }}
