import java.util.Scanner;

public class Comanda
{
    int indice_Floare, cantitate_Floare;
    public Comanda()
    {
        this.indice_Floare = 0;
        this.cantitate_Floare = 0;
    }
    public Comanda(int IF, int CF)
    {
        this.indice_Floare = IF;
        this.cantitate_Floare = CF;
    }

    public int getIndiceFloare()
    {
        return this.indice_Floare;
    }
    public int getCantitateFloare()
    {
        return this.cantitate_Floare;
    }

    public void initializareDateComanda()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu indicele produsului: ");
        this.indice_Floare = scanner.nextInt();
        System.out.println("Introdu cantitatea: ");
        this.cantitate_Floare = scanner.nextInt();
    }

    public void afisareDateComanda()
    {
        System.out.println("Indice produs: " + this.indice_Floare + " Cantitatea: " + this.cantitate_Floare);
    }
}