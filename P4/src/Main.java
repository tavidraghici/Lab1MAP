public class Main {
    public static void main(String[] args) {
        int[] tastatur = new int[]{20, 30, 40, 50, 60};
        int[] usb = new int[]{15, 25, 35, 45, 55};

        HandlungPreis h1 = new HandlungPreis();

        System.out.println(h1.billig(tastatur));
        System.out.println(h1.teuerste(tastatur, usb));
        System.out.println(h1.teuersteBuget(usb, 44));
        System.out.println(h1.ComandaBuget(usb, tastatur, 60));
    }
}
