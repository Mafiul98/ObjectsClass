package com.example.objectsclass;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvdisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvdisplay=findViewById(R.id.tvdisplay);
        tvdisplay.setText("");

        Employee employee = new Employee();
        employee.name = "jhon";
        employee.position = "manager";
        employee.salary = 40000;

        Employee employee1 = new Employee();
        employee1.name = "Mafi";
        employee1.position = "manager";
        employee1.salary = 40000;

        tvdisplay.append("\nName: "+employee.name);
        tvdisplay.append("\nPosition: "+employee.position);
        tvdisplay.append("\nSalary: "+employee.salary+"usd");

        tvdisplay.append("\n\nName: "+employee1.name);
        tvdisplay.append("\nPosition: "+employee1.position);
        tvdisplay.append("\nSalary: "+employee1.salary+"usd");

    }
}