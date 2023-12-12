package corejavaretest;



public class Feedback {

    private long id;
    private String description;
    private String author;

    public Feedback(long id, String description, String author) {
        this.id = id;
        this.description = description;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}

class InvalidDescription extends Exception {
    public InvalidDescription(String message) {
        super(message);
    }
}

class InvalidAuthorName extends Exception {
    public InvalidAuthorName(String message) {
        super(message);
    }
}

class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}

class FeedbackNotFoundException extends Exception {
    public FeedbackNotFoundException(String message) {
        super(message);
    }
}




