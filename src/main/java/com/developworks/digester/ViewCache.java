package com.developworks.digester;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-30 21:26</p>
 */
public class ViewCache {
    private List<Area> list = Lists.newArrayList ();
    public List<Area> getList() {
        return list;
    }
    public void setList(List<Area> list) {
        this.list = list;
    }

    public void addArea(Area area) {
        list.add (area);
    }
}
