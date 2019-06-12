package com.dst.FirstDstApp.controller;

import com.dst.FirstDstApp.Service.UpdateService;
import com.dst.FirstDstApp.models.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private UpdateService updateService;

    @PostMapping("/update")
    public ResponseEntity update(@RequestBody Data data) {
        updateService.update(data);
        return ResponseEntity.ok("updated");

    }
}
