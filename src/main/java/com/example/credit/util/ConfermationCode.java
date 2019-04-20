package com.example.credit.util;

public class ConfermationCode {
    private Long id;
    private Integer confCode;

    public ConfermationCode() {
    }

    public ConfermationCode(Long id, Integer confCode) {
        this.id = id;
        this.confCode = confCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConfCode() {
        return confCode;
    }

    public void setConfCode(Integer confCode) {
        this.confCode = confCode;
    }
}
