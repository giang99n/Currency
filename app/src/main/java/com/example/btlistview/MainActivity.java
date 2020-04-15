package com.example.btlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner ds1,ds2;
    TextView txt1,txt2,txt3,txt4,txt5;
    Button btn0, btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDot,btnCE,btnBS;
    Double kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ds1 = findViewById(R.id.spinner1);
        ds2 = findViewById(R.id.spinner2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDot = findViewById(R.id.btnDot);
        btnCE = findViewById(R.id.btnCE);
        btnBS = findViewById(R.id.btnBS);
        final ArrayList<String> array = new ArrayList<>();
        array.add("Europe - Euro €");
        array.add("Japan - Yen ¥");
        array.add("Korea - Won ₩");
        array.add("United States - Dollar $");
        array.add("Vietnam - Dong đ");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R. layout.simple_spinner_item, array);
        ds1.setAdapter(adapter);
        ds2.setAdapter(adapter);
        ds1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txt1.setText(array.get(position).toString().substring(array.get(position).toString().length()-1,array.get(position).toString().length()));
               // t();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ds2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txt3.setText(array.get(position).toString().substring(array.get(position).toString().length()-1,array.get(position).toString().length()));
             //  t();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"0");t();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"1");t();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"2");t();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"3");
                t();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"4");
                t();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"5");
                t();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"6");
              t();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"7");
               t();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"8");
               t();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText(txt2.getText()+"9");
               t();
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt2.getText().toString()==""){
                    txt2.setText("0.");
                }
                if(txt2.getText().toString().contains(".")) {
                    //
                }else
                    txt2.setText(txt2.getText() + ".");
                t();
            }
        });
        btnBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txt2.getText().toString().length()==1) {txt2.setText("");txt4.setText("");}
                if(! txt2.getText().toString().equals("")) {
                    txt2.setText(txt2.getText().toString().substring(0, txt2.getText().toString().length() - 1));
                    t();
                }
            }
        });
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt2.setText("");
                txt4.setText("");
            }
        });


    }

   public void t(){
        if(txt1.getText().toString().equals("€")){
            if(txt3.getText().toString().equals("¥")) {kq=Double.parseDouble(txt2.getText().toString())*117.65; txt5.setText("1€ = 117.65 ¥");}
            else if(txt3.getText().toString().equals("₩")) {kq=Double.parseDouble(txt2.getText().toString())*1328.98;txt5.setText("1€ = 1328.98 ₩");}
            else if(txt3.getText().toString().equals("$")) { kq=Double.parseDouble(txt2.getText().toString())*1.09;txt5.setText("1€ = 1.09 $");}
            else if(txt3.getText().toString().equals("€")) {kq = Double.parseDouble(txt2.getText().toString());txt5.setText("1€ = 1€");}
            else {kq=Double.parseDouble(txt2.getText().toString())*25581.99; txt5.setText("1€ = 25581.99 vnđ");}

        }
        else if(txt1.getText().toString().equals("¥")){
            if(txt3.getText().toString().equals("¥")) {kq=Double.parseDouble(txt2.getText().toString()); txt5.setText("1¥ = 1¥");}
            else if(txt3.getText().toString().equals("₩")) {kq=Double.parseDouble(txt2.getText().toString())*11.3;txt5.setText("1¥ = 11.30 ₩");}
            else if(txt3.getText().toString().equals("$")) { kq=Double.parseDouble(txt2.getText().toString())*0.0093;txt5.setText("1¥ = 0.0093 $");}
            else if(txt3.getText().toString().equals("€")) {kq = Double.parseDouble(txt2.getText().toString())*0.0085 ;txt5.setText("1¥ = 0.0085 €");}
            else  {kq=Double.parseDouble(txt2.getText().toString())*217.44; txt5.setText("1¥ = 217.44vnđ");}

        }
        else if(txt1.getText().toString().equals("₩")){
            if(txt3.getText().toString().equals("¥")) {kq=Double.parseDouble(txt2.getText().toString())*0.0885; txt5.setText("1 ₩ = 0.0885¥");}
            else if(txt3.getText().toString().equals("₩")) {kq=Double.parseDouble(txt2.getText().toString());txt5.setText("1₩ = ₩");}
            else if(txt3.getText().toString().equals("$")) { kq=Double.parseDouble(txt2.getText().toString())*0.0008;txt5.setText("1₩ =0.0008$");}
            else if(txt3.getText().toString().equals("€")) {kq = Double.parseDouble(txt2.getText().toString())*0.0008;txt5.setText("1₩ = 0.0008 €");}
            else {kq=Double.parseDouble(txt2.getText().toString())*19.25; txt5.setText("1₩ = 19.25vnđ");}
        }
        else if(txt1.getText().toString().equals("$")){
            if(txt3.getText().toString().equals("¥")) {kq=Double.parseDouble(txt2.getText().toString())*107.78; txt5.setText("1 $ = 107.78¥");}
            else if(txt3.getText().toString().equals("₩")) {kq=Double.parseDouble(txt2.getText().toString())*1217.48;txt5.setText("1$ = 1217.48₩");}
            else if(txt3.getText().toString().equals("$")) { kq=Double.parseDouble(txt2.getText().toString());txt5.setText("1$ = 1$");}
            else if(txt3.getText().toString().equals("€")) {kq = Double.parseDouble(txt2.getText().toString())*0.9161;txt5.setText("1$ = 0.9161€");}
            else {kq=Double.parseDouble(txt2.getText().toString())*23435.67; txt5.setText("1$ = 23435.67vnđ");}
        }
        else {
            if(txt3.getText().toString().equals("¥")) {kq=Double.parseDouble(txt2.getText().toString())*0.0046; txt5.setText("1 vnđ = 0.0046¥");}
            else if(txt3.getText().toString().equals("₩")) {kq=Double.parseDouble(txt2.getText().toString())* 0.0520;txt5.setText("1 vnđ = 0.0520 ₩");}
            else if(txt3.getText().toString().equals("$")) { kq=Double.parseDouble(txt2.getText().toString())*0.00004268;txt5.setText("1vnđ = 0.00004268$");}
            else if(txt3.getText().toString().equals("€")) {kq = Double.parseDouble(txt2.getText().toString())*0.00003906;txt5.setText("1vnđ = 0.00003906€");}
            else {kq=Double.parseDouble(txt2.getText().toString())*23435.67; txt5.setText("1vnđ = 1 vnđ");}
        }
       DecimalFormat dcf = new DecimalFormat("###,###,###.##");
       String k=String.valueOf(dcf.format(kq));
       txt4.setText(k);

    }

}
