package Client;

import java.util.Objects;

public class Client {


    protected String CNP;
    protected String Nume;

    protected String Prenume;
    protected int Varsta;


    protected String Sex;


    public Client(String cnp,String nume, String prenume, int varsta, String sex) {
        CNP = cnp;
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
        Sex = sex;

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

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @Override
    public String toString() {
        return "Client{" +
                "CNP='" + CNP + '\'' +
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
        Client client = (Client) o;
        return Varsta == client.Varsta && Objects.equals(CNP, client.CNP) && Objects.equals(Nume, client.Nume) && Objects.equals(Prenume, client.Prenume) && Objects.equals(Sex, client.Sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CNP, Nume, Prenume, Varsta, Sex);
    }
}
