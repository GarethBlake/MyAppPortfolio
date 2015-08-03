package net.bassbar.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    // Button methods

    /**
     * Launch Spotify Streamer
     *
     * @param view
     */
    public void launchSpotifyStreamer(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Spotify Streamer!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * Launch Scores App
     *
     * @param view
     */
    public void launchScoresApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Scores App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * Launch Library App
     *
     * @param view
     */
    public void launchLibraryApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the Library App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * Launch Build It Bigger
     *
     * @param view
     */
    public void launchBuildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * launch XYZ Reader
     *
     * @param view
     */
    public void launchXYZReader(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch the XYZ Reader!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /**
     * Launch Capstone:My Own App
     *
     * @param view
     */
    public void launchCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
