package com.databricks.sdk.core.error;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.core.error.details.ErrorInfo;
import com.databricks.sdk.core.error.details.RequestInfo;
import com.databricks.sdk.core.utils.SerDeUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.junit.jupiter.api.Test;

public class ApiErrorBodyDeserializationSuite {
  @Test
  void deserializeErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = SerDeUtils.createMapper();
    String rawResponse =
        "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\",\"detail\":\"thescimdetail\",\"status\":\"thescimstatus\",\"scimType\":\"thescimtype\",\"error\":\"theerror\"}";
    ApiErrorBody actual = mapper.readValue(rawResponse, ApiErrorBody.class);

    ApiErrorBody expected =
        ApiErrorBody.builder()
            .setErrorCode("theerrorcode")
            .setMessage("themessage")
            .setScimDetail("thescimdetail")
            .setScimStatus("thescimstatus")
            .setScimType("thescimtype")
            .setApi12Error("theerror")
            .build();

    assertEquals(expected, actual);
  }

  @Test
  void deserializeErrorResponseWitIntErrorCode() throws JsonProcessingException {
    ObjectMapper mapper = SerDeUtils.createMapper();
    String rawResponse =
        "{\"error_code\":42,\"message\":\"themessage\",\"detail\":\"thescimdetail\",\"status\":\"thescimstatus\",\"scimType\":\"thescimtype\",\"error\":\"theerror\"}";
    ApiErrorBody actual = mapper.readValue(rawResponse, ApiErrorBody.class);

    ApiErrorBody expected =
        ApiErrorBody.builder()
            .setErrorCode("42")
            .setMessage("themessage")
            .setScimDetail("thescimdetail")
            .setScimStatus("thescimstatus")
            .setScimType("thescimtype")
            .setApi12Error("theerror")
            .build();

    assertEquals(expected, actual);
  }

  @Test
  void deserializeDetailedResponse() throws JsonProcessingException {
    ObjectMapper mapper = SerDeUtils.createMapper();
    String rawResponse =
        "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\","
            + "\"details\":["
            + "{\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\", \"reason\":\"detailreason\", \"domain\":\"detaildomain\",\"metadata\":{\"etag\":\"detailsetag\"}}"
            + "]}";
    ApiErrorBody actual = mapper.readValue(rawResponse, ApiErrorBody.class);

    ApiErrorBody expected =
        ApiErrorBody.builder()
            .setErrorCode("theerrorcode")
            .setMessage("themessage")
            .setErrorDetails(
                ErrorDetails.builder()
                    .setErrorInfo(
                        ErrorInfo.builder()
                            .setReason("detailreason")
                            .setDomain("detaildomain")
                            .setMetadata(Collections.singletonMap("etag", "detailsetag"))
                            .build())
                    .build())
            .build();

    assertEquals(expected, actual);
  }

  // Test that an ApiErrorBody can be deserialized, even if the response includes unexpected
  // parameters.
  @Test
  void handleUnexpectedFieldsInErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = SerDeUtils.createMapper();
    String rawResponse =
        "{\"error_code\":\"theerrorcode\",\"message\":\"themessage\",\"unexpectedField\":[\"unexpected\"]}";
    ApiErrorBody actual = mapper.readValue(rawResponse, ApiErrorBody.class);

    ApiErrorBody expected =
        ApiErrorBody.builder().setErrorCode("theerrorcode").setMessage("themessage").build();

    assertEquals(expected, actual);
  }

  @Test
  void handleNullMetadataFieldInErrorResponse() throws JsonProcessingException {
    ObjectMapper mapper = SerDeUtils.createMapper();
    String rawResponse =
        "{\"error_code\":\"METASTORE_DOES_NOT_EXIST\",\"message\":\"No metastore assigned for the current workspace.\",\"details\":[{\"@type\":\"type.googleapis.com/google.rpc.RequestInfo\",\"request_id\":\"1888e822-f1b5-4996-85eb-0d2b5cc402e6\",\"serving_data\":\"\"}]}";
    ApiErrorBody actual = mapper.readValue(rawResponse, ApiErrorBody.class);

    ApiErrorBody expected =
        ApiErrorBody.builder()
            .setErrorCode("METASTORE_DOES_NOT_EXIST")
            .setMessage("No metastore assigned for the current workspace.")
            .setErrorDetails(
                ErrorDetails.builder()
                    .setRequestInfo(
                        RequestInfo.builder()
                            .setRequestId("1888e822-f1b5-4996-85eb-0d2b5cc402e6")
                            .setServingData("")
                            .build())
                    .build())
            .build();

    assertEquals(expected, actual);
  }
}
