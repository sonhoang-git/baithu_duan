package fpoly.sonhaph40315_20_6.myapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import fpoly.sonhaph40315_20_6.myapplication.fragment.ChoXacNhanFragment;
import fpoly.sonhaph40315_20_6.myapplication.fragment.DaGiaoFragment;
import fpoly.sonhaph40315_20_6.myapplication.fragment.DaHuyFragment;
import fpoly.sonhaph40315_20_6.myapplication.fragment.DangGiaoFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new ChoXacNhanFragment();
            case 1:
                return new DaGiaoFragment();
            case 2:
                return new DaHuyFragment();
            case 3:
                return new DangGiaoFragment();
            default:
                return new ChoXacNhanFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
