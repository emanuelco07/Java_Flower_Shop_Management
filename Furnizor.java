import java.util.Scanner;

public class Furnizor 
{
    private String numeCompanie, judetCompanie, locatitateCompanie, nrCompanie, nrTelefonCompanie, adresaGmailCompanie;
    String FloriOferite[][];

    public Furnizor()
    {
        this.numeCompanie = "";
        this.judetCompanie = "";
        this.locatitateCompanie = "";
        this.nrCompanie = "";
        this.nrTelefonCompanie = "";
        this.adresaGmailCompanie = "";
        this.FloriOferite = new String[256][256];
    }
    public Furnizor(String NC, String JC, String LC, String NRC, String NRTC, String AG, String F[][])
    {
        this.numeCompanie = NC;
        this.judetCompanie = JC;
        this.locatitateCompanie = LC;
        this.nrCompanie = NRC;
        this.nrTelefonCompanie = NRTC;
        this.adresaGmailCompanie = AG;
        this.FloriOferite = F;
    }
    public Furnizor(Furnizor F)
    {
        this.numeCompanie = F.numeCompanie;
        this.judetCompanie = F.judetCompanie;
        this.locatitateCompanie = F.locatitateCompanie;
        this.nrCompanie = F.nrCompanie;
        this.nrTelefonCompanie = F.nrTelefonCompanie;
        this.adresaGmailCompanie = F.adresaGmailCompanie;
        this.FloriOferite = F.FloriOferite;
    }

    void afisareDateCompanie()
    {
        System.out.println("Nume: " + this.numeCompanie + " Judet: " + this.judetCompanie + " Localitate: " + this.locatitateCompanie + " Numar: " + this.nrCompanie);
        System.out.println("Numar de telefon: " + this.nrTelefonCompanie + " Adresa de Gmail: " + this.adresaGmailCompanie);
        for (int i = 0; i < this.FloriOferite.length; i++)
            for (int j = 0; j < this.FloriOferite[i].length; j++) 
                System.out.println(this.FloriOferite[i][j]);
    }

    public void setNumeCompanie(String NC)
    {
        this.numeCompanie = NC;
    }
    public void setJudetCompanie(String JC)
    {
        this.judetCompanie = JC;
    }
    public void setLocalitateCompanie(String LC)
    {
        this.locatitateCompanie = LC;
    }
    public void setNrCompanie(String NRC)
    {
        this.nrCompanie = NRC;
    }
    public void setNrTelefonCompanie(String NRTC)
    {
        this.nrTelefonCompanie = NRTC;
    }
    public void setAdresaGmailCompanie(String AG)
    {
        this.adresaGmailCompanie = AG;
    }
    public void setFloriOferite(String F[][])
    {
        this.FloriOferite = F;
    }

    public String getNumeCompanie()
    {
        return this.numeCompanie;
    }
    public String getJudetCompanie()
    {
        return this.judetCompanie;
    }
    public String getLocalitateCompanie()
    {
        return this.locatitateCompanie;
    }
    public String getNumarComapanie()
    {
        return this.nrCompanie;
    }
    public String getNumarTelefonCompanie()
    {
        return this.nrTelefonCompanie;
    }
    public String getAdresaGmailCompanie()
    {
        return this.adresaGmailCompanie;
    }
    public String getFloriOferite()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.FloriOferite.length; i++) 
            for (int j = 0; j < this.FloriOferite[i].length; j++) 
                stringBuilder.append(this.FloriOferite[i][j]).append(" ");
        return stringBuilder.toString();
    }
}