public class AmethodFinal {
    public final void a(){
        System.out.println(" Hello a ");
    }
}

class B extends  AmethodFinal{
    public void  a(int n) { System.out.println("Classe B" + n); }
    //public void a() { System.out.println("Classe B"); }

}
