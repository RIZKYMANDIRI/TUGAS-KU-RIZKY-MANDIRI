package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;


public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }
    private static List<Ayam> initDataAyam(Context ctx) {
        List<Ayam> Ayams= new ArrayList<>();
        Ayams.add(new Ayam("Cemani", "indonesia",
                "Inilah jenis ayam khas dan asli milik negara kita, Indonesia. Asal nama cemani sendiri berasal dari bahasa Sansekerta yang jika diterjemahkan ke dalam bahasa Indonesia berarti hitam legam.\n" , R.drawable.ayam_cemani));
        Ayams.add(new Ayam("cochin", "china",
                "  Ayam jenis cochin memiliki bobot 4,5-5 kg untuk yang berjenis kelamin jantan dan 3,5-4 kg untuk yang berjenis kelamin betina.",R.drawable.ayam_cochin));
        Ayams.add(new Ayam("orpingthon", "orpingthon",
                "ayam ini adalah hasil dari persilangan antara ayam Minorca yang berkelamin jantan dengan dengan ayam Plymouth Rock betina berwarna hitam dan kemudian dari hasilnya persilangan kedua ayam tersebut dipersilangkan lagi dengan Ayam Langshan. ", R.drawable.ayam_orpingthon));
        Ayams.add(new Ayam("polish", "poland",
                "Ciri khas ayam poland yang paling menonjol adalah jambul di kepalanya yang bisa ditata dengan beragam bentuk. Bentuk jambulnya memang nyentrik.", R.drawable.ayam_polish));
        Ayams.add(new Ayam("salkiehen", "china",
                "Salah satu keunikan dari ayam silkia adalah dia memiliki jari yang berjumlah 5, berbeda dengan jenis ayam lainnya yang rata-rata memiliki jumlah jari sebanyak 4 saja. Keunikan lainnya adalah apabila kita cabut semua bulunya tersebut, maka dagingnya memiliki kemiripan dengan daging ayam cemani yaitu sama-sama memiliki warna hitam dan gelap baik kulit, ceker, paruh maupun organ dalamnya.", R.drawable.ayam_selkiehen));

                return Ayams;
    }

        private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataAyam(ctx));

    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
