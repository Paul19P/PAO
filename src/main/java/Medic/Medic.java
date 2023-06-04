package Medic;

import java.util.Objects;

public class Medic {

    private String Nume;

    private String Prenume;
    private int Varsta;
    private String Specializare;

    public Medic(String nume, String prenume, int varsta, String specializare) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Specializare = specializare;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public int getVarsta() {
        return Varsta;
    }

    public void setVarsta(int varsta) {
        Varsta = varsta;
    }

    public String getSpecializare() {
        return Specializare;
    }

    public void setSpecializare(String specializare) {
        Specializare = specializare;
    }

    @Override
    public String toString() {
        return "Medic.Medic{" +
                "Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Varsta=" + Varsta +
                ", Specializare='" + Specializare + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medic medic = (Medic) o;
        return Varsta == medic.Varsta && Objects.equals(Nume, medic.Nume) && Objects.equals(Prenume, medic.Prenume) && Objects.equals(Specializare, medic.Specializare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nume, Prenume, Varsta, Specializare);
    }
}
