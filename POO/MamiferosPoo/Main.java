public class Main {
    public static void main(String[] agrs){

        //Instância dos objetos
        SeresHumanos serHumano = new SeresHumanos();
        Felinos gato = new Felinos();

        serHumano.setAltura(1.82);
        serHumano.setPeso(75.0);
        serHumano.setExpectativaVida(75);

        gato.setAltura(0.25);
        gato.setPeso(4);
        gato.setExpectativaVida(15);

        System.out.println(gato.emitirBarulho());
        System.out.println(serHumano.emitirBarulho());
    }
}
