package service;
import Client.Client;
import exceptions.CustomException;
import view.ClientApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientService {

    /*ArrayList<Client> Clients = new ArrayList<Client>();
    public static Client registerNewClient(String cnp, String nume, String prenume, int varsta, String adresa, String sex, String istoric_Medical) throws CustomException {
        if (cnp == null || cnp.length() != 13 || cnp.chars().anyMatch(asciiCode -> (asciiCode < 48 || asciiCode > 57))) {
            throw new CustomException("CNP invalid: " + cnp);
        }
        if (nume == null || nume.isEmpty()){
            throw new CustomException("Nume client invalid: "+nume);
        }
        if (prenume == null || prenume.isEmpty()){
            throw new CustomException("Nume client invalid: "+prenume);
        }
        if (varsta < 0 ){
            throw new CustomException("Varsta invalida: "+varsta);
        }
        if (sex!="M" || sex!="F"){
            throw new CustomException("Sex invalid: "+sex);
        }
        Client client = new Client(cnp, nume, prenume, varsta, sex);
        Clients.add(client);
        return client;
    }

    public ArrayList<Client> getClients(){
        return Clients;
    }
     */

}
