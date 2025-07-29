package fpoly.sonhaph40315_20_6.myapplication.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CreditCardModel implements Serializable {
    private int sothe;
    private String ten;
    private long ngayhethan;

    public CreditCardModel(int sothe, String ten, long ngayhethan) {
        this.sothe = sothe;
        this.ten = ten;
        this.ngayhethan = ngayhethan;
    }

    public int getSothe() {
        return sothe;
    }

    public void setSothe(int sothe) {
        this.sothe = sothe;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getNgayhethan() {
        return ngayhethan;
    }

    public void setNgayhethan(long ngayhethan) {
        this.ngayhethan = ngayhethan;
    }
    public  String getNgayHetHan(String formatPattern){
        if(formatPattern == null || formatPattern.isEmpty()){
            formatPattern = "dd/MM/yyyy";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(formatPattern, Locale.getDefault());
        return sdf.format(new Date(this.ngayhethan));
    }
    @Override
    public String toString() {
        return "CreditCardModel{" +
                "sothe=" + sothe +
                ", ten='" + ten + '\'' +
                ", ngayhethan=" + ngayhethan +
                '}';
    }
}
