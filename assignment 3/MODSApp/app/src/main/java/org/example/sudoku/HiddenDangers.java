package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class HiddenDangers extends Activity  {
    private static final String TAG = "Sudoku";

    static private TextView msgText_TextView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.humanproblems);
        msgText_TextView5 = (TextView) findViewById(R.id.textView5);
        msgText_TextView5.setSingleLine(false);
        msgText_TextView5.setMaxLines(10);
        msgText_TextView5.setVerticalScrollBarEnabled(true);
        msgText_TextView5.setHorizontalScrollBarEnabled(true);
        msgText_TextView5.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        msgText_TextView5.setMovementMethod(new ScrollingMovementMethod());

        //to add new line +  "\n" +
        String txt = "North American River Otter Populations were once almost entirely eliminated around heavily populated areas in the Midwestern and eastern United States. Population trends although have stabilized in recent years and conservation efforts have resulted in the re-colonization of areas where they were previously eradicated. Northern river otter populations are still considered vulnerable throughout much of their range. Although they have serious environmental dangers from humans, their situation has not been assessed throughout much of the southeast including Florida and Georgia.";

        msgText_TextView5.setText(txt);

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
