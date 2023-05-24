package day25inheritiance;

public class C02_Isci extends C03_Muhasebe{

    protected String isciStatu ="Surekli Isci";

    protected  void mesai(){
        System.out.println("Isciler her çağırıldıklarında haftada 5 gün çalışır");
    }

    public static void main(String[] args) {
        C02_Isci isci1 = new C02_Isci();

        isci1.isim="orhan";
        isci1.soyIsim="demir";
        isci1.adres="Izmir";
        isci1.telNo="234234234";
        isci1.personelNo=07;

        isci1.calismaSaati=12;
        isci1.saatUcreti=20;
        isci1.isciStatu="isci";
        System.out.println(isci1);
        System.out.println("işci maaşı = " + isci1.maasHesapla());
    }

    @Override
    public String toString() {
        return "C02_Isci{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }
}
