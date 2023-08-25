public class SoSanhChuoi {
    public static void main(String[] args) {
        String s1 = "khanh.vn";
        String s2 = "KHANH.vn";
        String s3 = "khanh.vn";

        // equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // equalsIgnoreCase => so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        // compareTo => so sánh > < = => so sánh dựa trên chữ cái đầu tiên khác nhau từ trái qua phải có phân biệt hoa thường, chữ đứng trước bé hơn chữ đứng sau
        String sv1 = "Nguyễn Văn A";
        String sv2 = "Nguyễn Văn B";
        String sv3 = "Nguyễn Văn A";
        String sv4 = "Nguyễn Văn a";
        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv1.compareTo(sv3));
        System.out.println(sv1.compareTo(sv4));

        // compareToIgnoreCase => so sánh > < = => so sánh dựa trên chữ cái đầu tiên khác nhau từ trái qua phải ko phân biệt hoa thường, chữ đứng trước bé hơn chữ đứng sau
        System.out.println(sv1.compareToIgnoreCase(sv2));
        System.out.println(sv1.compareToIgnoreCase(sv3));
        System.out.println(sv1.compareToIgnoreCase(sv4));


        // regionMatches => so sánh 1 đoạn
        String r1 = "abc";
        String r2 = "abC";
        String r3 = "ade";
        System.out.println(r1.regionMatches(1,r2,1,2));
        System.out.println(r1.regionMatches(true,1,r2,1,2));
        System.out.println(r1.regionMatches(false,1,r2,1,2));
        // có 2 kiểu
        // chuỗi 1.regionMatches(ký tự bắt đầu của chuỗi 1, chuỗi 2, ký tự bắt đầu của chuỗi 2, số ký tự so sánh tính từ ký tự bắt đầu của chuỗi 1)
        // chuỗi 1.regionMatches(true là ko phân biệt hoa thường, false là có phân biệt hoa thường, ký tự bắt đầu của chuỗi 1, chuỗi 2, ký tự bắt đầu của chuỗi 2, số ký tự so sánh tính từ ký tự bắt đầu của chuỗi 1)


        // startsWith => kiểm tra 1 chuỗi xem nó có bắt đầu bằng 1 chuỗi ... ko
        String sdt = "037456789";
        System.out.println(sdt.startsWith("037"));
        System.out.println(sdt.startsWith("034"));


        // endsWith => kiểm tra 1 chuỗi xem nó có kết thúc bằng 1 chuỗi ... ko
        String nameFile1 = "khanh.png";
        System.out.println(nameFile1.endsWith("png"));
        System.out.println(nameFile1.endsWith("jpg"));
    }
}
