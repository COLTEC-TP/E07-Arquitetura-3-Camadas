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
import br.ufmg.coltec.tp.appacademico.R;

public class RemoverProfessorActivity extends Activity {

    IFachadaProfessor iFachadaProfessor = new FachadaProfessor(RemoverProfessorActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remover_professor);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final EditText numeroCadastro = findViewById(R.id.txt_RemoverProfessorNumeroCadastro);

        Button btn_remover = findViewById(R.id.btn_removerProfessor);

        btn_remover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Long longNumeroCadastro = Long.parseLong(numeroCadastro.getText().toString());
                boolean resultado = iFachadaProfessor.removeProfessor(longNumeroCadastro);

                try {
                    if (resultado){
                        Toast.makeText(RemoverProfessorActivity.this, "Professor removido com sucesso", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(RemoverProfessorActivity.this, "Professor não encontrado", Toast.LENGTH_SHORT).show();
                    }
                }
                catch (NumberFormatException e) {
                    Toast.makeText(RemoverProfessorActivity.this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}