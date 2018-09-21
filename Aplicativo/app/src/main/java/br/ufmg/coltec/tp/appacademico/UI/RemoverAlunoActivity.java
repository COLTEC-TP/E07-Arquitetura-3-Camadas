package br.ufmg.coltec.tp.appacademico.UI;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.ufmg.coltec.tp.appacademico.Negocio.FachadaAluno;
import br.ufmg.coltec.tp.appacademico.Negocio.IFachadaAluno;
import br.ufmg.coltec.tp.appacademico.R;

public class RemoverAlunoActivity extends Activity {
    private IFachadaAluno fachadaAluno = new FachadaAluno(RemoverAlunoActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remover_aluno);

        final EditText matricula = findViewById(R.id.txt_matriculaRemoverAluno);
        Button remover = findViewById(R.id.btn_removerAluno);

        remover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fachadaAluno.removerAluno(Long.parseLong(matricula.getText().toString()));
            }
        });

    }
}
