
public class primeiro_progama {
    public static void main(String[] args) throws Exception {
        double raio = 3.9;
        final double PI = 3.14159;

        double area = PI * raio * raio;

        System.out.println(area);

        raio = 12.12;
        area = PI * raio * raio;
        System.out.println("Area = " + area + "m2");
    }
}
