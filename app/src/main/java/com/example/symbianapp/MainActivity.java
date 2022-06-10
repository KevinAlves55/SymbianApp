package com.example.symbianapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.symbianapp.model.Cliente;
import com.example.symbianapp.remote.API;
import com.example.symbianapp.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText txtNome;
    EditText txtSobrenome;
    EditText txtEmail;
    EditText txtCelular;
    Button btnCadastrar;

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        txtSobrenome = findViewById(R.id.txtSobrenome);
        txtEmail = findViewById(R.id.txtEmail);
        txtCelular = findViewById(R.id.txtCelular);
        btnCadastrar = findViewById(R.id.btnCadastrarCliente);

        routerInterface = API.getClientInterface();

        btnCadastrar.setOnClickListener(view -> {

            Cliente cliente = new Cliente();

            cliente.setNome(txtNome.getText().toString());
            cliente.setSobrenome(txtSobrenome.getText().toString());
            cliente.setEmail(txtEmail.getText().toString());
            cliente.setCelular(txtCelular.getText().toString());

            addCliente(cliente);

        });

    }

    public void addCliente(Cliente cliente) {

        Call<Cliente> call = routerInterface.addCliente(cliente);

        call.enqueue(new Callback<Cliente>() {
            @Override
            public void onResponse(Call<Cliente> call, Response<Cliente> response) {

                if (response.isSuccessful()) {

                    Toast.makeText(MainActivity.this,"Cliente inserido com sucesso", Toast.LENGTH_LONG).show();

                }

            }

            @Override
            public void onFailure(Call<Cliente> call, Throwable t) {

                Log.d("teste", t.getMessage());
                Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_LONG).show();

            }
        });

    }

}