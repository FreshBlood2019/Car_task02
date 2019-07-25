package NewCar;

import java.util.Objects;

public class Hood {
    private int idHood;
    private int priceHood;
    private String hoodModel;

    public Hood() {

    }

    public Hood(int idHood, int priceHood, String hoodModel) {
        this.idHood = idHood;
        this.priceHood = priceHood;
        this.hoodModel = hoodModel;
    }

    public int getIdHood() {
        return idHood;
    }

    public void setIdHood(int idHood) {
        this.idHood = idHood;
    }

    public int getPriceHood() {
        return priceHood;
    }

    public void setPriceHood(int priceHood) {
        this.priceHood = priceHood;
    }

    public String getHoodModel() {
        return hoodModel;
    }

    public void setHoodModel(String hoodModel) {
        this.hoodModel = hoodModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hood hood = (Hood) o;
        return idHood == hood.idHood &&
                priceHood == hood.priceHood &&
                Objects.equals(hoodModel, hood.hoodModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHood, priceHood, hoodModel);
    }

    @Override
    public String toString() {
        return "Hood{" +
                "idHood=" + idHood +
                ", priceHood=" + priceHood +
                ", hoodModel='" + hoodModel + '\'' +
                '}';
    }
}
