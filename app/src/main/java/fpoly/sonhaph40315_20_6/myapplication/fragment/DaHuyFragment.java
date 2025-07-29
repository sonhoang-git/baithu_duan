package fpoly.sonhaph40315_20_6.myapplication.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import fpoly.sonhaph40315_20_6.myapplication.R;
import fpoly.sonhaph40315_20_6.myapplication.adapter.DaHuyDonHangAdapter;
import fpoly.sonhaph40315_20_6.myapplication.model.TrangThaiModel;


public class DaHuyFragment extends Fragment {

    private RecyclerView recyclerView_dahuy;
    private DaHuyDonHangAdapter daHuyDonHangAdapter;
    private ArrayList<TrangThaiModel> trangThaiModelArrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_da_huy, container, false);
        recyclerView_dahuy = view.findViewById(R.id.recyclerView_dahuy);
        trangThaiModelArrayList = new ArrayList<>();
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đã hủy"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đã hủy"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đã hủy"));

        daHuyDonHangAdapter = new DaHuyDonHangAdapter(getContext(),trangThaiModelArrayList);
        recyclerView_dahuy.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_dahuy.setAdapter(daHuyDonHangAdapter);


        return view;
    }
}