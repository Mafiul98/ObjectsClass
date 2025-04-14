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
/*

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

 */

        Employee employee2  = new Employee("Mafi","Developer",10000) {
            @Override
            public float calculateTex() {
                return getSalary()*5/100;
            }

            @Override
            public float calculateFinalSalary() {
                return getSalary()-calculateTex();
            }
        };

        tvdisplay.append("\nName: "+employee2.getName());
        tvdisplay.append("\nMainSalary: "+employee2.getSalary());
        tvdisplay.append("\nTax: "+employee2.calculateTex());
        tvdisplay.append("\nFinalSalary: "+employee2.calculateFinalSalary());


        Employee employee1 = new Employee("Bill gates","CEO",20000) {
            @Override
            public float calculateTex() {
                return getSalary()*10/100;
            }

            @Override
            public float calculateFinalSalary() {
                return getSalary()-calculateTex();
            }
        };

        tvdisplay.append("\n\nName: "+employee1.getName());
        tvdisplay.append("\nMainSalary: "+employee1.getSalary());
        tvdisplay.append("\nTax: "+employee1.calculateTex());
        tvdisplay.append("\nFinalSalary: "+employee1.calculateFinalSalary());


    }
}