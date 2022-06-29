public class Main {
    public static void main(String[] args){
        Aviao aviao = new Aviao("branco", "Boeing", 800,250,2);
        Moto moto = new Moto("preta","Yamaha", 120,2,2);

        System.out.println(aviao.getVelocidadeMaxima() + "km/h");
        System.out.println(moto.getVelocidadeMaxima() + "km/h");

        System.out.println(aviao.locomover());
        System.out.println(moto.locomover());
    }
}
