package com.company.Prototype;

public class GameInfo implements Cloneable {

    private String title;
    private String description;
    private String platform;
    private String PEGI;

    public GameInfo(String title, String platform) {
        this.title = title;
        this.platform = platform;
    }

    public GameInfo(String title, String description, String platform, String PEGI) {
        this.title = title;
        this.description = description;
        this.platform = platform;
        this.PEGI = PEGI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPEGI() {
        return PEGI;
    }

    public void setPEGI(String PEGI) {
        this.PEGI = PEGI;
    }

    @Override
    public String toString() {
        return "GameInfo{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", platform='" + platform + '\'' +
                ", PEGI='" + PEGI + '\'' +
                '}';
    }

    public GameInfo crateClone() throws CloneNotSupportedException {
        return (GameInfo) clone();
    }

}
