package com.example.gavin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//  Text displayed on screen at all times
    String display = "";

//  Array containing sum split up
    String[] sum;
    int index = 0;

//    

//  count to keep track of brackets
    int b_count = 0;

//  Numbers
    double a;// = Double.parseInt(splitText[0]);
    double b;// = Double.parseInt(splitText[1]);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textViewBig);

//      Assign zero button to listen and add 0 to display string
        Button zero = (Button) findViewById(R.id.btn_zero);
        zero.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "0";
                        textView.setText(display);
                    }
                });

//      Assign one button to listen  and add 1 to display string
        Button one = (Button) findViewById(R.id.btn_one);
        one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "1";
                        textView.setText(display);
                    }
                });

//      Assign two button to listen  and add 2 to display string
        Button two = (Button) findViewById(R.id.btn_two);
        two.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "2";
                        textView.setText(display);
                    }
                });

//      Assign three button to listen and add 3 to display string
        Button three = (Button) findViewById(R.id.btn_three);
        three.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "3";
                        textView.setText(display);
                    }
                });

//      Assign four button to listen and add 4 to display string
        Button four = (Button) findViewById(R.id.btn_four);
        four.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "4";
                        textView.setText(display);
                    }
                });

//      Assign five button to listen  and add 5 to display string
        Button five = (Button) findViewById(R.id.btn_five);
        five.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "5";
                        textView.setText(display);
                    }
                });

//      Assign six button to listen  and add 6 to display string
        Button six = (Button) findViewById(R.id.btn_six);
        six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "6";
                        textView.setText(display);
                    }
                });

//      Assign seven button to listen  and add 7 to display string
        Button seven = (Button) findViewById(R.id.btn_seven);
        seven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "7";
                        textView.setText(display);
                    }
                });

//      Assign eight button to listen and add 8 to display string
        Button eight = (Button) findViewById(R.id.btn_eight);
        eight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "8";
                        textView.setText(display);
                    }
                });

//      Assign nine button to listen  and add 9 to display string
        Button nine = (Button) findViewById(R.id.btn_nine);
        nine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "9";
                        textView.setText(display);
                    }
                });

//      Assign add button to listen  and add + to display string
        Button plus = (Button) findViewById(R.id.btn_plus);
        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "+";
                        textView.setText(display);
                    }
                });

//      Assign minus button to listen and add - to display string
        Button minus = (Button) findViewById(R.id.btn_minus);
        minus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "-";
                        textView.setText(display);
                    }
                });

//      Assign multiply button to listen and add * to display string
        Button multiply = (Button) findViewById(R.id.btn_multiple);
        multiply.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "*";
                        textView.setText(display);
                    }
                });

//      Assign divide button to listen and add / to display string
        Button divide = (Button) findViewById(R.id.btn_divide);
        divide.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "/";
                        textView.setText(display);
                    }
                });

//      Assign modulus button to listen and add % to display string
        Button modulus = (Button) findViewById(R.id.btn_percentage);
        modulus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + "%";
                        textView.setText(display);
                    }
                });

//      Assign decimal button to listen and add . to display string
        Button decimal = (Button) findViewById(R.id.btn_dot);
        decimal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = display + ".";
                        textView.setText(display);
                    }
                });

//      Assign back space button to listen and erase last entry
        Button back = (Button) findViewById(R.id.btn_back);
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(!display.equals("")) {
                            display = display.substring(0, display.length() - 1);
                            textView.setText(display);
                        }
                    }
                });

//      Assign clear button to listen and clear display string
        Button clear = (Button) findViewById(R.id.btn_delete);
        clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        display = "";
                        b_count = 0;
                        textView.setText(display);
                    }
                });

//      Assign brackets button to listen and add opening or closing bracket to display string
        Button brackets = (Button) findViewById(R.id.btn_small_bracket);
        brackets.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(b_count % 2 == 0){
                            display = display + "(";
                            b_count++;
                        } else {
                            display = display + ")";
                            b_count++;
                        }
                        textView.setText(display);
                    }
                });

//      Assign equals button to listen and compute equation entered
        Button equals = (Button) findViewById(R.id.btn_equal);
        equals.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(isValid()){
                            calculate();
                        } else {
                            display = "Error!!!";
                        }
                        textView.setText(display);
                    }
                });
        }

//  Check if what is entered is valid
    public boolean isValid(){
        boolean isValid = true;
        if(display.startsWith("+") || display.startsWith("-") || display.startsWith("*")
                || display.startsWith("/") || display.startsWith("%") || b_count % 2 !=0) {
            isValid = false;
        }
        return isValid;
    }

//  Calculate what is entered
    public void calculate() {

//      parse display to divide into numbers and operators
        String number = "";
        String operators = "+-*/%";
        for(int i = 0; i < display.length(); i++){

            if(display.substring(i,i+1).equals("(")){
                sum[index] = "(";
                index++;
            } else if(display.substring(i,i+1).equals(")")){
                sum[index] = number;
                number = "0";
                index++;
                sum[index] = ")";
                index++;
            } else if(display.substring(i,i+1).equals(operators)) {
                sum[index] = number;
                number = "0";
                index++;
                sum[index] = display.substring(i,i+1);
                index++;
            } else {
                number = number + display.substring(i,i+1);
            }
        }

        for(int i = 0; i < sum.length; i++){

        }

//        for(int x = 0;x < display.length();x++){
//            if(display.substring(x,x+1).equals(operator)) {
//                a = Double.parseDouble(number);
//                number = "0";
//            } else {
//                number = number + display.substring(x,x+1);
//            }
//            b = Double.parseDouble(number);
//        }

        double result = 0;

//        switch (operator) {
//            case "+": result = a + b; break;
//            case "-": result = a - b; break;
//            case "*": result = a * b; break;
//            case "/": result = a / b; break;
//            case "%": result = a % b;
//        }
//        display = Double.toString(result);
    }

}