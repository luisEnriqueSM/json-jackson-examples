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
        String json = "{\"id\":\"f854207a-84ec-4c1a-9ac6-ce5a72651b14\",\"beerName\":\"Dos XX\",\"beerStyle\":\"Lager\",\"upc\":220102002,\"price\":15.90,\"createdDate\":\"2024-07-31T11:17:03.640565-06:00\",\"lastUpdatedDate\":\"2024-07-31T11:17:03.640586-06:00\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }

}