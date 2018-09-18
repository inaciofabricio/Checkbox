package checkbox.cursoandroid.com.checkbok;

import android.os.StrictMode;
import android.support.annotation.BoolRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private TextView textoMostrar;
    private CheckBox checkBoxCachorro;
    private CheckBox checkBoxGato;
    private CheckBox checkBoxPapagaio;

    private String checaMarcacao(Boolean x){

        String resultado = "";

        if(x == true){
            resultado = "Sim";
        }else{
            resultado = "Não";
        }

        return resultado;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxCachorro = (CheckBox) findViewById(R.id.checkBoxCachorroId);
        checkBoxGato = (CheckBox) findViewById(R.id.checkBoxGatoId);
        checkBoxPapagaio = (CheckBox) findViewById(R.id.checkBoxPapagaioId);
        textoMostrar = (TextView) findViewById(R.id.textoMostrarId);
        botao = (Button) findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String itensSelecionado = "";
                itensSelecionado += "Cachorro: " + checkBoxCachorro.getText() + "Status: " + checaMarcacao(checkBoxCachorro.isChecked()) +"\n";
                itensSelecionado += "Gato: " + checkBoxGato.getText() + "Status: " + checaMarcacao(checkBoxGato.isChecked()) +"\n";
                itensSelecionado += "Papagaio: " + checkBoxPapagaio.getText() + "Status: " + checaMarcacao(checkBoxPapagaio.isChecked()) +"\n";

                textoMostrar.setText(itensSelecionado);
            }
        });
    }
}
