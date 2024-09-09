package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("bắt đầu Chạy spring boot");
        ApplicationContext context = SpringApplication.run(Main.class, args);
        ThanhVien tv = context.getBean(ThanhVien.class);
        tv.thongTinTenThanhVien();
        tv.thongTinThanhVien();

        Meo meo = context.getBean(Meo.class);
        meo.thongTin();


//        // dùng tight coupling
//        ThanhVien thanhVien = new ThanhVien();
//
//        // dùng setter(loose couping)
//        GoiDangKy goiDangKy2 = new Basic();
//        thanhVien.setGoiDangKy(goiDangKy2);
//        thanhVien.thongTinThanhVien();
//
//        // dùng loose couping
//        GoiDangKy goiDangKy = new Basic();
//        ThanhVien thanhVien2 = new ThanhVien(goiDangKy);
//        thanhVien2.thongTinThanhVien();
    }
}