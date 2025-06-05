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
@JsonSerialize(using = DeleteDataResult.DeleteDataResultSerializer.class)
@JsonDeserialize(using = DeleteDataResult.DeleteDataResultDeserializer.class)
public class DeleteDataResult {
  /** List of primary keys for rows that failed to process. */
  private Collection<String> failedPrimaryKeys;

  /** Count of successfully processed rows. */
  private Long successRowCount;

  public DeleteDataResult setFailedPrimaryKeys(Collection<String> failedPrimaryKeys) {
    this.failedPrimaryKeys = failedPrimaryKeys;
    return this;
  }

  public Collection<String> getFailedPrimaryKeys() {
    return failedPrimaryKeys;
  }

  public DeleteDataResult setSuccessRowCount(Long successRowCount) {
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
    DeleteDataResult that = (DeleteDataResult) o;
    return Objects.equals(failedPrimaryKeys, that.failedPrimaryKeys)
        && Objects.equals(successRowCount, that.successRowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failedPrimaryKeys, successRowCount);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataResult.class)
        .add("failedPrimaryKeys", failedPrimaryKeys)
        .add("successRowCount", successRowCount)
        .toString();
  }

  DeleteDataResultPb toPb() {
    DeleteDataResultPb pb = new DeleteDataResultPb();
    pb.setFailedPrimaryKeys(failedPrimaryKeys);
    pb.setSuccessRowCount(successRowCount);

    return pb;
  }

  static DeleteDataResult fromPb(DeleteDataResultPb pb) {
    DeleteDataResult model = new DeleteDataResult();
    model.setFailedPrimaryKeys(pb.getFailedPrimaryKeys());
    model.setSuccessRowCount(pb.getSuccessRowCount());

    return model;
  }

  public static class DeleteDataResultSerializer extends JsonSerializer<DeleteDataResult> {
    @Override
    public void serialize(DeleteDataResult value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDataResultPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDataResultDeserializer extends JsonDeserializer<DeleteDataResult> {
    @Override
    public DeleteDataResult deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDataResultPb pb = mapper.readValue(p, DeleteDataResultPb.class);
      return DeleteDataResult.fromPb(pb);
    }
  }
}
