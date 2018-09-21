package br.ufmg.coltec.tp.appacademico.UI;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.ufmg.coltec.tp.appacademico.Negocio.Aluno;
import br.ufmg.coltec.tp.appacademico.Negocio.FachadaAluno;
import br.ufmg.coltec.tp.appacademico.Negocio.IFachadaAluno;
import br.ufmg.coltec.tp.appacademico.R;

public class BuscarAlunoActivity extends Activity {
    private IFachadaAluno fachadaAluno = new FachadaAluno(BuscarAlunoActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_aluno);

        final EditText matricula = findViewById(R.id.txt_matriculaBuscarAluno);

        final TextView nome = findViewById(R.id.lbl_nomeBuscarAluno);
        final TextView curso = findViewById(R.id.lbl_cursoBuscarAluno);
        final TextView endereco = findViewById(R.id.lbl_enderecoBuscarAluno);

        Button buscar = findViewById(R.id.btn_buscarAluno);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno aluno = fachadaAluno.buscarAluno(Long.parseLong(matricula.getText().toString()));
                nome.setText("Nome: " + aluno.getNome());
                curso.setText("Curso: " + aluno.getCurso());
                endereco.setText("Endereço: " + aluno.getEndereco());
            }
        });
    }
}
