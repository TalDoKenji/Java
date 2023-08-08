package AtividadePoo;

public class TesteTransport {
    public static void main(String[] args){

    TransportTerrestre transportTerrestre = new TransportTerrestre();
    TranspotNautica transpotNautica = new TranspotNautica();

    System.out.println("Transporte terrestre: " + transportTerrestre.calculaFrete(10,20));
    System.out.println("Transporte nautico: " +transpotNautica.calculaFrete(10,20));

}
}
