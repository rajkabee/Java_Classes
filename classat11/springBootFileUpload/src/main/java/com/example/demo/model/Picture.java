package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name="picture")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String fileName;

    private String fileType;
    @Lob
    private byte[] data;

    public Picture() {
    }

    public Picture(String fileName, String contentType, byte[] bytes) {
        this.fileName=fileName;
        this.fileType=contentType;
        this.data=bytes;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
