package com.bridgelabz;
import java.util.*;

public class BookMain {
	public static void main(String args[]) {
		List<BookDetails>list=new ArrayList<BookDetails>();
		BookDetails B1=new BookDetails("Ramayana","Valmiki","octuber","MYthology");
		BookDetails B2=new BookDetails("Data Communication","Frozen","Feb","Engineering");
		BookDetails B3=new BookDetails("Operating system","wiley","January","computer science");
		
		list.add(B1);
		list.add(B2);
		list.add(B3);
		for(BookDetails b:list) {
			System.out.println(b.BookName+" "+b.AuthorName+" "+b.ReleaseDate+" "+b.Genre);
		}
	}

}
