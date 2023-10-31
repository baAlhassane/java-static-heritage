public class AttFinal {
    private static  int compteur=0;
    private final int identite;
    private static final int maximal=10;

    public AttFinal() {
        if(compteur<maximal){
            compteur++;
        }
        else{   compteur=0;}

        this.identite = compteur;
    }
}
