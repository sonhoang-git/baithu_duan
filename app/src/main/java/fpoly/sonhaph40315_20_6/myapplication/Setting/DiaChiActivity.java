package fpoly.sonhaph40315_20_6.myapplication.Setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import fpoly.sonhaph40315_20_6.myapplication.DonMuaActivity;
import fpoly.sonhaph40315_20_6.myapplication.R;

public class DiaChiActivity extends AppCompatActivity {


    private ImageView img_choxacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dia_chi);
        img_choxacnhan = findViewById(R.id.img_choxacnhan);
        img_choxacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiaChiActivity.this, DonMuaActivity.class);
                startActivity(intent);
            }
        });
    }
}