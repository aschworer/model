package ai.elimu.model.gson.content;

import ai.elimu.model.enums.GradeLevel;
import ai.elimu.model.gson.content.multimedia.ImageGson;

public class StoryBookGson extends ContentGson {
    
    private String title;
    
    private ImageGson coverImage;
    
    private GradeLevel gradeLevel;
    
    // TODO: add pages

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public ImageGson getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(ImageGson coverImage) {
        this.coverImage = coverImage;
    }

    public GradeLevel getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
