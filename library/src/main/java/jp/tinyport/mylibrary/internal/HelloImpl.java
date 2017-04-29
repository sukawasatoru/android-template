package jp.tinyport.mylibrary.internal;

import java.util.Date;

import javax.inject.Inject;

import jp.tinyport.mylibrary.internal.model.LibraryTable;
import jp.tinyport.mylibrary.internal.repository.LibraryOrma;

public class HelloImpl {
    private final LibraryOrma mOrma;

    @Inject
    HelloImpl(LibraryOrma orma) {
        mOrma = orma;
    }

    public void hello() {
        final LibraryTable table = new LibraryTable();
        table.date = new Date().getTime();
        mOrma.insertIntoLibraryTable(table);
    }
}
