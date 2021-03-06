package com.codegym.web_service.controller;

import com.codegym.dao.entity.ThongBao;
import com.codegym.service.ThongBaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class ThongBaoController {
    @Autowired
    ThongBaoService thongBaoService;

    @GetMapping("/thongbao")
    public ResponseEntity<List<ThongBao>> danhSachThongBao(){
        List<ThongBao> thongBaos = thongBaoService.getThongBao();
        Collections.sort(thongBaos, new Comparator<ThongBao>() {
            @Override
            public int compare(ThongBao o1, ThongBao o2) {
                return o2.getThoiGianThongBao().compareTo(o1.getThoiGianThongBao());
            }
        });
        return ResponseEntity.ok(thongBaos);
    }

    @GetMapping("/thongbao/{id}")
    public ResponseEntity<ThongBao> getThongBao(@PathVariable("id") Integer id) {
        ThongBao thongBao = thongBaoService.getThongBaoById(id);
        return ResponseEntity.ok(thongBao);
    }

    @PostMapping("/thongbao/update")
    public ResponseEntity<ThongBao> updateThongBao(@RequestBody ThongBao thongBao){
        thongBaoService.saveThongBao(thongBao);
        return ResponseEntity.ok(thongBao);
    }
}
