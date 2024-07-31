package org.json.jackson.examples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerName\":\"Dos XX\",\"beerStyle\":\"Lager\",\"upc\":220102002,\"price\":\"15.90\",\"createdDate\":\"2024-07-31T16:29:35-0600\",\"lastUpdatedDate\":\"2024-07-31T16:29:35.559792-06:00\",\"myLocalDate\":\"20240731\",\"beerId\":\"47136f80-8a6e-4e54-b05d-40607926d65a\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }

}