package Chapter2;

import java.awt.print.Book;

public class BookStore {

	public static void printBooks(BookLibrary[] books) {
		for (BookLibrary b:books){
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		BookLibrary[]  a=  new BookLibrary[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new BookLibrary();
		}
		a[4] = new BookLibrary ("DATE A LIFE 19" , "Koushi Tachibana", 35.9);
		a[5] = new BookLibrary();
		printBooks(a);
	}

}
