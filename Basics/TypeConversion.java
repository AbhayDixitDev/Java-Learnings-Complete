
class TypeConversion {
    public static void main(String[] args) {
        int a =257;
        // byte b=a;  lossy conversion can not do using conversion or auto type conversion have to use casting
        byte b=(byte)a; // explicit casting
        System.out.println(b);

        float f= 50.6f;
        // int s = f; lossy conversion haveto use casting
        int s=(int)f; // explicit casting
        System.err.println(System.out.println("Explicit Casting from int to byte: " + b);
System.err.println("Explicit Casting from float to int: " + s);s);

    }
    
}
