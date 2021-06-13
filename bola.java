package app.main;

public class bola {
    int jari;
    double Luasbola, Volumebola;
    double pi = 3.14;

    public void SetJari(int jari){
        this.jari = jari;
    }

    public int GetJari(){
        return this.jari ;
    }

    public double Luasbola(){
        this.Luasbola = 4 * pi * this.jari * this.jari;
        return this.Luasbola;
    }
    public double Volumebola(){
        this.Volumebola = 4/3 * pi * this.jari * this.jari * this.jari;
        return this.Volumebola;
    }
    @Override
    public String toString() {
        return "\nJari-jari bola : " +jari;
    }
}   
