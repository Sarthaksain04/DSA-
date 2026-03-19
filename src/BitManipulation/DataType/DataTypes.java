package BitManipulation.DataType;

public class DataTypes {
    public static void main(String[] args) {
        byte x = 127 ;
        x +=3;
        System.out.println(x); // it gives -126 because it goes like this 127 then when i add 3 it start from negative so 127 + 3  = -128 -> -127 -> -126

    }
}
