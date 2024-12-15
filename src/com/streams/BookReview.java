package com.streams;

public class BookReview {
	
	private String bookId;
	private double rating;
	private String comment;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public BookReview(String bookId, double rating, String comment) {
		super();
		this.bookId = bookId;
		this.rating = rating;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "BookReview [bookId=" + bookId + ", rating=" + rating + ", comment=" + comment + "]";
	}


}
