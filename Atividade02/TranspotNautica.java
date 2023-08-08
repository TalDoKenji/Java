package AtividadePoo;

public class TranspotNautica extends Transportadora{
    @Override
    public double calculaFrete(Integer altura, Integer largura) {
        if (largura == 0 && altura == 0) {
            return 0;
        } else {
            return ((largura + altura) * 0.1);
        }

    }
}
