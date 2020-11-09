package de.jonasbernard.tudarmstadtmoodlewrapper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent source = getIntent();

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("moodlemobile://link=" + source.getDataString()));

        if (i.resolveActivity(getPackageManager()) != null) {

            // Toast.makeText(this, "Open " + source.getDataString(), Toast.LENGTH_SHORT).show();

            startActivity(i);
            finish();
            return;
        } else {
            Toast.makeText(this, "Newest version of Moodle not installed.", Toast.LENGTH_SHORT).show();
        }
    }
}