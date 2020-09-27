package androdev.com.customalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonOK,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showCustomDialog(View view) {

        LayoutInflater inflater = LayoutInflater.from(this);
        View dialogView = inflater.inflate(R.layout.custom_dialog,null);

        buttonOK = dialogView.findViewById(R.id.btnOK);
        btnCancel = dialogView.findViewById(R.id.btnCancel);

        buttonOK.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

        AlertDialog dialog = new AlertDialog.Builder(this)
                            .setView(dialogView)
                            .create();

        dialog.show();
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.btnOK)
            Toast.makeText(this, "BUTTON OK PRESSED", Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, "BUTTON CANCEL PRESSED", Toast.LENGTH_SHORT).show();

    }
}