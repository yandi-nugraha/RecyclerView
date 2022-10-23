package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Kendaraan> kendaraans = new ArrayList<>();
    private KendaraanAdapter kendaraanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        kendaraanAdapter = new KendaraanAdapter(this, kendaraans);
        recyclerView = findViewById(R.id.rv_kendaraan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(kendaraanAdapter);
    }

    private void addData() {
        kendaraans.add(new Kendaraan("Sepeda Motor", "Kendaraan darat", "Sepeda motor adalah kendaraan beroda dua yang digerakkan oleh sebuah mesin. Letak kedua roda sebaris lurus dan pada kecepatan tinggi sepeda motor tetap stabil disebabkan oleh gaya giroskopik. Sedangkan pada kecepatan rendah, kestabilan atau keseimbangan sepeda motor bergantung kepada pengaturan setang oleh pengendara. Penggunaan sepeda motor di Indonesia sangat populer karena harganya yang relatif murah, terjangkau untuk sebagian besar kalangan dan penggunaan bahan bakarnya, serta biaya operasionalnya cukup hemat.", R.drawable.ic_motor));
        kendaraans.add(new Kendaraan("Traktor", "Kendaraan darat", "Traktor adalah kendaraan yang didesain secara spesifik untuk keperluan traksi tinggi pada kecepatan rendah, atau untuk menarik trailer atau implemen yang digunakan dalam pertanian atau konstruksi. Istilah ini umum digunakan untuk mendefinisikan suatu jenis kendaraan untuk pertanian. Instrumen pertanian umumnya digerakkan dengan menggunakan kendaraan ini, ditarik ataupun didorong, dan menjadi sumber utama mekanisasi pertanian. Istilah umum lainnya, \"unit traktor\", yang mendefinisikan kendaraan truk semi-trailer.", R.drawable.ic_traktor));
        kendaraans.add(new Kendaraan("Bus", "Kendaraan darat", "Bus atau omnibus, (disebut juga multibus atau motorbus; ejaan tidak baku bis; sering juga dilafalkan sebagai /bas/ atau /bəs/) adalah kendaraan darat yang dirancang untuk mengangkut banyak penumpang. Bus dapat memiliki kapasitas hingga 300 penumpang. Jenis bus yang paling umum adalah bus tunggal satu lantai; bila muatan yang diangkut lebih besar uumnya dilayani bus bertingkat dan gandeng, dan muatan yang lebih kecil dibawa oleh midibus dan minibus; bus besar digunakan untuk layanan jarak jauh. Banyak jenis bus, seperti bus transit perkotaan dan bus antarkota, menarik tarif. Jenis lain, seperti bus sekolah atau bus kampus tidak selalu menarik tarif. Di banyak yurisdiksi, sopir bus memerlukan SIM atau izin khusus di atas SIM reguler.", R.drawable.ic_bus));
        kendaraans.add(new Kendaraan("Pesawat", "Kendaraan udara", "Pesawat terbang (bahasa Inggris: Airplane) adalah pesawat udara yang lebih berat dari udara, bersayap tetap, dan dapat terbang dengan tenaga sendiri. Secara umum istilah pesawat terbang sering juga disebut dengan pesawat udara, kapal terbang atau pesawat saja, dengan tujuan pendefenisian yang sama sebagai kendaraan yang mampu terbang di atmosfer atau udara. Namun dalam dunia penerbangan, istilah pesawat terbang berbeda dengan pesawat udara, istilah pesawat udara jauh lebih luas pengertiannya karena telah mencakup pesawat terbang dan helikopter.", R.drawable.ic_pesawat));
        kendaraans.add(new Kendaraan("Kapal", "Kendaraan air", "Kapal (bahasa Inggris: Ship) adalah kendaraan pengangkut penumpang dan barang di laut (sungai dsb)[1] seperti halnya sampan atau perahu yang lebih kecil. Kapal biasanya cukup besar untuk membawa perahu kecil seperti sekoci. Sedangkan dalam istilah inggris, dipisahkan antara ship yang lebih besar dan boat yang lebih kecil. Secara kebiasaannya kapal dapat membawa perahu tetapi perahu tidak dapat membawa kapal. Ukuran sebenarnya di mana sebuah Perahu disebut Kapal selalu ditetapkan oleh undang-undang dan peraturan atau kebiasaan setempat.", R.drawable.ic_kapal));
        kendaraans.add(new Kendaraan("Mobil", "Kendaraan darat", "Mobil (bahasa Belanda: Mobiel) adalah kendaraan yang menggunakan bahan bakar untuk menghidupkan mesinnya. Mobil kependekan dari otomobil yang berasal dari Bahasa Yunani 'autos' (sendiri) dan Latin 'movére' (bergerak).", R.drawable.ic_mobil));
        kendaraans.add(new Kendaraan("Kereta Api", "Kendaraan darat", "Kereta api adalah sarana transportasi berupa kendaraan dengan tenaga gerak, baik berjalan sendiri maupun dirangkaikan dengan kendaraan lainnya, yang akan ataupun sedang bergerak di rel. Kereta api merupakan alat transportasi massal yang umumnya terdiri dari lokomotif (kendaraan dengan tenaga gerak yang berjalan sendiri) dan rangkaian kereta atau gerbong (dirangkaikan dengan kendaraan lainnya). Rangkaian kereta atau gerbong tersebut berukuran relatif luas sehingga mampu memuat penumpang maupun barang dalam skala besar. Karena sifatnya sebagai angkutan massal efektif, beberapa negara berusaha memanfaatkannya secara maksimal sebagai alat transportasi utama angkutan darat baik di dalam kota, antarkota, maupun antarnegara.", R.drawable.ic_kereta));
        kendaraans.add(new Kendaraan("Truk Damkar", "Kendaraan darat", "Kendaraan-kendaraan Pemadam Kebakaran tergolong sebagai kendaraan unit gawat darurat. Tipe kendaraaan ini biasanya truk yang bagian belakang merupakan penyimpanan air, dan kendaraan ini umumnya berwarna merah. Ada beberapa tipe kendaraan yang digunakan di kesatuan pemadam kebakaran seperti:\n" +
                "\n" +
                "mobil pick-up double cabin atau SUV yang digunakan untuk membawa perwira/komando pemadam kebakaran,\n" +
                "truk pemadam kebakaran dengan ukuran kecil dan besar sebagai unit pembawa air (unit tanker),\n" +
                "truk pemompa dan penyimpan air (biasanya dapat memompa air dari Hidran dan sumber air lainya) disebut Pump Unit\n" +
                "truk dan mobil pembawa alat-alat dan perlengkapan (selang, palu, gergaji, p3k, lampu, dll) pemadam kebakaran,\n" +
                "truk pembawa tangga (unit ladder),\n" +
                "serta kendaraan pembantu operasional lainya seperti: ambulans milik pemadam kebakaran.", R.drawable.ic_truk_damkar));
        kendaraans.add(new Kendaraan("Sepeda", "Kendaraan darat", "Sepeda (bahasa Inggris: Bicycle) adalah kendaraan beroda dua atau tiga yang mempunyai setang (Kendali), tempat duduk, dan sepasang pengayuh yang digerakkan kaki untuk menjalankannya.", R.drawable.ic_sepeda));
        kendaraans.add(new Kendaraan("Perahu", "Kendaraan air", "Perahu adalah kendaraan air yang biasanya lebih kecil dari kapal laut. Beberapa perahu biasanya dibawa oleh kapal laut. Akan tetapi kata perahu ini sebenarnya mengalami penyempitan makna, karena setidaknya sampai abad ke-17, perahu merujuk kepada kapal besar (lihat K'un-lun po/perahu Kunlun), bahkan galleon Barat pun dulunya dikategorikan sebagai perahu, sampai digantikan oleh kata \"kapal\" pada bahasa Indonesia dan bahasa Melayu modern, yang sejatinya berasal dari rumpun bahasa Dravida \"kappal\". Kata ini mulai muncul pada literatur Tamil sebagai kata கப்பல் (kappal) setelah abad ke-17. \"Kapal\" dulunya digunakan untuk merujuk pada kendaraan air dari pesisir Koromandel (pantai Timur India), dari bahasa Telugu atau Telinga, yang memiliki sistem layar persegi (square-rigged vessel).:66, 379 Kendaraan yang disebut \"perahu\" pada masa modern, dulu disebut sebagai sampan (berasal dari kata China 舢舨).", R.drawable.ic_perahu));
    }
}