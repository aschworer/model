package ai.elimu.model.gson.content;

import java.util.List;

public class SyllableGson extends ContentGson {
    
    private String text;
    
    private List<AllophoneGson> allophones;
    
    private int usageCount; // Based on StoryBook content

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public List<AllophoneGson> getAllophones() {
        return allophones;
    }

    public void setAllophones(List<AllophoneGson> allophones) {
        this.allophones = allophones;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }
}
