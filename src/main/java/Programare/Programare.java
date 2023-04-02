package Programare;

import Client.Client;
import Medic.Medic;

import java.util.Objects;

public class Programare {
    private String Data;
    private Client Client;
    private Medic Medic;

    private String Sectie;

    public Programare(String data, Client client, Medic medic, String sectie) {
        Data = data;
        Client = client;
        Medic = medic;
        Sectie = sectie;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        Client = client;
    }

    public Medic getMedic() {
        return Medic;
    }

    public void setMedic(Medic medic) {
        Medic = medic;
    }


    public String getSectie() {
        return Sectie;
    }

    public void setSectie(String sectie) {
        Sectie = sectie;
    }

    @Override
    public String toString() {
        return "Programare.Programare{" +
                "Data='" + Data + '\'' +
                ", Client.Client=" + Client +
                ", Medic.Medic=" + Medic +
                ", Sectie='" + Sectie + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programare that = (Programare) o;
        return Objects.equals(Data, that.Data) && Objects.equals(Client, that.Client) && Objects.equals(Medic, that.Medic) && Objects.equals(Sectie, that.Sectie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Data, Client, Medic, Sectie);
    }
}
