package com.techabout.cm.controller;

import com.techabout.cm.dto.CmGetResDto;
import com.techabout.cm.service.CmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cm")
public class CmController {

    @Autowired
    private CmService cmService;

    /**
     * 메뉴 조회
     * */
    @GetMapping(value = "/getMenuList")
    public List<CmGetResDto> getMenuList() {
        return cmService.getMenuList();
    }
}
