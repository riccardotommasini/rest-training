package it.polimi.deib.middleware.rest.solutions;

import com.google.gson.JsonElement;

public class Resp {

    private int status;
    private String message;
    private JsonElement data;

    public Resp(int status) {
        this.status = status;
    }

    public Resp(int status, String message) {
        this.status = status;
        this.message=message;
    }

    public Resp(int status, JsonElement data) {
        this.status = status;
        this.data=data;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public JsonElement getData() {
        return data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }
}
