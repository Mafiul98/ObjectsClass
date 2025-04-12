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
        employee.setName("Mafiul alam");
        employee.setPosition("Android Developer");
        employee.setSalary(10000);

        Employee employee1 = new Employee();
        employee1.setName("Jhon");
        employee1.setPosition("Web Developer");
        employee1.setSalary(10000);

        tvdisplay.append(employee.getName());
        tvdisplay.append("\n"+employee.getPosition());
        tvdisplay.append("\n"+employee.getSalary()+"USD");

        tvdisplay.append("\n\n"+employee1.getName());
        tvdisplay.append("\n"+employee1.getPosition());
        tvdisplay.append("\n"+employee1.getSalary()+"USD");

    }
}