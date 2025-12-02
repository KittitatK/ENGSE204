package Lab02o8;

public class TempConverter {

    public static double CtoF(double c){
        return ((c * 9.0/5.0) + 32);
    }

    public static double FtoC(double f){
        return ((f - 32) * (5.0/9.0));
    }
}
