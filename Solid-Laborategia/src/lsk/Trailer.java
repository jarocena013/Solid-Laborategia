package lsk;

// NO tiene motor, pero SÍ matrícula
public class Trailer extends TransportationDevice implements LicensePlateable {
    private String matricula;

    @Override
    public void matrikulatu(String matricula) {
        this.matricula = matricula;
    }
}