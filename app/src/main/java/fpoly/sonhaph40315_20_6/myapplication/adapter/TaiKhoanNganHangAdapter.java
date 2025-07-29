package fpoly.sonhaph40315_20_6.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import fpoly.sonhaph40315_20_6.myapplication.R;
import fpoly.sonhaph40315_20_6.myapplication.model.TaiKhoanNganHangModel;

public class TaiKhoanNganHangAdapter extends RecyclerView.Adapter<TaiKhoanNganHangAdapter.ViewHolder>{

    private Context context;
    private ArrayList<TaiKhoanNganHangModel> listtaikhoannganhang;


    public TaiKhoanNganHangAdapter(Context context, ArrayList<TaiKhoanNganHangModel> listtaikhoannganhang) {
        this.context = context;
        this.listtaikhoannganhang = listtaikhoannganhang;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_taikhoancard,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TaiKhoanNganHangModel item = listtaikhoannganhang.get(position);
        NumberFormat formatter = NumberFormat.getInstance(new Locale("vi", "VN"));
        String formattedGia = formatter.format(item.getGia());
        holder.txt_item_sodutaikhoan.setText(formattedGia);
    }

    @Override
    public int getItemCount() {
        return listtaikhoannganhang.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_item_paypan;
        private TextView txt_item_tennganhang,txt_item_sodutaikhoan,txt_item_vnd;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img_item_paypan = itemView.findViewById(R.id.img_item_paypan);
            txt_item_tennganhang = itemView.findViewById(R.id.txt_item_tennganhang);
            txt_item_sodutaikhoan = itemView.findViewById(R.id.txt_item_sodutaikhoan);
            txt_item_vnd = itemView.findViewById(R.id.txt_item_vnd);
        }
    }
}
