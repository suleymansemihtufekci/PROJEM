package jsonparser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.projem.R;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class jsonparser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsonparser);

        TextView tv= findViewById(R.id.tv);

        final ObjectMapper mapper = new ObjectMapper();
        try {
            String personJsonStr = "{\"firstname\":\"John\",\"lastname\":\"Doe\"}";
            Person person = mapper.readValue(personJsonStr, Person.class);
            tv.setText(person.getFirstname() + " " + person.getLastname());
        } catch (IOException e) {

        }
    }
}