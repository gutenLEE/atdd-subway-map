package subway;

import org.springframework.http.HttpStatus;

public class Response<T> {
    private final int status;
    private final T data;

    public Response(int status, T data) {
        this.status = status;
        this.data = data;
    }
}
