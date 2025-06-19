// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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
    using = DeleteSyncedDatabaseTableResponse.DeleteSyncedDatabaseTableResponseSerializer.class)
@JsonDeserialize(
    using = DeleteSyncedDatabaseTableResponse.DeleteSyncedDatabaseTableResponseDeserializer.class)
public class DeleteSyncedDatabaseTableResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSyncedDatabaseTableResponse.class).toString();
  }

  DeleteSyncedDatabaseTableResponsePb toPb() {
    DeleteSyncedDatabaseTableResponsePb pb = new DeleteSyncedDatabaseTableResponsePb();

    return pb;
  }

  static DeleteSyncedDatabaseTableResponse fromPb(DeleteSyncedDatabaseTableResponsePb pb) {
    DeleteSyncedDatabaseTableResponse model = new DeleteSyncedDatabaseTableResponse();

    return model;
  }

  public static class DeleteSyncedDatabaseTableResponseSerializer
      extends JsonSerializer<DeleteSyncedDatabaseTableResponse> {
    @Override
    public void serialize(
        DeleteSyncedDatabaseTableResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSyncedDatabaseTableResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSyncedDatabaseTableResponseDeserializer
      extends JsonDeserializer<DeleteSyncedDatabaseTableResponse> {
    @Override
    public DeleteSyncedDatabaseTableResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSyncedDatabaseTableResponsePb pb =
          mapper.readValue(p, DeleteSyncedDatabaseTableResponsePb.class);
      return DeleteSyncedDatabaseTableResponse.fromPb(pb);
    }
  }
}
