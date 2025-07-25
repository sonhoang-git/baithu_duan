package fpoly.sonhaph40315_20_6.myapplication.model;

import java.io.Serializable;

public class ProductListModel implements Serializable {
    private int id;
    private int avata;
    private String name;
    private int giaban;

    private int soluongdaban;

    public ProductListModel(int id, int avata, String name, int giaban, int soluongdaban) {
        this.id = id;
        this.avata = avata;
        this.name = name;
        this.giaban = giaban;
        this.soluongdaban = soluongdaban;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvata() {
        return avata;
    }

    public void setAvata(int avata) {
        this.avata = avata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public int getSoluongdaban() {
        return soluongdaban;
    }

    public void setSoluongdaban(int soluongdaban) {
        this.soluongdaban = soluongdaban;
    }

    @Override
    public String toString() {
        return "ProductListModel{" +
                "id=" + id +
                ", avata=" + avata +
                ", name='" + name + '\'' +
                ", giaban=" + giaban +
                ", soluongdaban=" + soluongdaban +
                '}';
    }
}
