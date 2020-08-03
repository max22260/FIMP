package com.example.fimp;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Recognize, AddNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recognize = (Button) findViewById(R.id.Recognize_button);
        AddNew = (Button) findViewById(R.id.add_new_button);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            Recognize.setEnabled(false);
            AddNew.setEnabled(false);
            ActivityCompat.requestPermissions(this, new String[] { Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE }, 0);
        } else {
            Recognize.setEnabled(true);
            AddNew.setEnabled(true);
        }

        Recognize.setOnClickListener(this);
        AddNew.setOnClickListener(this);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == 0) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Recognize.setEnabled(true);
                AddNew.setEnabled(true);
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Recognize_button:
                Intent intent = new Intent(this, RecognizeActivity.class);
                startActivity(intent);
                break;
            case R.id.add_new_button:
                Intent intent3 = new Intent(this, AddNewActivity.class);
                startActivity(intent3);
                break;
        }

    }
}
