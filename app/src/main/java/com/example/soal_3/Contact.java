package com.example.soal_3;

public class Contact {
    private String nama, status, tipePhone;
    private Integer photoPic;

    public Contact(String nama, String status, String tipePhone, Integer photoPic) {
        this.nama = nama;
        this.status = status;
        this.tipePhone = tipePhone;
        this.photoPic = photoPic;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public String getTipePhone() {
        return tipePhone;
    }

    public Integer getPhotoPic() {
        return photoPic;
    }
}
