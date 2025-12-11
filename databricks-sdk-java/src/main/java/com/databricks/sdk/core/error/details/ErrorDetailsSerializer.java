package com.databricks.sdk.core.error.details;

import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

/**
 * Custom serializer for ErrorDetails that converts the object back to the array format expected by
 * the ErrorDetailsDeserializer.
 */
@InternalApi
public class ErrorDetailsSerializer extends JsonSerializer<ErrorDetails> {

  @Override
  public void serialize(
      ErrorDetails errorDetails, JsonGenerator gen, SerializerProvider serializers)
      throws IOException {
    gen.writeStartArray();

    // Serialize ErrorInfo if present
    if (errorDetails.errorInfo().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.ErrorInfo",
          errorDetails.errorInfo().get(),
          serializers);
    }

    // Serialize RequestInfo if present
    if (errorDetails.requestInfo().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.RequestInfo",
          errorDetails.requestInfo().get(),
          serializers);
    }

    // Serialize RetryInfo if present
    if (errorDetails.retryInfo().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.RetryInfo",
          errorDetails.retryInfo().get(),
          serializers);
    }

    // Serialize DebugInfo if present
    if (errorDetails.debugInfo().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.DebugInfo",
          errorDetails.debugInfo().get(),
          serializers);
    }

    // Serialize QuotaFailure if present
    if (errorDetails.quotaFailure().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.QuotaFailure",
          errorDetails.quotaFailure().get(),
          serializers);
    }

    // Serialize PreconditionFailure if present
    if (errorDetails.preconditionFailure().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.PreconditionFailure",
          errorDetails.preconditionFailure().get(),
          serializers);
    }

    // Serialize BadRequest if present
    if (errorDetails.badRequest().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.BadRequest",
          errorDetails.badRequest().get(),
          serializers);
    }

    // Serialize ResourceInfo if present
    if (errorDetails.resourceInfo().isPresent()) {
      serializeWithType(
          gen,
          "type.googleapis.com/google.rpc.ResourceInfo",
          errorDetails.resourceInfo().get(),
          serializers);
    }

    // Serialize Help if present
    if (errorDetails.help().isPresent()) {
      serializeWithType(
          gen, "type.googleapis.com/google.rpc.Help", errorDetails.help().get(), serializers);
    }

    // Serialize unknown details
    for (JsonNode unknownDetail : errorDetails.unknownDetails()) {
      gen.writeObject(unknownDetail);
    }

    gen.writeEndArray();
  }

  private void serializeWithType(
      JsonGenerator gen, String type, Object obj, SerializerProvider serializers)
      throws IOException {
    // Let Jackson serialize the object to a JsonNode first.
    ObjectMapper mapper = new ObjectMapper();
    JsonNode node = mapper.valueToTree(obj);

    // Add the @type field.
    if (node instanceof ObjectNode) {
      ((ObjectNode) node).put("@type", type);
    } else {
      throw new IllegalArgumentException("Unknown detail type: " + node.getClass().getName());
    }

    gen.writeObject(node);
  }
}
