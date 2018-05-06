package com.ags.alejo.mylittlegoogle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** UI components **/
    private EditText textField;
    private EditText urlsField;
    private Button makeAction;
    private TextView switchModeLabel;

    private boolean isInSearchMode = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect();

        switchModeLabel.setOnClickListener(view ->  changeMode() );
    }

    /**
     * Change the mode of search mode to insert mode
     */
    private void changeMode() {
        if(isInSearchMode) {
            textField.setHint("Ingresa una palabra clave");
            urlsField.setVisibility(View.VISIBLE);
            makeAction.setText("Agregar");
            switchModeLabel.setText("Buscar por palabra clave");
            isInSearchMode = false;
            return;
        }
        textField.setHint("Ingresa tu busqueda");
        urlsField.setVisibility(View.INVISIBLE);
        makeAction.setText("Buscar");
        switchModeLabel.setText("Agrega mas webs y cambia el mundo");
        isInSearchMode = true;
    }

    private void connect() {
        textField = findViewById(R.id.search_input);
        urlsField = findViewById(R.id.urls_input);
        makeAction = findViewById(R.id.btn_make_action);
        switchModeLabel = findViewById(R.id.switch_mode);
    }
}
