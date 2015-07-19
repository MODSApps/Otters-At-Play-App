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
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Sudoku extends Activity implements OnClickListener {
   private static final String TAG = "Sudoku";

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.homescreen);
      //Set up click listeners for all the buttons
      View continueButton = findViewById(R.id.Meet_button);
      continueButton.setOnClickListener(this);
     View newButton = findViewById(R.id.Behind_button);
      newButton.setOnClickListener(this);
      View aboutButton = findViewById(R.id.Activities_In_The_Wild);
      aboutButton.setOnClickListener(this);
       View anatomyButton = findViewById(R.id.Anatomy_button);
       anatomyButton.setOnClickListener(this);
       View dangerButton = findViewById(R.id.Dangers_button);
       dangerButton.setOnClickListener(this);
       View quizButton = findViewById(R.id.Quiz_button);
       quizButton.setOnClickListener(this);
   }

   // ...
   
   public void onClick(View v) {
      switch (v.getId()) {

          case R.id.Meet_button:
              startActivity(new Intent(this, About.class));
              break;
          case R.id.Anatomy_button:
              startActivity(new Intent(this, Anatomy.class));
              break;
      // More buttons go here (if any) ...
      case R.id.Behind_button:
          startActivity(new Intent(this, BehindTheScenes.class));
          break;
          case R.id.Activities_In_The_Wild:
              startActivity(new Intent(this, OttersGoneWild.class));
         break;
          case R.id.Dangers_button:
              startActivity(new Intent(this, HiddenDangers.class));
              break;
          case R.id.Quiz_button:
              Intent intent = new Intent();
              intent.setAction("com.deitel.flagquiz");
              sendBroadcast(intent);
              break;


      }
   }


    @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      super.onCreateOptionsMenu(menu);
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.menu, menu);
      return true;
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case R.id.settings:
         startActivity(new Intent(this, Prefs.class));
         return true;
      // More items go here (if any) ...
      }
      return false;
   }

   /** Ask the user what difficulty level they want */
   private void openNewGameDialog() {
      new AlertDialog.Builder(this)
           .setTitle(R.string.new_game_title)
           .setItems(R.array.difficulty,
            new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialoginterface,
                     int i) {
                  startGame(i);
               }
            })
           .show();
   }
   
   /** Start a new game with the given difficulty level */
   private void startGame(int i) {
      Log.d(TAG, "clicked on " + i);
      // Start game here...
   }


    
}
