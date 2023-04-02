package view;
import Medic.Medic;
import Client.Client;
import Client.ClientVIP;
import Programare.Programare;
import service.ClientService;
import exceptions.CustomException;
import java.util.*;

public class ClientApp {
    private final Scanner scanner = new Scanner(System.in);

    Set<Medic> Medics = new HashSet<Medic>();
    List<Client> Clients = new ArrayList<Client>();

    List<ClientVIP> VipClients = new ArrayList<ClientVIP>();

    ArrayList<Programare> Programari = new ArrayList<Programare>();


    Client c1 = new Client("1234","ala","bala",123,"M");

    public static void main(String[] args) {

        ClientApp clientApp = new ClientApp();
        while(true){
            clientApp.showMenu();
            int option = clientApp.readOption();
            clientApp.execute(option);
        }
    }
    private void showMenu() {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Bine ai venit pe platforma cabinetului medical");
        System.out.println("Ce vrei sa faci?");
        System.out.println("1. Adauga client");
        System.out.println("2. Afiseaza toti clientii");
        System.out.println("3. Gaseste clientul dupa CNP");
        System.out.println("4. Elimina client");
        System.out.println("5. Adauga medic");
        System.out.println("6. Afiseaza toti medici");
        System.out.println("7. Adauga Programare");
        System.out.println("8. Afiseaza toate programarile");
        System.out.println("9. Adauga client vip");
        System.out.println("10. Afiseaza toti clientii vip");
        System.out.println("11. Gaseste clientul vip dupa CNP");
        System.out.println("0. exit");
    }
    private void execute(int option) {
        switch (option) {
            case 1: {
                addClient();
                break;
            }
            case 2: {
                listAllClients();
                break;
            }

            case 3: {
                findClientbyId();
                break;
            }

            case 4: {
                removeClient();
                break;
            }

            case 5: {
                addMedic();
                break;
            }

            case 6: {
                listAllMedics();
                break;
            }

            case 7: {
                addProgramare();
                break;
            }

            case 8: {
                listAllProgramari();
                break;
            }

            case 9: {
                addVIPClient();
                break;
            }

            case 10: {
                listAllVIPClients();
                break;
            }

            case 11: {
                findVIPClientbyId();
                break;
            }

            case 0: {
                scanner.close();
                System.exit(0);
            }
        }
    }
    private void addClient() {
        Client client = readClientDetails();

        Clients.add(client);
        System.out.println("Client adaugat cu succes!");
    }

    private void listAllClients(){
        sortClientsByName(Clients);
        System.out.println(Clients);
    }

    private void findClientbyId(){
        System.out.print("CNP client cautat: ");
        String cnp = scanner.next();
        System.out.println("");
        boolean gasit = false;
        for (int i=0;i<Clients.size();i++){
            Client client = Clients.get(i);

            if(Objects.equals(client.getCNP(), cnp)){
                System.out.println(client);
                gasit=true;
                break;
            }
        }
        if(gasit==false)
            System.out.println("Nu exista clientul cu CNP-ul dat!");
    }
    private void removeClient(){
        System.out.print("CNP client cautat: ");
        String cnp = scanner.next();
        System.out.println("");
        boolean gasit = false;
        for (int i=0;i<Clients.size();i++){
            Client client = Clients.get(i);

            if(Objects.equals(client.getCNP(), cnp)){
                System.out.println("Clientul a fost sters!");
                Clients.remove(client);
                gasit=true;
                break;
            }
        }
        if(gasit==false)
            System.out.println("Nu exista clientul cu CNP-ul dat!");

    }


    private Client readClientDetails() {
        System.out.print("CNP Client: ");
        String cnp = scanner.next();
        System.out.print("Nume Client: ");
        String nume = scanner.next();
        System.out.print("Prenume Client: ");
        String prenume = scanner.next();
        System.out.println("Varsta Client: ");
        int varsta = readAge();
        System.out.println("Sex Client: ");
        String sex = scanner.next();
        return new Client(cnp, nume, prenume, varsta,sex);
    }

    private void addVIPClient() {
        ClientVIP client = readVIPClientDetails();

        VipClients.add(client);
        System.out.println("Client adaugat cu succes!");
    }

    private ClientVIP readVIPClientDetails() {
        System.out.print("Profesie Client: ");
        String profesie = scanner.next();
        System.out.print("CNP Client: ");
        String cnp = scanner.next();
        System.out.print("Nume Client: ");
        String nume = scanner.next();
        System.out.print("Prenume Client: ");
        String prenume = scanner.next();
        System.out.println("Varsta Client: ");
        int varsta = readAge();
        System.out.println("Sex Client: ");
        String sex = scanner.next();
        return new ClientVIP(cnp,nume,prenume,varsta,sex,profesie);
    }
    private void listAllVIPClients(){
        System.out.println(VipClients);
    }
    private void findVIPClientbyId(){
        System.out.print("CNP client cautat: ");
        String cnp = scanner.next();
        System.out.println("");
        boolean gasit = false;
        for (int i=0;i<VipClients.size();i++){
            ClientVIP client = VipClients.get(i);

            if(Objects.equals(client.getCNP(), cnp)){
                System.out.println(client);
                gasit=true;
                break;
            }
        }
        if(gasit==false)
            System.out.println("Nu exista clientul cu CNP-ul dat!");
    }

    private void addMedic(){
        Medic medic = readMedicDetails();
        Medics.add(medic);
        System.out.println("Medic adaugat cu succes!");
    }

    public void sortClientsByName(List<Client> Clients) {
        Collections.sort(Clients, new Comparator<Client>() {
            @Override
            public int compare(Client c1, Client c2) {
                return c1.getNume().compareTo(c2.getNume());
            }
        });
    }


    private void listAllMedics(){

        System.out.println(Medics);
    }


    private Medic readMedicDetails() {
        System.out.print("Nume: ");
        String nume = scanner.next();
        System.out.print("Prenume: ");
        String prenume = scanner.next();
        System.out.println("Varsta: ");
        int varsta = readAge();
        System.out.println("Specializare: ");
        String specializare = scanner.next();
        return new Medic(nume,prenume,varsta,specializare);
    }


    private void addProgramare(){
        Programare programare = readProgramareDetails();
        Programari.add(programare);
        System.out.println("Programare aduagata cu succes!");
    }

    private void listAllProgramari(){
        System.out.println(Programari);
    }
    private Programare readProgramareDetails() {
        System.out.print("Data programare: ");
        String data = scanner.next();
        System.out.print("Client: ");
        Client client = readClientDetails();
        System.out.print("Medic: ");
        Medic medic = readMedicDetails();
        System.out.println("Sectie: ");
        String sectie = scanner.next();

        return new Programare(data,client,medic,sectie);
    }
    private int readAge() {
        int varsta = -1;
        do {
            try {
                varsta = readInt();
            } catch (CustomException exception) {
                System.out.println("Invalid input for employee age! Try again!");
            }
        } while (varsta < 0);
        return varsta;
    }

    private int readInt() throws CustomException {
        String line = scanner.next();
        if (line.matches("^\\d+$")) {
            return Integer.parseInt(line);
        } else {
            throw new CustomException("Invalid number");
        }
    }
    private int readOption() {
        int option = -1;
        do {
            try {
                option = readInt();
            } catch (CustomException exception) {
                System.out.println("Invalid option! Try again!");
            }
        } while (option < 0 || option > 11);
        return option;
    }

}
