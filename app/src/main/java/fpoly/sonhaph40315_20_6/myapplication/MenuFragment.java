package fpoly.sonhaph40315_20_6.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import fpoly.sonhaph40315_20_6.myapplication.adapter.ProductListAdapter;
import fpoly.sonhaph40315_20_6.myapplication.model.ProductListModel;


public class MenuFragment extends Fragment {

   private RecyclerView productList_recyclerView;
   private ProductListAdapter productListAdapter;
   private ArrayList<ProductListModel> listProduct;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu, container, false);
        productList_recyclerView = view.findViewById(R.id.productList_recyclerView);
        listProduct = new ArrayList<>();
        listProduct.add(new ProductListModel(1,R.drawable.user_avata_icon,"Áo trẻ em",100,100));
        listProduct.add(new ProductListModel(1,R.drawable.user_avata_icon,"Áo trẻ em",100,100));
        listProduct.add(new ProductListModel(1,R.drawable.user_avata_icon,"Áo trẻ em",100,100));
        listProduct.add(new ProductListModel(1,R.drawable.user_avata_icon,"Áo trẻ em",100,100));
        listProduct.add(new ProductListModel(1,R.drawable.user_avata_icon,"Áo trẻ em",100,100));

        productListAdapter = new ProductListAdapter(getContext(),listProduct);
        productList_recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        productList_recyclerView.setAdapter(productListAdapter);
/// /// productList_recyclerView.setAdapter(productListAdapter);
        return view;
    }
}