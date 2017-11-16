package com.wind.androidserialization;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by zhangcong on 2017/11/16.
 */

public class SerializableActivity extends Activity{
    private TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        textView=findViewById(R.id.tv_text);
        Intent intent=getIntent();
        User user= (User) intent.getSerializableExtra("Simon");
        Person person=intent.getParcelableExtra("Simon");
        if (user!=null)
        {
            textView.setText(user.getName()+ "   "+ user.getPassword());
        }
        if (person!=null)
        {
            textView.setText(person.getName()+ "   "+ person.getAge());
        }


    }
}
