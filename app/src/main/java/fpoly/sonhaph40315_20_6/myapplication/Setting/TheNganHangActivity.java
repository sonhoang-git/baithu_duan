package fpoly.sonhaph40315_20_6.myapplication.Setting;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

import fpoly.sonhaph40315_20_6.myapplication.R;
import fpoly.sonhaph40315_20_6.myapplication.adapter.TaiKhoanNganHangAdapter;
import fpoly.sonhaph40315_20_6.myapplication.adapter.TheTinDung_Card_Adapter;
import fpoly.sonhaph40315_20_6.myapplication.model.CreditCardModel;
import fpoly.sonhaph40315_20_6.myapplication.model.TaiKhoanNganHangModel;

public class TheNganHangActivity extends AppCompatActivity {

    ImageView btn_back;
    Button btn_item_thetindung;
    Button btn_item_themtknganhang;

    RecyclerView rcv_thetindung,rcv_taikhoannganhang;
    TheTinDung_Card_Adapter theTinDungCardAdapter;
    ArrayList<CreditCardModel> listCreditCardModel;

    TaiKhoanNganHangAdapter taiKhoanNganHangAdapter;
    ArrayList<TaiKhoanNganHangModel> listTaiKhoanNganHang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_the_ngan_hang);
        initUl();


        // the tin dung
       listCreditCardModel = new ArrayList<>();
       listCreditCardModel.add(new CreditCardModel(99999999,"Hoàng Anh Sơn",getMillis(2000,0,5)));
        listCreditCardModel.add(new CreditCardModel(99999999,"Hoàng Anh Sơn",getMillis(2000,0,5)));
        listCreditCardModel.add(new CreditCardModel(99999999,"Hoàng Anh Sơn",getMillis(2000,0,5)));
       theTinDungCardAdapter = new TheTinDung_Card_Adapter(this,listCreditCardModel);
       rcv_thetindung.setLayoutManager(new LinearLayoutManager(this));
       rcv_thetindung.setAdapter(theTinDungCardAdapter);

       // tài khoản ngân hàng
        listTaiKhoanNganHang = new ArrayList<>();
        listTaiKhoanNganHang.add(new TaiKhoanNganHangModel(9999999));
        listTaiKhoanNganHang.add(new TaiKhoanNganHangModel(1345678));
        taiKhoanNganHangAdapter = new TaiKhoanNganHangAdapter(this,listTaiKhoanNganHang);
        rcv_taikhoannganhang.setLayoutManager(new LinearLayoutManager(this));
        rcv_taikhoannganhang.setAdapter(taiKhoanNganHangAdapter);

    }

    private void initUl(){
        btn_back = findViewById(R.id.btn_back);
        btn_item_thetindung = findViewById(R.id.btn_item_thetindung);
        btn_item_themtknganhang = findViewById(R.id.btn_item_themtknganhang);
        rcv_thetindung = findViewById(R.id.rcv_thetindung);
        rcv_taikhoannganhang = findViewById(R.id.rcv_taikhoannganhang);

    }

    private long getMillis(int year,int month,int day){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTimeInMillis();
    }
}