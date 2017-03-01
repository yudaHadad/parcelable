package com.example.jbt.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.saveBtn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String model = ((EditText)findViewById(R.id.modelET)).getText().toString();
                String maker = ((EditText)findViewById(R.id.makerET)).getText().toString();
                int size = Integer.parseInt(((EditText)findViewById(R.id.sizeET)).getText().toString());
                int year = Integer.parseInt(((EditText)findViewById(R.id.yearET)).getText().toString());

                Device d = new Device(model, maker, size , year);

                Intent intent = new Intent(MainActivity.this, orderDetailsAct.class);
                intent.putExtra("my_phone", d);
                startActivity(intent);
            }
        });

    }
}
