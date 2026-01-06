package org.hellfire.designpatterns.designPatterns.creational.prototypeDesign;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Document implements Prototype<Document>{

    private String title;
    private String content;
    private String footer;

    public Document(String title, String content, String footer) {
        this.title = title;
        this.content = content;
        this.footer = footer;
    }

    @Override
    public Document clone() {
        return new Document(this.title, this.content, this.footer);
    }
}
