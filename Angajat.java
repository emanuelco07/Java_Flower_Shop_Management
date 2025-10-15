import java.util.Scanner;
import java.time.LocalDate;

public class Angajat 
{
    private String nume, prenume, functia, orar_de_lucru;
    char sex;
    private int salariu, varsta, zi_angajare, luna_angajare, an_angajare, zile_concediu_luate;

    public Angajat()
    {
        this.nume = "";
        this.prenume = "";
        this.functia = "";
        this.orar_de_lucru = "";
        this.sex = 'N';
        this.salariu = 0;
        this.varsta = 0;
        this.zi_angajare = 0;
        this.luna_angajare = 0;
        this.an_angajare = 0;
        this.zile_concediu_luate = 0;
    }
    public Angajat(String N, String P, String F, String O, char X, int S, int V, int ZA, int LA, int AA, int ZCL)
    {
        this.nume = N;
        this.prenume = P;
        this.functia = F;
        this.orar_de_lucru = O;
        this.sex = X;
        this.salariu = S;
        this.varsta = V;
        this.zi_angajare = ZA;
        this.luna_angajare = LA;
        this.an_angajare = AA;
        this.zile_concediu_luate = ZCL;
    }
    public Angajat(Angajat A)
    {
        this.nume = A.nume;
        this.prenume = A.prenume;
        this.functia = A.functia;
        this.orar_de_lucru = A.orar_de_lucru;
        this.sex = A.sex;
        this.salariu = A.salariu;
        this.varsta = A.varsta;
        this.zi_angajare = A.zi_angajare;
        this.luna_angajare = A.luna_angajare;
        this.an_angajare = A.an_angajare;
        this.zile_concediu_luate = A.zile_concediu_luate;
    }

    public void initializareDateAngajat()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care este numele angajatului?");
        this.nume = scanner.nextLine();
        System.out.println("Care este prenumele angajatului?");
        this.prenume = scanner.nextLine();
        System.out.println("Care este functia angajatului?");
        this.functia = scanner.nextLine();
        System.out.println("Care este orarul de lucru al angajatului?");
        this.orar_de_lucru = scanner.nextLine();
        System.out.println("Care este sexul angajatului? (M sau F)");
        this.sex = scanner.next().charAt(0);
        System.out.println("Care este salariul angajatului?");
        this.salariu = scanner.nextInt();
        System.out.println("Care este varsta angajatului?");
        this.varsta = scanner.nextInt();
        System.out.println("Care este ziua in care a fost angajat?");
        this.zi_angajare = scanner.nextInt();
        System.out.println("Care este luna in care a fost angajat?");
        this.luna_angajare = scanner.nextInt();
        System.out.println("Care este anul in care a fost angajat?");
        this.an_angajare = scanner.nextInt();
        System.out.println("Cate zile de concediu si-a luat pana acum?");
        this.zile_concediu_luate = scanner.nextInt();
    }

    void afisareDateAngajat()
    {
        System.out.println("Nume: " + this.nume + " Prenume: " + this.prenume + " Sex: " + this.sex + " Functia: " + this.functia + " Orar de lucru: " + this.orar_de_lucru);
        System.out.println("Salariu: " + this.salariu + " Varsta: " + this.varsta + " Zile de concediu luate: " + this.zile_concediu_luate);
        System.out.println("Zi angajare: " + this.zi_angajare + " Luna angajare: " + this.luna_angajare + " An angajare: " + this.an_angajare);
    }

    void setNumeAngajat(String N)
    {
        this.nume = N;
    }
    void setPrenumeAngajat(String P)
    {
        this.prenume = P;
    }
    void setFunctiaAngajat(String F)
    {
        this.functia = F;
    }
    void setOrarDeLucruAngajat(String O)
    {
        this.orar_de_lucru = O;
    }
    void setSexAngajat(char X)
    {
        this.sex = X;
    }
    void setSalariuAngajat(int S)
    {
        this.salariu = S;
    }
    void setVarstaAngajat(int V)
    {
        this.varsta = V;
    }
    void setZiAngajareAngajat(int ZA)
    {
        this.zi_angajare = ZA;
    }
    void setLunaAngajareAngajat(int LA)
    {
        this.luna_angajare = LA;
    }
    void setAnAngajareAngajat(int AA)
    {
        this.an_angajare = AA;
    }
    void setZileConcediuLuateAngajat(int ZCL)
    {
        this.zile_concediu_luate = ZCL;
    }

    public String getNumeAngajat()
    {
        return this.nume;
    }
    public String getPrenumeAngajat()
    {
        return this.prenume;
    }
    public String getFunctiaAngajat()
    {
        return this.functia;
    }
    public String getOrarDeLucruAngajat()
    {
        return this.orar_de_lucru;
    }
    public char getSexAngajat()
    {
        return this.sex;
    }
    public int getSalariuAngajat()
    {
        return this.salariu;
    }
    public int getVarstaAngajat()
    {
        return this.varsta;
    }
    public int getZiAngajareAngajat()
    {
        return this.zi_angajare;
    }
    public int getLunaAngajareAngajat()
    {
        return this.luna_angajare;
    }
    public int getAnAngajareAngajat()
    {
        return this.an_angajare;
    }
    public int getZileConcediuLuateDeAngajat()
    {
        return this.zile_concediu_luate;
    }

    public int CalculareVechimeAngajat()
    {
        return LocalDate.now().getYear() - this.an_angajare;
    }

    public int CalculeZileConcediuRamase()
    {
        return (21 - this.zile_concediu_luate);
    }

    public int CalculAnPensionare()
    {
        int an_curent = LocalDate.now().getYear(), diferenta;
        if(this.sex =='M')
            diferenta = 65 - this.varsta;
        else
            diferenta = 62 - this.varsta;
        return (an_curent + diferenta);
    }
}