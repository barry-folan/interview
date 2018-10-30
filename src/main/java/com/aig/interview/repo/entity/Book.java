package com.aig.interview.repo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Book implements Serializable {

    @Id
    private String isbn;
    @Column
    private String title;
    @Column
    private String alias;

    public Book(final String isbn) {
        this.isbn = isbn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Book other = (Book) obj;
        if (other.isbn.equals(this.isbn)) {
            return true;
        } else {
            return false;
        }
    }
}
