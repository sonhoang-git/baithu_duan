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
import fpoly.sonhaph40315_20_6.myapplication.model.TrangThaiModel;

public class DaHuyDonHangAdapter extends RecyclerView.Adapter<DaHuyDonHangAdapter.ViewHolder> {

    private final Context context;

    private final ArrayList<TrangThaiModel> trangThaiModelArrayList;

    public DaHuyDonHangAdapter(Context context, ArrayList<TrangThaiModel> trangThaiModelArrayList) {
        this.context = context;
        this.trangThaiModelArrayList = trangThaiModelArrayList;
    }

    @NonNull
    @Override
    public DaHuyDonHangAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_dahuy_donhang, parent, false);
        return new DaHuyDonHangAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaHuyDonHangAdapter.ViewHolder holder, int position) {
        TrangThaiModel item = trangThaiModelArrayList.get(position);
        holder.img_layout_item_dahuy_avata.setImageResource(item.getAvata());
        holder.txt_layout_item_dahuy_aotreem.setText(item.getName());
        holder.txt_layout_item_dahuy_giatien.setText(String.valueOf(item.getGia()+ "K"));
        holder.txt_layout_item_dahuy_trangthai.setText(item.getTrangthai());
        holder.txt_layout_item_dahuy_mualai.setOnClickListener(item1 -> {

        });
        holder.txt_layout_item_dahuy_danhgia.setOnClickListener(item1 -> {

        });
    }


    @Override
    public int getItemCount() {
        return trangThaiModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_layout_item_dahuy_avata;
        TextView txt_layout_item_dahuy_aotreem;
        TextView txt_layout_item_dahuy_tongtien;
        TextView txt_layout_item_dahuy_giatien;
        TextView txt_layout_item_dahuy_vnd;
        TextView txt_layout_item_dahuy_trangthai;
        TextView txt_layout_item_dahuy_mualai;
        TextView txt_layout_item_dahuy_danhgia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_layout_item_dahuy_avata = itemView.findViewById(R.id.img_layout_item_dahuy_avata);
            txt_layout_item_dahuy_aotreem = itemView.findViewById(R.id.txt_layout_item_dahuy_aotreem);
            txt_layout_item_dahuy_tongtien = itemView.findViewById(R.id.txt_layout_item_dahuy_tongtien);
            txt_layout_item_dahuy_giatien = itemView.findViewById(R.id.txt_layout_item_dahuy_giatien);

            txt_layout_item_dahuy_vnd = itemView.findViewById(R.id.txt_layout_item_dahuy_vnd);
            txt_layout_item_dahuy_trangthai = itemView.findViewById(R.id.txt_layout_item_dahuy_trangthai);
            txt_layout_item_dahuy_mualai = itemView.findViewById(R.id.txt_layout_item_dahuy_mualai);
            txt_layout_item_dahuy_danhgia = itemView.findViewById(R.id.txt_layout_item_dahuy_danhgia);

        }
    }
}
