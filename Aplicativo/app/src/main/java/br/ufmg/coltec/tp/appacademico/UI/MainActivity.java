package br.ufmg.coltec.tp.appacademico.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.ufmg.coltec.tp.appacademico.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aluno = findViewById(R.id.btn_alunoUI);
        Button professor = findViewById(R.id.btn_professorUI);

        aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlunoActivity.class);
                startActivity(intent);
            }
        });

        professor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfessorActivity.class);
                startActivity(intent);
            }
        });
    }
}
