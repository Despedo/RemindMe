package com.despedo.remindme.dto;

/**
 * Created by Despedo on 16.03.2017.
 */

public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
