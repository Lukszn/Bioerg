package com.sznurowski.bioerg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    public Button btnCalculations;

    public void init() {

        btnCalculations = (Button) findViewById(R.id.calculations);
        btnCalculations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Menu = new Intent(MenuActivity.this, CalculationsActivity.class );
                startActivity(Menu);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
    }
}
