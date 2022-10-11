package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, Integer paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina;
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
                getEnsenanza();
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
