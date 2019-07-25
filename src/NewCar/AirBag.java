package NewCar;

import java.util.Objects;

public class AirBag {
    private int idAirBag;
    private int priceAirBag;
    private String AirbagModel;

    public AirBag() {
    }
    public AirBag(int idAirBag, int priceAirBag, String AirbagModel) {
        this.idAirBag = idAirBag;
        this.priceAirBag = priceAirBag;
        this.AirbagModel = AirbagModel;
    }

    public int getIdAirBag() {
        return idAirBag;
    }

    public void setIdAirBag(int idAirBag) {
        this.idAirBag = idAirBag;
    }

    public int getPriceAirBag() {
        return priceAirBag;
    }

    public void setPriceAirBag(int priceAirBag) {
        this.priceAirBag = priceAirBag;
    }

    public String getAirbagModel() {
        return AirbagModel;
    }

    public void setAirbagModel(String airbagModel) {
        AirbagModel = airbagModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirBag airBag = (AirBag) o;
        return idAirBag == airBag.idAirBag &&
                priceAirBag == airBag.priceAirBag &&
                Objects.equals(AirbagModel, airBag.AirbagModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAirBag, priceAirBag, AirbagModel);
    }

    @Override
    public String toString() {
        return "AirBag{" +
                "idAirBag=" + idAirBag +
                ", priceAirBag=" + priceAirBag +
                ", AirbagModel='" + AirbagModel + '\'' +
                '}';
    }
}
