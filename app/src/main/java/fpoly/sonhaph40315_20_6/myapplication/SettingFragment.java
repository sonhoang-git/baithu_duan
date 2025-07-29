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

    private ImageView imgbtn_back;
    private TextView txt_title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_setting, container, false);
        toolbar = view.findViewById(R.id.toolbar_setting);
        settingContainer = view.findViewById(R.id.settingContainer);
        imgbtn_back = view.findViewById(R.id.btn_back);
        txt_title = view.findViewById(R.id.tv_title);

        // Gọi hàm ẩn bottom
        ((MainActivity)getActivity()) .hideBottomNav();
        settingContainer = view.findViewById(R.id.settingContainer);
        addSettingItem(R.drawable.map, "Địa chỉ");
        addDivider();
        addSettingItem(R.drawable.map, "Thẻ ngân hàng");
        addDivider();
        addSettingItem(R.drawable.map, "Thông tin");
        addDivider();
        addSettingItem(R.drawable.map, "Hỗ trợ");
        addDivider();
        addSettingItem(R.drawable.map, "Đăng xuất");
        addDivider();
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

    private void addDivider() {
        View divider = new View(getContext());
        divider.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                1)); // chiều cao 1dp
        divider.setBackgroundColor(Color.parseColor("#333333"));
        settingContainer.addView(divider);
    }
}
