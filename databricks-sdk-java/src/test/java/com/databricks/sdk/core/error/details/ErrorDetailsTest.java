package com.databricks.sdk.core.error.details;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.SerDeUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ErrorDetailsTest {

  private final ObjectMapper mapper = SerDeUtils.createMapper();

  @Test
  public void testDeserializeFromArray() throws Exception {
    String json =
        "["
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\","
            + "    \"reason\": \"PERMISSION_DENIED\","
            + "    \"domain\": \"databricks.com\","
            + "    \"metadata\": {"
            + "      \"service\": \"workspace\""
            + "    }"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.RequestInfo\","
            + "    \"request_id\": \"req-123\","
            + "    \"serving_data\": \"stack-trace-data\""
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.RetryInfo\","
            + "    \"retry_delay\": \"30s\""
            + "  },"
            + "  {"
            + "    \"@type\": \"unknown.type\","
            + "    \"custom_field\": \"custom_value\""
            + "  }"
            + "]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    JsonNode unknownDetail =
        mapper.readTree("{\"@type\": \"unknown.type\", \"custom_field\": \"custom_value\"}");

    ErrorDetails expected =
        ErrorDetails.builder()
            .setErrorInfo(
                ErrorInfo.builder()
                    .setReason("PERMISSION_DENIED")
                    .setDomain("databricks.com")
                    .setMetadata(
                        ImmutableMap.<String, String>builder().put("service", "workspace").build())
                    .build())
            .setRequestInfo(
                RequestInfo.builder()
                    .setRequestId("req-123")
                    .setServingData("stack-trace-data")
                    .build())
            .setRetryInfo(RetryInfo.builder().setRetryDelay(Duration.ofSeconds(30)).build())
            .setUnknownDetails(Arrays.asList(unknownDetail))
            .build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeFromSingleObject() throws Exception {
    String json =
        "{"
            + "  \"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\","
            + "  \"reason\": \"RESOURCE_EXHAUSTED\","
            + "  \"domain\": \"databricks.com\","
            + "  \"metadata\": {"
            + "    \"quota_limit\": \"1000\""
            + "  }"
            + "}";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    ErrorDetails expected =
        ErrorDetails.builder()
            .setErrorInfo(
                ErrorInfo.builder()
                    .setReason("RESOURCE_EXHAUSTED")
                    .setDomain("databricks.com")
                    .setMetadata(
                        ImmutableMap.<String, String>builder().put("quota_limit", "1000").build())
                    .build())
            .build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeFromArrayWithMixedTypes() throws Exception {
    String json =
        "["
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\","
            + "    \"violations\": ["
            + "      {"
            + "        \"subject\": \"project:123\","
            + "        \"description\": \"Daily limit exceeded\""
            + "      }"
            + "    ]"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.Help\","
            + "    \"links\": ["
            + "      {"
            + "        \"description\": \"Quota documentation\","
            + "        \"url\": \"https://docs.databricks.com/quota\""
            + "      }"
            + "    ]"
            + "  },"
            + "  {"
            + "    \"unrecognized_field\": \"value\""
            + "  }"
            + "]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    JsonNode unknownDetail = mapper.readTree("{\"unrecognized_field\": \"value\"}");

    ErrorDetails expected =
        ErrorDetails.builder()
            .setQuotaFailure(
                QuotaFailure.builder()
                    .setViolations(
                        Arrays.asList(
                            QuotaFailure.QuotaFailureViolation.builder()
                                .setSubject("project:123")
                                .setDescription("Daily limit exceeded")
                                .build()))
                    .build())
            .setHelp(
                Help.builder()
                    .setLinks(
                        Arrays.asList(
                            Help.HelpLink.builder()
                                .setDescription("Quota documentation")
                                .setUrl("https://docs.databricks.com/quota")
                                .build()))
                    .build())
            .setUnknownDetails(Arrays.asList(unknownDetail))
            .build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeEmptyArray() throws Exception {
    String json = "[]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    ErrorDetails expected = ErrorDetails.builder().build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeAllErrorDetailTypes() throws Exception {
    String json =
        "["
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\","
            + "    \"reason\": \"reason\","
            + "    \"domain\": \"domain\","
            + "    \"metadata\": {\"k1\": \"v1\", \"k2\": \"v2\"}"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.RequestInfo\","
            + "    \"request_id\": \"req42\","
            + "    \"serving_data\": \"data\""
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.RetryInfo\","
            + "    \"retry_delay\": \"1.000000001s\""
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.DebugInfo\","
            + "    \"stack_entries\": [\"entry1\", \"entry2\"],"
            + "    \"detail\": \"detail\""
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\","
            + "    \"violations\": [{\"subject\": \"subject\", \"description\": \"description\"}]"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.PreconditionFailure\","
            + "    \"violations\": [{\"type\": \"type\", \"subject\": \"subject\", \"description\": \"description\"}]"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.BadRequest\","
            + "    \"field_violations\": [{\"field\": \"field\", \"description\": \"description\"}]"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ResourceInfo\","
            + "    \"resource_type\": \"resource_type\","
            + "    \"resource_name\": \"resource_name\","
            + "    \"owner\": \"owner\","
            + "    \"description\": \"description\""
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.Help\","
            + "    \"links\": [{\"description\": \"description\", \"url\": \"url\"}]"
            + "  }"
            + "]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    ErrorDetails expected =
        ErrorDetails.builder()
            .setErrorInfo(
                ErrorInfo.builder()
                    .setReason("reason")
                    .setDomain("domain")
                    .setMetadata(
                        ImmutableMap.<String, String>builder()
                            .put("k1", "v1")
                            .put("k2", "v2")
                            .build())
                    .build())
            .setRequestInfo(
                RequestInfo.builder().setRequestId("req42").setServingData("data").build())
            .setRetryInfo(RetryInfo.builder().setRetryDelay(Duration.ofSeconds(1, 1)).build())
            .setDebugInfo(
                DebugInfo.builder()
                    .setStackEntries(Arrays.asList("entry1", "entry2"))
                    .setDetail("detail")
                    .build())
            .setQuotaFailure(
                QuotaFailure.builder()
                    .setViolations(
                        Arrays.asList(
                            QuotaFailure.QuotaFailureViolation.builder()
                                .setSubject("subject")
                                .setDescription("description")
                                .build()))
                    .build())
            .setPreconditionFailure(
                PreconditionFailure.builder()
                    .setViolations(
                        Arrays.asList(
                            PreconditionFailure.PreconditionFailureViolation.builder()
                                .setType("type")
                                .setSubject("subject")
                                .setDescription("description")
                                .build()))
                    .build())
            .setBadRequest(
                BadRequest.builder()
                    .setFieldViolations(
                        Arrays.asList(
                            BadRequest.BadRequestFieldViolation.builder()
                                .setField("field")
                                .setDescription("description")
                                .build()))
                    .build())
            .setResourceInfo(
                ResourceInfo.builder()
                    .setResourceType("resource_type")
                    .setResourceName("resource_name")
                    .setOwner("owner")
                    .setDescription("description")
                    .build())
            .setHelp(
                Help.builder()
                    .setLinks(
                        Arrays.asList(
                            Help.HelpLink.builder()
                                .setDescription("description")
                                .setUrl("url")
                                .build()))
                    .build())
            .build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeUnknownErrorDetailType() throws Exception {
    String json =
        "[" + "  {" + "    \"@type\": \"foo\"," + "    \"reason\": \"reason\"" + "  }" + "]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    JsonNode unknownDetail = mapper.readTree("{\"@type\": \"foo\", \"reason\": \"reason\"}");

    ErrorDetails expected =
        ErrorDetails.builder().setUnknownDetails(Arrays.asList(unknownDetail)).build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeInvalidErrorDetails() throws Exception {
    String json =
        "["
            + "  42,"
            + "  \"foobar\","
            + "  {\"foo\": \"bar\"},"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\","
            + "    \"reason\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.RequestInfo\","
            + "    \"request_id\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.RetryInfo\","
            + "    \"retry_delay\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.DebugInfo\","
            + "    \"stack_entries\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\","
            + "    \"violations\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.PreconditionFailure\","
            + "    \"violations\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.BadRequest\","
            + "    \"field_violations\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ResourceInfo\","
            + "    \"resource_type\": 0"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.Help\","
            + "    \"links\": 0"
            + "  }"
            + "]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    JsonNode firstUnknown = mapper.readTree("42");
    JsonNode secondUnknown = mapper.readTree("\"foobar\"");
    JsonNode thirdUnknown = mapper.readTree("{\"foo\": \"bar\"}");
    JsonNode errorInfoUnknown =
        mapper.readTree("{\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\", \"reason\": 0}");
    JsonNode requestInfoUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.RequestInfo\", \"request_id\": 0}");
    JsonNode retryInfoUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.RetryInfo\", \"retry_delay\": 0}");
    JsonNode debugInfoUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.DebugInfo\", \"stack_entries\": 0}");
    JsonNode quotaFailureUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\", \"violations\": 0}");
    JsonNode preconditionFailureUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.PreconditionFailure\", \"violations\": 0}");
    JsonNode badRequestUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.BadRequest\", \"field_violations\": 0}");
    JsonNode resourceInfoUnknown =
        mapper.readTree(
            "{\"@type\": \"type.googleapis.com/google.rpc.ResourceInfo\", \"resource_type\": 0}");
    JsonNode helpUnknown =
        mapper.readTree("{\"@type\": \"type.googleapis.com/google.rpc.Help\", \"links\": 0}");

    ErrorDetails expected =
        ErrorDetails.builder()
            .setUnknownDetails(
                Arrays.asList(
                    firstUnknown,
                    secondUnknown,
                    thirdUnknown,
                    errorInfoUnknown,
                    requestInfoUnknown,
                    retryInfoUnknown,
                    debugInfoUnknown,
                    quotaFailureUnknown,
                    preconditionFailureUnknown,
                    badRequestUnknown,
                    resourceInfoUnknown,
                    helpUnknown))
            .build();

    assertEquals(expected, errorDetails);
  }

  @Test
  public void testDeserializeLastErrorDetailWins() throws Exception {
    String json =
        "["
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\","
            + "    \"reason\": \"first\","
            + "    \"domain\": \"test\","
            + "    \"metadata\": {}"
            + "  },"
            + "  {"
            + "    \"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\","
            + "    \"reason\": \"second\","
            + "    \"domain\": \"test\","
            + "    \"metadata\": {}"
            + "  }"
            + "]";

    ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);

    ErrorDetails expected =
        ErrorDetails.builder()
            .setErrorInfo(
                ErrorInfo.builder()
                    .setReason("second")
                    .setDomain("test")
                    .setMetadata(ImmutableMap.of())
                    .build())
            .build();

    assertEquals(expected, errorDetails);
  }
}
