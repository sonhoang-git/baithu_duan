package fpoly.sonhaph40315_20_6.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import fpoly.sonhaph40315_20_6.myapplication.R;
import fpoly.sonhaph40315_20_6.myapplication.model.ProductListModel;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.ViewHolder>{

    private final Context context;

    private final ArrayList<ProductListModel> productListModels;

    public ProductListAdapter(Context context, ArrayList<ProductListModel> productListModels) {
        this.context = context;
        this.productListModels = productListModels;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_productlist, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProductListModel item = productListModels.get(position);
        holder.img_productlist_avata.setImageResource(item.getAvata());
        holder.txt_productlist_txtaotreem.setText(item.getName());
        holder.txt_productlist_giatien.setText(String.valueOf(item.getGiaban()+"K"));
        holder.txt_productlist_soluongdaban.setText(String.valueOf(item.getSoluongdaban()));
    }

    @Override
    public int getItemCount() {
        return productListModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_productlist_avata;
        TextView txt_productlist_txtaotreem;
        TextView txt_productlist_giatien;
        TextView txt_productlist_vnd;
        TextView txt_productlist_danhgia;
        TextView txt_productlist_soluongdanhgia;
        ImageView img_productlist_sao1;
        ImageView img_productlist_sao2;
        ImageView img_productlist_sao3;
        ImageView img_productlist_sao4;
        ImageView img_productlist_sao5;
        TextView txt_productlist_daban;
        TextView txt_productlist_soluongdaban;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_productlist_avata = itemView.findViewById(R.id.img_item_productlist_avata);
            txt_productlist_txtaotreem = itemView.findViewById(R.id.txt_item_productlist_txtaotreem);
            txt_productlist_giatien = itemView.findViewById(R.id.txt_item_productlist_giatien);
            txt_productlist_vnd = itemView.findViewById(R.id.txt_item_productlist_vnd);
            txt_productlist_danhgia = itemView.findViewById(R.id.txt_item_productlist_danhgia);
            txt_productlist_soluongdanhgia = itemView.findViewById(R.id.txt_item_productlist_soluongdanhgia);

            img_productlist_sao1 = itemView.findViewById(R.id.img_item_productlist_sao1);
            img_productlist_sao2 = itemView.findViewById(R.id.img_item_productlist_sao2);
            img_productlist_sao3 = itemView.findViewById(R.id.img_item_productlist_sao3);
            img_productlist_sao4 = itemView.findViewById(R.id.img_item_productlist_sao4);
            img_productlist_sao5 = itemView.findViewById(R.id.img_item_productlist_sao5);
            txt_productlist_daban = itemView.findViewById(R.id.txt_item_productlist_daban);
            txt_productlist_soluongdaban = itemView.findViewById(R.id.txt_item_productlist_soluongdaban);

        }
    }
}
