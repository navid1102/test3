package com.nf.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText editText;
    Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText=(EditText) findViewById(R.id.edit_text1);
        btn_back=(Button) findViewById(R.id.btn_back);

        Intent i=getIntent();
        String str=i.getStringExtra("wealcom");
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();




        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setData(Uri.parse(editText.getText().toString()));
                setResult(RESULT_OK,intent);
                finish();
            }
        });



    }
}
