package AtividadePoo;

public class TransportTerrestre extends Transportadora {
    @Override
    public double calculaFrete(Integer altura, Integer largura) {
        if (largura == 0 && altura == 0) {
            return 0;
        } else {
            return (((double) largura / altura) * 0.2);
        }

    }
}
