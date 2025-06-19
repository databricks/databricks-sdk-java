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
@JsonSerialize(
    using = ValidateStorageCredentialResponse.ValidateStorageCredentialResponseSerializer.class)
@JsonDeserialize(
    using = ValidateStorageCredentialResponse.ValidateStorageCredentialResponseDeserializer.class)
public class ValidateStorageCredentialResponse {
  /** Whether the tested location is a directory in cloud storage. */
  private Boolean isDir;

  /** The results of the validation check. */
  private Collection<ValidationResult> results;

  public ValidateStorageCredentialResponse setIsDir(Boolean isDir) {
    this.isDir = isDir;
    return this;
  }

  public Boolean getIsDir() {
    return isDir;
  }

  public ValidateStorageCredentialResponse setResults(Collection<ValidationResult> results) {
    this.results = results;
    return this;
  }

  public Collection<ValidationResult> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidateStorageCredentialResponse that = (ValidateStorageCredentialResponse) o;
    return Objects.equals(isDir, that.isDir) && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isDir, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ValidateStorageCredentialResponse.class)
        .add("isDir", isDir)
        .add("results", results)
        .toString();
  }

  ValidateStorageCredentialResponsePb toPb() {
    ValidateStorageCredentialResponsePb pb = new ValidateStorageCredentialResponsePb();
    pb.setIsDir(isDir);
    pb.setResults(results);

    return pb;
  }

  static ValidateStorageCredentialResponse fromPb(ValidateStorageCredentialResponsePb pb) {
    ValidateStorageCredentialResponse model = new ValidateStorageCredentialResponse();
    model.setIsDir(pb.getIsDir());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ValidateStorageCredentialResponseSerializer
      extends JsonSerializer<ValidateStorageCredentialResponse> {
    @Override
    public void serialize(
        ValidateStorageCredentialResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ValidateStorageCredentialResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ValidateStorageCredentialResponseDeserializer
      extends JsonDeserializer<ValidateStorageCredentialResponse> {
    @Override
    public ValidateStorageCredentialResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ValidateStorageCredentialResponsePb pb =
          mapper.readValue(p, ValidateStorageCredentialResponsePb.class);
      return ValidateStorageCredentialResponse.fromPb(pb);
    }
  }
}
