package com.dst.FirstDstApp.repository;

import com.dst.FirstDstApp.models.SettingDictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SettingDictionaryRepository extends JpaRepository<SettingDictionary, String> {

    @Modifying
    @Query("update SettingDictionary set value=:val where name=:name and subcategory in (:category)")
    void updateValue(@Param("val") String value, @Param("category") String cat, @Param("name") String name);
}
