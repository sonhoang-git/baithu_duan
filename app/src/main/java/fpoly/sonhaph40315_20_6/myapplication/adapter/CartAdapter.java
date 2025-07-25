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
import fpoly.sonhaph40315_20_6.myapplication.model.CartItem;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<CartItem> cartItems;

    public CartAdapter(Context context, ArrayList<CartItem> cartItems) {
        this.context = context;
        this.cartItems = cartItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_cart, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CartItem item = cartItems.get(position);

        holder.img_cart_avata.setImageResource(item.getAvata());
        holder.txt_cart_txtaotreem.setText(item.getTen());
        holder.txt_cart_giatien.setText(String.valueOf(item.getGia() + "K")); // sửa lỗi ở đây

        // Sau này bạn thêm xử lý tăng/giảm số lượng ở đây
        holder.txt_cart_giamsoluong.setOnClickListener(v -> {
            // TODO: giảm số lượng
        });

        holder.txt_cart_tangsoluong.setOnClickListener(v -> {
            // TODO: tăng số lượng
        });
    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img_cart_avata;
        TextView txt_cart_txtaotreem;
        TextView txt_cart_size;
        TextView txt_cart_giatien;
        TextView txt_cart_vnd;
        TextView txt_cart_giamsoluong;
        TextView txt_cart_soluong;
        TextView txt_cart_tangsoluong;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_cart_avata = itemView.findViewById(R.id.img_cart_avata);
            txt_cart_txtaotreem = itemView.findViewById(R.id.txt_cart_txtaotreem);
            txt_cart_size = itemView.findViewById(R.id.txt_cart_size);
            txt_cart_giatien = itemView.findViewById(R.id.txt_cart_giatien);
            txt_cart_vnd = itemView.findViewById(R.id.txt_cart_vnd);
            txt_cart_giamsoluong = itemView.findViewById(R.id.txt_cart_giamsoluong);
            txt_cart_soluong = itemView.findViewById(R.id.txt_cart_soluong);
            txt_cart_tangsoluong = itemView.findViewById(R.id.txt_cart_tangsoluong);
        }
    }
}
