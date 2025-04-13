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

        Employee employee1 = new Employee("Mafiul Alam","App Developer",10000);
        tvdisplay.append(employee1.getName());
        tvdisplay.append("\n"+employee1.getPosition());
        tvdisplay.append("\n"+employee1.getSalary());


        Employee employee2 = new Employee("John","Web Developer",10000,5);
        tvdisplay.append("\n\n"+employee2.getName());
        tvdisplay.append("\n"+employee2.getPosition());
        tvdisplay.append("\n"+employee2.getSalary());



    }
}