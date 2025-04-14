package com.example.objectsclass;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay;
    Employee Mafi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdisplay=findViewById(R.id.tvdisplay);
        tvdisplay.setText("");

     Mafi = new FulltimeEmployee("Mafi","Developer",10000);
     tvdisplay.append("Nmae: "+Mafi.getName());
     tvdisplay.append("\nPosition: "+Mafi.getPosition());
     tvdisplay.append("\nSalary: "+Mafi.getSalary());
     tvdisplay.append("\nTex: "+Mafi.calculateTex());
     tvdisplay.append("\nFinalSalary: "+Mafi.calculateFinalSalary());


     tvdisplay.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             tvdisplay.setText("");
             Mafi = new ParttimeEmployee("Mafi","Manager",8000);
             tvdisplay.append("Nmae: "+Mafi.getName());
             tvdisplay.append("\nPosition: "+Mafi.getPosition());
             tvdisplay.append("\nSalary: "+Mafi.getSalary());
             tvdisplay.append("\nTex: "+Mafi.calculateTex());
             tvdisplay.append("\nFinalSalary: "+Mafi.calculateFinalSalary());



         }
     });



    }
}