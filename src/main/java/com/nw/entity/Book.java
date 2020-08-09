package com.nw.entity;

public class Book {
    private long bookId;// 图书ID

    private String name;// 图书名称

    private int number;// 馆藏数量

    private String description;// 图书简介

    private String press;// 出版社

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public Book() {
    }

    public Book(long bookId, String name, int number, String description, String press) {
        this.bookId = bookId;
        this.name = name;
        this.number = number;
        this.description = description;
        this.press = press;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", description='" + description + '\'' +
                ", press='" + press + '\'' +
                '}';
    }
}
