package com.databricks.sdk.core.error.details;

import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom deserializer for ErrorDetails that converts an array of JSON objects into an ErrorDetails
 * object.
 */
@InternalApi
public class ErrorDetailsDeserializer extends JsonDeserializer<ErrorDetails> {

  private static final String ERROR_INFO_TYPE = "type.googleapis.com/google.rpc.ErrorInfo";
  private static final String REQUEST_INFO_TYPE = "type.googleapis.com/google.rpc.RequestInfo";
  private static final String RETRY_INFO_TYPE = "type.googleapis.com/google.rpc.RetryInfo";
  private static final String DEBUG_INFO_TYPE = "type.googleapis.com/google.rpc.DebugInfo";
  private static final String QUOTA_FAILURE_TYPE = "type.googleapis.com/google.rpc.QuotaFailure";
  private static final String PRECONDITION_FAILURE_TYPE =
      "type.googleapis.com/google.rpc.PreconditionFailure";
  private static final String BAD_REQUEST_TYPE = "type.googleapis.com/google.rpc.BadRequest";
  private static final String RESOURCE_INFO_TYPE = "type.googleapis.com/google.rpc.ResourceInfo";
  private static final String HELP_TYPE = "type.googleapis.com/google.rpc.Help";

  @Override
  public ErrorDetails deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    ObjectMapper mapper = (ObjectMapper) p.getCodec();
    JsonNode node = mapper.readTree(p);

    if (node.isArray()) {
      return deserializeFromArray((ArrayNode) node, mapper);
    } else {
      // Fallback to single object deserialization
      return deserializeFromObject((ObjectNode) node, mapper);
    }
  }

  private ErrorDetails deserializeFromArray(ArrayNode arrayNode, ObjectMapper mapper)
      throws IOException {
    ErrorDetails.Builder builder = ErrorDetails.builder();
    List<JsonNode> unknownDetails = new ArrayList<>();

    for (JsonNode detailNode : arrayNode) {
      if (detailNode.isObject()) {
        ObjectNode objectNode = (ObjectNode) detailNode;
        String type = objectNode.path("@type").asText();

        try {
          switch (type) {
            case ERROR_INFO_TYPE:
              ErrorInfo errorInfo = mapper.treeToValue(objectNode, ErrorInfo.class);
              builder.setErrorInfo(errorInfo);
              break;
            case REQUEST_INFO_TYPE:
              RequestInfo requestInfo = mapper.treeToValue(objectNode, RequestInfo.class);
              builder.setRequestInfo(requestInfo);
              break;
            case RETRY_INFO_TYPE:
              RetryInfo retryInfo = mapper.treeToValue(objectNode, RetryInfo.class);
              builder.setRetryInfo(retryInfo);
              break;
            case DEBUG_INFO_TYPE:
              DebugInfo debugInfo = mapper.treeToValue(objectNode, DebugInfo.class);
              builder.setDebugInfo(debugInfo);
              break;
            case QUOTA_FAILURE_TYPE:
              QuotaFailure quotaFailure = mapper.treeToValue(objectNode, QuotaFailure.class);
              builder.setQuotaFailure(quotaFailure);
              break;
            case PRECONDITION_FAILURE_TYPE:
              PreconditionFailure preconditionFailure =
                  mapper.treeToValue(objectNode, PreconditionFailure.class);
              builder.setPreconditionFailure(preconditionFailure);
              break;
            case BAD_REQUEST_TYPE:
              BadRequest badRequest = mapper.treeToValue(objectNode, BadRequest.class);
              builder.setBadRequest(badRequest);
              break;
            case RESOURCE_INFO_TYPE:
              ResourceInfo resourceInfo = mapper.treeToValue(objectNode, ResourceInfo.class);
              builder.setResourceInfo(resourceInfo);
              break;
            case HELP_TYPE:
              Help help = mapper.treeToValue(objectNode, Help.class);
              builder.setHelp(help);
              break;
            default:
              // Unknown type, add to unknownDetails
              unknownDetails.add(detailNode);
              break;
          }
        } catch (Exception e) {
          // If deserialization fails for a known type, treat it as unknown
          unknownDetails.add(detailNode);
        }
      } else {
        // Non-object node, add to unknownDetails
        unknownDetails.add(detailNode);
      }
    }

    builder.setUnknownDetails(unknownDetails);
    return builder.build();
  }

  private ErrorDetails deserializeFromObject(ObjectNode objectNode, ObjectMapper mapper)
      throws IOException {
    // Handle single object case - try to determine type and deserialize accordingly
    String type = objectNode.path("@type").asText();

    try {
      switch (type) {
        case ERROR_INFO_TYPE:
          ErrorInfo errorInfo = mapper.treeToValue(objectNode, ErrorInfo.class);
          return ErrorDetails.builder()
              .setErrorInfo(errorInfo)
              .setUnknownDetails(new ArrayList<>())
              .build();
        case REQUEST_INFO_TYPE:
          RequestInfo requestInfo = mapper.treeToValue(objectNode, RequestInfo.class);
          return ErrorDetails.builder()
              .setRequestInfo(requestInfo)
              .setUnknownDetails(new ArrayList<>())
              .build();
        case RETRY_INFO_TYPE:
          RetryInfo retryInfo = mapper.treeToValue(objectNode, RetryInfo.class);
          return ErrorDetails.builder()
              .setRetryInfo(retryInfo)
              .setUnknownDetails(new ArrayList<>())
              .build();
        case DEBUG_INFO_TYPE:
          DebugInfo debugInfo = mapper.treeToValue(objectNode, DebugInfo.class);
          return ErrorDetails.builder()
              .setDebugInfo(debugInfo)
              .setUnknownDetails(new ArrayList<>())
              .build();
        case QUOTA_FAILURE_TYPE:
          QuotaFailure quotaFailure = mapper.treeToValue(objectNode, QuotaFailure.class);
          return ErrorDetails.builder()
              .setQuotaFailure(quotaFailure)
              .setUnknownDetails(new ArrayList<>())
              .build();
        case PRECONDITION_FAILURE_TYPE:
          PreconditionFailure preconditionFailure =
              mapper.treeToValue(objectNode, PreconditionFailure.class);
          return ErrorDetails.builder().setPreconditionFailure(preconditionFailure).build();
        case BAD_REQUEST_TYPE:
          BadRequest badRequest = mapper.treeToValue(objectNode, BadRequest.class);
          return ErrorDetails.builder().setBadRequest(badRequest).build();
        case RESOURCE_INFO_TYPE:
          ResourceInfo resourceInfo = mapper.treeToValue(objectNode, ResourceInfo.class);
          return ErrorDetails.builder()
              .setResourceInfo(resourceInfo)
              .setUnknownDetails(new ArrayList<>())
              .build();
        case HELP_TYPE:
          Help help = mapper.treeToValue(objectNode, Help.class);
          return ErrorDetails.builder().setHelp(help).setUnknownDetails(new ArrayList<>()).build();
        default:
          // Unknown type, treat as unknown detail
          List<JsonNode> unknownDetails = new ArrayList<>();
          unknownDetails.add(objectNode);
          return ErrorDetails.builder().setUnknownDetails(unknownDetails).build();
      }
    } catch (Exception e) {
      // If deserialization fails, treat as unknown detail
      List<JsonNode> unknownDetails = new ArrayList<>();
      unknownDetails.add(objectNode);
      return ErrorDetails.builder().setUnknownDetails(unknownDetails).build();
    }
  }
}
