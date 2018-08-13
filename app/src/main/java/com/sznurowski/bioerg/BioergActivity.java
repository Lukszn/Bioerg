package com.sznurowski.bioerg;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.INVISIBLE;

public class BioergActivity extends AppCompatActivity {

    TextView totalSumTxt;
    TextView displacementTxt;
    EditText number1Txt;
    EditText number2Txt;
    EditText number3Txt;
    EditText number4Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioerg);

        totalSumTxt = (TextView) findViewById(R.id.totalSumTxt);
        displacementTxt = (TextView) findViewById(R.id.displacementTxt);
        number1Txt = (EditText) findViewById(R.id.number1Txt);
        number2Txt = (EditText) findViewById(R.id.number2Txt);
        number3Txt = (EditText) findViewById(R.id.number3Txt);
        number4Txt = (EditText) findViewById(R.id.number4Txt);

        Button calcBtn = (Button) findViewById(R.id.calcBtn);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1 = Float.parseFloat(number1Txt.getText().toString());
                float num2 = Float.parseFloat(number2Txt.getText().toString());
                float num3 = Float.parseFloat(number3Txt.getText().toString());
                float num4 = Float.parseFloat(number4Txt.getText().toString());

                float total = num4 - (num2 - num3);
                float example = 5 - total;
                float displacement = total / 2;
                String displacementS = "przesuń dławik od tulejki o:" + " " + displacement + " cm";
                String roznica = "dodaj podkładkę:" + " " + example + " cm";
                totalSumTxt.setText(Float.toString(total) + " cm");
                displacementTxt.setVisibility(INVISIBLE);


                if (total < 4.99 || total > 6.00){
                    totalSumTxt.setTextColor(Color.RED);
                    displacementTxt.setText(roznica);
                    displacementTxt.setVisibility(View.VISIBLE);
                }else{
                    totalSumTxt.setTextColor(Color.GREEN);
                    displacementTxt.setText(displacementS);
                    displacementTxt.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}
