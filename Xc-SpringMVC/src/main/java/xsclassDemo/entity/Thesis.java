package xsclassDemo.entity;

import java.util.Date;

public class Thesis {
    private int thesisID;
    private int editorID;
    private String title;
    private Date date;
    private String content;
    private int likeAccount;
    private int viewAccount;

    public void setThesisID(int thesisID) {
        this.thesisID = thesisID;
    }

    public void setEditorID(int editorID) {
        this.editorID = editorID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setLikeAccount(int likeAccount) {
        this.likeAccount = likeAccount;
    }

    public void setViewAccount(int viewAccount) {
        this.viewAccount = viewAccount;
    }

    public int getEditorID() {
        return editorID;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date.toString();
    }

    public String getContent() {
        return content;
    }

    public int getLikeAccount() {
        return likeAccount;
    }

    public int getViewAccount() {
        return viewAccount;
    }

    public int getThesisID() {
        return thesisID;
    }

    @Override
    public String toString() {
        return "Thesis{" +
                "thesisID=" + thesisID +
                ", editorID=" + editorID +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", content='" + content + '\'' +
                ", likeAccount=" + likeAccount +
                ", viewAccount=" + viewAccount +
                '}';
    }
}
