package br.ufmg.coltec.tp.appacademico.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.ufmg.coltec.tp.appacademico.R;

public class AlunoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aluno);

        Button btnInserir = findViewById(R.id.btn_intentInserirAluno);
        Button btnRemover = findViewById(R.id.btn_intentRemoverAluno);
        Button btnBuscar = findViewById(R.id.btn_intentBuscarAluno);

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlunoActivity.this, InserirAlunoActivity.class);
                startActivity(intent);
            }
        });

        btnRemover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlunoActivity.this, RemoverAlunoActivity.class);
                startActivity(intent);
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlunoActivity.this, BuscarAlunoActivity.class);
                startActivity(intent);
            }
        });
    }
}
