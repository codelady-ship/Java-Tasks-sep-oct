package tasklar.SentyabrTask.Les15Task.PaswordExpTask;
// Custom Exceptions
class EmptyPasswordException extends Exception {
    public EmptyPasswordException(String message) {
        super(message);
    }
}
class TooShortPasswordException extends Exception {
    public TooShortPasswordException(String message) {
        super(message);
    }
}
class NoCapitalLetterException extends Exception {
    public NoCapitalLetterException(String message) {
        super(message);
    }
}
class NoRegularLetterException extends Exception {
    public NoRegularLetterException(String message) {
        super(message);
    }
}

class NoDigitException extends Exception {
    public NoDigitException(String message) {
        super(message);
    }
}

class NoSpecialCharacterException extends Exception {
    public NoSpecialCharacterException(String message) {
        super(message);
    }
}
