/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan40.warnakepribadian;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi class warna kepribadian
 */
class warnaKepribadian {
    //kode warna teks
    public static final String ANSI_RESET = "\u001B[0m" ;
    public static final String ANSI_BLACK = "\u001B[30m" ;
    public static final String ANSI_RED = "\u001B[31m" ;
    public static final String ANSI_GREEN = "\u001B[32m" ;
    public static final String ANSI_YELLOW = "\u001B[33m" ;
    public static final String ANSI_BLUE = "\u001B[34m" ;
    public static final String ANSI_PURPLE = "\u001B[35m" ;
    public static final String ANSI_CYAN = "\u001B[36m" ;
    public static final String ANSI_WHITE = "\u001B[37m" ;
    
    //kode warna latar
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m" ;
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m" ;
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m" ;
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m" ;
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m" ;
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m" ;
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m" ;
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m" ;
    
 public static void kepribadian(String warnaPribadi){
 String warna = warnaPribadi.toUpperCase();
     System.out.println("warna Favoritmu Adalah : ");
     switch (warna){
            case "MERAH" :
                  System.out.println(ANSI_RED+" Merah "+ANSI_RESET);
                  System.out.println("1. Periang.");
                  System.out.println("2. Pemberani.");
                  System.out.println("3. Berani Mengambil Resiko.");
                  System.out.println("4. Menyukai Tantangan.");
                  System.out.println("5. Kurang Sabar.");
                  System.out.println("6. Dapat Menahan Marah Namun Jika Sudah Tahap Puncak"
                          + "toleransi, Kemarahannya akan sulit dikontrol.");
                  System.out.println("7. Memiliki Energi kehangatan dan Cinta.");
            break; 
            case "HIJAU" :
                  System.out.println(ANSI_GREEN+" HIJAU "+ANSI_RESET);
                  System.out.println("1. Romantis.");
                  System.out.println("2. Menyukai hal yang berbau alami dan keindahan.");
                  System.out.println("3. Teguh Pada Prinsip.");
                  System.out.println("4. Menginkan Kesempurnaan.");
                  System.out.println("5. Mudah Cemburu.");
                  System.out.println("6. Mudah Merasa Iri");
                  System.out.println("7. Menjunjung Tinggi Suatu Nilai toleransi"
                          + "dan Kepercayaan.");
            break;
            case "KUNING" :
                  System.out.println(ANSI_YELLOW+" KUNING "+ANSI_RESET);
                  System.out.println("1. Optimis.");
                  System.out.println("2. Suka Bergaul.");
                  System.out.println("3. Periang.");
                  System.out.println("4. Senang Menolong.");
                  System.out.println("5. Lincah dan Aktif.");
                  System.out.println("6. Tidak Suka Meremahkan kekurangan Orang Lain");
                  System.out.println("7. loyal.");
                  System.out.println("8. Hangat.");
                  System.out.println("9. Meskipun karakternya optimis dan idealis"
                          + "seringkali goyah dan tidak stabil.");
                  System.out.println("10. Cenderung Penakut");
            break; 
           case "BIRU" :
                  System.out.println(ANSI_BLUE+" BIRU "+ANSI_RESET);
                  System.out.println("1. Menyenangkan.");
                  System.out.println("2. Bijaksana.");
                  System.out.println("3. Pembawaan diri tenang saat menghadapi masalah.");
                  System.out.println("4. Dinamis.");
                  System.out.println("5. Senang berbagi.");
                  System.out.println("6. Bersahabat.");
                  System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang.");
                  System.out.println("8. Menyembunyikan perasaan karena Karakternya yang "
                          + "Cenderung mencari jalan damai");
            break;
            case "UNGU" :
                  System.out.println(ANSI_PURPLE+" UNGU "+ANSI_RESET);
                  System.out.println("1. Optimis.");
                  System.out.println("2. Tidak Pernah Ragu.");
                  System.out.println("3. Menurutnya Pasangan yang ideal adalah"
                          + " yang memiliki mental yang kuat.");
                  System.out.println("4. Memiliki Ambisi yang Besar.");
                  System.out.println("5. Memiliki empati yang besar.");
                  System.out.println("6. Memiliki sisi misterius sebab seringkali"
                          + " menutupi perasaannya.");
                  System.out.println("7. terkadang bersikap keras kepala dan angkuh.");
            break;
            
            default :
                System.out.println("");
                System.out.println("OOPS.. belum teridentifikasi");
                break;
        }       
 }
}
