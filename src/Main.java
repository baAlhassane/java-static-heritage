import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
         /*
        A obja=new A();

       A objb=new A();

        obja.a=22;
        obja.print();//a = 22  b= 1
        objb.print();//a = 0  b= 1


        obja.a=22;
        obja.b=100;
        //obja.print();//a = 22  b= 100
        //objb.print();//a = 0  b= 100


        A.b=1200;
        obja.print();//a = 22  b= 1200
        objb.print();//a = 0  b= 1200
  */

        //Dans le main
        //CompteurInstance obj1=new CompteurInstance();
        //obj1.printCompteur();// compteur  = 1
        //CompteurInstance obj2=new CompteurInstance();
       // CompteurInstance obj3=new CompteurInstance();

        //obj1.printCompteur();// compteur  = 3
       // obj2.printCompteur();
       // obj3.printCompteur();





        // methode final
        //AmethodFinal b=new AmethodFinal();

        /* Abstract class  */

        AbstractClass absa=new BextendsAbstract();
        BextendsAbstract absb=new BextendsAbstract();

        absa.a();
        absb.b();
        absb.a();


    }



    public static boolean  isPalindrome(String s){
        //char [] tabCar =s.toCharArray();
        String s1="";
        for(int j=s.length()-1;j>=0;j--){
            s1+=s.charAt(j);

        }
        System.out.println(" S1 =  "+s1);
        boolean b=s.equals(s1);
        if(b){
            System.out.println(s+" est Palindrome ");
        }
        else{
            System.out.println(s+" n'est pas  Palindrome ");
        }


        return b;

    }



    public static boolean isAnagrame(String s1, String s2){

        char [] tabCar1 =s1.toCharArray();
        char [] tabCar2 =s1.toCharArray();
        Arrays.sort(tabCar1);
        Arrays.sort(tabCar2);
        String s1ordered="";
        String s2ordered="";
        boolean b=false;
        if(s1.length()!=s2.length()){
            System.out.println(s1+" et  "+s2+" ne sont pas  anagrammes : b= "+b);
            return false;
        }
        else{

            for(int i=0; i<s1.length();i++){
                s1ordered+=tabCar1[i];
                s2ordered+=tabCar2[i];
            }

            b=s1ordered.equals(s2ordered);

        }
        if(b){
            System.out.println(s1+" et  "+s2+" sont anagrammes : b= "+b);
        }
        return b;

    }



    public static Integer valTempNearToZero(List<Integer> list){

        Stream<Integer> listStream=list.stream().sorted(Comparator.naturalOrder());
        listStream.forEach(e-> System.out.print(e+" "));
        //System.out.println(" ------ ");
        //Stream<Integer> list_abs= listStream.map(e-> Math.abs(e));
        //list_abs.forEach(e-> System.out.print(e+" "));

        List<Integer> list2=list.stream()
                .sorted(Comparator.naturalOrder())
                .map(e-> Math.abs(e)).collect(Collectors.toList());


        int indice=0;
        int indiceMin=0;
        Integer min=list2.get(0);
        for(Integer e:list2){
            if(e< min){
                min=e;
                indiceMin=indice;

            }
            indice++;
        }

        Integer min0=list2.get(indiceMin);
        System.out.println( " ");
        System.out.print( " la valeur la plus proche de 0 est : "+min0 );

        return min0;

    }




}