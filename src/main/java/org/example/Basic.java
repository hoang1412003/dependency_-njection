package org.example;

import org.springframework.stereotype.Component;

@Component
public class Basic implements GoiDangKy{
    public Basic(){
        System.out.println("Basic constructor");
    }
    @Override
    public void thongTin() {
        System.out.println("goi basic");
    }
}
