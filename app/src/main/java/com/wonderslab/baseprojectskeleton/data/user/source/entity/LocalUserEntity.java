package com.wonderslab.baseprojectskeleton.data.user.source.entity;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

/**
 * Created by Ekalips on 9/25/17.
 */

@Entity
public class LocalUserEntity implements User {

    @Id(assignable = true)
    private
    long id;
    private String name;

    public LocalUserEntity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
