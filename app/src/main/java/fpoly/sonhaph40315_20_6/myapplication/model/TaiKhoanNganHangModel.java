package fpoly.sonhaph40315_20_6.myapplication.model;

public class TaiKhoanNganHangModel {
    private float gia;

    public TaiKhoanNganHangModel(float gia) {
        this.gia = gia;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "TaiKhoanNganHangModel{" +
                "gia=" + gia +
                '}';
    }
}
