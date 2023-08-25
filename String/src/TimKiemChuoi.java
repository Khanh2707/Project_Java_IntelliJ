public class TimKiemChuoi {
    public static void main(String[] args) {
        String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
        String s2 = "Xin chào";
        String s3 = "Xin chào 123";

        //indexOf
        // ko tìm thấy sẽ trả về -1
        // tìm thấy sẽ trả về vị trí của ký tự đầu tiên của chuỗi đó đầu tiên trong chuỗi
        System.out.println(s1.indexOf(s2));
        System.out.println(s1.indexOf(s3));

        // tìm kiếm từ vị trí ... trở đi
        System.out.println(s1.indexOf(s2,2));


        // lastIndexOf: ngược lại với indexOf, tìm kiếm từ phải sang trái
    }
}
