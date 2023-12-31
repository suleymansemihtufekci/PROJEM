package jsonparser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = Person.class)
public class Person {
    @JsonProperty("firstname")
    private String firstname;

    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }





    @JsonProperty("lastname")
    private String lastname;
}
