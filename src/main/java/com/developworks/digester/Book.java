package com.developworks.digester;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-30 21:47</p>
 */
public class Book {
    private String title;
    private String author;
    private List<Chapter> list = Lists.newArrayList ();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Chapter> getList() {
        return list;
    }

    public void setList(List<Chapter> list) {
        this.list = list;
    }

    public void addChapter(Chapter chapter) {
        list.add (chapter);
    }
}
