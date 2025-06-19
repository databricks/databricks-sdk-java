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
@JsonSerialize(using = CredentialValidationResult.CredentialValidationResultSerializer.class)
@JsonDeserialize(using = CredentialValidationResult.CredentialValidationResultDeserializer.class)
public class CredentialValidationResult {
  /** Error message would exist when the result does not equal to **PASS**. */
  private String message;

  /** The results of the tested operation. */
  private ValidateCredentialResult result;

  public CredentialValidationResult setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public CredentialValidationResult setResult(ValidateCredentialResult result) {
    this.result = result;
    return this;
  }

  public ValidateCredentialResult getResult() {
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CredentialValidationResult that = (CredentialValidationResult) o;
    return Objects.equals(message, that.message) && Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, result);
  }

  @Override
  public String toString() {
    return new ToStringer(CredentialValidationResult.class)
        .add("message", message)
        .add("result", result)
        .toString();
  }

  CredentialValidationResultPb toPb() {
    CredentialValidationResultPb pb = new CredentialValidationResultPb();
    pb.setMessage(message);
    pb.setResult(result);

    return pb;
  }

  static CredentialValidationResult fromPb(CredentialValidationResultPb pb) {
    CredentialValidationResult model = new CredentialValidationResult();
    model.setMessage(pb.getMessage());
    model.setResult(pb.getResult());

    return model;
  }

  public static class CredentialValidationResultSerializer
      extends JsonSerializer<CredentialValidationResult> {
    @Override
    public void serialize(
        CredentialValidationResult value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CredentialValidationResultPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CredentialValidationResultDeserializer
      extends JsonDeserializer<CredentialValidationResult> {
    @Override
    public CredentialValidationResult deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CredentialValidationResultPb pb = mapper.readValue(p, CredentialValidationResultPb.class);
      return CredentialValidationResult.fromPb(pb);
    }
  }
}
