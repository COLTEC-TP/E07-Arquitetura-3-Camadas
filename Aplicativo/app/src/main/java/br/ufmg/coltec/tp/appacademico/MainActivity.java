package br.ufmg.coltec.tp.appacademico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import br.ufmg.coltec.tp.appacademico.gui.GUIActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(MainActivity.this, GUIActivity.class);
        startActivity(intent);
    }
}
