package kriek.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class rps extends AppCompatActivity {


    public int computer = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps2);
    }
    public void paperclick(View z){

        Random rand = new Random();
        computer = rand.nextInt(3);

        // 0 is defined as paper, 1 as scissors, 2 as rock

        switch(computer){
            case 0: startActivity(new Intent(getApplicationContext(), Draw.class));
                break;
            case 1: startActivity(new Intent(getApplicationContext(), loss.class));
                break;
            case 2:  startActivity(new Intent(getApplicationContext(), winnings.class));
                break;

        }

    }
    public void scissorsclick(View g){
        Random rand = new Random();
        computer = rand.nextInt(3);

        // 0 is defined as paper, 1 as scissors, 2 as rock

        switch(computer){
            case 1: startActivity(new Intent(getApplicationContext(), Draw.class));
                break;
            case 2: startActivity(new Intent(getApplicationContext(), loss.class));
                break;
            case 0:  startActivity(new Intent(getApplicationContext(), winnings.class));
                break;

        }
    }
    public void rockclick(View c){
        Random rand = new Random();
        computer = rand.nextInt(3);

        // 0 is defined as paper, 1 as scissors, 2 as rock

        switch(computer){
            case 2: startActivity(new Intent(getApplicationContext(), Draw.class));
                break;
            case 0: startActivity(new Intent(getApplicationContext(), loss.class));
                break;
            case 1:  startActivity(new Intent(getApplicationContext(), winnings.class));
                break;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rps, menu);
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
