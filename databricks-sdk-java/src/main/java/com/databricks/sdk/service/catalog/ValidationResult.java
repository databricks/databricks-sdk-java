// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = ValidationResult.ValidationResultSerializer.class)
@JsonDeserialize(using = ValidationResult.ValidationResultDeserializer.class)
public class ValidationResult {
  /** Error message would exist when the result does not equal to **PASS**. */
  private String message;

  /** The operation tested. */
  private ValidationResultOperation operation;

  /** The results of the tested operation. */
  private ValidationResultResult result;

  public ValidationResult setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public ValidationResult setOperation(ValidationResultOperation operation) {
    this.operation = operation;
    return this;
  }

  public ValidationResultOperation getOperation() {
    return operation;
  }

  public ValidationResult setResult(ValidationResultResult result) {
    this.result = result;
    return this;
  }

  public ValidationResultResult getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationResult that = (ValidationResult) o;
    return Objects.equals(message, that.message)
        && Objects.equals(operation, that.operation)
        && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, operation, result);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidationResult.class)
        .add("message", message)
        .add("operation", operation)
        .add("result", result)
        .toString();
  }

  ValidationResultPb toPb() {
    ValidationResultPb pb = new ValidationResultPb();
    pb.setMessage(message);
    pb.setOperation(operation);
    pb.setResult(result);

    return pb;
  }

  static ValidationResult fromPb(ValidationResultPb pb) {
    ValidationResult model = new ValidationResult();
    model.setMessage(pb.getMessage());
    model.setOperation(pb.getOperation());
    model.setResult(pb.getResult());

    return model;
  }

  public static class ValidationResultSerializer extends JsonSerializer<ValidationResult> {
    @Override
    public void serialize(ValidationResult value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ValidationResultPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ValidationResultDeserializer extends JsonDeserializer<ValidationResult> {
    @Override
    public ValidationResult deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ValidationResultPb pb = mapper.readValue(p, ValidationResultPb.class);
      return ValidationResult.fromPb(pb);
    }
  }
}
