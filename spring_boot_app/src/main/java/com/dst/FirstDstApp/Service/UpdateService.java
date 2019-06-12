package com.dst.FirstDstApp.Service;

import com.dst.FirstDstApp.models.Data;
import com.dst.FirstDstApp.repository.SettingDictionaryRepository;
import org.springframework.stereotype.Service;

@Service
public class UpdateService {
    private SettingDictionaryRepository settingDictionaryRepository;

    public void update(Data data) {
        try {
            settingDictionaryRepository.updateValue(data.getValue(), data.getCategory(), data.getName());
        } catch (RuntimeException e) {
            System.out.println("error occcured ");
            e.printStackTrace();
        }

    }
}
