package fpoly.sonhaph40315_20_6.myapplication;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DanhGiaSanPhamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_danh_gia_san_pham);
        ImageView[] stars = {
                findViewById(R.id.star1),
                findViewById(R.id.star2),
                findViewById(R.id.star3),
                findViewById(R.id.star4),
                findViewById(R.id.star5)
        };

        int yellow = ContextCompat.getColor(this, R.color.yellow);
        int gray = ContextCompat.getColor(this, R.color.gray);

        for (int i = 0; i < stars.length; i++) {
            final int index = i;
            stars[i].setOnClickListener(v -> {
                for (int j = 0; j < stars.length; j++) {
                    if (j <= index) {
                        stars[j].setColorFilter(yellow, PorterDuff.Mode.SRC_IN);
                    } else {
                        stars[j].setColorFilter(gray, PorterDuff.Mode.SRC_IN);
                    }
                }
            });

        }
    }
}