package br.ufmg.coltec.tp.appacademico.gui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.List;

import br.ufmg.coltec.tp.appacademico.R;
import br.ufmg.coltec.tp.appacademico.negocios.FachadaAluno;
import br.ufmg.coltec.tp.appacademico.negocios.FachadaProfessor;

public class GUIActivity extends Activity {

    RadioButton radioConsultaProfessor;
    RadioButton radioCadastroProfessor;
    Button enviarProfessor;
    EditText nomeProfessor;

    RadioButton radioConsultaAluno;
    RadioButton radioCadastroAluno;
    Button enviarAluno;
    EditText nomeAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gui);
        radioConsultaProfessor = findViewById(R.id.radioConsultaProfessor);
        radioCadastroProfessor = findViewById(R.id.radioCadastroProfessor);
        enviarProfessor = findViewById(R.id.enviarProfessor);
        nomeProfessor = findViewById(R.id.editTextAluno);

        radioConsultaAluno = findViewById(R.id.radioConsultaAluno);
        radioCadastroAluno = findViewById(R.id.radioCadastroAluno);
        enviarAluno = findViewById(R.id.enviarAluno);
        nomeAluno = findViewById(R.id.editTextProfessor);

        enviarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeAluno.getText().toString();
                FachadaAluno fachadaAluno = new FachadaAluno();
                if(radioCadastroAluno.isChecked()) {
                    fachadaAluno.cadastro(nomeAluno.getText().toString());
                }
                else if(radioConsultaAluno.isChecked()) {
                    List alunos = fachadaAluno.consulta(nomeAluno.getText().toString());
                }
            }
        });

        enviarProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeProfessor.getText().toString();
                FachadaProfessor fachadaProfessor = new FachadaProfessor();
                if(radioCadastroProfessor.isChecked()) {
                    fachadaProfessor.cadastro(nomeProfessor.getText().toString());
                }
                else if(radioConsultaProfessor.isChecked()) {
                    List professores = fachadaProfessor.consulta(nomeProfessor.getText().toString());
                }
            }
        });
    }
}
