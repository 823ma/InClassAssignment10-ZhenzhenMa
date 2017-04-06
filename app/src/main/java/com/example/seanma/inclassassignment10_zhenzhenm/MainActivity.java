package com.example.seanma.inclassassignment10_zhenzhenm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toActivity (View view){
        switch (((Button) view).getText().toString()){
            case "Object":
                startActivity (new Intent(this, activity_object.class));
                break;
            case "List":
                startActivity (new Intent(this, activity_list.class));
                break;
            case "Camera":
                startActivity (new Intent(this, activity_camera.class));
                break;
            case "Storage":
                startActivity (new Intent(this, activity_storage.class));
                break;
        }
    }
}
