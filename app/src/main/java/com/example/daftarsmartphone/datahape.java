package com.example.daftarsmartphone;

import java.util.ArrayList;

public class datahape {
    public static String[][] data = new String[][]{
            {"Uzumaki Naruto","Klan Uzumaki","Uzumaki Naruto adalah tokoh fiktif dari serial anime dan manga Naruto. Ia merupakan tokoh utama dalam serial ini. Ia digambarkan sebagai bocah berambut pirang dan bermata biru. Di pipinya ada semacam guratan yang mirip seperti kumis milik karakter Doraemon dalam manga Doraemon. Ia sering terlihat memakai jaket dan celana panjang berwarna jingga. Di dahinya ada ikat kepala berwarna biru dengan lambang desa kelahirannya.\n" +
                    "\n" +
                    "Menurut cerita, Naruto adalah seorang ninja dari desa Konoha (Konohagakure), sebuah desa fiktif yang konon tersembunyi di antara rimbunnya dedaunan hutan. Sejak kecil ia ditinggal oleh kedua orang tuanya, sehingga ia tidak pernah merasakan bagaimana kasih sayang orang tua kepada anaknya. Dengan dukungan dari teman-teman dan guru-gurunya, Naruto tumbuh menjadi pemuda yang ceria, optimis, dan pemberani. Masashi Kishimoto, pengarang serial manga ini, dikutip dari wawancara terbaru dari Shonen Jump Amerika mengatakan bahwa kehidupannya seperti Naruto ketika dia seumuran dengannya.","https://upload.wikimedia.org/wikipedia/id/3/36/Naruto_Uzumaki.png"},

            {"Uchiha Sasuke","Klan Uchiha","Uchiha Sasuke adalah seorang karakter fiktif dari komik dan anime Naruto. Nama depan Sasuke, konon berasal dari nama seorang ninja legendaris, Sarutobi Sasuke. Sedangkan nama belakangnya, \"Uchiha\" dibaca sebagai \"uchiwa\", atau \"kipas kertas\" (kipas yang terbuat dari kertas). Pada zaman Jepang Kuno, uchiwa seringkali dipakai dalam upacara kerajaan, sebagai souvenir, atau digunakan untuk melindungi prajurit dari serangan anak panah. Namun menurut filosofi dalam komik Naruto, \"uchiwa\" adalah sebuah kipas yang mampu mengobarkan bara menjadi api, yang menggambarkan kemampuan klan Uchiha yang mampu menggemblang keturunan mereka menjadi seorang ninja yang hebat.","http://pluspng.com/img-png/sasuke-png-sasuke-part-i-png-350.png"},
            {"Haruno Sakura","Tidak ada Klan","Haruno Sakura adalah salah satu tokoh fiksi dari seri manga & anime Naruto. Dia adalah seorang ninja wanita yang tergabung dalam Tim 7 bersama Naruto Uzumaki dan Sasuke Uchiha di bawah bimbingan Kakashi Hatake. Dia juga adalah seorang ninja medis di bawah bimbingan Tsunade.","https://upload.wikimedia.org/wikipedia/id/2/2a/Sakura_Haruno.png"},
            {"Nara Shikamaru","Klan Nara","Nara Shikamaru adalah salah satu tokoh protagonis dalam serial manga dan anime Naruto. 'Shika' berarti rusa dan 'maru' bisa berarti lingkaran atau \"berkembang dengan baik\" tetapi biasa digunakan sebagai nama anak lelaki. Nara juga adalah salah satu nama prefektur dan kota di Jepang yang memiliki taman dengan banyak rusa.\n" +
                    "\n","https://upload.wikimedia.org/wikipedia/id/thumb/9/9a/Shikamaru_Nara.png/240px-Shikamaru_Nara.png"},
            {"Yamanaka Ino","Klan Yamanaka","Yamanaka Ino adalah tokoh fiktif di serial anime dan manga Naruto. Seiyuu Ino adalah Ryouka Yuzuki, yang juga telah mengisi suara berbagai anime di Jepang. Pada kemunculan awal, jurus-jurus yang dikeluarkan Ino adalah jurus andalan klannya, yaitu shintenshin dan juga jurus-jurus ninja lainnya.", "https://upload.wikimedia.org/wikipedia/id/thumb/5/52/Ino_Yamanaka.png/240px-Ino_Yamanaka.png"},
            {"Akimichi Chouji","Klan Akimichi","Akimichi Chouji adalah nama seorang ninja fiktif dari serial anime dan manga Naruto. Dia adalah salah satu anggota Tim Asuma yang dibimbing oleh Asuma Sarutobi.","https://upload.wikimedia.org/wikipedia/id/thumb/9/96/Choji_Akimichi.png/280px-Choji_Akimichi.png"},
            {"Hyuuga Hinata","Klan Hyuuga","Hyuuga Hinata adalah tokoh fiksi dari anime dan manga yang berjudul Naruto karya Masashi Kishimoto. Hinata adalah salah keturunan dari klan Hyuga. Ia memiliki seorang adik bernama Hanabi Hyuuga, dan ayah bernama Hiashi Hyuuga. Saudara sepupunya bernama Neji Hyuuga. Neji Hyuuga pernah melawannya saat ujian Chunnin berlangsung. Hinata memiliki status souke di klan Hyuuga. Ia adalah seorang perempuan ningrat yang memiliki harga diri yang tinggi.","https://upload.wikimedia.org/wikipedia/id/thumb/c/c8/Hinata_Hyuga.png/240px-Hinata_Hyuga.png"},
            {"Inuzaka Kiba","Klan Inuzaka","Inuzaka Kiba adalah salah satu karakter dalam cerita fiksi dan manga Naruto. Inuzuka bisa diartikan 'klan/perkumpulan anjing' yang dipakai sebagai salah satu nama klan yang cukup kuat pada zaman Edo. Mereka dikenal sebagai 'pejuang anjing' dan menyembah 'Inu' atau anjing dalam perlambangan zodiak. 'Inuzuka' juga sebuah nama dalam cerita Hakkenden, novel seekor samurai anjing. 'Kiba' berarti 'taring'.","https://upload.wikimedia.org/wikipedia/id/thumb/2/22/Kiba_Inuzuka.png/240px-Kiba_Inuzuka.png"},
            {"Aburame Shino","Klan Aburame","Aburame Shino adalah salah satu tokoh protagonis dalam manga dan anime Naruto. Shino adalah nama yang diberikan oleh samurai Inuzuka yang ada dalam cerita Hakkenden, cerita tentang samurai anjing. 'Aburame' berarti 'Wanita Minyak' sedangkan nama lengkapnya 'Aburame Shino' hampir menyerupai nama Jepang untuk kecoak.","https://upload.wikimedia.org/wikipedia/id/thumb/f/f0/Shino_Aburame.png/240px-Shino_Aburame.png"},
            {"Hyuuga Neji","Klan Hyuuga","Neji Hyuuga adalah nama seorang tokoh fiktif dalam anime dan manga Naruto. Neji adalah seorang genin yang genius. Ia berasal dari klan Hyuga, dan masih sekerabat dengan Hinata Hyuuga.","https://upload.wikimedia.org/wikipedia/id/1/18/Neji_Hyuga.png"},

    };

    public static ArrayList<hape> getListData(){
        ArrayList<hape> list = new ArrayList<>();
            for (String[] aData : data){
                hape hape = new hape();
                hape.setNama(aData[0]);
                hape.setKlan(aData[1]);
                hape.setDeskripsi(aData[2]);
                hape.setFoto(aData[3]);

                list.add(hape);
            }

            return list;
    }
}
