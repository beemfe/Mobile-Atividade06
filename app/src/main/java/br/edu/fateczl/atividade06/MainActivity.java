package br.edu.fateczl.atividade06;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.edu.fateczl.atividade06.model.Professor;
import br.edu.fateczl.atividade06.model.ProfessorHorista;
import br.edu.fateczl.atividade06.model.ProfessorTitular;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbTitular;
    private RadioButton rbHorista;
    private EditText etSalarioAtual;
    private EditText etAnosInstituicao;
    private EditText etHoraAula;
    private EditText etHoras;
    private Button btnCalc;
    private TextView tvSalario;
    private Professor prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHoras = findViewById(R.id.etHoras);
        btnCalc = findViewById(R.id.btnCalc);
        tvSalario = findViewById(R.id.tvSalario);
        rbTitular = findViewById(R.id.rbTitular);
        rbHorista = findViewById(R.id.rbHorista);
        etSalarioAtual = findViewById(R.id.etSalarioAtual);
        etAnosInstituicao = findViewById(R.id.etAnosInstituicao);
        etHoraAula = findViewById(R.id.etHoraAula);

        btnCalc.setOnClickListener(view -> calc());
    }

    private void calc() {
        int horas = Integer.parseInt(etHoras.getText().toString());
        int anosInstituicao = Integer.parseInt(etAnosInstituicao.getText().toString());
        double horaAula = Integer.parseInt(etHoraAula.getText().toString());
        double salarioAtual = Integer.parseInt(etSalarioAtual.getText().toString());

        if (rbHorista.isChecked()) {
            prof = new ProfessorHorista();
            double sal = prof.calcSalario(horas, horaAula);
            sal = horas * horaAula;
        }
        if (rbTitular.isChecked()) {
            prof = new ProfessorTitular();
            double sal = prof.calcSalarioAtual(salarioAtual, anosInstituicao);
            if (anosInstituicao >= 5) {
                sal = salarioAtual * 0.05;
            }
            if (anosInstituicao >= 10) {
                sal = salarioAtual * 0.05;
            }
            if (anosInstituicao >= 15) {
                sal = salarioAtual * 0.05;
            }
            if (anosInstituicao >= 20) {
                sal = salarioAtual * 0.05;
            }
            if (anosInstituicao >= 25) {
                sal = salarioAtual * 0.05;
            }
        }
    }

}