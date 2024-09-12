import java.util.Scanner;

class Book {
private String title;
private String author;
private int year;
private String genre;
private static int totalBooks = 0;

public Book(String title, String author, int year, String genre) {
this.title = title;
this.author = author;
this.year = year;
this.genre = genre;
totalBooks++;
}

public void displayBookDetails() {
System.out.println("Title: " + title);
System.out.println("Author: " + author);
System.out.println("Year: " + year);
System.out.println("Genre: " + genre);

}

public static void displayTotalBooks() {
System.out.println("Total number of books: " + totalBooks);
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String[] genres = {"Romance", "Science Fiction", "Fantasy"};
String[] authors = {"Rabindranath Thakur", "Zafar Iqbal", "Shariful Hasan"};
int[] years = {1929, 2024, 2018};

Book[] books = new Book[3];
int count = 0;

while (count < 3) {
System.out.print("Enter the title for book " + (count + 1) + ": ");
String title = scanner.nextLine();

if (count < genres.length) {
books[count] = new Book(title, authors[count], years[count], genres[count]);
} else {
System.out.println("No more predefined genres, authors, or years.");
break;
}

count++;
}

System.out.println("\nBook Details:");
for (int i = 0; i < count; i++) {
if (books[i] != null) {
books[i].displayBookDetails();
System.out.println();
} else {
System.out.println("Book " + (i + 1) + " details not available.");
}
}

Book.displayTotalBooks();
}
}