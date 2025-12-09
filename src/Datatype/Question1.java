package Datatype;
///declare a variable as byte and short and add them both and try to store value in short
///
///
///
/// The root cause lies in Java's implicit type promotion rules during arithmetic operations.
/// When byte and short types are involved in an arithmetic operation (like addition in this case),
/// Java automatically promotes them to int to perform the calculation. This is done to prevent potential overflow issues during
/// intermediate calculations, as int is typically the default integer type for arithmetic in Java.
/// Therefore, the expression a + b will result in an int value.
/// The code then attempts to cast a to short ((short)a), but the addition (short)a + b still results in an int because b is a short,
///  and the entire expression is promoted to int.
/// Finally, assigning this int result to a short variable res requires an explicit cast from int to short. Without this explicit cast
/// for the entire result of the addition, the code will result in a compilation error (specifically, an "incompatible types:
/// possible lossy conversion from int to short" error).
public class Question1 {
    public static void main(String[] args) {
        byte a=10;
        short b=20;
       // short res=(short)a+b;
        short res=(short)(a+b);

    }
}
