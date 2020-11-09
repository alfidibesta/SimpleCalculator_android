package id.bagas.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.bagas.calculator.R;


public class MainActivity extends AppCompatActivity {
    private Button button_kali, button_tambah,button_kurang, button_bagi;
    private TextView text_hasil;
    private EditText edit_text_angka_pertama,edit_text_angka_kedua;

    private int angka_pertama, angka_kedua, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_kali = findViewById(R.id.button_kali);
        button_bagi = findViewById(R.id.button_bagi);
        button_kurang = findViewById(R.id.button_kurang);
        button_tambah = findViewById(R.id.button_tambah);
        text_hasil = findViewById(R.id.text_hasil);
        edit_text_angka_kedua = findViewById(R.id.edit_text_angka_kedua);
        edit_text_angka_pertama = findViewById(R.id.edit_text_angka_pertama);

        //TODO 02 Buatlah kode program untuk menambahkan event klik dari tombol kali dan tombol bagi
        button_kali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getAngkaMasukan();
                text_hasil.setText(Integer.toString(kali(angka_pertama,angka_kedua)));
            }
        });

        button_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAngkaMasukan();
                text_hasil.setText(Integer.toString(bagi(angka_pertama,angka_kedua)));
            }
        });

        //TODO 03 Gunakanlah Log Cat Untuk memperbaiki kesalahan program

        //TODO 04 Gunakanlah Debugger untuk mencari kesalahan program (program berjalan dengan baik namun hasilnya salah)

        //TODO 05 Buatlah Validasi input agar masukan yang di isi oleh user tidak membuat program Force Close
        button_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validasi()){
                    return;
                }
                getAngkaMasukan();
                text_hasil.setText(Integer.toString(kurang(angka_pertama,angka_kedua)));
            }
        });

        button_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!validasi()){
                    return;
                }
                getAngkaMasukan();
                text_hasil.setText(Integer.toString(tambah(angka_pertama,angka_kedua)));
            }
        });
    }

    public void getAngkaMasukan(){
        //TODO 01 Buatlah kode program untuk mengambil nilai input dari edit text
        angka_pertama = Integer.parseInt(edit_text_angka_pertama.getText().toString());
        angka_kedua = Integer.parseInt(edit_text_angka_kedua.getText().toString());
    }

    private boolean validasi() {
        String number = "[1-9]+";

        if (edit_text_angka_pertama.getText().toString().length() > 0 && edit_text_angka_kedua.getText().toString().length() > 0) {
            if (!edit_text_angka_kedua.getText().toString().matches(number)) {
                return false;
            };
            if (!edit_text_angka_pertama.getText().toString().matches(number)) {
                return false;
            };
            return true;
        } else {
            return false;
        }
    }

    public int tambah(int angka_pertama, int angka_kedua) {
        hasil = angka_pertama+angka_kedua;
        return hasil;
    }

    public int kurang(int angka_pertama, int angka_kedua) {
        hasil = angka_pertama-angka_kedua;
        return hasil;
    }

    public int kali(int angka_pertama, int angka_kedua) {
        hasil = angka_pertama*angka_kedua;
        return hasil;
    }

    public int bagi(int angka_pertama, int angka_kedua) {
        hasil = angka_pertama/angka_kedua;
        return hasil;
    }
}