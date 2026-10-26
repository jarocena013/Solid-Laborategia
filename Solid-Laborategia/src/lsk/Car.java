package lsk;

public class Car extends TransportationDevice implements WithEngine, LicensePlateable {
    private Engine engine;
    private String matricula;

    @Override
    public void startEngine() {
		// Motorra abiarazten du
	}

    @Override
    public void matrikulatu(String matricula) {
        this.matricula = matricula;
    }
}