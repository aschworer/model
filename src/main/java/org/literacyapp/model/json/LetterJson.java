package org.literacyapp.model.json;

import org.literacyapp.model.enums.Locale;

public class LetterJson {
    
    private Long id;
    
    private Locale locale;
    
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
