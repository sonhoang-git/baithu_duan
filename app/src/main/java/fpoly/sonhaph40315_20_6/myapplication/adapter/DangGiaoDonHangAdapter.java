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

public class DangGiaoDonHangAdapter extends RecyclerView.Adapter<DangGiaoDonHangAdapter.ViewHolder> {
    private final Context context;

    private final ArrayList<TrangThaiModel> trangThaiModelArrayList;

    public DangGiaoDonHangAdapter(Context context, ArrayList<TrangThaiModel> trangThaiModelArrayList) {
        this.context = context;
        this.trangThaiModelArrayList = trangThaiModelArrayList;
    }

    @NonNull
    @Override
    public DangGiaoDonHangAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_danggiao_donhang, parent, false);
        return new DangGiaoDonHangAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull DangGiaoDonHangAdapter.ViewHolder holder, int position) {
        TrangThaiModel item = trangThaiModelArrayList.get(position);
        holder.img_layout_item_danggiao_avata.setImageResource(item.getAvata());
        holder.txt_layout_item_danggiao_aotreem.setText(item.getName());
        holder.txt_layout_item_danggiao_trangthai.setText(item.getTrangthai());
        holder.txt_layout_item_danggiao_giatien.setText(String.valueOf(item.getGia()+ "K"));
        holder.txt_layout_item_danggiao_xemthongtin.setOnClickListener(item1 ->{

        });
    }


    @Override
    public int getItemCount() {
        return trangThaiModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img_layout_item_danggiao_avata;
        TextView txt_layout_item_danggiao_aotreem;

        TextView txt_layout_item_danggiao_tongtien;
        TextView txt_layout_item_danggiao_giatien;
        TextView txt_layout_item_danggiao_vnd;
        TextView txt_layout_item_danggiao_trangthai;
        TextView txt_layout_item_danggiao_xemthongtin;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_layout_item_danggiao_avata = itemView.findViewById(R.id.img_layout_item_danggiao_avata);
            txt_layout_item_danggiao_aotreem = itemView.findViewById(R.id.txt_layout_item_danggiao_aotreem);
            txt_layout_item_danggiao_tongtien = itemView.findViewById(R.id.txt_layout_item_danggiao_tongtien);
            txt_layout_item_danggiao_giatien = itemView.findViewById(R.id.txt_layout_item_danggiao_giatien);
            txt_layout_item_danggiao_vnd = itemView.findViewById(R.id.txt_layout_item_danggiao_vnd);
            txt_layout_item_danggiao_trangthai = itemView.findViewById(R.id.txt_layout_item_danggiao_trangthai);
            txt_layout_item_danggiao_xemthongtin = itemView.findViewById(R.id.txt_layout_item_danggiao_xemthongtin);
        }
    }
}
