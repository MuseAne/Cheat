package fr.insa.sth1.b7.projet_info_s2;

import java.util.ArrayList;

public class TypeBarre {

    private int Id;
    private String Section;
    private double Lmin;
    private double Lmax;
    private double Cout;
    private double RmC;
    private double RmT;
    private double Cout_Supplementaire;
    private String Materiaux;
    private ArrayList<Barre> Barre_TypeBarre;

    public TypeBarre(int Iden) { //On s'en fout de ce qu'il y a dedans c'est juste pour dire qu'il y a un truc quoi
        Id = Iden;
        Section = "Rond";
        Lmin = 3;
        Lmax = 4;
        Cout = 200;
        RmC = -100;
        RmT = 50;
        Materiaux = "Fer";
        Barre_TypeBarre = new ArrayList<>();
        Cout_Supplementaire = 1500;
    }

    public TypeBarre(int Iden, String S, double C, double ResiMC, double ResiMT, String Mat) { //On s'en fout de ce qu'il y a dedans c'est juste pour dire qu'il y a un truc quoi
        Id = Iden;
        Section = S;
        Cout = C;
        RmC = ResiMC;
        RmT = ResiMT;
        Materiaux = Mat;
        Barre_TypeBarre = new ArrayList<>();
    }

    public TypeBarre(int Iden, String S, double C, double ResiMC, double ResiMT, String Mat, double Cout_Sup) { //On s'en fout de ce qu'il y a dedans c'est juste pour dire qu'il y a un truc quoi
        Id = Iden;
        Section = S;
        Cout = C;
        RmC = ResiMC;
        RmT = ResiMT;
        Materiaux = Mat;
        Barre_TypeBarre = new ArrayList<>();
        Cout_Supplementaire = Cout_Sup;
    }

    public String getSection() {
        return Section;
    }

    public double getLmin() {
        return Lmin;
    }

    public double getLmax() {
        return Lmax;
    }

    public double getCout() {
        return Cout;
    }

    public double getRmC() {
        return RmC;
    }

    public double getRmT() {
        return RmT;
    }

    public double getCout_Supplementaire() {
        return Cout_Supplementaire;
    }

    public String getMateriaux() {
        return Materiaux;
    }

    public ArrayList<Barre> getBarre_TypeBarre() {
        return Barre_TypeBarre;
    }

    public void addBarre_TypeBarre(Barre B) {
        Barre_TypeBarre.add(B);
    }

    public String toString() {
        String res;
        res = "\n --Type Barre " + getId() + "--" + "\n- Section : " + Section + "\n- Longueur min : " + Lmin + "\n- Longueur max : " + Lmax + "\n- Resistance ?? la compression : " + RmC
                + "\n- Resistance ?? la torsion : " + RmT + "\n- Materiau : " + Materiaux + "\n-Cout Supllementaire Au m??tre : " + Cout_Supplementaire;
        res = res + "\nLes barres suivantes sont de ce type : ";

        return res;
    }

    public int getId() {
        return Id;
    }

    public String Enregistrement() {
        String S;
        S = "TypeBarre ; " + this.getId() + " ; " + this.getSection() + " ; " + this.getCout() + " ; " + this.getRmC() + " ; " + this.getRmT() + " ; " + this.getMateriaux() + " ; " + this.getCout_Supplementaire() + "\n";
        return S;
    }
}
