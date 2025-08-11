package com.databricks.sdk.core.error.details;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ErrorDetailsTest {
    
    private final ObjectMapper mapper = new ObjectMapper()
        .registerModule(new GuavaModule());
    
    @Test
    public void testDeserializeFromArray() throws Exception {
        String json = "[" +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\"," +
                "\"reason\": \"PERMISSION_DENIED\"," +
                "\"domain\": \"databricks.com\"," +
                "\"metadata\": {" +
                    "\"service\": \"workspace\"" +
                "}" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.RequestInfo\"," +
                "\"request_id\": \"req-123\"," +
                "\"serving_data\": \"stack-trace-data\"" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.RetryInfo\"," +
                "\"retry_delay\": \"30s\"" +
            "}," +
            "{" +
                "\"@type\": \"unknown.type\"," +
                "\"custom_field\": \"custom_value\"" +
            "}" +
            "]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        assertTrue(errorDetails.errorInfo().isPresent());
        assertEquals("PERMISSION_DENIED", errorDetails.errorInfo().get().reason());
        assertEquals("databricks.com", errorDetails.errorInfo().get().domain());
        
        assertTrue(errorDetails.requestInfo().isPresent());
        assertEquals("req-123", errorDetails.requestInfo().get().requestId());
        assertEquals("stack-trace-data", errorDetails.requestInfo().get().servingData());
        
        assertTrue(errorDetails.retryInfo().isPresent());
        assertEquals("PT30S", errorDetails.retryInfo().get().retryDelay().toString());
        
        assertEquals(1, errorDetails.unknownDetails().size());
        JsonNode unknownDetail = errorDetails.unknownDetails().get(0);
        assertEquals("unknown.type", unknownDetail.get("@type").asText());
        assertEquals("custom_value", unknownDetail.get("custom_field").asText());
    }
    
    @Test
    public void testDeserializeFromSingleObject() throws Exception {
        String json = "{" +
            "\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\"," +
            "\"reason\": \"RESOURCE_EXHAUSTED\"," +
            "\"domain\": \"databricks.com\"," +
            "\"metadata\": {" +
                "\"quota_limit\": \"1000\"" +
            "}" +
            "}";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        assertTrue(errorDetails.errorInfo().isPresent());
        assertEquals("RESOURCE_EXHAUSTED", errorDetails.errorInfo().get().reason());
        assertEquals("databricks.com", errorDetails.errorInfo().get().domain());
        assertEquals("1000", errorDetails.errorInfo().get().metadata().get("quota_limit"));
        
        assertEquals(0, errorDetails.unknownDetails().size());
    }
    
    @Test
    public void testDeserializeFromArrayWithMixedTypes() throws Exception {
        String json = "[" +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\"," +
                "\"violations\": [" +
                    "{" +
                        "\"subject\": \"project:123\"," +
                        "\"description\": \"Daily limit exceeded\"" +
                    "}" +
                "]" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.Help\"," +
                "\"links\": [" +
                    "{" +
                        "\"description\": \"Quota documentation\"," +
                        "\"url\": \"https://docs.databricks.com/quota\"" +
                    "}" +
                "]" +
            "}," +
            "{" +
                "\"unrecognized_field\": \"value\"" +
            "}" +
            "]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        assertTrue(errorDetails.quotaFailure().isPresent());
        assertEquals(1, errorDetails.quotaFailure().get().violations().size());
        assertEquals("project:123", errorDetails.quotaFailure().get().violations().get(0).subject());
        assertEquals("Daily limit exceeded", errorDetails.quotaFailure().get().violations().get(0).description());
        
        assertTrue(errorDetails.help().isPresent());
        assertEquals(1, errorDetails.help().get().links().size());
        assertEquals("Quota documentation", errorDetails.help().get().links().get(0).description());
        assertEquals("https://docs.databricks.com/quota", errorDetails.help().get().links().get(0).url());
        
        assertEquals(1, errorDetails.unknownDetails().size());
        JsonNode unknownDetail = errorDetails.unknownDetails().get(0);
        assertEquals("value", unknownDetail.get("unrecognized_field").asText());
    }
    
    @Test
    public void testDeserializeEmptyArray() throws Exception {
        String json = "[]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        assertFalse(errorDetails.errorInfo().isPresent());
        assertFalse(errorDetails.requestInfo().isPresent());
        assertFalse(errorDetails.retryInfo().isPresent());
        assertFalse(errorDetails.debugInfo().isPresent());
        assertFalse(errorDetails.quotaFailure().isPresent());
        assertFalse(errorDetails.preconditionFailure().isPresent());
        assertFalse(errorDetails.badRequest().isPresent());
        assertFalse(errorDetails.resourceInfo().isPresent());
        assertFalse(errorDetails.help().isPresent());
        assertEquals(0, errorDetails.unknownDetails().size());
    }
    
    @Test
    public void testDeserializeAllErrorDetailTypes() throws Exception {
        String json = "[" +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\"," +
                "\"reason\": \"reason\"," +
                "\"domain\": \"domain\"," +
                "\"metadata\": {\"k1\": \"v1\", \"k2\": \"v2\"}" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.RequestInfo\"," +
                "\"request_id\": \"req42\"," +
                "\"serving_data\": \"data\"" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.RetryInfo\"," +
                "\"retry_delay\": \"1.000000001s\"" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.DebugInfo\"," +
                "\"stack_entries\": [\"entry1\", \"entry2\"]," +
                "\"detail\": \"detail\"" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\"," +
                "\"violations\": [{\"subject\": \"subject\", \"description\": \"description\"}]" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.PreconditionFailure\"," +
                "\"violations\": [{\"type\": \"type\", \"subject\": \"subject\", \"description\": \"description\"}]" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.BadRequest\"," +
                "\"field_violations\": [{\"field\": \"field\", \"description\": \"description\"}]" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ResourceInfo\"," +
                "\"resource_type\": \"resource_type\"," +
                "\"resource_name\": \"resource_name\"," +
                "\"owner\": \"owner\"," +
                "\"description\": \"description\"" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.Help\"," +
                "\"links\": [{\"description\": \"description\", \"url\": \"url\"}]" +
            "}" +
            "]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        // Verify all error detail types are present
        assertTrue(errorDetails.errorInfo().isPresent());
        assertEquals("reason", errorDetails.errorInfo().get().reason());
        assertEquals("domain", errorDetails.errorInfo().get().domain());
        assertEquals("v1", errorDetails.errorInfo().get().metadata().get("k1"));
        assertEquals("v2", errorDetails.errorInfo().get().metadata().get("k2"));
        
        assertTrue(errorDetails.requestInfo().isPresent());
        assertEquals("req42", errorDetails.requestInfo().get().requestId());
        assertEquals("data", errorDetails.requestInfo().get().servingData());
        
        assertTrue(errorDetails.retryInfo().isPresent());
        assertEquals("PT1.000000001S", errorDetails.retryInfo().get().retryDelay().toString());
        
        assertTrue(errorDetails.debugInfo().isPresent());
        assertEquals(2, errorDetails.debugInfo().get().stackEntries().size());
        assertEquals("entry1", errorDetails.debugInfo().get().stackEntries().get(0));
        assertEquals("entry2", errorDetails.debugInfo().get().stackEntries().get(1));
        assertEquals("detail", errorDetails.debugInfo().get().detail());
        
        assertTrue(errorDetails.quotaFailure().isPresent());
        assertEquals(1, errorDetails.quotaFailure().get().violations().size());
        assertEquals("subject", errorDetails.quotaFailure().get().violations().get(0).subject());
        assertEquals("description", errorDetails.quotaFailure().get().violations().get(0).description());
        
        assertTrue(errorDetails.preconditionFailure().isPresent());
        assertEquals(1, errorDetails.preconditionFailure().get().violations().size());
        assertEquals("type", errorDetails.preconditionFailure().get().violations().get(0).type());
        assertEquals("subject", errorDetails.preconditionFailure().get().violations().get(0).subject());
        assertEquals("description", errorDetails.preconditionFailure().get().violations().get(0).description());
        
        assertTrue(errorDetails.badRequest().isPresent());
        assertEquals(1, errorDetails.badRequest().get().fieldViolations().size());
        assertEquals("field", errorDetails.badRequest().get().fieldViolations().get(0).field());
        assertEquals("description", errorDetails.badRequest().get().fieldViolations().get(0).description());
        
        assertTrue(errorDetails.resourceInfo().isPresent());
        assertEquals("resource_type", errorDetails.resourceInfo().get().resourceType());
        assertEquals("resource_name", errorDetails.resourceInfo().get().resourceName());
        assertEquals("owner", errorDetails.resourceInfo().get().owner());
        assertEquals("description", errorDetails.resourceInfo().get().description());
        
        assertTrue(errorDetails.help().isPresent());
        assertEquals(1, errorDetails.help().get().links().size());
        assertEquals("description", errorDetails.help().get().links().get(0).description());
        assertEquals("url", errorDetails.help().get().links().get(0).url());
        
        assertEquals(0, errorDetails.unknownDetails().size());
    }
    
    @Test
    public void testDeserializeUnknownErrorDetailType() throws Exception {
        String json = "[" +
            "{" +
                "\"@type\": \"foo\"," +
                "\"reason\": \"reason\"" +
            "}" +
            "]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        // Verify no known error detail types are present.
        assertFalse(errorDetails.errorInfo().isPresent());
        assertFalse(errorDetails.requestInfo().isPresent());
        assertFalse(errorDetails.retryInfo().isPresent());
        assertFalse(errorDetails.debugInfo().isPresent());
        assertFalse(errorDetails.quotaFailure().isPresent());
        assertFalse(errorDetails.preconditionFailure().isPresent());
        assertFalse(errorDetails.badRequest().isPresent());
        assertFalse(errorDetails.resourceInfo().isPresent());
        assertFalse(errorDetails.help().isPresent());
        
        // Verify unknown detail is captured.
        assertEquals(1, errorDetails.unknownDetails().size());
        JsonNode unknownDetail = errorDetails.unknownDetails().get(0);
        assertEquals("foo", unknownDetail.get("@type").asText());
        assertEquals("reason", unknownDetail.get("reason").asText());
    }
    
    @Test
    public void testDeserializeInvalidErrorDetails() throws Exception {
        String json = "[" +
            "42," +
            "\"foobar\"," +
            "{\"foo\": \"bar\"}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\"," +
                "\"reason\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.RequestInfo\"," +
                "\"request_id\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.RetryInfo\"," +
                "\"retry_delay\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.DebugInfo\"," +
                "\"stack_entries\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.QuotaFailure\"," +
                "\"violations\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.PreconditionFailure\"," +
                "\"violations\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.BadRequest\"," +
                "\"field_violations\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ResourceInfo\"," +
                "\"resource_type\": 0" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.Help\"," +
                "\"links\": 0" +
            "}" +
            "]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        // All error detail types should fail to deserialize due to invalid data
        // and be captured as unknown details.
        assertFalse(errorDetails.errorInfo().isPresent());
        assertFalse(errorDetails.badRequest().isPresent());
        assertFalse(errorDetails.help().isPresent());
        assertFalse(errorDetails.requestInfo().isPresent());
        assertFalse(errorDetails.resourceInfo().isPresent());
        assertFalse(errorDetails.quotaFailure().isPresent());
        assertFalse(errorDetails.preconditionFailure().isPresent());
        assertFalse(errorDetails.debugInfo().isPresent());
        assertFalse(errorDetails.retryInfo().isPresent());
        
        // 12 items should be captured as unknown details:
        // - 3 non-error detail types (42, "foobar", {"foo": "bar"}),
        // - 9 error detail objects with invalid data (including RetryInfo).
        assertEquals(12, errorDetails.unknownDetails().size());
        
        // Verify the first three unknown details (non-error detail types).
        JsonNode firstUnknown = errorDetails.unknownDetails().get(0);
        assertTrue(firstUnknown.isNumber());
        assertEquals(42, firstUnknown.asInt());
        
        JsonNode secondUnknown = errorDetails.unknownDetails().get(1);
        assertTrue(secondUnknown.isTextual());
        assertEquals("foobar", secondUnknown.asText());
        
        JsonNode thirdUnknown = errorDetails.unknownDetails().get(2);
        assertTrue(thirdUnknown.isObject());
        assertEquals("bar", thirdUnknown.get("foo").asText());
        
        // Verify that error detail objects with invalid data are in unknown details
        // Check for a few key types to ensure they're properly captured.
        boolean foundErrorInfo = false;
        boolean foundBadRequest = false;
        for (JsonNode unknownDetail : errorDetails.unknownDetails()) {
            if (unknownDetail.isObject() && unknownDetail.has("@type")) {
                String type = unknownDetail.get("@type").asText();
                if ("type.googleapis.com/google.rpc.ErrorInfo".equals(type)) {
                    assertEquals(0, unknownDetail.get("reason").asInt());
                    foundErrorInfo = true;
                } else if ("type.googleapis.com/google.rpc.BadRequest".equals(type)) {
                    assertEquals(0, unknownDetail.get("field_violations").asInt());
                    foundBadRequest = true;
                }
            }
        }
        
        assertTrue(foundErrorInfo, "ErrorInfo should be found in unknown details");
        assertTrue(foundBadRequest, "BadRequest should be found in unknown details");
    }
    
    @Test
    public void testDeserializeLastErrorDetailWins() throws Exception {
        String json = "[" +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\"," +
                "\"reason\": \"first\"," +
                "\"domain\": \"test\"," +
                "\"metadata\": {}" +
            "}," +
            "{" +
                "\"@type\": \"type.googleapis.com/google.rpc.ErrorInfo\"," +
                "\"reason\": \"second\"," +
                "\"domain\": \"test\"," +
                "\"metadata\": {}" +
            "}" +
            "]";
        
        ErrorDetails errorDetails = mapper.readValue(json, ErrorDetails.class);
        
        // Verify only the last ErrorInfo is present.
        assertTrue(errorDetails.errorInfo().isPresent());
        assertEquals("second", errorDetails.errorInfo().get().reason());
        
        // Verify no other error detail types are present.
        assertFalse(errorDetails.requestInfo().isPresent());
        assertFalse(errorDetails.retryInfo().isPresent());
        assertFalse(errorDetails.debugInfo().isPresent());
        assertFalse(errorDetails.quotaFailure().isPresent());
        assertFalse(errorDetails.preconditionFailure().isPresent());
        assertFalse(errorDetails.badRequest().isPresent());
        assertFalse(errorDetails.resourceInfo().isPresent());
        assertFalse(errorDetails.help().isPresent());
        
        assertEquals(0, errorDetails.unknownDetails().size());
    }
} 