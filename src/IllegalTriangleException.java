import java.util.Scanner;

public class IllegalTriangleException {
    public IllegalTriangleException() {
    }

    public void checkIllegalTriangleException(int a, int b, int c) throws Exception{
        if (a + b <= c | a + c <= b | b + c <= a) throw new Exception();
    }
}
