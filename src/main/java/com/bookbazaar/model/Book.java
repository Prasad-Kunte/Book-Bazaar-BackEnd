package com.bookbazaar.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_Id;
	private String book_title;
	@ManyToOne
    @JoinColumn(name = "fk_Book_autherId")
	private Auther auther;
	public String getBook_type() {
		return book_type;
	}
	public void setBook_type(String book_type) {
		this.book_type = book_type;
	}
	private String book_genre;
	private String book_language;
	private String book_desc;
	private String book_type;
	private float book_MRP;
	private float book_price;
	private String book_locality;
	private String book_img;
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	@ManyToOne
    @JoinColumn(name = "fk_Book_userId")
	private User user;
	private String DATETIME;
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public Auther getAuther() {
		return auther;
	}
	public void setAuther(Auther auther) {
		this.auther = auther;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public String getBook_language() {
		return book_language;
	}
	public void setBook_language(String book_language) {
		this.book_language = book_language;
	}
	public String getBook_desc() {
		return book_desc;
	}
	public void setBook_desc(String book_desc) {
		this.book_desc = book_desc;
	}
	public float getBook_MRP() {
		return book_MRP;
	}
	public void setBook_MRP(float book_MRP) {
		this.book_MRP = book_MRP;
	}
	public float getBook_price() {
		return book_price;
	}
	public void setBook_price(float book_price) {
		this.book_price = book_price;
	}
	public String getBook_locality() {
		return book_locality;
	}
	public void setBook_locality(String book_locality) {
		this.book_locality = book_locality;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getDATETIME() {
		return DATETIME;
	}
	public void setDATETIME(String dATETIME) {
		DATETIME = dATETIME;
	}
	
	

}
