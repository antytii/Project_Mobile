package com.sitihajar_f55123063.wonderland_sulteng;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar; // Gunakan Toolbar dari androidx
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ExploreFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<ExploreItem> itemList;

    public ExploreFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemList = new ArrayList<>();
        loadData();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_explore, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("Explore");
        } else {
            Log.e("ExploreFragment", "Toolbar not found");
        }

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ExploreAdapter adapter = new ExploreAdapter(itemList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void loadData() {
        itemList.add(new ExploreItem(R.drawable.airterjuntalokan, "Kabupaten Buol, Air Terjun Talokan", "Desa Talokan dikenal dengan Air Terjun Talokan yang megah, dengan ketinggian sekitar 50 meter.\n" +
                "Berlokasi sekitar 200 meter dari bibir pantai, air terjun ini menjadi tujuan liburan populer bagi warga sekitar\n" +
                "dan wisatawan luar daerah.Menariknya, air terjun ini\n" +
                "terletak di pinggir jalan, sehingga pengendara di jalur\n" +
                "Trans Sulawesi bisa menikmati pemandangannya. Banyak pelintas berhenti sejenak untuk berfoto dan mengabadikan momen di sini."));

        itemList.add(new ExploreItem(R.drawable.pantaipoganda, "Kabupaten Banggai, Pantai Poganda", "Pantai ini terletak di Kecamatan Bulagi Utara, Pantai Poganda menawarkan\n" +
                "hamparan pasir putih dan pemandangan jejeran pohon kelapa. Menurut Dinas\n" +
                "Pariwisata Baggai Kepulauan, ombak di Pantai Poganda cukup tenang sehingga\n" +
                "aman untuk dikunjungi wisatawan dari manapun."));

        itemList.add(new ExploreItem(R.drawable.padanglaya, "Kabupaten Banggai Laut, Padang Laya", "Jika ingin menikmati keindahan alam dari ketinggian, wajib datang ke bukit\n" +
                "Padang Laya yang terletak di Dangkalan, Kecematan Banggai, Kabupaten\n" +
                "Banggai Laut. Padang Laya menawarkan pemandangan bukit dan rerumputan\n" +
                "yang indah, disini juga dapat menikmati sunrise dan sunset yang indah."));

        itemList.add(new ExploreItem(R.drawable.tanjungkarang, "Kabupaten Donggala, Tanjung Karang", "Objek wisata Pantai Tanjung Karang, Kabupaten Donggala, Sulawesi Tengah,\n" +
                "menjadi tujuan wisatawan saat libur akhir pekan. Pantai dengan pesona pasir putih\n" +
                "itu berjarak 40 kilometer dari pusat Kota Palu. Di Pantai Tanjung Karang, terdapat\n" +
                "sejumlah villa yang bisa digunakan pengunjung jika ingin bermalam. Selain\n" +
                "berenang, pengunjung juga dapat menikmati berbagai wahana air yang\n" +
                "disediakan. Seperti, banana boat, perahu, dan peralatan snorkeling."));

        itemList.add(new ExploreItem(R.drawable.airterjunpofaa, "Kabupaten Morowali, Air Terjun Pofa'a", "Air terjun Pofua’a menjadi salah satu wisata terbaik yang berada di Kabupaten\n" +
                "Morowali Sulawesi Tengah. Panoramanya yang alami seketika membuat\n" +
                "pengelihatan siapa saja akan menjadi terpesona waktu berada ditempat itu.\n" +
                "Menapaki pinggir aliran sungai air terjun akan dilihat sejumlah pondok panggung\n" +
                "yang berukuran sederhana yang terbuat dari kayu. Bangunan itu disediakan buat\n" +
                "para pengunjung, dan sangat cocok sekali ditempati buat duduk beristirahat\n" +
                "sembari memandangi alam sekitarnya."));

        itemList.add(new ExploreItem(R.drawable.pantaikucing, "Kabupaten Parigi Moutong, Pantai Kucing", "Pantai Kucing Parigi Moutong terletak di Desa Tandaigi, Kecamatan Siniu,\n" +
                "Kabupaten Parigi Moutong Sulawesi Tengah. Pantai Kucing berhadapan langsung\n" +
                "dengan Teluk Tomini yang memiliki pasir putih dan terumbu karang. Pengunjung\n" +
                "dapat melakukan diving untuk menikmati pemandangan bawah laut di sini.\n"));

        itemList.add(new ExploreItem(R.drawable.danautambing, "Kabupaten Poso, Danau Tambing", "Danau Tambing memiliki 3 keunggulan yang berada pada satu ekosistem yaitu\n" +
                "alam, danau, dan burung. Danau Tambing memiliki keanekaragaman makhluk\n" +
                "hidup, seperti spesies burung. Dengan lebih dari 260 jenis burung, membuat\n" +
                "tempat ini dijuluki “Surga Burung”. 30 persen di antara spesies burung tersebut\n" +
                "adalah jenis endemik, artinya 30 persen jenis burung yang ada di Tambing, hanya\n" +
                "ada dan berkembang biak di sekitar Danau Tambing.\n"));

        itemList.add(new ExploreItem(R.drawable.puncakmatantimali, "Kabupaten Sigi, Puncak Matantimali", "Puncak Matantimali adalah tempat wisata alam yang menawarkan beragam\n" +
                "aktivitas seru, terutama paralayang dan camping. Dengan ketinggian mencapai\n" +
                "1.100 meter di atas permukaan laut, Puncak Matantimali memanjakan pengunjung\n" +
                "dengan panorama spektakuler kota Palu yang terbentang di bawahnya. Tempat ini\n" +
                "telah menjadi pilihan yang sangat diminati oleh warga dan pengunjung untuk\n" +
                "berlibur dan menyaksikan kecantikan alam yang disuguhkan dari ketinggian ini.\n" +
                "Puncak Matantimali juga dikenal sebagai salah satu spot terbaik untuk kegiatan\n" +
                "paralayang di Asia. Bagi para penggemar olahraga ekstrem ini, tempat ini adalah\n" +
                "surga yang tak boleh dilewatkan. Mereka dapat merasakan sensasi terbang bebas\n" +
                "sambil menikmati pemandangan indah di bawahnya.\n"));

        itemList.add(new ExploreItem(R.drawable.pulaukapas, "Kabupaten Tol-toli, Pulau Kapas", "Destinasi wisata yang terletak di Desa Kapas, Kecamatan Dakopamean, pulau ini\n" +
                "memiliki panorama pasir putih dan air laut yang bening berwarna biru muda.\n" +
                "Tumbuhan alga yang hidup di air laut di sekitar pulau menambah keindahan pulau\n" +
                "tersebut. Air laut yang tenang membuat wisatawan bisa puas berenang atau\n" +
                "snorkeling di tempat ini, menyaksikan matahari terbenam juga menciptakan\n" +
                "sensasi tersendiri dari pulau yang berjarak 10 menit dari dermaga desa.\n"));

        itemList.add(new ExploreItem(R.drawable.puncangsalena, "Kota Palu, Puncak Salena", "Salena merupakan destinasi wisata yang menyajikan keindahan alam khas\n" +
                "pegunungan dengan panorama yang begitu menawan. Dari atas Paralayang\n" +
                "Salena, kamu bisa menikmati keindahan Teluk Palu dan suasana Kota Palu yang\n" +
                "begitu eksotis. Puncak bukit ini juga sering digunakan sebagai landasan untuk\n" +
                "olahraga paralayang yang cukup memicu adrenalin. Selain difungsikan sebagai\n" +
                "tempat wisata olahraga khusunya paralayang, Bukit Salena juga akan\n" +
                "dikembangkan untuk wisata sepeda gunung, motor trail, dan juga outbound.\n"));

        itemList.add(new ExploreItem(R.drawable.danaumariona, "Kabupaten Tojo Una-una, Danau Mariona", "Danau mariona adalah danau yang dihuni oleh ubur-ubur tak menyengat \n" +
                "merupakan salah satu keindahan alam yang menjadi mimpi banyak orang untuk \n" +
                "mengunjunginya, Nah! Sobat Touna, taugak sih, kenapa danau yang luasnya \n" +
                "±6.07ha ini menjadi impian bagi mereka yang menyukai travelling/snorkeling? \n" +
                "karena keindahan yang ditawarkan di Pulau Ubur-Ubur ini bisa kita nikmati tidak \n" +
                "hanya dari kejauhan, tapi bermain atau berenang bersama makhluk kecil tidak \n" +
                "menyengat dan menggemaskan ini bisa kalian jumpai dengan snorkeling dan \n" +
                "freedive.,  \n"));

        itemList.add(new ExploreItem(R.drawable.teluktomori, "Kabupaten Morowali Utara, Teluk Tomori", "Teluk Tomori yang terletak di kabupaten Morowali Utara (Morut) mencuri\n" +
                "perhatiaan para wisatawan baik lokal maupun manca Negara.Keberadaan\n" +
                "sejumlah pulau-pulau kecil di seputaran wilayah teluk Tomori melengkapi\n" +
                "keindahan hamparan teluk Tomori. Letak teluk yang menjorok masuk ke dalam,\n" +
                "jauh dari perairan laut lepas, menjadikan perairan Teluk Tomori yang tenang\n" +
                "cocok untuk pengembangan wisata air.,  \n"));

        itemList.add(new ExploreItem(R.drawable.pantaipompon, "Kabupaten Banggai Kepulauan, Pantai Pompon", "Pantai Pompon terletak di Desa Lalong, Kecamatan Tinangkung Utara,\n" +
                "Kabupaten Banggai Kepulauan, Jaraknya sekitra 90 km dari pusat Kabupaten,\n" +
                "dengan keindahan bawah laut yang lestari dengan aneka ragam biota laut,\n" +
                "wisatawan dapat menikmati dengan berbagai aktifvitas, seperti, berenang,\n" +
                "snorkeling, scuba diving, naik perahu, dan sepeda air.\n,  \n"));
    }
}
