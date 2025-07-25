package fpoly.sonhaph40315_20_6.myapplication.model;

public class CartItem {
    private int avata;
    private int id;
    private String ten;
    private int gia;


    public CartItem(int avata, int id, String ten, int gia) {
        this.avata = avata;
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public int getAvata() {
        return avata;
    }

    public void setAvata(int avata) {
        this.avata = avata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "avata=" + avata +
                ", id=" + id +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                '}';
    }
}
