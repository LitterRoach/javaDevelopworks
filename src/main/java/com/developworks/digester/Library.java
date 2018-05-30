package com.developworks.digester;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-30 21:48</p>
 */
public class Library {
    private String name;
    private List<Book> list = Lists.newArrayList ();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public void addBook(Book book) {
        list.add (book);
    }
}
