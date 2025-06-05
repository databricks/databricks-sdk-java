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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ValidateCredentialResponse.ValidateCredentialResponseSerializer.class)
@JsonDeserialize(using = ValidateCredentialResponse.ValidateCredentialResponseDeserializer.class)
public class ValidateCredentialResponse {
  /**
   * Whether the tested location is a directory in cloud storage. Only applicable for when purpose
   * is **STORAGE**.
   */
  private Boolean isDir;

  /** The results of the validation check. */
  private Collection<CredentialValidationResult> results;

  public ValidateCredentialResponse setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public ValidateCredentialResponse setResults(Collection<CredentialValidationResult> results) {
    this.results = results;
    return this;
  }

  public Collection<CredentialValidationResult> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateCredentialResponse that = (ValidateCredentialResponse) o;
    return Objects.equals(isDir, that.isDir) && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDir, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateCredentialResponse.class)
        .add("isDir", isDir)
        .add("results", results)
        .toString();
  }

  ValidateCredentialResponsePb toPb() {
    ValidateCredentialResponsePb pb = new ValidateCredentialResponsePb();
    pb.setIsDir(isDir);
    pb.setResults(results);

    return pb;
  }

  static ValidateCredentialResponse fromPb(ValidateCredentialResponsePb pb) {
    ValidateCredentialResponse model = new ValidateCredentialResponse();
    model.setIsDir(pb.getIsDir());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ValidateCredentialResponseSerializer
      extends JsonSerializer<ValidateCredentialResponse> {
    @Override
    public void serialize(
        ValidateCredentialResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ValidateCredentialResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ValidateCredentialResponseDeserializer
      extends JsonDeserializer<ValidateCredentialResponse> {
    @Override
    public ValidateCredentialResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ValidateCredentialResponsePb pb = mapper.readValue(p, ValidateCredentialResponsePb.class);
      return ValidateCredentialResponse.fromPb(pb);
    }
  }
}
