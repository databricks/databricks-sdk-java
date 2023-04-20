package com.databricks.sdk.client.error;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiErrorBodyDeserializationSuite {
  @Test
  void deserializeErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String rawResponse = "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\",\"detail\":\"thescimdetail\",\"status\":\"thescimstatus\",\"scimType\":\"thescimtype\",\"error\":\"theerror\"}";
    ApiErrorBody error = mapper.readValue(rawResponse, ApiErrorBody.class);
    assertEquals(error.getErrorCode(), "theerrorcode");
    assertEquals(error.getMessage(), "themessage");
    assertEquals(error.getScimDetail(), "thescimdetail");
    assertEquals(error.getScimStatus(), "thescimstatus");
    assertEquals(error.getScimType(), "thescimtype");
    assertEquals(error.getApi12Error(), "theerror");
  }
}
