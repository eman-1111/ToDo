package com.example.basma.todo;
import com.google.gson.annotations.SerializedName;

public class RetroUsers {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;

    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id = "+id+", name = "+name;
    }
}