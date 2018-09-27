package br.ufmg.coltec.tp.appacademico.UI;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.ufmg.coltec.tp.appacademico.Negocio.FachadaProfessor;
import br.ufmg.coltec.tp.appacademico.Negocio.IFachadaProfessor;
import br.ufmg.coltec.tp.appacademico.Negocio.Professor;
import br.ufmg.coltec.tp.appacademico.R;

public class InserirProfessorActivity extends Activity {

    IFachadaProfessor iFachadaProfessor = new FachadaProfessor(InserirProfessorActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_professor);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final EditText nome = findViewById(R.id.txt_inserirNomeProfessor);
        final EditText curso = findViewById(R.id.txt_inserirCursoProfessor);
        final EditText numeroCadastro = findViewById(R.id.txt_inserirNumeroCadastroProfessor);

        Button btn_inserir = findViewById(R.id.btn_inserirProfessor);

        btn_inserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String stringNome = nome.getText().toString();
                String stringCurso = curso.getText().toString();
                Long longNumeroCadastro = Long.parseLong(numeroCadastro.getText().toString());

                if (stringNome.equals("") || stringCurso.equals("") || longNumeroCadastro.toString().equals("")) {
                    Toast.makeText(InserirProfessorActivity.this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show();
                }
                else {
                    Professor professor = new Professor(stringNome, stringCurso, longNumeroCadastro);

                    iFachadaProfessor.insereProfessor(professor);

                    Toast.makeText(InserirProfessorActivity.this, "Professor inserido com sucesso", Toast.LENGTH_SHORT).show();

                    finish();
                }
            }
        });
    }
}