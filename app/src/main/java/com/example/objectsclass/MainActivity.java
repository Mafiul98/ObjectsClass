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


        Employee FulltimeEmployee = new FulltimeEmployee("Mafiul","App Devolper",10000);
        tvdisplay.append("Name: "+FulltimeEmployee.getName());
        tvdisplay.append("\nMainSalary: "+FulltimeEmployee.getSalary());
        tvdisplay.append("\nTax: "+FulltimeEmployee.calculateTex());
        tvdisplay.append("\nFinalSalary: "+FulltimeEmployee.calculateFinalSalary());

        Employee ParttimeEmployee = new ParttimeEmployee("John","Web Devolper",10000);
        tvdisplay.append("\n\nName: "+ParttimeEmployee.getName());
        tvdisplay.append("\nMainSalary: "+ParttimeEmployee.getSalary());
        tvdisplay.append("\nTax: "+ParttimeEmployee.calculateTex());
        tvdisplay.append("\nFinalSalary: "+ParttimeEmployee.calculateFinalSalary());



    }
}