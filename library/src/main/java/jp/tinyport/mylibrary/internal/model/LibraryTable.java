package jp.tinyport.mylibrary.internal.model;

import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

@Table
public class LibraryTable {
    @PrimaryKey
    public long id;
}
