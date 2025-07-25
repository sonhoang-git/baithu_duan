package fpoly.sonhaph40315_20_6.myapplication;

public class HomeActivity {
    private int name;
    private int gia;
    private int id;

    public HomeActivity(int name, int gia, int id) {
        this.name = name;
        this.gia = gia;
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
