package NewCar;

import java.util.Objects;

public class Engine {
    private int idEngine;
    private int priceEngine;
    private String engineModel;

    public Engine() {

    }

    public Engine(int idEngine, int priceEngine, String engineModel) {
        this.idEngine = idEngine;
        this.priceEngine = priceEngine;
        this.engineModel = engineModel;
    }

    public int getIdEngine() {
        return idEngine;
    }

    public void setIdEngine(int idEngine) {
        this.idEngine = idEngine;
    }

    public int getPriceEngine() {
        return priceEngine;
    }

    public void setPriceEngine(int priceEngine) {
        this.priceEngine = priceEngine;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return idEngine == engine.idEngine &&
                priceEngine == engine.priceEngine &&
                Objects.equals(engineModel, engine.engineModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEngine, priceEngine, engineModel);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "idEngine=" + idEngine +
                ", priceEngine=" + priceEngine +
                ", engineModel='" + engineModel + '\'' +
                '}';
    }
}

