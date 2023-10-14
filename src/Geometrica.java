public class Geometrica implements ICalcMedia{

    @Override
    public double CalculaMedia(double A, double B) {
        double answer = Math.sqrt(A*B);//raiz ded A*B
        return answer;
    }

    @Override
    public String Situacao(double media) {
        String resultado;
        if(media>7)
        {
            resultado = "Aprovado";
        } else resultado  = "Reprovado";

        return resultado;
    }
}
