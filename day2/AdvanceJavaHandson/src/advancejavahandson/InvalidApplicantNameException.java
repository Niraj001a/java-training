package advancejavahandson;


class InvalidApplicantNameException extends RuntimeException {
    public InvalidApplicantNameException(String message) {
        super(message);
    }
}