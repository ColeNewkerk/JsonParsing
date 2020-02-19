package utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import domain.Person;
import exceptions.ParameterIsNotJsonStringException;

public class ParseUtils {

    public static Person parseJsonToPersonDirect(String jsonString) {
            Gson gson = new Gson();
            Person userObject = gson.fromJson(jsonString, Person.class);
            if(jsonString.charAt(0)!='{'){
                ParameterIsNotJsonStringException;
            }
            else{
                return userObject;
            }


    return userObject;
    }

    public static Person parseJsonToPersonManual(String jsonString) {
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(jsonString);
        JsonObject rootObject = rootElement.getAsJsonObject();
        var firstName = rootObject.getAsJsonPrimitive("name").getAsString();
        var lastName = rootObject.getAsJsonPrimitive("last").getAsString();
        var year = rootObject.getAsJsonPrimitive("dob").getAsInt();
        return new Person(firstName, lastName, year);

    }

}
