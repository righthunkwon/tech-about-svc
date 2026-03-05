package com.techabout.cm.service;

import com.techabout.cm.dto.CmGetResDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class CmService {

    /**
     * 메뉴 조회
     * */
    public List<CmGetResDto> getMenuList() {
        // Repository 를 통한 쿼리 호출
        return null;
    }
}
