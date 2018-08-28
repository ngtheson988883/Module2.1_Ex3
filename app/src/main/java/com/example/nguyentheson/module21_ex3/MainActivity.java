package com.example.nguyentheson.module21_ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnConvert;
    EditText txtYear;
    EditText txtYinYear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvert = (Button) findViewById(R.id.btn_convert);
        txtYear = (EditText) findViewById(R.id.text_year);
        txtYinYear = (EditText) findViewById(R.id.text_yinYear);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year=Integer.parseInt(txtYear.getText().toString());
                txtYinYear.setText(calCan(year)+" "+calChi(year));
            }
        });
    }

    private String calCan(int year){
        int count = year%10;
        switch (count){
            case 0:
                return "Canh";
            case 1:
                return "Tân";
            case 2:
                return "Nhâm";
            case 3:
                return "Quý";
            case 4:
                return "Giáp";
            case 5:
                return "Ất";
            case 6:
                return "Bính";
            case 7:
                return "Đinh";
            case 8:
                return "Mậu";
            case 9:
                return "Tý";
            default:
                break;
        }
        return "";
    }
    private String calChi(int year){
        int count = year%12;
        switch (count){
            case 0:
                return "Thân";
            case 1:
                return "Dậu";
            case 2:
                return "Tuất";
            case 3:
                return "Hợi";
            case 4:
                return "Tý";
            case 5:
                return "Sửu";
            case 6:
                return "Dần";
            case 7:
                return "Mão";
            case 8:
                return "Thìn";
            case 9:
                return "Tỵ";
            case 10:
                return "Ngọ";
            case 11:
                return "Mùi";
            default:
                break;
        }
        return "";
    }
}
