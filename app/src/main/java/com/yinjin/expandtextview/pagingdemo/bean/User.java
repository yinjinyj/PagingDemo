package com.yinjin.expandtextview.pagingdemo.bean;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * desc:
 * time: 2018/5/29
 *
 * @author yinYin
 */
@Entity(tableName = "user")
public class User {
    @PrimaryKey
    private Long id;
    @ColumnInfo(name = "name")
    private String name;

    public User() {
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
