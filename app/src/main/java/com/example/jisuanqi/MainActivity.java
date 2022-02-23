package com.example.jisuanqi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bt_jia,bt_cheng,bt_chu,bt_jian,bt_ok,bt_del;
    private EditText et_number;
    private TextView result,gc;
    private int number_1,number_2,number_re,mode;
    private String text_re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_jia=findViewById(R.id.bt_jia);
        bt_jian=findViewById(R.id.bt_jian);
        bt_cheng=findViewById(R.id.bt_cheng);
        bt_del=findViewById(R.id.bt_del);
        bt_chu=findViewById(R.id.bt_chu);
        bt_ok=findViewById(R.id.bt_ok);
        et_number=findViewById(R.id.et);
        result=findViewById(R.id.result);
        gc=findViewById(R.id.gc);
        System.out.println("123");
        bt_jia.setOnClickListener(this);
        bt_jian.setOnClickListener(this);
        bt_cheng.setOnClickListener(this);
        bt_chu.setOnClickListener(this);
        bt_ok.setOnClickListener(this);
        bt_del.setOnClickListener(this);

        System.out.println("杨昱中 yyds");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.bt_cheng:
                cheng();

                break;
            case R.id.bt_chu:
                chu();

                break;
            case R.id.bt_jia:
                jia();

                break;
            case R.id.bt_jian:
                jian();

                break;
            case R.id.bt_ok:
                ok();
                break;
            case R.id.bt_del:
                del();
                break;

        }
    }
    public void cheng(){
         mode=1;
         if (text_re==null) {
             String textnum = et_number.getText().toString().trim();
             number_1 = Integer.parseInt(textnum);
             et_number.setText("");
         }
         else {
             number_1 =number_re;
             et_number.setText("");
         }
    }
    public void cheng_2()
    {
        number_re=number_1*number_2;
        text_re=Integer.toString(number_re);
        result.setText(text_re);
        et_number.setText(text_re);
        gc.setText(Integer.toString(number_1)+"x"+Integer.toString(number_2));

    }



    public void chu(){
        mode=2;
        if (text_re==null) {
            String textnum = et_number.getText().toString().trim();
            number_1 = Integer.parseInt(textnum);
            et_number.setText("");
        }
        else {
            number_1 =number_re;
            et_number.setText("");
        }
    }
    public void chu_2()
    {
        number_re=number_1/number_2;
        text_re=Integer.toString(number_re);
        result.setText(text_re);
        et_number.setText(text_re);

    }
    public void jia(){
        mode=3;
        if (text_re==null) {
            String textnum = et_number.getText().toString().trim();
            number_1 = Integer.parseInt(textnum);
            et_number.setText("");
        }
        else {
            number_1 =number_re;
            et_number.setText("");
        }
    }
    public void jia_2()
    {
        number_re=number_1+number_2;
        text_re=Integer.toString(number_re);
        result.setText(text_re);
        et_number.setText(text_re);

    }
    public void jian(){
        mode=4;
        if (text_re==null) {
            String textnum = et_number.getText().toString().trim();
            number_1 = Integer.parseInt(textnum);
            et_number.setText("");
        }
        else {
            number_1 =number_re;
            et_number.setText("");
        }
    }
    public void jian_2()
    {
        number_re=number_1-number_2;
        text_re=Integer.toString(number_re);
        result.setText(text_re);
        et_number.setText(text_re);

    }



    public void ok()
    {
        String textnum_2=et_number.getText().toString().trim();
        number_2=Integer.parseInt(textnum_2);
        switch (mode)
        {
            case 1:
                cheng_2();
                break;
            case 2:
                chu_2();
                break;
            case 3:
                jia_2();
                break;
            case 4:
                jian_2();
                break;
        }
    }
    public void del(){
        number_re=0;
        result.setText("0");
        et_number.setText("");
        text_re=null;
    }

}