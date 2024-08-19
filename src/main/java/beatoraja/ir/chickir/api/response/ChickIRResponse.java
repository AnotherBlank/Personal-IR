package beatoraja.ir.chickir.api.response;

import bms.player.beatoraja.ir.IRResponse;

public class ChickIRResponse<T> implements IRResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public ChickIRResponse() {
        this.success = false;
        this.message = "";
        this.data = null;
    }

    public ChickIRResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ChickIRResponse(IRResponse<T> response) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    @Override
    public boolean isSucceeded() {
        return this.success;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public T getData() {
        return this.data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ChickIRResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
