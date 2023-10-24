public class Library {

  protected String name;
  protected String address;
  protected int since;

  Library(String name, String address, int since) {
    this.name = name;
    this.address = address;
    this.since = since;
  }

  // Constructor overloading
  Library(String name, String address) {
    this(name, address, 0);
  }

  // Constructor overloading
  Library(String name) {
    this(name, null, 0);
  }

  public void description(String description) {
    System.out.println(description);
  }

  public int year(int since, int now) {
    int result = now - since;
    // System.out.println("Berdiri selama " + result + " Tahun");
    return result;
  }
}
