package fpoly.sonhaph40315_20_6.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import fpoly.sonhaph40315_20_6.myapplication.adapter.CartAdapter;
import fpoly.sonhaph40315_20_6.myapplication.model.CartItem;


public class PositionFragment extends Fragment {

    RecyclerView cart_recyclerView;
    TextView txt_cart_tonggiatien;
    Button btn_cart_thanhtoan;
    ArrayList<CartItem>listCart;
    CartAdapter cartAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_position,container,false);
        cart_recyclerView = view.findViewById(R.id.recyclerView);
        txt_cart_tonggiatien = view.findViewById(R.id.txt_cart_tonggiatien);
        btn_cart_thanhtoan = view.findViewById(R.id.btn_cart_thanhtoan);

        listCart = new ArrayList<>();
        listCart.add(new CartItem( R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));
        listCart.add(new CartItem(R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));
        listCart.add(new CartItem(R.drawable.user_avata_icon, 1, "Áo trẻ em", 100));

        cartAdapter = new CartAdapter(getContext(),listCart);
        cart_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        cart_recyclerView.setAdapter(cartAdapter);
        return view;
    }
}