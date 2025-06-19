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
@JsonSerialize(
    using =
        GenerateTemporaryTableCredentialRequest.GenerateTemporaryTableCredentialRequestSerializer
            .class)
@JsonDeserialize(
    using =
        GenerateTemporaryTableCredentialRequest.GenerateTemporaryTableCredentialRequestDeserializer
            .class)
public class GenerateTemporaryTableCredentialRequest {
  /**
   * The operation performed against the table data, either READ or READ_WRITE. If READ_WRITE is
   * specified, the credentials returned will have write permissions, otherwise, it will be read
   * only.
   */
  private TableOperation operation;

  /** UUID of the table to read or write. */
  private String tableId;

  public GenerateTemporaryTableCredentialRequest setOperation(TableOperation operation) {
    this.operation = operation;
    return this;
  }

  public TableOperation getOperation() {
    return operation;
  }

  public GenerateTemporaryTableCredentialRequest setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  public String getTableId() {
    return tableId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenerateTemporaryTableCredentialRequest that = (GenerateTemporaryTableCredentialRequest) o;
    return Objects.equals(operation, that.operation) && Objects.equals(tableId, that.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, tableId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenerateTemporaryTableCredentialRequest.class)
        .add("operation", operation)
        .add("tableId", tableId)
        .toString();
  }

  GenerateTemporaryTableCredentialRequestPb toPb() {
    GenerateTemporaryTableCredentialRequestPb pb = new GenerateTemporaryTableCredentialRequestPb();
    pb.setOperation(operation);
    pb.setTableId(tableId);

    return pb;
  }

  static GenerateTemporaryTableCredentialRequest fromPb(
      GenerateTemporaryTableCredentialRequestPb pb) {
    GenerateTemporaryTableCredentialRequest model = new GenerateTemporaryTableCredentialRequest();
    model.setOperation(pb.getOperation());
    model.setTableId(pb.getTableId());

    return model;
  }

  public static class GenerateTemporaryTableCredentialRequestSerializer
      extends JsonSerializer<GenerateTemporaryTableCredentialRequest> {
    @Override
    public void serialize(
        GenerateTemporaryTableCredentialRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GenerateTemporaryTableCredentialRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GenerateTemporaryTableCredentialRequestDeserializer
      extends JsonDeserializer<GenerateTemporaryTableCredentialRequest> {
    @Override
    public GenerateTemporaryTableCredentialRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GenerateTemporaryTableCredentialRequestPb pb =
          mapper.readValue(p, GenerateTemporaryTableCredentialRequestPb.class);
      return GenerateTemporaryTableCredentialRequest.fromPb(pb);
    }
  }
}
