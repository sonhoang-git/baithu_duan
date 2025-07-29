package fpoly.sonhaph40315_20_6.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;
    Fragment homeFragment = new HomeFragment();
    Fragment menuFragment = new MenuFragment();
    Fragment poFragment = new PositionFragment();
    Fragment settingFragment = new SettingFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            bottomNavigationView = findViewById(R.id.bottomNavigation);
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,homeFragment).commit();

            bottomNavigationView.setOnItemSelectedListener(item ->{
                int id = item.getItemId();
                if(id == R.id.menu_setting){
                    loadFragment(settingFragment);
                    return true;
                } else if (id == R.id.menu_home) {
                    loadFragment(homeFragment);
                    return true;
                } else if (id==R.id.menu_position) {
                    loadFragment(poFragment);
                    return  true;
                }else if (id==R.id.menu_menu) {
                    loadFragment(menuFragment);
                    return true;
                }
                return false;
            });
//            return insets;
//        });
    }
    private void loadFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }
    // Hàm ẩn bottomNavigation
    public void hideBottomNav(){
        bottomNavigationView.setVisibility(View.GONE);
    }

    public void showBottomNav(){
        bottomNavigationView.setVisibility(View.VISIBLE);
    }
}