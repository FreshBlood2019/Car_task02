package NewCar;

import java.util.Objects;

public class Bumper {
    private int idBumper;
    private int priceBumper;
    private String bumperModel;

    public Bumper() {
    }
    public Bumper(int idBumper, int priceBumper, String bumperModel) {
        this.idBumper = idBumper;
        this.priceBumper = priceBumper;
        this.bumperModel = bumperModel;
    }

    public int getIdBumper() {
        return idBumper;
    }

    public void setIdBumper(int idBumper) {
        this.idBumper = idBumper;
    }

    public int getPriceBumper() {
        return priceBumper;
    }

    public void setPriceBumper(int priceBumper) {
        this.priceBumper = priceBumper;
    }

    public String getBumperModel() {
        return bumperModel;
    }

    public void setBumperModel(String bumperModel) {
        this.bumperModel = bumperModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bumper bumper = (Bumper) o;
        return idBumper == bumper.idBumper &&
                priceBumper == bumper.priceBumper &&
                Objects.equals(bumperModel, bumper.bumperModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBumper, priceBumper, bumperModel);
    }

    @Override
    public String toString() {
        return "Bumper{" +
                "idBumper=" + idBumper +
                ", priceBumper=" + priceBumper +
                ", bumperModel='" + bumperModel + '\'' +
                '}';
    }
}
