package exercise;

import lombok.SneakyThrows;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    @SneakyThrows
    public String serialize() {
        var car = new Car(this.id, this.brand, this.model, this.color, this.owner);
        return new ObjectMapper().writeValueAsString(car);
    }

    @SneakyThrows
    public static Car unserialize(String json) {
        return new ObjectMapper().readValue(json, Car.class);
    }
    // END
}
