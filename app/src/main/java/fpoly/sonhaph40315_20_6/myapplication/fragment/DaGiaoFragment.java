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
import fpoly.sonhaph40315_20_6.myapplication.adapter.ChoXacNhanDonHangAdapter;
import fpoly.sonhaph40315_20_6.myapplication.adapter.DaGiaoDonHangAdapter;
import fpoly.sonhaph40315_20_6.myapplication.model.TrangThaiModel;


public class DaGiaoFragment extends Fragment {

    private RecyclerView recyclerView_dagiao;
    private DaGiaoDonHangAdapter daGiaoDonHangAdapter;
    private ArrayList<TrangThaiModel> trangThaiModelArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_da_giao, container, false);
        recyclerView_dagiao = view.findViewById(R.id.recyclerView_dagiao);
        trangThaiModelArrayList = new ArrayList<>();
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đã giao"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đã giao"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đã giao"));

        daGiaoDonHangAdapter = new DaGiaoDonHangAdapter(getContext(),trangThaiModelArrayList);
        recyclerView_dagiao.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_dagiao.setAdapter(daGiaoDonHangAdapter);
        return view;
    }
}