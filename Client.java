import java.util.Scanner;

public class Client
{
    private String nume, prenume, numar_telefon, adresa_gmail, parola;
    public Client()
    {
        this.nume = "";
        this.prenume = "";
        this.numar_telefon = "";
        this.adresa_gmail = ""; 
        this.parola = "";
    }
    public Client(String N, String P, String NT , String AG, String Pr)
    {
        this.nume = N;
        this.prenume = P;
        this.numar_telefon = NT;
        this.adresa_gmail = AG;
        this.parola = Pr;
    }
    public Client(Client C)
    {
        this.nume = C.nume;
        this.prenume = C.prenume;
        this.numar_telefon = C.numar_telefon;
        this.adresa_gmail = C.adresa_gmail;
        this.parola = C.parola;
    }
    
    public void afisareDateClient()
    {
        System.out.println("Nume: " + this.nume + " Prenume: " + this.prenume + " Numar de telefon: " + this.numar_telefon + " Adresa de gmail: " + adresa_gmail + " Parola: " + this.parola);
    }

    public void initializareDateClient()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care este numele dumneavoastra");
        this.nume = scanner.nextLine();
        System.out.println("Care este prenumele dumneavoastra?");
        this.prenume = scanner.nextLine();
        System.out.println("Care este numarul dumneavoastra de telefon?");
        this.numar_telefon = scanner.nextLine();
        System.out.println("Care este adresa dumneavoastra de gmail?");
        this.adresa_gmail = scanner.nextLine();
        System.out.println("Care este parola dumneavoastra?");
        this.parola = scanner.nextLine();
    }

    public void setNumeClient(String N)
    {
        this.nume = N;
    }
    public void setPrenumeClient(String P)
    {
        this.prenume = P;
    }
    public void setNumarTelefonClient(String NT)
    {
        this.numar_telefon = NT;
    }
    public void setAdresaGmailClient(String AG)
    {
        this.adresa_gmail = AG;
    }
    public void setParolaClient(String Pr)
    {
        this.parola = Pr;
    }

    public String getNumeClient()
    {
        return this.nume;
    }
    public String getPrenumeClient()
    {
        return this.prenume;
    }
    public String getNumarTelefonClient()
    {
        return this.numar_telefon;
    }
    public String getAdresaGmailClient()
    {
        return this.adresa_gmail;
    }
    public String getParolaClient()
    {
        return this.parola;
    }

    public class AdresaDeLivrare
    {
        private String judet, localitate, strada;
        private int numar;

        public AdresaDeLivrare()
        {
            this.judet = "";
            this.localitate = "";
            this.strada = "";
            this.numar = 0;
        }
        public AdresaDeLivrare(String J, String L, String S, int NR)
        {
            this.judet = J;
            this.localitate = L;
            this.strada = S;
            this.numar = NR;
        }
        public AdresaDeLivrare(AdresaDeLivrare ADL)
        {
            this.judet = ADL.judet;
            this.localitate = ADL.localitate;
            this.strada = ADL.strada;
            this.numar = ADL.numar;
        }

        public void afisareDateAdresaDeLivrare()
        {
            System.out.println("Judet: " + this.judet + " Localitate: " + this.localitate + " Strada: " + this.strada + " Numar: " + this.numar);
        }

        public void initializareDateAdresaDeLivrare()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Care este judetul unde se face livrarea?");
            this.judet = scanner.nextLine();
            System.out.println("Care este localitatea?");
            this.localitate = scanner.nextLine();
            System.out.println("Care este strada?");
            this.strada = scanner.nextLine();
            System.out.println("Care este numarul la care se face livrarea?(fara litere)");
            this.numar = scanner.nextInt();
        }

        public void setJudetAdresaLivrare(String J)
        {
            this.judet = J;
        }
        public void setLocalitateAdresaLivrare(String L)
        {
            this.localitate = L;
        }
        public void setStradaAdresaLivrare(String S)
        {
            this.strada = S;
        }
        public void setNumarAdresaLivrare(int NR)
        {
            this.numar = NR;
        }

        public String getJudetAdresaLivrare()
        {
            return this.judet;
        }
        public String getLocalitateAdresaLivrare()
        {
            return this.localitate;
        }
        public String getStradaAdresaLivrare()
        {
            return this.strada;
        }
        public int getNumarAdresaLivrare()
        {
            return this.numar;
        }
    }
}