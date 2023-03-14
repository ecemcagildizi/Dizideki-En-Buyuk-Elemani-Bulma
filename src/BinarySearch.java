import java.util.Random;

public class BinarySearch {

    public static void diziSıralama(int[] dizi){
        for(int i=0;i<10000;i++){
            System.out.println(dizi[i]);
        }
        System.out.println();
    }

    public void diziElemanlarınıOlusturma() {

        Random rnd = new Random();
        int[] dizi = new int[10000];
        int gecici;
        System.out.println("Oluşturulan Dizi: ");
        for(int i=0;i<10000;i++){
            dizi[i] = rnd.nextInt(1000);
            System.out.println(dizi[i]+" ");
        }
        System.out.println();


        System.out.println("Dizinin Sıralanmış Şekli: ");
        for(int i=0;i<10000;i++){
            for(int j=i+1;j<10000;j++){
                if(dizi[j]<dizi[i]){
                    gecici=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=gecici;
                }
            }
        }
        diziSıralama(dizi);


        System.out.println("Dizinin En Büyük Elemanı: ");
        int ilk = dizi[0];
        int son = dizi[9999];
        int orta = (ilk+son)/2;
        for(int i=0;i<10000;i++){
            son = dizi[i];
            if(orta<son){
                orta = dizi[i];
            }
        }
        System.out.println(son);
    }
}
