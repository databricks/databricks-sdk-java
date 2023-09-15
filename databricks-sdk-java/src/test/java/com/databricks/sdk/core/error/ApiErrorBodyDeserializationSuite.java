package com.databricks.sdk.core.error;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.junit.jupiter.api.Test;

public class ApiErrorBodyDeserializationSuite {
  @Test
  void deserializeErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String rawResponse =
        "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\",\"detail\":\"thescimdetail\",\"status\":\"thescimstatus\",\"scimType\":\"thescimtype\",\"error\":\"theerror\"}";
    ApiErrorBody error = mapper.readValue(rawResponse, ApiErrorBody.class);
    assertEquals(error.getErrorCode(), "theerrorcode");
    assertEquals(error.getMessage(), "themessage");
    assertEquals(error.getScimDetail(), "thescimdetail");
    assertEquals(error.getScimStatus(), "thescimstatus");
    assertEquals(error.getScimType(), "thescimtype");
    assertEquals(error.getApi12Error(), "theerror");
  }

  @Test
  void deserializeDetailedResponse() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String rawResponse =
        "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\","
            + "\"details\":["
            + "{\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\", \"reason\":\"detailreason\", \"domain\":\"detaildomain\",\"metadata\":{\"etag\":\"detailsetag\"}}"
            + "]}";
    ApiErrorBody error = mapper.readValue(rawResponse, ApiErrorBody.class);
    Map<String, String> metadata = new HashMap<>();
    metadata.put("etag", "detailsetag");
    ErrorDetail errorDetails = error.getErrorDetails().get(0);
    assertEquals(errorDetails.getType(), "type.googleapis.com/google.rpc.ErrorInfo");
    assertEquals(errorDetails.getReason(), "detailreason");
    assertEquals(errorDetails.getDomain(), "detaildomain");
    assertEquals(errorDetails.getMetadata(), metadata);
  }

  // Test that an ApiErrorBody can be deserialized, even if the response includes unexpected
  // parameters.
  @Test
  void handleUnexpectedFieldsInErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String rawResponse =
        "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\",\"unexpectedField\":[\"unexpected\"]}";
    ApiErrorBody error = mapper.readValue(rawResponse, ApiErrorBody.class);
    assertEquals(error.getErrorCode(), "theerrorcode");
    assertEquals(error.getMessage(), "themessage");
  }
}
