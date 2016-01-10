package com.example.sourabh.overflowmenuexample;

//To create an Overfolw menu,u need to override 2 new methods- onOptionItemSelected() & onCreateOptionMenu()
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        text=(TextView)findViewById(R.id.text);  //Referring to TextView
        switch (item.getItemId())   //returns the value of selected item
        {
            case R.id.red:
                if(item.isChecked())  item.setChecked(false);  //Optional
                else item.setChecked(true);                    //Optional
                text.setTextColor(Color.RED);
                break;
            case R.id.yellow:
                if(item.isChecked())  item.setChecked(false);  //Optional
                else item.setChecked(true);                    //Optional
                text.setTextColor(Color.YELLOW);
                break;
            case R.id.green:
                if(item.isChecked())  item.setChecked(false);  //Optional
                else item.setChecked(true);                    //Optional
                text.setTextColor(Color.GREEN);
                break;
            case R.id.blue:
                if(item.isChecked())  item.setChecked(false);  //Optional
                else item.setChecked(true);                    //Optional
                text.setTextColor(Color.BLUE);
                break;
            default:


        }
        Toast.makeText(MainActivity.this,"Color is " + item.getTitle(),Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);  //Inflating xml file "menu_main" from menu folder from resource folder
        return super.onCreateOptionsMenu(menu);
    }
}
