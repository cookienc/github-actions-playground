package touch.baton.domain.common.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException {

    private final ErrorCode errorCode;

    public BaseException(final ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode.getMessage();
    }

    public String getErrorCodesdfa() {
        return errorCode.getErrorCode();
    }

    public HttpStatus getHttpStatusadfdfa() {
        return errorCode.getHttpStatus();
    }
}
