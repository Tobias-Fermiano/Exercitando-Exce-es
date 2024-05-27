public class TemperaturaException extends Exception{

    private int temperatura;

    public TemperaturaException(int temperatura){
        setTemperatura(temperatura);
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
