package com.example.intentexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page extends Activity {

    Button back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page);

        back=(Button)findViewById(R.id.button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }


}
