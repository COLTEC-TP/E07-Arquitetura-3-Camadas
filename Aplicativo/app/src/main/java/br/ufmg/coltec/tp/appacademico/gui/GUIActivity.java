package br.ufmg.coltec.tp.appacademico.gui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import br.ufmg.coltec.tp.appacademico.R;

public class GUIActivity extends Activity {

    RadioButton radioConsultaProfessor;
    RadioButton radioCadastroProfessor;
    Button enviarProfessor;
    TextView nomeProfessor;

    RadioButton radioConsultaAluno;
    RadioButton radioCadastroAluno;
    Button enviarAluno;
    TextView nomeAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gui);
        radioConsultaProfessor = findViewById(R.id.radioConsultaProfessor);
        radioCadastroProfessor = findViewById(R.id.radioCadastroProfessor);
        enviarProfessor = findViewById(R.id.enviarProfessor);
        nomeProfessor = findViewById(R.id.textViewProfessor);

        radioConsultaAluno = findViewById(R.id.radioConsultaAluno);
        radioCadastroAluno = findViewById(R.id.radioCadastroAluno);
        enviarAluno = findViewById(R.id.enviarAluno);
        nomeAluno = findViewById(R.id.textViewAluno);

        enviarProfessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeProfessor.getText().toString();
                if(radioCadastroProfessor.isChecked()) {

                }
                if(radioConsultaProfessor.isChecked()) {

                }
            }
        });

        enviarAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeAluno.getText().toString();
                if(radioCadastroAluno.isChecked()) {

                }
                if(radioConsultaAluno.isChecked()) {

                }
            }
        });
    }
}
