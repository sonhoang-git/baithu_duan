package fpoly.sonhaph40315_20_6.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import fpoly.sonhaph40315_20_6.myapplication.adapter.ViewPagerAdapter;

public class DonMuaActivity extends AppCompatActivity {


    private String[] title_donmua = {"Chờ xác nhận", "Đã giao", "Đã hủy","Đang giao"};
    private Toolbar toolbar_donmua;
    private TabLayout tablayout_donmua;
    private ViewPager2 viewpager;
    private ViewPagerAdapter viewpageradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_don_mua);
        toolbar_donmua = findViewById(R.id.toolbar_donmua);

        toolbar_donmua.setTitle("Đơn hàng");
        setSupportActionBar(toolbar_donmua);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tablayout_donmua = findViewById(R.id.tablayout_donmua);
        viewpager = findViewById(R.id.viewpager);
        viewpageradapter = new ViewPagerAdapter(this);
        viewpager.setAdapter(viewpageradapter);

        new TabLayoutMediator(tablayout_donmua, viewpager,
                (tab, position) ->
                        tab.setText(title_donmua[position])).attach();

    }
}
