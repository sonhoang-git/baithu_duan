package fpoly.sonhaph40315_20_6.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import fpoly.sonhaph40315_20_6.myapplication.Setting.DiaChiActivity;
import fpoly.sonhaph40315_20_6.myapplication.Setting.HoTroActivity;
import fpoly.sonhaph40315_20_6.myapplication.Setting.TheNganHangActivity;
import fpoly.sonhaph40315_20_6.myapplication.Setting.ThongTinActivity;

public class SettingFragment extends Fragment {

    private LinearLayout settingContainer;
    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        toolbar = view.findViewById(R.id.toolbar_setting);
        AppCompatActivity activity = (AppCompatActivity) requireActivity();
        activity.setSupportActionBar(toolbar);
        if (activity.getSupportActionBar() != null) {
            activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            activity.getSupportActionBar().setTitle("Cài đặt");
        }
        toolbar.setNavigationOnClickListener(v -> activity.onBackPressed());
        settingContainer = view.findViewById(R.id.settingContainer);
        addSettingItem(R.drawable.map, "Địa chỉ");
        View divider = new View(getContext());
        divider.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                1)); // chiều cao 1dp
        divider.setBackgroundColor(Color.parseColor("#333333"));
        settingContainer.addView(divider);
        addSettingItem(R.drawable.map, "Thẻ ngân hàng");
        addSettingItem(R.drawable.map, "Thông tin");
        addSettingItem(R.drawable.map, "Hỗ trợ");
        addSettingItem(R.drawable.map, "Đăng xuất");
        return view;
    }

    private void addSettingItem(int iconRes, String title) {
        View item = LayoutInflater.from(getContext()).inflate(R.layout.item_setting, null);
        ((ImageView) item.findViewById(R.id.icon_setting)).setImageResource(iconRes);
        ((TextView) item.findViewById(R.id.textSetting)).setText(title);
        item.setOnClickListener(v -> {
            Context context = requireContext();
            if (title.equals("Địa chỉ")) {
                startActivity(new Intent(context, DiaChiActivity.class));
            } else if (title.equals("Thẻ ngân hàng")) {
                startActivity(new Intent(context, TheNganHangActivity.class));
            } else if (title.equals("Thông tin")) {
                startActivity(new Intent(context, ThongTinActivity.class));
            } else if (title.equals("Hỗ trợ")) {
                startActivity(new Intent(context, HoTroActivity.class));
            } else if (title.equals("Đăng xuất")) {
                Toast.makeText(context, "Đăng xuất thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
        settingContainer.addView(item);
    }
}
