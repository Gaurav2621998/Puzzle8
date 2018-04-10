package com.example.gaurav.puzzle;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.SwitchPreference;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.gaurav.puzzle.PuzzleActivity;

public class SettingsActivity extends AppCompatPreferenceActivity {

    public TextView t;
    PuzzleActivity puzzleActivity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings_screen);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(this,PuzzleActivity.class);
        intent.putExtra("key",4);
        startActivity(intent);
    }
}
