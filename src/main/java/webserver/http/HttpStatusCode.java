package webserver.http;

public enum HttpStatusCode {
    OK(200),
    CREATED(201),
    FOUND(302),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    private int code;

    HttpStatusCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + " " + this.name();
    }
}
