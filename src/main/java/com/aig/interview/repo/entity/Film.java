package com.aig.interview.repo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

public class Film implements Serializable {

    @Id
    private String name;
    @Column
    private BigDecimal boxOffice;
    @Column
    private String basedOnIsbn;

    public Film(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBoxOffice() {
        return boxOffice;
    }
    public void setBoxOffice(BigDecimal boxOffice) {
        this.boxOffice = boxOffice;
    }

    public String getBasedOnIsbn() {
        return basedOnIsbn;
    }
    public void setBasedOnIsbn(String basedOnIsbn) {
        this.basedOnIsbn = basedOnIsbn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        final Film other = (Film) obj;
        if (other.name.equals(this.name)) {
            return true;
        } else {
            return false;
        }
    }
}
