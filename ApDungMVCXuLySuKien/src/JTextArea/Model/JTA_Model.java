package JTextArea.Model;

public class JTA_Model {
    private String vanBan;
    private String tuKhoa;
    private String ketQua;

    public JTA_Model() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public void setVanBan(String vanBan) {
        this.vanBan = vanBan;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public String getVanBan() {
        return vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void timKiem() {
        int dem = 0;
        int viTri = 0;
        while (true) {
            int i = this.vanBan.indexOf(this.tuKhoa,viTri);
            if (i == -1) {
                break;
            }
            else {
                ++dem;
                viTri = i + 1;
            }
        }
        this.ketQua = "Kết quả: "+dem+" "+this.tuKhoa;
        System.out.println(ketQua);
    }
}
