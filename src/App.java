public class App {

  public static void main(String[] args) throws Exception {
    // Parent class
    Library library = new Library("Perpusnas", "Jakarta", 2000);
    System.out.println("Nama : " + library.name);
    System.out.println("Alamat : " + library.address);
    System.out.println("Tahun Berdiri : " + library.since);

    library.description(
      "Perpusnas merupakan perpustakaan terbesar di indonesia"
    );
    System.out.println("Berdiri selama " + library.year(2000, 2023) + " tahun");

    System.out.println("\n================================\n");

    // Child class
    Book book = new Book("Hilang Dalam Dekapan Semeru", 224, "Fajar Aditya");
    System.out.println("Judul : " + book.title);
    System.out.println("Jumlah Halaman : " + book.number_of_pages);
    System.out.println("Penulis : " + book.author);

    book.description(
      "Buku ini memiliki kumpulan cerita yang sangat mencekam dan juga menyedihkan. Setiap tokoh yang ditulis dalam buku sebenarnya sudah banyak dikenal lewat siaran YouTube RJL 5."
    );

    book.synopsis(
      "Perasaannya sangat tak menentu campur aduk menjadi satu. Arif tidak menyangka kalau arwah yang saat itu datang pada jelangkung tersebut adalah arwah dari Bang Daing."
    );
  }
}
