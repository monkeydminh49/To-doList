package Model;

import java.io.Serializable;
import java.time.LocalDate;

public class Work implements Serializable {

    private String title;
    private String description;
    private LocalDate date;
    private boolean finished;

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

    public LocalDate getDate() {
        
        return date;
    }

    public void setDate(LocalDate expirationDate) {
        this.date = expirationDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean isFinished) {
        this.finished = isFinished;
    }

    public Work() {
        title = "New work";
        description = "";
        date = null;
        finished = false;
    }

    public Work(String title, String description, LocalDate expirationDate) {
        this.title = title;
        this.description = description;
        this.date = expirationDate;
        finished = false;
    }

    @Override
    public String toString() {
        return getTitle();
    }

}
