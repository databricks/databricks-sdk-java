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
@JsonSerialize(using = DeleteDatabaseCatalogResponse.DeleteDatabaseCatalogResponseSerializer.class)
@JsonDeserialize(
    using = DeleteDatabaseCatalogResponse.DeleteDatabaseCatalogResponseDeserializer.class)
public class DeleteDatabaseCatalogResponse {

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
    return new ToStringer(DeleteDatabaseCatalogResponse.class).toString();
  }

  DeleteDatabaseCatalogResponsePb toPb() {
    DeleteDatabaseCatalogResponsePb pb = new DeleteDatabaseCatalogResponsePb();

    return pb;
  }

  static DeleteDatabaseCatalogResponse fromPb(DeleteDatabaseCatalogResponsePb pb) {
    DeleteDatabaseCatalogResponse model = new DeleteDatabaseCatalogResponse();

    return model;
  }

  public static class DeleteDatabaseCatalogResponseSerializer
      extends JsonSerializer<DeleteDatabaseCatalogResponse> {
    @Override
    public void serialize(
        DeleteDatabaseCatalogResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDatabaseCatalogResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDatabaseCatalogResponseDeserializer
      extends JsonDeserializer<DeleteDatabaseCatalogResponse> {
    @Override
    public DeleteDatabaseCatalogResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDatabaseCatalogResponsePb pb =
          mapper.readValue(p, DeleteDatabaseCatalogResponsePb.class);
      return DeleteDatabaseCatalogResponse.fromPb(pb);
    }
  }
}
