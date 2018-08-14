package com.sznurowski.bioerg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculationsActivity extends AppCompatActivity {

    public Button btnPumps;

    public void init() {

        btnPumps = (Button) findViewById(R.id.pumpsBtn);
        btnPumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Menu = new Intent(CalculationsActivity.this, BioergActivity.class );
                startActivity(Menu);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculations);
        init();
    }
}
