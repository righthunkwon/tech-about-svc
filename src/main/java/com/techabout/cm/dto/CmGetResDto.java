package com.techabout.cm.dto;

import lombok.Data;

@Data
public class CmGetResDto {
    private String menuId;
    private String menuNm;
    private String menuUrl;
    private Integer sortNo;
    private Integer menuLv;
}
