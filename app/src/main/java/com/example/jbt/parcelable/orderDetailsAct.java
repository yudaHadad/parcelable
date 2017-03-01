package com.example.jbt.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class orderDetailsAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        Intent myIntent = getIntent();
        Device o1 = myIntent.getParcelableExtra("my_phone");

        ((TextView)findViewById(R.id.orderDetailsTV)).setText
                ("model: " +o1.model+ ", maker: " +o1.maker+ ", size: " +o1.size+ ", year: "+o1.year );
    }
}
