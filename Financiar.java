import java.util.Scanner;

public class Financiar 
{
    private double venit, vanzari, costuri, investitii_marketing;
    public Financiar()
    {
        this.venit = 0.0;
        this.vanzari = 0.0;
        this.costuri = 0.0;
        this.investitii_marketing = 0.0;
    }
    public Financiar(double Ven, double Van, double C, double IM)
    {
        this.venit = Ven;
        this.vanzari = Van;
        this.costuri = C;
        this.investitii_marketing = IM;
    }
    public Financiar(Financiar F)
    {
        this.venit = F.venit;
        this.vanzari = F.vanzari;
        this.costuri = F.costuri;
        this.investitii_marketing = F.investitii_marketing;
    }

    public void afisareDateFinanciar()
    {
        System.out.println("Venituri: " + this.venit + " Vanzari: " + this.vanzari + " Costuri: " + this.costuri + " Investitii in marketing: " + this.investitii_marketing);
    }

    public void initializareDateFinanciar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care este venitul florariei?");
        this.venit = scanner.nextDouble();
        System.out.println("Care sunt vanzarile totale ale firmei?");
        this.vanzari = scanner.nextDouble();
        System.out.println("Care sunt costuriel florariei? (facturi, salarii)");
        this.costuri = scanner.nextDouble();
        System.out.println("Cat valoreaza investiile in marketing?");
        this.investitii_marketing = scanner.nextDouble();
    }

    public void setVenitFinanciar(double Ven)
    {
        this.venit = Ven;
    }
    public void setVanzariFinanciar(double Van)
    {
        this.vanzari = Van;
    }
    public void setCosturiFinanciar(double C)
    {
        this.costuri = C;
    }
    public void setInvestitiiMarketingFinanciar(double IM)
    {
        this.investitii_marketing = IM;
    }

    public double getVenitFinanciar()
    {
        return this.venit;
    }
    public double getVanzariFinanciar()
    {
        return this.vanzari;
    }
    public double getCosturiFinanciar()
    {
        return this.costuri;
    }
    public double getInvestitiiMarketingFinanciar()
    {
        return this.investitii_marketing;
    }

    public double Profit()
    {
        double aux = this.vanzari - (this.costuri + this.investitii_marketing);
        return aux;
    }
}