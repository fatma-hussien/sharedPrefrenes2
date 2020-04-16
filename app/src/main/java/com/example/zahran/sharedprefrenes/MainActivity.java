package com.example.zahran.sharedprefrenes;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/*
    TextView editText1,editText2,editText3;
    TextView textView;*/
    SharedPreferences Pref;
    public static String MYPREF="PREF";
    public static  String username="username";
//    public static  String age="username";
  //  public static  String like="username";

    public SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pref=getApplicationContext().getSharedPreferences(MYPREF,Context.MODE_PRIVATE);
/*
        editText1=findViewById(R.id.et_name);
        editText1=findViewById(R.id.et_age);
        editText1=findViewById(R.id.et_like);
        textView=findViewById(R.id.tv_define);

        String str1=editText1.getText().toString();
        String str2=editText2.getText().toString();
        String str3=editText3.getText().toString();
*/
        editor =Pref.edit();
        editor.putString(username,"fatma");
        editor.commit();

        //textView.setText(Pref.getString(username,"").toString().trim());

        Toast.makeText(this,"I'm "+Pref.getString(username,"")
                ,Toast.LENGTH_SHORT).show();

        editor.remove(username);
        editor.commit();
        editor.clear();

    }
}
