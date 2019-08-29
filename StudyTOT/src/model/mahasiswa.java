/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private char jenis_kelamin;

    public mahasiswa(String nim, String nama, String jurusan, char jenis_kelamin) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public char getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    
}
