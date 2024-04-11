package com.example.ThymeleafProject;

public class ItemObj {
    private String pat_name;
    private String doc_name;
    private String time;
    private String date;

    public ItemObj(String pat_name, String doc_name, String time, String date) {
        this.pat_name = pat_name;
        this.doc_name = doc_name;
        this.time = time;
        this.date = date;
    }

    public String getPat_name() {
        return pat_name;
    }

    public void setPat_name(String pat_name) {
        this.pat_name = pat_name;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Имя пациента: " + pat_name + ", Имя врача: " + doc_name + ", время приема: " + time;
    }
}
