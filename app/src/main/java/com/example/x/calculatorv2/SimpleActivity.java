package com.example.x.calculatorv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SimpleActivity extends AppCompatActivity {

    private static String input;
    private List<String> toParse = new ArrayList<>();
    private static int i=0;

    private double num1;
    private double num2;

    private double calcResult = 0;

    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private Button add;
    private Button substr;
    private Button divide;
    private Button multiply;
    private Button dot;
    private Button delete;
    private Button remove;
    private Button equals;

    private static boolean flag = false;

    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);



        final TextView memory = (TextView) findViewById(R.id.memory);
        final TextView result = (TextView) findViewById(R.id.result);

        Button button0 = (Button) findViewById(R.id.btn0);
        Button button1 = (Button) findViewById(R.id.btn1);
        Button button2 = (Button) findViewById(R.id.btn2);
        Button button3 = (Button) findViewById(R.id.btn3);
        Button button4 = (Button) findViewById(R.id.btn4);
        Button button5 = (Button) findViewById(R.id.btn5);
        Button button6 = (Button) findViewById(R.id.btn6);
        Button button7 = (Button) findViewById(R.id.btn7);
        Button button8 = (Button) findViewById(R.id.btn8);
        Button button9 = (Button) findViewById(R.id.btn9);

        Button add = (Button) findViewById(R.id.btnPlus);
        Button substr = (Button) findViewById(R.id.btnMinus);
        Button divide = (Button) findViewById(R.id.btnDivide);
        Button multiply = (Button) findViewById(R.id.btnMultiply);
        Button dot = (Button) findViewById(R.id.btnDot);
        Button delete = (Button) findViewById(R.id.delete);
        Button remove = (Button) findViewById(R.id.remove);
        Button equals = (Button) findViewById(R.id.equals);

        result.setText(calcResult+"");

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("0");
                if(i==0)
                {
                    input = toParse.get(i);
                    memory.setText(input);
                    calcResult = calcResult + Double.parseDouble(toParse.get(i));
                    result.setText(calcResult+"");
                }
                else
                {
                    if(!toParse.get(i-1).equals("/"))
                    {
                        input = input + toParse.get(i);
                        memory.setText(input);

                        for(int i=0; i<toParse.size();i++)
                        {
                            if(isDouble(toParse.get(i)))
                            {
                                if(toParse.get(i-1).equals("+"))
                                {
                                    calcResult = calcResult + Double.parseDouble(toParse.get(i));
                                    result.setText(calcResult+"");
                                }
                                else if (toParse.get(i-1).equals("-"))
                                {
                                    calcResult = calcResult - Double.parseDouble(toParse.get(i));
                                    result.setText(calcResult+"");
                                }
                                else if (toParse.get(i-1).equals("*"))
                                {
                                    calcResult = calcResult * Double.parseDouble(toParse.get(i));
                                    result.setText(calcResult+"");
                                }
//                                else if (toParse.get(i-1).equals("/"))
//                                {
//                                    calcResult = calcResult / Double.parseDouble(toParse.get(i));
//                                    result.setText(calcResult+"");
//                                }
                            }
                        }
                    }
                    else
                    {
                        memory.setText("Cannot divide by 0 !");
                    }
                }
                i++;


            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("1");
                if(i==0)
                {
                    input = toParse.get(i);
                    calcResult = Double.parseDouble(toParse.get(i));
//                    result.setText(input);
                    result.setText(calcResult+"");
                }
                else
                {
                    input = input + toParse.get(i);
                    for(int i=0; i<toParse.size();i++)
                    {
                        if(isDouble(toParse.get(i)))
                        {
                            if(toParse.get(i-1).equals("+"))
                            {
                                calcResult = calcResult + Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("-"))
                            {
                                calcResult = calcResult - Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("*"))
                            {
                                calcResult = calcResult * Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("/"))
                            {
                                calcResult = calcResult / Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                        }
                    }
                }
                memory.setText(input);
                i++;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("2");
                if(i==0)
                {
                    input = toParse.get(i);
                    calcResult = calcResult + Double.parseDouble(toParse.get(i));
                    result.setText(input);
                }
                else
                {
                    input = input + toParse.get(i);
                    for(int i=0; i<toParse.size();i++)
                    {
                        if(isDouble(toParse.get(i)))
                        {
                            if(toParse.get(i-1).equals("+"))
                            {
                                calcResult = calcResult + Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("-"))
                            {
                                calcResult = calcResult - Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("*"))
                            {
                                calcResult = calcResult * Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("/"))
                            {
                                calcResult = calcResult / Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                        }
                    }
                }
                memory.setText(input);
                i++;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("3");
                if(i==0)
                {
                    input = toParse.get(i);
                    calcResult = calcResult + Double.parseDouble(toParse.get(i));
                    result.setText(input);
                }
                else
                {
                    input = input + toParse.get(i);

                    for(int i=0; i<toParse.size();i++)
                    {
                        if(isDouble(toParse.get(i)))
                        {
                            if(toParse.get(i-1).equals("+"))
                            {
                                calcResult = calcResult + Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("-"))
                            {
                                calcResult = calcResult - Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("*"))
                            {
                                calcResult = calcResult * Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                            else if (toParse.get(i-1).equals("/"))
                            {
                                calcResult = calcResult / Double.parseDouble(toParse.get(i));
                                result.setText(calcResult+"");
                            }
                        }
                    }
                }


                memory.setText(input);
                i++;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("4");
                if(i==0)
                {
                    input = toParse.get(i);
                }
                else
                {
                    input = input + toParse.get(i);


                }


                memory.setText(input);
                i++;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("5");
                if(i==0)
                {
                    input = toParse.get(i);
                }
                else
                {
                    input = input + toParse.get(i);
                }


                memory.setText(input);
                i++;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("6");
                if(i==0)
                {
                    input = toParse.get(i);
                }
                else
                {
                    input = input + toParse.get(i);
                }


                memory.setText(input);
                i++;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("7");
                if(i==0)
                {
                    input = toParse.get(i);
                }
                else
                {
                    input = input + toParse.get(i);
                }


                memory.setText(input);
                i++;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("8");
                if(i==0)
                {
                    input = toParse.get(i);
                }
                else
                {
                    input = input + toParse.get(i);
                }


                memory.setText(input);
                i++;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toParse.add("9");
                if(i==0)
                {
                    input = toParse.get(i);
                }
                else
                {
                    input = input + toParse.get(i);
                }


                memory.setText(input);
                i++;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0)
                {
                    toParse.add("+");
                    input = toParse.get(i);
                    i++;
                }
                else
                {
                    if(toParse.get(i-1).equals("+") ||toParse.get(i-1).equals("-") || toParse.get(i-1).equals("*") || toParse.get(i-1).equals("/"))
                    {
                        toParse.remove(i-1);
                        i--;
                        toParse.add("+");
                        input = input.substring(0,i) + toParse.get(i);
                        i++;
                    }
                    else
                    {
                        toParse.add("+");
                        input = input + toParse.get(i);
                        i++;
                    }
                }
                flag = false;

                memory.setText(input);

            }
        });

        substr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0)
                {
                    toParse.add("-");
                    input = toParse.get(i);
                    i++;
                }
                else
                {
                    if(toParse.get(i-1).equals("+") ||toParse.get(i-1).equals("-") || toParse.get(i-1).equals("*") || toParse.get(i-1).equals("/"))
                    {
                        toParse.remove(i-1);
                        i--;
                        toParse.add("-");
                        input = input.substring(0,i) + toParse.get(i);
                        i++;
                    }
                    else
                    {
                        toParse.add("-");
                        input = input + toParse.get(i);
                        i++;
                    }
                }
                flag = false;

                memory.setText(input);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0)
                {
                    toParse.add("/");
                    input = toParse.get(i);
                    i++;
                }
                else
                {
                    if(toParse.get(i-1).equals("+") ||toParse.get(i-1).equals("-") || toParse.get(i-1).equals("*") || toParse.get(i-1).equals("/"))
                    {
                        toParse.remove(i-1);
                        i--;
                        toParse.add("/");
                        input = input.substring(0,i) + toParse.get(i);
                        i++;
                    }
                    else
                    {
                        toParse.add("/");
                        input = input + toParse.get(i);
                        i++;
                    }
                }
                flag = false;

                memory.setText(input);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0)
                {
                    toParse.add("+");
                    input = toParse.get(i);
                    i++;
                }
                else
                {
                    if(toParse.get(i-1).equals("+") ||toParse.get(i-1).equals("-") || toParse.get(i-1).equals("*") || toParse.get(i-1).equals("/"))
                    {
                        toParse.remove(i-1);
                        i--;
                        toParse.add("*");
                        input = input.substring(0,i) + toParse.get(i);
                        i++;
                    }
                    else
                    {
                        toParse.add("*");
                        input = input + toParse.get(i);
                        i++;
                    }
                }
                flag = false;

                memory.setText(input);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(i!=0)
            {
                if(flag==false && !(toParse.get(i-1).equals("+")||toParse.get(i-1).equals("-")||toParse.get(i-1).equals("/")||toParse.get(i-1).equals("*")))
                {
                    toParse.add(".");
                    if(i==0)
                    {
                        input = toParse.get(i);
                    }
                    else
                    {
                        input = input + toParse.get(i);
                    }
                    memory.setText(input);
                    flag=true;
                    i++;
                }
            }

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i!=0)
                {
                    if(toParse.get(i-1).equals("."))
                    {
                        flag = false;
                    }
                    toParse.remove(i-1);

                    if(i==0)
                    {
                        input = "";
                    }
                    else
                    {
                        input = input.substring(0,i-1);
                        i--;
                    }
                    memory.setText(input);
                }
            }
        });

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               toParse.removeAll(toParse);
                i=0;
                memory.setText("");
                flag = false;
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
