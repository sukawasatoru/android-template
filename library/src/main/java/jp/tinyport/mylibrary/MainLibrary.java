package jp.tinyport.mylibrary;

import javax.inject.Inject;

import jp.tinyport.mylibrary.internal.repository.LibraryOrma;

public class MainLibrary {
    LibraryOrma mOrma;

    @Inject
    public MainLibrary(LibraryOrma orma) {
        mOrma = orma;
    }

    public static void hello() {
        throw new UnsupportedOperationException("TODO");
    }
}
