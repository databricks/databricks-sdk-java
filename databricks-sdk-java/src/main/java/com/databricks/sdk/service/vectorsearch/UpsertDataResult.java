// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = UpsertDataResult.UpsertDataResultSerializer.class)
@JsonDeserialize(using = UpsertDataResult.UpsertDataResultDeserializer.class)
public class UpsertDataResult {
  /** List of primary keys for rows that failed to process. */
  private Collection<String> failedPrimaryKeys;

  /** Count of successfully processed rows. */
  private Long successRowCount;

  public UpsertDataResult setFailedPrimaryKeys(Collection<String> failedPrimaryKeys) {
    this.failedPrimaryKeys = failedPrimaryKeys;
    return this;
  }

  public Collection<String> getFailedPrimaryKeys() {
    return failedPrimaryKeys;
  }

  public UpsertDataResult setSuccessRowCount(Long successRowCount) {
    this.successRowCount = successRowCount;
    return this;
  }

  public Long getSuccessRowCount() {
    return successRowCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpsertDataResult that = (UpsertDataResult) o;
    return Objects.equals(failedPrimaryKeys, that.failedPrimaryKeys)
        && Objects.equals(successRowCount, that.successRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedPrimaryKeys, successRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataResult.class)
        .add("failedPrimaryKeys", failedPrimaryKeys)
        .add("successRowCount", successRowCount)
        .toString();
  }

  UpsertDataResultPb toPb() {
    UpsertDataResultPb pb = new UpsertDataResultPb();
    pb.setFailedPrimaryKeys(failedPrimaryKeys);
    pb.setSuccessRowCount(successRowCount);

    return pb;
  }

  static UpsertDataResult fromPb(UpsertDataResultPb pb) {
    UpsertDataResult model = new UpsertDataResult();
    model.setFailedPrimaryKeys(pb.getFailedPrimaryKeys());
    model.setSuccessRowCount(pb.getSuccessRowCount());

    return model;
  }

  public static class UpsertDataResultSerializer extends JsonSerializer<UpsertDataResult> {
    @Override
    public void serialize(UpsertDataResult value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpsertDataResultPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpsertDataResultDeserializer extends JsonDeserializer<UpsertDataResult> {
    @Override
    public UpsertDataResult deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpsertDataResultPb pb = mapper.readValue(p, UpsertDataResultPb.class);
      return UpsertDataResult.fromPb(pb);
    }
  }
}
