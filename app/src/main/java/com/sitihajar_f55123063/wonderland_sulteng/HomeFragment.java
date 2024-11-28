package com.sitihajar_f55123063.wonderland_sulteng;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        TextView homeTitle = view.findViewById(R.id.homeTitle);
        TextView homeDescription = view.findViewById(R.id.homeDescription);

        homeDescription.setText(getHomeDescription());
        return view;
    }

    private String getHomeDescription() {
        return "Wonderful SulTeng merupakan singkatan dari Wonderful Sulawesi Tengah yang\n" +
                "merupakan kampanye pariwisata yang bertujuan untuk memperkenalkan dan\n" +
                "mempromosikan potensi wisata di Sulawesi Tengah sebagai destinasi unik yang\n" +
                "kaya akan keindahan alam dan pengalaman tak terlupakan. Dengan fokus pada\n" +
                "daya tarik wisata alam, kampanye ini dirancang untuk mengundang wisatawan\n" +
                "domestik dan internasional menjelajahi pesona daerah yang sering kali masih\n" +
                "tersembunyi dari radar pariwisata utama Indonesia.\n\n" +
                "Tujuan Kampanye Dari Wonderful SulTeng:\n" +
                "1. Meningkatkan Kesadaran Global: Memperkenalkan Sulawesi Tengah sebagai destinasi wisata unik.\n" +
                "2. Meningkatkan Kunjungan Wisata: Mendorong lebih banyak wisatawan untuk datang.\n" +
                "3. Memperkuat Ekonomi Lokal: Membuka peluang usaha bagi masyarakat setempat.\n" +
                "4. Pelestarian Alam dan Budaya: Menjaga kelestarian lingkungan dan budaya lokal.\n";
    }
}
