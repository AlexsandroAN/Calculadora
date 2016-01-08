package br.com.alex.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.view.*;


public class MainActivity extends ActionBarActivity {

    EditText etNumero1, etNumero2, etResultado;
    double numero1, numero2, resultado;
    Button btSomar, btSubtrair, btDividir, btMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero1 = (EditText) findViewById(R.id.numero1);
        etNumero2 = (EditText) findViewById(R.id.numero2);
        etResultado = (EditText) findViewById(R.id.resultado);
        btSomar = (Button) findViewById(R.id.btSoma);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btDividir = (Button) findViewById(R.id.btDividir);
        btMultiplicar= (Button) findViewById(R.id.btMultiplicar);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble(etNumero1.getText().toString());
                numero2 = Double.parseDouble(etNumero2.getText().toString());
                resultado = numero1 + numero2;
                etResultado.setText(String.valueOf(resultado));
            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble(etNumero1.getText().toString());
                numero2 = Double.parseDouble(etNumero2.getText().toString());
                resultado = numero1 - numero2;
                etResultado.setText(String.valueOf(resultado));

            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble(etNumero1.getText().toString());
                numero2 = Double.parseDouble(etNumero2.getText().toString());
                resultado = numero1 / numero2;
                etResultado.setText(String.valueOf(resultado));
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = Double.parseDouble(etNumero1.getText().toString());
                numero2 = Double.parseDouble(etNumero2.getText().toString());
                resultado = numero1 * numero2;
                etResultado.setText(String.valueOf(resultado));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
