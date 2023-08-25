package Model;

public class Book {
    private String id;
    private String tenSach;
    private int giaBan;
    private int namXuatBan;

    public Book() {
    }

    public Book(String id) {
        this.id = id;
    }

    public Book(String id, String tenSach, int giaBan, int namXuatBan) {
        this.id = id;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public String getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", giaBan=" + giaBan +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}
