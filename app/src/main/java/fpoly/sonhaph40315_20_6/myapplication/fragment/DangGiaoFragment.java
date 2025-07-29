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
import fpoly.sonhaph40315_20_6.myapplication.adapter.DangGiaoDonHangAdapter;
import fpoly.sonhaph40315_20_6.myapplication.model.TrangThaiModel;


public class DangGiaoFragment extends Fragment {

    private RecyclerView recyclerView_danggiao;
    private DangGiaoDonHangAdapter dangGiaoDonHangAdapter;
    private ArrayList<TrangThaiModel> trangThaiModelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dang_giao, container, false);
        recyclerView_danggiao = view.findViewById(R.id.recyclerView_danggiao);
        trangThaiModelArrayList = new ArrayList<>();
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đang giao"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đang giao"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Đang giao"));

        dangGiaoDonHangAdapter = new DangGiaoDonHangAdapter(getContext(),trangThaiModelArrayList);
        recyclerView_danggiao.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_danggiao.setAdapter(dangGiaoDonHangAdapter);

        return  view;
    }
}