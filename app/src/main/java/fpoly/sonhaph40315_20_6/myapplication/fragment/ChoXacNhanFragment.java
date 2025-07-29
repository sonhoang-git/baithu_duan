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
import fpoly.sonhaph40315_20_6.myapplication.model.TrangThaiModel;


public class ChoXacNhanFragment extends Fragment {

    private RecyclerView recyclerView_choxacnhan;

    private ChoXacNhanDonHangAdapter choXacNhanDonHangAdapter;
    private ArrayList<TrangThaiModel> trangThaiModelArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cho_xac_nhan, container, false);
        recyclerView_choxacnhan = view.findViewById(R.id.recyclerView_choxacnhan);
        trangThaiModelArrayList = new ArrayList<>();
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Cho xac nhan"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Cho xac nhan"));
        trangThaiModelArrayList.add(new TrangThaiModel( R.drawable.user_avata_icon,  "Áo trẻ em", 100, "Cho xac nhan"));

        choXacNhanDonHangAdapter = new ChoXacNhanDonHangAdapter(getContext(),trangThaiModelArrayList);
        recyclerView_choxacnhan.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView_choxacnhan.setAdapter(choXacNhanDonHangAdapter);
        return view;
    }
}