package cn.edu.sdwu.android02.home.sn170507180130;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }
    public void startHome1(View view){

        //界面跳转到作业1
        Intent intent=new Intent(this,Home1Activity.class);
        startActivity(intent);
    }
    //作业2 跳转
    public void startHome2(View view){
        //界面跳转
        Intent intent=new Intent(this,Home2Activity.class);
        startActivity(intent);
    }
    //作业3 跳转
    public void startHome3(View view){
        //界面跳转
        Intent intent=new Intent(this,Home3Activity.class);
        startActivity(intent);
    }

}
