import java.util.Scanner;

public class Produs 
{
    private String Nume, TipFlori, Culori;
    private double Pret, Dimensiune;
    private int Disponibil;

    public Produs()
    {
        this.Nume = "";
        this.TipFlori = "";
        this.Culori = "";
        this.Pret = 0.0;
        this.Dimensiune = 0.0;
        this.Disponibil = 0;
    }
    public Produs(String N, String TF , String C , double P , double D , int DI)
    {
        this.Nume = N;
        this.TipFlori = TF;
        this.Culori = C;
        this.Pret= P;
        this.Dimensiune = D;
        this.Disponibil = DI;
    }
    public Produs(Produs P)
    {
        this.Nume = P.Nume;
        this.TipFlori = P.TipFlori;
        this.Culori = P.Culori;
        this.Pret= P.Pret;
        this.Dimensiune = P.Dimensiune;
        this.Disponibil = P.Disponibil;
    }

    public void setNumeProdus(String N)
    {
        this.Nume = N;
    }
    public String getNumeProdus()
    {
        return this.Nume;
    }

    public void setTipFloriProdus(String TP)
    {
        this.TipFlori = TP;
    }
    public String getTipFloriProdus()
    {
        return this.TipFlori;
    }

    public void setCuloriProdus(String C)
    {
        this.Culori = C;
    }
    public String getCuloriProdus()
    {
        return this.Culori;
    }

    public void setPretProdus(double P)
    {
        this.Pret = P;
    }
    public double getPretProdus()
    {
        return this.Pret;
    }

    public void setDimensiuneProdus(double D)
    {
        this.Dimensiune = D;
    }
    public double getDimensiuneProdus()
    {
        return this.Dimensiune;
    }

    public void setDisponibilProdus(int DI)
    {
        this.Disponibil = DI;
    }
    public int getDisponibilProdus()
    {
        return this.Disponibil;
    }

    public void afiseazaDetaliiProdus() 
    {
        System.out.println("Aranjament: " + this.Nume);
        System.out.println("Tip flori: " + this.TipFlori);
        System.out.println("Culori: " + this.Culori);
        System.out.println("Pret: " + this.Pret + " lei");
        System.out.println("Dimensiune: " + this.Dimensiune);
        System.out.println("Disponibilitate: " + this.Disponibil);
    }

    public void initializareDateProdus()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele aranjamentului: ");
        this.Nume = scanner.nextLine();
        System.out.println("Introdu tipul florii: ");
        this.TipFlori = scanner.nextLine();
        System.out.println("Introdu Culori: ");
        this.Culori = scanner.nextLine();
        System.out.println("Introdu pretul aranjamentului: ");
        this.Pret = scanner.nextDouble();
        System.out.println("Introdu dimensiunea aranjamentului: ");
        this.Dimensiune = scanner.nextDouble();
        System.out.println("Introdu disponibilitatea aranjamentului: ");
        this.Disponibil = scanner.nextInt();
    }
}