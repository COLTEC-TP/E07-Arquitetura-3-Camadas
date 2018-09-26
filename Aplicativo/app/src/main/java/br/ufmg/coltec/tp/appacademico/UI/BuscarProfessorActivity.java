package br.ufmg.coltec.tp.appacademico.UI;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.ufmg.coltec.tp.appacademico.Negocio.FachadaProfessor;
import br.ufmg.coltec.tp.appacademico.Negocio.IFachadaProfessor;
import br.ufmg.coltec.tp.appacademico.Negocio.Professor;
import br.ufmg.coltec.tp.appacademico.R;

public class BuscarProfessorActivity extends Activity {

    IFachadaProfessor iFachadaProfessor = new FachadaProfessor(BuscarProfessorActivity.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_professor);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final TextView nome = findViewById(R.id.lbl_nomeBuscarProfessor);
        final TextView curso = findViewById(R.id.lbl_cursoBuscarProfessor);

        final EditText numeroCadastro = findViewById(R.id.txt_numeroCadastroBuscarProfessor);

        Button btn_buscar = findViewById(R.id.btn_buscarProfessor);

        btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Long longNumeroCadastro = Long.parseLong(numeroCadastro.getText().toString());

                try {
                    Professor professor = iFachadaProfessor.buscaProfessor(longNumeroCadastro);

                    nome.setText("Nome: " + professor.getNome());
                    curso.setText("Curso: " + professor.getCurso());

                }catch(NullPointerException e){
                    Toast.makeText(BuscarProfessorActivity.this, "Professor não cadastrado", Toast.LENGTH_SHORT).show();
                }catch (NumberFormatException e){
                    Toast.makeText(BuscarProfessorActivity.this, "Preencha os campos corretamente", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
