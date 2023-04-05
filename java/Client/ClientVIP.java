package Client;

import java.util.Objects;

public class ClientVIP extends Client{
    private String Profesie;

    public ClientVIP(String cnp, String nume, String prenume, int varsta, String sex, String profesie) {
        super(cnp, nume, prenume, varsta, sex);
        Profesie = profesie;
    }

    public String getProfesie() {
        return Profesie;
    }

    public void setProfesie(String profesie) {
        Profesie = profesie;
    }

    @Override
    public String toString() {
        return "ClientVIP{" +
                "Profesie='" + Profesie + '\'' +
                ", CNP='" + CNP + '\'' +
                ", Nume='" + Nume + '\'' +
                ", Prenume='" + Prenume + '\'' +
                ", Varsta=" + Varsta +
                ", Sex='" + Sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ClientVIP clientVIP = (ClientVIP) o;
        return Objects.equals(Profesie, clientVIP.Profesie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Profesie);
    }
}
