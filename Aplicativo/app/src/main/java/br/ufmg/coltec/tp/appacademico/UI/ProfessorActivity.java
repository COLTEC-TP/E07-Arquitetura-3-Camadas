package br.ufmg.coltec.tp.appacademico.UI;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.ufmg.coltec.tp.appacademico.R;

public class ProfessorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button btn_inserir = findViewById(R.id.btn_inserirProfessor);
        Button btn_remover = findViewById(R.id.btn_removerProfessor);
        Button btn_buscar = findViewById(R.id.btn_buscarAluno);

        btn_inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfessorActivity.this, AlunoActivity.class);
                startActivity(intent);
            }
        });

        btn_remover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfessorActivity.this, AlunoActivity.class);
                startActivity(intent);
            }
        });

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfessorActivity.this, AlunoActivity.class);
                startActivity(intent);
            }
        });


    }
}
