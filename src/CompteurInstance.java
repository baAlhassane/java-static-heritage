public class CompteurInstance {
    private static int compteur=0;

    CompteurInstance(){
        compteur++;
    }
    public void  printCompteur(){
        System.out.println("compteur  = "+compteur);}

}
