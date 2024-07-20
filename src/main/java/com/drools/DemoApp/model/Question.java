package com.drools.DemoApp.model;

public class Question {
    private String name;
	private int chapter_id;
	private int easy;
	private int medium;
    private int hard;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getChapter_id() {
        return chapter_id;
    }
    public void setChapter_id(int chapter_id) {
        this.chapter_id = chapter_id;
    }
    public int getEasy() {
        return easy;
    }
    public void setEasy(int easy) {
        this.easy = easy;
    }
    public int getMedium() {
        return medium;
    }
    public void setMedium(int medium) {
        this.medium = medium;
    }
    public int getHard() {
        return hard;
    }
    public void setHard(int hard) {
        this.hard = hard;
    }
}
