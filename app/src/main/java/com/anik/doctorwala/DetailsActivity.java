package com.anik.doctorwala;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgDoctor;
    TextView txtName, txtDesc;

    String mobileNumber[] = {"0183175899", "0183175899", "0183175899", "0183175899"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgDoctor = findViewById(R.id.imageView);
        txtName = findViewById(R.id.txt_name);
        txtDesc = findViewById(R.id.txt_desc);

        //Received data
        String getName = getIntent().getExtras().getString("dr_name");

        if (getName.equals("one")) {

            imgDoctor.setImageResource(R.drawable.mahafuz);
            txtName.setText("Dr. Mahfuzur Rahaman");
            txtDesc.setText("Medicine Specialist\nTime:8PM - 11PM\nLocation: Dhaka\n Cell:  "+mobileNumber[0]);
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[0]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });



        }



        else if (getName.equals("two"))
        {
            imgDoctor.setImageResource(R.drawable.doctor2);
            txtName.setText("Dr. Mamun Khan");
            txtDesc.setText("Medicine Specialist\nTime:8PM - 11PM\nLocation: Dhaka ");

            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[1]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }

        else if (getName.equals("three"))
        {

            imgDoctor.setImageResource(R.drawable.doctor3);
            txtName.setText("Dr. Jamal Khan");
            txtDesc.setText("Medicine Specialist\nTime:8PM - 11PM\nLocation: Dhaka ");
            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[2]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }

        else if (getName.equals("four"))
        {

            imgDoctor.setImageResource(R.drawable.doctor4);
            txtName.setText("Dr. Rahim Uddin");
            txtDesc.setText("Medicine Specialist\nTime:8PM - 11PM\nLocation: Dhaka ");

            txtDesc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + mobileNumber[3]));
                    if (ActivityCompat.checkSelfPermission(DetailsActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    startActivity(intent);
                }
            });
        }



    }
}
