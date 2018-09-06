package com.anik.doctorwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnDoctor1,btnDoctor2,btnDoctor3,btnDoctor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDoctor1=findViewById(R.id.btn_doctor1);
        btnDoctor2=findViewById(R.id.btn_doctor2);
        btnDoctor3=findViewById(R.id.btn_doctor3);
        btnDoctor4=findViewById(R.id.btn_doctor4);

        btnDoctor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("dr_name","one");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        btnDoctor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("dr_name","two");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });


        btnDoctor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("dr_name","three");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnDoctor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("dr_name","four");
                Toast.makeText(HomeActivity.this, "Doctor", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

    }
}
