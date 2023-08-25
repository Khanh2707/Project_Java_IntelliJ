package RadioButton_and_Checkbox.Model;

import java.util.StringTokenizer;

public class Model_ThucDon {
    private String lucChonMonChinh;
    private String lucChonMonPhu;
    private double tongTien;

    public Model_ThucDon() {
        this.lucChonMonChinh = "";
        this.lucChonMonPhu = "";
        this.tongTien = 0;
    }

    public void setLucChonMonChinh(String lucChonMonChinh) {
        this.lucChonMonChinh = lucChonMonChinh;
    }

    public void setLucChonMonPhu(String lucChonMonPhu) {
        this.lucChonMonPhu = lucChonMonPhu;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getLucChonMonChinh() {
        return lucChonMonChinh;
    }

    public String getLucChonMonPhu() {
        return lucChonMonPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void tinhTongTien() {
        this.tongTien = 0;
        if (this.lucChonMonChinh.equals("CƠM")) {
            tongTien += 25000;
        } else if (this.lucChonMonChinh.equals("PHỞ")) {
            tongTien += 30000;
        } else if (this.lucChonMonChinh.equals("BÁNH MỲ")) {
            tongTien += 15000;
        }

        StringTokenizer stringTokenizer = new StringTokenizer(this.lucChonMonPhu, ",");
        while (stringTokenizer.hasMoreElements()) {
            String monPhu = stringTokenizer.nextToken();
            monPhu = monPhu.trim();

            if (monPhu.equals("TRÀ SỮA")) {
                tongTien += 35000;
            } else if (monPhu.equals("COCACOLA")) {
                tongTien += 10000;
            } else if (monPhu.equals("PEPSI")) {
                tongTien += 10000;
            } else if (monPhu.equals("7 UP")) {
                tongTien += 10000;
            }
        }
    }
}
