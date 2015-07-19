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

public class About extends Activity implements View.OnClickListener {
   private static final String TAG = "Sudoku";

   /**
    * Called when the activity is first created.
    */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.meettheotters);
      //Set up click listeners for all the buttons
      View continueButton = findViewById(R.id.joey_button);
      continueButton.setOnClickListener(this);
      View jafarButton = findViewById(R.id.jafar_button);
      jafarButton.setOnClickListener(this);
      View linusButton = findViewById(R.id.linus_button);
      linusButton.setOnClickListener(this);
      View marlinButton = findViewById(R.id.marlin_button);
      marlinButton.setOnClickListener(this);


   }

   // ...

   public void onClick(View v) {
      switch (v.getId()) {

         case R.id.joey_button:
            startActivity(new Intent(this, JoeyInformation.class));
            break;
         case R.id.jafar_button:
            startActivity(new Intent(this, JafarInformation.class));
            break;
         case R.id.linus_button:
            startActivity(new Intent(this, LinusInformation.class));
            break;
         case R.id.marlin_button:
            startActivity(new Intent(this, MarlinInformation.class));
            break;

      }
   }
}
