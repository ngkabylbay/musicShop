import products.technic.electric.microphone.Microphone;

public class Main {
    public static void main(String[] args) {
        Microphone p = new Microphone(2,200.0);
        System.out.println(p.isCanOutputSound());
    }
}