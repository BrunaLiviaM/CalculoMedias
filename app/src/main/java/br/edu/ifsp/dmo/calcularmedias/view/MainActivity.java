package br.edu.ifsp.dmo.calcularmedias.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.dmo.calcularmedias.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Preencher o Spinner com as opções de tipo de média
        Spinner mediaSpinner = findViewById(R.id.mediaSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tipos_media_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mediaSpinner.setAdapter(adapter);
    }

    public void calcularMedia(View view) {
        // Obter valores dos EditTexts e tipo de média selecionado do Spinner
        EditText editText1 = findViewById(R.id.editText1);
        double valor1 = Double.parseDouble(editText1.getText().toString());

        Spinner mediaSpinner = findViewById(R.id.mediaSpinner);
        String tipoMedia = mediaSpinner.getSelectedItem().toString();

        // Implementar a lógica para calcular a média de acordo com o tipo selecionado
        // Usar a interface ConversorMedias e suas implementações aqui
    }
}
