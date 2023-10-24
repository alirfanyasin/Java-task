public class Book extends Library {

  String title;
  int number_of_pages;
  String author;

  Book(
    String title,
    int number_of_pages,
    String author,
    String name,
    String address,
    int since
  ) {
    super(name, address, since);
    this.title = title;
    this.number_of_pages = number_of_pages;
    this.author = author;
  }

  // Constructor overloading
  Book(String title, int number_of_page, String author) {
    super(title, author, number_of_page);
    this.title = title;
    this.number_of_pages = number_of_page;
    this.author = author;
  }

  // Constructor overloading
  Book(String title, String author) {
    this(title, 0, author);
  }

  // Method overriding
  @Override
  public void description(String description) {
    System.out.println(description);
  }

  public void synopsis(String synopsis) {
    System.out.println(
      "Synopsis dari judul buku " + this.title + " : " + synopsis
    );
  }
}
