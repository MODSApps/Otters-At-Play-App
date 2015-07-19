package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Anatomy extends Activity  {
    private static final String TAG = "Sudoku";

    static private TextView msgText_TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anatomy);
        msgText_TextView = (TextView) findViewById(R.id.textView2);
        msgText_TextView.setSingleLine(false);
        msgText_TextView.setMaxLines(10);
        msgText_TextView.setVerticalScrollBarEnabled(true);
        msgText_TextView.setHorizontalScrollBarEnabled(true);
        msgText_TextView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        msgText_TextView.setMovementMethod(new ScrollingMovementMethod());

        //to add new line +  "\n" +
        String txt = "Their life expectancy is 8-9 years in the wild and up to 21 years in captivity. They have Extremely flexible bodies, webbed toes and strong claws on all four feet, tails that take up about one third of the total body length, flattened heads with short thick necks and dense velvety fur. North American river otters are about 3-4 feet long including their tail. The tail makes up about 1/3 of their total length. They usually weigh between 11 to 30 pounds. Males are generally larger than females.";

        msgText_TextView.setText(txt);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_behind_the_scenes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
