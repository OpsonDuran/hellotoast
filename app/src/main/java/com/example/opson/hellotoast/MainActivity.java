package com.example.opson.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView mshowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_LONG);
        toast.show();
    }
    public void countUp(View view) {
        mshowCount =(TextView) findViewById(R.id.show_count);
        mcount++;
        if (mshowCount!=null)
            mshowCount.setText(Integer.toString(mcount));
    }
}
