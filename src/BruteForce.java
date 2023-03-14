import java.util.Random;

public class BruteForce {

    public static void main(String[] args){
        BruteForce olustur = new BruteForce();
        olustur.diziElemanlarınıOlusturma();
    }

    public void diziElemanlarınıOlusturma() {

        Random rnd = new Random();
        int gecici;
        int[] dizi = new int[10000];
        System.out.println("Oluşturulan Dizi: ");
        for(int i=0;i<10000;i++){
            dizi[i] = rnd.nextInt(1000);
            System.out.println(dizi[i]+" ");
        }
        System.out.println();



        System.out.println("Dizinin En Büyük Elemanı: ");
        int max= dizi[0];
        for(int i=1;i< dizi.length;i++){
            if(dizi[i]>max){
                max=dizi[i];
            }
        }
        System.out.println(max);
    }

}
