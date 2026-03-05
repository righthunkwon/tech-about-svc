package com.techabout.cm.controller;

import com.techabout.cm.dto.CmGetResDto;
import com.techabout.cm.service.CmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/cm")
public class CmController {

    private final CmService cmService;

    /**
     * 메뉴 조회
     * */
    @GetMapping(value = "/getMenuList")
    public List<CmGetResDto> getMenuList() {
        return cmService.getMenuList();
    }
}
