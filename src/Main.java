public class Main {
    public static void main(String[] args) {
        try {
            IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
            illegalTriangleException.checkIllegalTriangleException(1, 2, 3);
        } catch (Exception e){
            System.out.println("Nhập sai cmnr");
        }
    }
}
