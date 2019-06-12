package com.dst.FirstDstApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SettingDictionary {
    @Id
    private String id;
    private String name;
}
