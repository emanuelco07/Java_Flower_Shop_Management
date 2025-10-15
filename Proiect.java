import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Proiect
{
    public static void main(String[] args)
    {
        //Aici facem declarari initiale, parole etc, pentru administrator;
        String ParolaAdministrator = "123456789", UserNameAdministrator = "Emanuelco07";

        //Aici cream un stoc de flori
        Flori vectorFlori[] = new Flori[101];
        int numar_flori = 25;
        for(int i = 0; i < numar_flori; i++)
            vectorFlori[i] = new Flori();
        vectorFlori[0] = new Flori("Trandafir", "Rosu", "Gradina", 1.2, 3, 10, 150);
        vectorFlori[1] = new Flori("Lalea", "Galben", "Campie", 0.6, 1, 5, 100);
        vectorFlori[2] = new Flori("Orhidee", "Mov", "Padure Tropicala", 0.3, 7, 15, 50);
        vectorFlori[3] = new Flori("Crin", "Alb", "Gradina", 0.8, 4, 7, 75);
        vectorFlori[4] = new Flori("Garoafa", "Roz", "Gradina", 0.5, 2, 3, 89);
        vectorFlori[5] = new Flori("Narcisa", "Galben", "Camp", 0.4, 1.5, 4, 67);
        vectorFlori[6] = new Flori("Zambila", "Albastru", "Gradina", 0.3, 2, 10, 50);
        vectorFlori[7] = new Flori("Margareta", "Alb", "Camp", 0.5, 1, 4, 60);
        vectorFlori[8] = new Flori("Bujor", "Roz", "Gradina", 1.0, 5, 2.5, 35);
        vectorFlori[9] = new Flori("Violeta", "Violet", "Padure", 0.2, 1.5, 3.5, 23);
        vectorFlori[10] = new Flori("Crizantema", "Galben", "Gradina", 0.9, 3, 8, 19);
        vectorFlori[11] = new Flori("Iasomie", "Alb", "Padure", 0.4, 2, 1, 321);
        vectorFlori[12] = new Flori("Begonie", "Rosu", "Gradina", 0.3, 1.5, 6, 34);
        vectorFlori[13] = new Flori("Freesia", "Galben", "Camp", 0.4, 1.5, 12, 50);
        vectorFlori[14] = new Flori("Gladiola", "Rosu", "Gradina", 1.0, 2, 2, 10);
        vectorFlori[15] = new Flori("Hortensie", "Albastru", "Gradina", 1.2, 5, 3, 5);
        vectorFlori[16] = new Flori("Iris", "Mov", "Camp", 0.7, 2, 7.5, 4);
        vectorFlori[17] = new Flori("Lavanda", "Mov", "Camp", 0.6, 1.5, 1.2, 20);
        vectorFlori[18] = new Flori("Muscata", "Roz", "Gradina", 0.3, 2, 5, 50);
        vectorFlori[19] = new Flori("Panseluta", "Violet", "Gradina", 0.2, 1, 4, 12);
        vectorFlori[20] = new Flori("Petunie", "Rosu", "Gradina", 0.3, 1, 2.5, 43);
        vectorFlori[21] = new Flori("Rododendron", "Roz", "Padure", 1.5, 6, 1.5, 45);
        vectorFlori[22] = new Flori("Salvie", "Albastru", "Camp", 0.6, 2, 2.0, 78);
        vectorFlori[23] = new Flori("Sunatoare", "Galben", "Camp", 0.5, 1, 10, 34);
        vectorFlori[24] = new Flori("Vascul", "Alb", "Padure", 0.3, 3, 2, 59);
        

        //Aici cream un stoc de furniori
        Furnizor vectorFurnizori[] = new Furnizor[5];

        vectorFurnizori[0] = new Furnizor(
            "Floraria Trandafir",
            "Bucuresti",
            "Bucuresti",
            "RO123456789",
            "0723456789",
            "contact@trandafir.ro",
            new String[][] {{"Trandafir", "Lalea"}, {"Orhidee", "Crin"}}
        );
        
        vectorFurnizori[1] = new Furnizor(
            "Floraria Lalea",
            "Cluj",
            "Cluj-Napoca",
            "RO987654321",
            "0729876543",
            "info@lalea.ro",
            new String[][] {{"Garoafa", "Zambila"}, {"Margareta", "Bujor"}}
        );
        
        vectorFurnizori[2] = new Furnizor(
            "Orhideea Lux",
            "Constanta",
            "Constanta",
            "RO112233445",
            "0731122334",
            "sales@orhideea-lux.ro",
            new String[][] {{"Violeta", "Crizantema"}, {"Iasomie", "Begonie"}}
        );

        vectorFurnizori[3] = new Furnizor(
            "Crizantema de Aur",
            "Iasi",
            "Iasi",
            "RO556677889",
            "0745566778",
            "contact@crizantema-aur.ro",
            new String[][] {{"Freesia", "Gladiola"}, {"Hortensie", "Iris"}}
        );
        
        vectorFurnizori[4] = new Furnizor(
            "Lalele si Bujori",
            "Timis",
            "Timisoara",
            "RO998877665",
            "0759988776",
            "support@lalelebujori.ro",
            new String[][] {{"Lavanda", "Muscata"}, {"Panseluta", "Petunie"}}
        );

        //Aici facem un stoc de produse
        Produs vectorProduse[] = new Produs[5];

        vectorProduse[0] = new Produs(
            "Buchet Lux",
            "Trandafir, Lalea, Orhidee, Crin, Garoafa",
            "Rosu, Galben, Mov, Alb, Roz",
            250.0,
            1.5,
            10
        );

        vectorProduse[1] = new Produs(
            "Aranjament Elegant",
            "Narcisa, Zambila, Margareta, Bujor, Violeta",
            "Galben, Albastru, Alb, Roz, Violet",
            220.0,
            1.4,
            10
        );

        vectorProduse[2] = new Produs(
            "Set Floral",
            "Crizantema, Iasomie, Begonie, Freesia, Gladiola",
            "Galben, Alb, Rosu, Galben, Rosu",
            200.0,
            1.6,
            10
        );

        vectorProduse[3] = new Produs(
            "Buchet Special",
            "Hortensie, Iris, Lavanda, Muscata, Panseluta",
            "Albastru, Mov, Mov, Roz, Violet",
            240.0,
            1.5,
            10
        );

        vectorProduse[4] = new Produs(
            "Aranjament de Vara",
            "Petunie, Rododendron, Salvie, Sunatoare, Vascul",
            "Rosu, Roz, Albastru, Galben, Alb",
            180.0,
            1.2,
            10
        );

        //Aici facem un stoc financiar
        Financiar F = new Financiar();
        F.setVenitFinanciar(75000);
        F.setVanzariFinanciar(100000);
        F.setCosturiFinanciar(50000);
        F.setInvestitiiMarketingFinanciar(10000);

        //Aici cream un stoc de angajati
        Angajat[] angajati = new Angajat[3];

        for(int i = 0; i < 3; i++)
            angajati[i] = new Angajat();

        angajati[0].setNumeAngajat("Popescu");
        angajati[0].setPrenumeAngajat("Ion");
        angajati[0].setFunctiaAngajat("Manipulant marfa");
        angajati[0].setOrarDeLucruAngajat("09:00 - 17:00");
        angajati[0].setSexAngajat('M');
        angajati[0].setSalariuAngajat(3000);
        angajati[0].setVarstaAngajat(45);
        angajati[0].setZiAngajareAngajat(15);
        angajati[0].setLunaAngajareAngajat(6);
        angajati[0].setAnAngajareAngajat(2015);
        angajati[0].setZileConcediuLuateAngajat(10);
    
        angajati[1].setNumeAngajat("Ionescu");
        angajati[1].setPrenumeAngajat("Maria");
        angajati[1].setFunctiaAngajat("Vanzator");
        angajati[1].setOrarDeLucruAngajat("08:00 - 16:00");
        angajati[1].setSexAngajat('F');
        angajati[1].setSalariuAngajat(2500);
        angajati[1].setVarstaAngajat(30);
        angajati[1].setZiAngajareAngajat(1);
        angajati[1].setLunaAngajareAngajat(7);
        angajati[1].setAnAngajareAngajat(2018);
        angajati[1].setZileConcediuLuateAngajat(5);
    
        angajati[2].setNumeAngajat("Georgescu");
        angajati[2].setPrenumeAngajat("Andrei");
        angajati[2].setFunctiaAngajat("Curier");
        angajati[2].setOrarDeLucruAngajat("10:00 - 18:00");
        angajati[2].setSexAngajat('M');
        angajati[2].setSalariuAngajat(2800);
        angajati[2].setVarstaAngajat(40);
        angajati[2].setZiAngajareAngajat(20);
        angajati[2].setLunaAngajareAngajat(5);
        angajati[2].setAnAngajareAngajat(2017);
        angajati[2].setZileConcediuLuateAngajat(7);

        //Aici facem declarari initiale, parole etc, pentru clienti;
        Client[] clienti = new Client[101];
        int l = 5;

        clienti[0] = new Client("Popescu", "Ion", "0712345678", "popescu.ion@gmail.com", "parola1");
        clienti[1] = new Client("Ionescu", "Maria", "0722345678", "ionescu.maria@gmail.com", "parola2");
        clienti[2] = new Client("Georgescu", "Andrei", "0732345678", "georgescu.andrei@gmail.com", "parola3");
        clienti[3] = new Client("Vasilescu", "Elena", "0742345678", "vasilescu.elena@gmail.com", "parola4");
        clienti[4] = new Client("Dumitrescu", "Alex", "0752345678", "dumitrescu.alex@gmail.com", "parola5");

        Client.AdresaDeLivrare adresaDeLivrare[] = new Client.AdresaDeLivrare[101];

        adresaDeLivrare[0] = clienti[0].new AdresaDeLivrare("Bucuresti", "Sector 1", "Strada Exemplu", 10);
        adresaDeLivrare[1] = clienti[1].new AdresaDeLivrare("Cluj", "Cluj-Napoca", "Strada Exemplu2", 20);
        adresaDeLivrare[2] = clienti[2].new AdresaDeLivrare("Timis", "Timisoara", "Strada Exemplu3", 30);
        adresaDeLivrare[3] = clienti[3].new AdresaDeLivrare("Iasi", "Iasi", "Strada Exemplu4", 40);
        adresaDeLivrare[4] = clienti[4].new AdresaDeLivrare("Constanta", "Constanta", "Strada Exemplu5", 50);

        //De aici incepe aplicatia

        System.out.println("Bine ati venit la Floraria FLOS!");

        Scanner scanner = new Scanner(System.in);
        int n = 0, ok = 0;
        System.out.println("Apasati tasta:\n1-pentru administrator\n2-pentru client");
        n = scanner.nextInt();
        scanner.nextLine();
        if(n == 1)
        {
            //Verificam daca userul este bun;
            do
            {
                System.out.println("Te rog introdu numele de utilizator: ");
                String userAdm = scanner.nextLine();
                System.out.println("Te rog introdu parola: ");
                String parolaAdm = scanner.nextLine();
                if(userAdm.compareTo(UserNameAdministrator) != 0)
                {
                    System.out.println("Userul este gresit!");
                    System.out.println("Va rugam introduceti din nou datele!");
                }
                else if(parolaAdm.compareTo(ParolaAdministrator) != 0)
                {
                    System.out.println("Parola este gresita");
                    System.out.println("Va rugam introduceti din nou datele!");
                }
                else
                {
                    ok = 1;
                    System.out.println("Datele au fost introduse cu succes! V-ati conectat ca administrator!");
                }
            }
            
            while(ok == 0);
            System.out.println();
            System.out.println("Apasati tasta:\n1-vizualizare stoc flori\n2-vizualizare produse\n3-vizualizare-furnizori\n4-vizualizare parte financiara\n5-vizulizare angajati");
            System.out.println();

            n = scanner.nextInt();
            if(n == 1)
            {
                for(int i = 0; i < numar_flori; i++)
                {
                    System.out.print("Indice floare: " + i + " ");
                    vectorFlori[i].afisareDateFloare();
                }
                int verific = 1;
                System.out.println("Apasati tasta:\n1-adaugare floare\n2-modificare numar flori din stoc");
                int apas = scanner.nextInt();
                if(apas == 1)
                {
                    do
                    {
                        vectorFlori[numar_flori] = new Flori();
                        vectorFlori[numar_flori].initializareDateFloare();
                        numar_flori++;
                        System.out.println("Adaugarea s-a realizatat cu succes, mai jos puteti vedea produsul:");
                        vectorFlori[numar_flori - 1].afisareDateFloare();

                        System.out.println("Apasati tasta:\n1-realizare modificari in continuare\n0-oprire");
                        verific = scanner.nextInt();

                    }while(verific == 1);
                }
                else if(apas == 2)
                {
                    do
                    {
                        int numaru_ordine = 0;
                        System.out.println("Introdu numarul de ordine al florii careia doresti sa-i modifici stocul: (0 - 24)");
                        numaru_ordine = scanner.nextInt();

                        for(int i = 0; i < numar_flori; i++)
                        {
                            if(numaru_ordine == i)
                            {
                                vectorFlori[i].afisareDateFloare();
                                System.out.println("Va rog introduceti noua cantitate de flori: ");
                                int cantitate_flori = scanner.nextInt();
                                vectorFlori[i].setDisponibilitateFloare(cantitate_flori);
                                System.out.println("Floare a fost modificata cu succes!");
                                vectorFlori[i].afisareDateFloare();
                            }
                        }

                        System.out.println("Apasati tasta:\n1-realizare modificari in continuare\n0-oprire");
                        verific = scanner.nextInt();

                    }while(verific == 1);
                }
                else
                    System.out.println("Ati apasat tasta gresita!");
            }
            else if(n == 2)
            {
                for(int i = 0; i < 5; i++)
                {
                    vectorProduse[i].afiseazaDetaliiProdus();
                    System.out.println();
                }
            }
            else if(n == 3)
            {
                for(int i = 0; i < 5; i++)
                {
                    vectorFurnizori[i].afisareDateCompanie();
                    System.out.println();
                }
            }
            else if(n == 4)
            {
                F.afisareDateFinanciar();
            }
            else if(n == 5)
            {
                for(int i = 0; i < 3; i++)
                {
                    System.out.println("Indice angjat: " + i + " ");
                    angajati[i].afisareDateAngajat();
                    System.out.println();
                }
                int verific = 1;
                do
                {
                    int numaru_ordine = 0;
                    System.out.println("Introdu numarul de ordine al angajatului caruia doresti sa-i modifici salariul: (0 - 2)");
                    numaru_ordine = scanner.nextInt();

                    for(int i = 0; i < 3; i++)
                    {
                        if(numaru_ordine == i)
                        {
                            angajati[i].afisareDateAngajat();
                            System.out.println("Va rog introduceti noul salariu: ");
                            int nou_salariu = scanner.nextInt();
                            angajati[i].setSalariuAngajat(nou_salariu);
                            System.out.println("Salariul a fost modificat cu succes!");
                            angajati[i].afisareDateAngajat();
                        }
                    }

                    System.out.println("Apasati tasta:\n1-realizare modificari in continuare\n0-oprire");
                    verific = scanner.nextInt();

                }while(verific == 1);
            }
            else
                System.out.println("Ati apasat tasta gresita, va rugam incercati din nou!");
            
        }
        else if(n == 2)
        {
            Comanda vectorComanda[] = new Comanda[101];
            System.out.println("Incerci sa te conectezi ca un client, mai jos ai numele si indicele clientilor pe care ii avem in sistem, daca te regasesti acolo apasa tasta corespunzajoare indicelui, altfel apasa -1 pentru ati crea cont.");
            System.out.println();
            for(int i = 0; i < l; i++)
            {
                String nume = clienti[i].getNumeClient(), prenume = clienti[i].getPrenumeClient();
                System.out.println("Indice client: " + i + " Nume: " + nume + " Prenume: " + prenume);
            }
            System.out.println();
            System.out.println("Alege indicele sau apasa -1.");
            int tasta = scanner.nextInt();
            scanner.nextLine();
            int indice = 0;
            if(tasta == -1)
            {
                System.out.println("Urmeaza urmatorii pasi pentru ati crea un cont: ");
                clienti[l] = new Client();
                clienti[l].initializareDateClient();
                adresaDeLivrare[l] = clienti[l].new AdresaDeLivrare();
                adresaDeLivrare[l].initializareDateAdresaDeLivrare();
                clienti[l].afisareDateClient();
                adresaDeLivrare[l].afisareDateAdresaDeLivrare();
                System.out.println("Acum ai indicele " + l + " ca sa te conectezi!");
                System.out.println();
                indice = l;
            }
            do
            {
                indice = tasta;
                System.out.println("Te rog introdu numele: ");
                String numeCl = scanner.nextLine();
                System.out.println("Te rog introdu prenumele: ");
                String prenumeCl = scanner.nextLine();
                System.out.println("Te rog introdu parola: ");
                String parolaCl = scanner.nextLine();
                if(clienti[indice].getNumeClient().compareTo(numeCl) != 0 && clienti[indice].getPrenumeClient().compareTo(prenumeCl) != 0)
                {
                    System.out.println("Numele si prenumele sunt gresite!");
                    System.out.println("Va rugam introduceti din nou datele!");
                }
                else if(clienti[indice].getParolaClient().compareTo(parolaCl) != 0)
                {
                    System.out.println("Parola este gresita");
                    System.out.println("Va rugam introduceti din nou datele!");
                }
                else
                {
                    ok = 1;
                    System.out.println("Datele au fost introduse cu succes! V-ati conectat cu succes!");
                }
            }
            while(ok == 0);
            int alegere = 2, numar_produse = 0;
            do
            {
                System.out.println("Mai jos ai o lista cu toate produsele noastre flori/aranjamente, te rog sa alegi indicele produsului pe care il doriti si cantitatea!");
                System.out.println("\nFlori:\n");
                int var, i;
                for(i = 0, var = 0; i < numar_flori; i++, var++)
                {
                    System.out.print("Indice floare: " + var + " ");
                    vectorFlori[i].afisareDateFloare();
                }
                System.out.println("\nAranjamente:\n");
                for(i = 0, var = numar_flori; i < 5; i++, var++)
                {
                    System.out.print("Indice aranjament: " + var + " ");
                    vectorProduse[i].afiseazaDetaliiProdus();
                    System.out.println();
                }
                System.out.println("Introduceti va rog numarul de produse pe care vreti sa le cumparati:");
                numar_produse = scanner.nextInt();
                for(i = 0; i < numar_produse; i++)
                    vectorComanda[i] = new Comanda();
                for(i = 0; i < numar_produse; i++)
                    vectorComanda[i].initializareDateComanda();
                double suma_comanda = 0.0;
                for(i = 0; i < numar_produse; i++)
                {
                    int ind = vectorComanda[i].getIndiceFloare(), can = vectorComanda[i].getCantitateFloare();
                    if(ind < numar_flori)
                        suma_comanda = suma_comanda + vectorFlori[ind].getPretFloare() * can;
                    else
                        suma_comanda = suma_comanda + vectorProduse[ind - numar_flori].getPretProdus() * can;
                }
                System.out.println("Pretul comenzii este: " + suma_comanda + " lei\nApasati tasta:\n1-comandati\n2-reluati o noua comanda(cea facuta nu se salveaza)\n3-renuntati");
                alegere = scanner.nextInt();
                if(alegere == 2)
                    System.out.println("Va rugam sa selectati din nou ce produse doriti sa cumparati!");
            }while(alegere == 2);
            if(alegere == 1)
            {
                System.out.println("Comanda a fost realizatat cu succes!");
                System.out.print("Adresa de livrare: ");
                adresaDeLivrare[indice].afisareDateAdresaDeLivrare();
                for(int i = 0; i < numar_produse; i++)
                {
                    int ind = vectorComanda[i].getIndiceFloare(), can = vectorComanda[i].getCantitateFloare();
                    if(ind < numar_flori)
                    {
                        int c = vectorFlori[ind].getDisponibilitateFloare();
                        vectorFlori[ind].setDisponibilitateFloare(c - can);
                    }
                    else
                    {
                        int c = vectorProduse[ind - numar_flori].getDisponibilProdus();
                        vectorProduse[ind - numar_flori].setDimensiuneProdus(c - can);
                    }
                }
            }
            else if(alegere == 3)
                System.out.println("Multumim ca ati vizitat floaria noastra!");
        }
    }
}