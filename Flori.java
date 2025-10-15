import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class Flori {
    private String culoare, habitat, nume;
    private double dimensiune, durata_de_viata, pret_floare;
    private int disponibilitateFloare = 0;

    public Flori()
    {
        this.nume = "";
        this.culoare = "";
        this.habitat = "";
        this.dimensiune = 0.0;
        this.durata_de_viata = 0.0;
        this.pret_floare = 0.0;
        this.disponibilitateFloare = 0;
    }
    public Flori(String N, String C, String H, double D, double V, double P, int DF)
    {
        this.nume = N;
        this.culoare = C;
        this.habitat = H;
        this.dimensiune = D;
        this.durata_de_viata = V;
        this.pret_floare = P;
        this.disponibilitateFloare = DF;
    }
    public Flori(Flori F)
    {
        this.nume = F.nume;
        this.culoare = F.culoare;
        this.habitat = F.habitat;
        this.dimensiune = F.dimensiune;
        this.durata_de_viata = F.durata_de_viata;
        this.pret_floare = F.pret_floare;
        this.disponibilitateFloare = F.disponibilitateFloare;
    }

    public void initializareDateFloare()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care este numele florii?");
        this.nume = scanner.nextLine();
        System.out.println("Care este culoarea florii?");
        this.culoare = scanner.nextLine();
        System.out.println("In ce habitat se dezvolta floarea?");
        this.habitat = scanner.nextLine();
        System.out.println("Care este dimensiunea florii?");
        this.dimensiune = scanner.nextDouble();
        System.out.println("Care este durata de viata a florii?");
        this.durata_de_viata = scanner.nextDouble();
        System.out.println("Care este pretul florii?");
        this.pret_floare = scanner.nextDouble();
        System.out.println("Care este numarul de flori de acest tip?");
        this.disponibilitateFloare = scanner.nextInt();
    }

    public void setNumeFloare(String N)
    {
        this.nume = N;
    }
    public void setCuloareFloare(String C)
    {
        this.culoare = C;
    }
    public void setHabitatFloare(String H)
    {
        this.habitat = H;
    }
    public void setDimensiuneFloare(double D)
    {
        this.dimensiune = D;
    }
    public void setDurataDeViataFloare(double V)
    {
        this.durata_de_viata = V;
    }
    public void setPretFloare(double P)
    {
        this.pret_floare = P;
    }
    public void setDisponibilitateFloare(int DF)
    {
        this.disponibilitateFloare = DF;
    }

    public String getNumeFloare()
    {
        return this.nume;
    }
    public String getCuloareFloare()
    {
        return this.culoare;
    }
    public String getHabitatFloare()
    {
        return this.habitat;
    }
    public double getDimensiuneFloare()
    {
        return this.dimensiune;
    }
    public double getDurataDeViataFloare()
    {
        return this.durata_de_viata;
    }
    public double getPretFloare()
    {
        return this.pret_floare;
    }
    public int getDisponibilitateFloare()
    {
        return this.disponibilitateFloare;
    }

    void afisareDateFloare()
    {
        System.out.println("Nume: " + this.nume + " Culoare: " + this.culoare + " Habitat: " + this.habitat + " Dimensiune: " + this.dimensiune + " metri " + " Durata de viata: " + this.durata_de_viata + " luni " + " Pret: " + this.pret_floare + " lei " + " Disponibilitate(stoc): " + this.disponibilitateFloare);
    }
}