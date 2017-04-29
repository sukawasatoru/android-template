package jp.tinyport.mylibrary.internal.model;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

@Table
public class LibraryTable {
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public long date;
}
