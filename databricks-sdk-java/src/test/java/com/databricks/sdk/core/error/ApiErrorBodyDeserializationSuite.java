package com.databricks.sdk.core.error;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.error.details.ErrorInfo;
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

  void deserializeErrorResponseWitIntErrorCode() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String rawResponse =
        "{\"error_code\":42,\"message\":\"themessage\",\"detail\":\"thescimdetail\",\"status\":\"thescimstatus\",\"scimType\":\"thescimtype\",\"error\":\"theerror\"}";
    ApiErrorBody error = mapper.readValue(rawResponse, ApiErrorBody.class);
    assertEquals(error.getErrorCode(), "42");
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

    ErrorDetails expectedErrorDetails =
        ErrorDetails.builder()
            .setErrorInfo(
                ErrorInfo.builder()
                    .setReason("detailreason")
                    .setDomain("detaildomain")
                    .setMetadata(metadata)
                    .build())
            .build();

    assertEquals(expectedErrorDetails, error.getErrorDetails());
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

  @Test
  void handleNullMetadataFieldInErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    String rawResponse =
        "{\"error_code\":\"METASTORE_DOES_NOT_EXIST\",\"message\":\"No metastore assigned for the current workspace.\",\"details\":[{\"@type\":\"type.googleapis.com/google.rpc.RequestInfo\",\"request_id\":\"1888e822-f1b5-4996-85eb-0d2b5cc402e6\",\"serving_data\":\"\"}]}";
    ApiErrorBody error = mapper.readValue(rawResponse, ApiErrorBody.class);

    assertEquals(error.getErrorCode(), "METASTORE_DOES_NOT_EXIST");
    assertEquals(error.getMessage(), "No metastore assigned for the current workspace.");
  }
}
