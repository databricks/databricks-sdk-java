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

/** Create a Synced Database Table */
@Generated
@JsonSerialize(
    using = CreateSyncedDatabaseTableRequest.CreateSyncedDatabaseTableRequestSerializer.class)
@JsonDeserialize(
    using = CreateSyncedDatabaseTableRequest.CreateSyncedDatabaseTableRequestDeserializer.class)
public class CreateSyncedDatabaseTableRequest {
  /** Next field marker: 12 */
  private SyncedDatabaseTable syncedTable;

  public CreateSyncedDatabaseTableRequest setSyncedTable(SyncedDatabaseTable syncedTable) {
    this.syncedTable = syncedTable;
    return this;
  }

  public SyncedDatabaseTable getSyncedTable() {
    return syncedTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateSyncedDatabaseTableRequest that = (CreateSyncedDatabaseTableRequest) o;
    return Objects.equals(syncedTable, that.syncedTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncedTable);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateSyncedDatabaseTableRequest.class)
        .add("syncedTable", syncedTable)
        .toString();
  }

  CreateSyncedDatabaseTableRequestPb toPb() {
    CreateSyncedDatabaseTableRequestPb pb = new CreateSyncedDatabaseTableRequestPb();
    pb.setSyncedTable(syncedTable);

    return pb;
  }

  static CreateSyncedDatabaseTableRequest fromPb(CreateSyncedDatabaseTableRequestPb pb) {
    CreateSyncedDatabaseTableRequest model = new CreateSyncedDatabaseTableRequest();
    model.setSyncedTable(pb.getSyncedTable());

    return model;
  }

  public static class CreateSyncedDatabaseTableRequestSerializer
      extends JsonSerializer<CreateSyncedDatabaseTableRequest> {
    @Override
    public void serialize(
        CreateSyncedDatabaseTableRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateSyncedDatabaseTableRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateSyncedDatabaseTableRequestDeserializer
      extends JsonDeserializer<CreateSyncedDatabaseTableRequest> {
    @Override
    public CreateSyncedDatabaseTableRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateSyncedDatabaseTableRequestPb pb =
          mapper.readValue(p, CreateSyncedDatabaseTableRequestPb.class);
      return CreateSyncedDatabaseTableRequest.fromPb(pb);
    }
  }
}
