public class Aritmetica implements ICalcMedia {
    @Override
    public double CalculaMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    @Override
    public String Situacao(double media) {
        return (media > 5) ? "Aprovado" : "Reprovado";
    }
}


