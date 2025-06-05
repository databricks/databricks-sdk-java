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
import java.util.Objects;

@Generated
@JsonSerialize(using = DeleteDataVectorIndexResponse.DeleteDataVectorIndexResponseSerializer.class)
@JsonDeserialize(
    using = DeleteDataVectorIndexResponse.DeleteDataVectorIndexResponseDeserializer.class)
public class DeleteDataVectorIndexResponse {
  /** Result of the upsert or delete operation. */
  private DeleteDataResult result;

  /** Status of the delete operation. */
  private DeleteDataStatus status;

  public DeleteDataVectorIndexResponse setResult(DeleteDataResult result) {
    this.result = result;
    return this;
  }

  public DeleteDataResult getResult() {
    return result;
  }

  public DeleteDataVectorIndexResponse setStatus(DeleteDataStatus status) {
    this.status = status;
    return this;
  }

  public DeleteDataStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteDataVectorIndexResponse that = (DeleteDataVectorIndexResponse) o;
    return Objects.equals(result, that.result) && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteDataVectorIndexResponse.class)
        .add("result", result)
        .add("status", status)
        .toString();
  }

  DeleteDataVectorIndexResponsePb toPb() {
    DeleteDataVectorIndexResponsePb pb = new DeleteDataVectorIndexResponsePb();
    pb.setResult(result);
    pb.setStatus(status);

    return pb;
  }

  static DeleteDataVectorIndexResponse fromPb(DeleteDataVectorIndexResponsePb pb) {
    DeleteDataVectorIndexResponse model = new DeleteDataVectorIndexResponse();
    model.setResult(pb.getResult());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class DeleteDataVectorIndexResponseSerializer
      extends JsonSerializer<DeleteDataVectorIndexResponse> {
    @Override
    public void serialize(
        DeleteDataVectorIndexResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDataVectorIndexResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDataVectorIndexResponseDeserializer
      extends JsonDeserializer<DeleteDataVectorIndexResponse> {
    @Override
    public DeleteDataVectorIndexResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDataVectorIndexResponsePb pb =
          mapper.readValue(p, DeleteDataVectorIndexResponsePb.class);
      return DeleteDataVectorIndexResponse.fromPb(pb);
    }
  }
}
