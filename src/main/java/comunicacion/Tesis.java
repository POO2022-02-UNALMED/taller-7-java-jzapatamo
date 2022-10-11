package comunicacion;

import java.util.Arrays;

public class Tesis extends  Escrito{
    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, Integer paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * 5 * palabrasPagina;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + '\n' +
                getTitulo() + '\n' +
                getAutor() + '\n' +
                getPaginas() + '\n' +
                getIdea() + '\n' +
                getArgumentos().length + '\n' +
                getConclusion() + '\n' +
                getReferencias();
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public static String[] getArgumentos() {
        return argumentos;
    }

    public static void setArgumentos(String[] argumentos) {
        Tesis.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
