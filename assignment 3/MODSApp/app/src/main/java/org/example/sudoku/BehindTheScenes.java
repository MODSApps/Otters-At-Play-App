/***
 * Excerpted from "Hello, Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/eband3 for more book information.
 ***/
package org.example.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BehindTheScenes extends Activity implements View.OnClickListener {
    private static final String TAG = "Sudoku";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vipbehindthescenes);
        //Set up click listeners for all the buttons
        View continueButton = findViewById(R.id.Meet_button);
        continueButton.setOnClickListener(this);
        View jafarButton = findViewById(R.id.Diet_button);
        jafarButton.setOnClickListener(this);
        View linusButton = findViewById(R.id.Activities_In_The_Wild);
        linusButton.setOnClickListener(this);
        View marlinButton = findViewById(R.id.Anatomy_button);
        marlinButton.setOnClickListener(this);


    }

    // ...

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.Meet_button:
                startActivity(new Intent(this, CageCleaning.class));
                break;
            case R.id.Activities_In_The_Wild:
                startActivity(new Intent(this, Care.class));
                break;
            case R.id.Diet_button:
                startActivity(new Intent(this, Diet.class));
                break;
            case R.id.Anatomy_button:
                startActivity(new Intent(this, Dailyl.class));
                break;

        }
    }
}
