package com.developworks.digester;

import org.apache.commons.digester.Digester;
import org.junit.Test;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Author: ouyp </p>
 * <p>Date: 2018-05-30 21:28</p>
 */
public class DigesterTest {

    /**
     * 解析viewcache.xml文件
     */
    @Test
    public void testViewCache() {
        Digester digester = new Digester();
        digester.setValidating (false);
        digester.addObjectCreate ("viewcache/areas", ViewCache.class);
        digester.addObjectCreate ("viewcache/areas/area", Area.class);
        digester.addBeanPropertySetter ("viewcache/areas/area/id", "id");
        digester.addBeanPropertySetter ("viewcache/areas/area/parentId", "parentId");
        digester.addBeanPropertySetter ("viewcache/areas/area/areaType", "areaType");
        digester.addBeanPropertySetter ("viewcache/areas/area/name", "name");
        digester.addBeanPropertySetter ("viewcache/areas/area/ordering", "ordering");
        digester.addBeanPropertySetter ("viewcache/areas/area/phoneArea", "phoneArea");
        digester.addSetNext ("viewcache/areas/area", "addArea");

        ViewCache viewCache = null;
        try {
            InputStream is = getClass ().getResourceAsStream ("viewcache.xml");
            viewCache = (ViewCache)digester.parse (is);
        } catch (IOException e) {
            e.printStackTrace ();
        } catch (SAXException e) {
            e.printStackTrace ();
        }
        System.out.println (viewCache.getList ().size ());
    }

    /**
     * 解析books.xml文件
     */
    @Test
    public void testBooks() {
        Digester digester = new Digester ();
        digester.setValidating (false);
        digester.addObjectCreate ("library", Library.class);
        digester.addSetProperties ("library", "name", "name");
        digester.addObjectCreate ("library/book", Book.class);
        digester.addSetProperties ("library/book", "title", "title");
        digester.addSetProperties ("library/book", "author", "author");
        digester.addObjectCreate ("library/book/chapter", Chapter.class);
        digester.addBeanPropertySetter ("library/book/chapter/no", "no");
        digester.addBeanPropertySetter ("library/book/chapter/caption", "caption");
        digester.addSetNext ("library/book/chapter", "addChapter");
        digester.addSetNext ("library/book", "addBook");

        try {
            Library library = (Library)digester.parse (getClass ().getResourceAsStream ("books.xml"));
            System.out.println("图书馆名称：" + library.getName ());
            System.out.println ("图书馆共有图书：" + library.getList ().size ());
            for (Book book : library.getList ()) {
                System.out.println(book.getTitle () + "," + book.getAuthor ());
                for (Chapter chapter : book.getList ()) {
                    System.out.println (chapter.getCaption () + "," + chapter.getNo ());
                }
                System.out.println("--------------------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } catch (SAXException e) {
            e.printStackTrace ();
        }
    }
}
