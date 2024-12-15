package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookReviewAnalysis {

	public static void main(String[] args) {

		List<BookReview> list = Arrays.asList(new BookReview("book1", 4.5, "Great Book!"),
				new BookReview("book1", 3.8, "Good Book!"), new BookReview("book2", 2.5, "Not my favourite"),
				new BookReview("book2", 3.0, "It was great reading"), new BookReview("book3", 5.0, "Excellent"),
				new BookReview("book3", 4.8, "Amazing Book!"), new BookReview("book3", 4.2, "Very informative"));

		Map<String, List<BookReview>> map = list.stream().filter(n -> n.getRating() >= 3.0)
				.collect(Collectors.groupingBy(BookReview::getBookId));

		// map.forEach((x,y)->System.out.println(x+":"+y));

		map.forEach((bookid, bookrevielist) -> {
			Double average = bookrevielist.stream().mapToDouble(BookReview::getRating).average().orElse(0.0);
			int count = bookrevielist.size();
			// System.out.println(count);
			System.out.println("Bookid: " + bookid + " Averege Rating: " + average + " Review count: " + count);
		});

	}

}
