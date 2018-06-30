package jp.tinyport.example.sample.core.model;

import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

@Table
public class AppTable {
    @PrimaryKey
    public long id;
}
