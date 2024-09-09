package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class ThanhVien {
    private String ten;
//    @Autowired
    //@Qualifier("")
    private final GoiDangKy goiDangKy;
    // dùng tight coupling
//    public ThanhVien() {
////        this.goiDangKy = new NonMember();
//        System.out.println("Countructor ThanhVien");
//    }

    // dùng loose couping
//    @Autowired
//    public ThanhVien(GoiDangKy goiDangKy) {
//        this.goiDangKy = goiDangKy;
//        System.out.println("Countructor ThanhVien có tham số");
//    }

    public void thongTinThanhVien() {
        System.out.println("Tên = meo");
        goiDangKy.thongTin();
    }

    public void thongTinTenThanhVien() {
        System.out.println("tên: meo");
    }
//    @Autowired
//    public void setGoiDangKy(GoiDangKy goiDangKy) {
//        this.goiDangKy = goiDangKy;
//    }
}
