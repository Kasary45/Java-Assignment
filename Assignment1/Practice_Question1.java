public class Practice_Question1 {
    public static void main(String[] args) {
        String s1 = "12.34f";
        float f1 = Float.parseFloat(s1);
        double d1 = Double.parseDouble(s1);
        System.out.println("float : " +f1);
        System.out.println("double : "+d1);

        Float f2 = new Float(3.14f);
        float f3 = f2.floatValue();
        System.out.println("float : " +f3);

        Double d = new Double(3.789904);
        double d9 = d.doubleValue();
        System.out.println("double : "+ d9);

        float f4 = f3;
        String s2 = String.valueOf(f4);
        System.out.println("String : " +s2);

        double d2 = d1;
        String s3 = String.valueOf(d2);
        System.out.println("String : "+s3);

        float f5 = 35.78f;
        Float f6 = Float.valueOf(f5);
        System.out.println("Float : "+f6);

        double d3 = 12.45677;
        Double d4 = Double.valueOf(d3);
        System.out.println("Double : "+d4);






    }
}
