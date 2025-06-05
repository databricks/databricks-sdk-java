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

/** Delete a Synced Database Table */
@Generated
@JsonSerialize(
    using = DeleteSyncedDatabaseTableRequest.DeleteSyncedDatabaseTableRequestSerializer.class)
@JsonDeserialize(
    using = DeleteSyncedDatabaseTableRequest.DeleteSyncedDatabaseTableRequestDeserializer.class)
public class DeleteSyncedDatabaseTableRequest {
  /** */
  private String name;

  public DeleteSyncedDatabaseTableRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteSyncedDatabaseTableRequest that = (DeleteSyncedDatabaseTableRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteSyncedDatabaseTableRequest.class).add("name", name).toString();
  }

  DeleteSyncedDatabaseTableRequestPb toPb() {
    DeleteSyncedDatabaseTableRequestPb pb = new DeleteSyncedDatabaseTableRequestPb();
    pb.setName(name);

    return pb;
  }

  static DeleteSyncedDatabaseTableRequest fromPb(DeleteSyncedDatabaseTableRequestPb pb) {
    DeleteSyncedDatabaseTableRequest model = new DeleteSyncedDatabaseTableRequest();
    model.setName(pb.getName());

    return model;
  }

  public static class DeleteSyncedDatabaseTableRequestSerializer
      extends JsonSerializer<DeleteSyncedDatabaseTableRequest> {
    @Override
    public void serialize(
        DeleteSyncedDatabaseTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSyncedDatabaseTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSyncedDatabaseTableRequestDeserializer
      extends JsonDeserializer<DeleteSyncedDatabaseTableRequest> {
    @Override
    public DeleteSyncedDatabaseTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSyncedDatabaseTableRequestPb pb =
          mapper.readValue(p, DeleteSyncedDatabaseTableRequestPb.class);
      return DeleteSyncedDatabaseTableRequest.fromPb(pb);
    }
  }
}
