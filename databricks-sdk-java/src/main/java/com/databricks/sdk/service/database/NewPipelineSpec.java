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

/**
 * Custom fields that user can set for pipeline while creating SyncedDatabaseTable. Note that other
 * fields of pipeline are still inferred by table def internally
 */
@Generated
@JsonSerialize(using = NewPipelineSpec.NewPipelineSpecSerializer.class)
@JsonDeserialize(using = NewPipelineSpec.NewPipelineSpecDeserializer.class)
public class NewPipelineSpec {
  /**
   * UC catalog for the pipeline to store intermediate files (checkpoints, event logs etc). This
   * needs to be a standard catalog where the user has permissions to create Delta tables.
   */
  private String storageCatalog;

  /**
   * UC schema for the pipeline to store intermediate files (checkpoints, event logs etc). This
   * needs to be in the standard catalog where the user has permissions to create Delta tables.
   */
  private String storageSchema;

  public NewPipelineSpec setStorageCatalog(String storageCatalog) {
    this.storageCatalog = storageCatalog;
    return this;
  }

  public String getStorageCatalog() {
    return storageCatalog;
  }

  public NewPipelineSpec setStorageSchema(String storageSchema) {
    this.storageSchema = storageSchema;
    return this;
  }

  public String getStorageSchema() {
    return storageSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NewPipelineSpec that = (NewPipelineSpec) o;
    return Objects.equals(storageCatalog, that.storageCatalog)
        && Objects.equals(storageSchema, that.storageSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageCatalog, storageSchema);
  }

  @Override
  public String toString() {
    return new ToStringer(NewPipelineSpec.class)
        .add("storageCatalog", storageCatalog)
        .add("storageSchema", storageSchema)
        .toString();
  }

  NewPipelineSpecPb toPb() {
    NewPipelineSpecPb pb = new NewPipelineSpecPb();
    pb.setStorageCatalog(storageCatalog);
    pb.setStorageSchema(storageSchema);

    return pb;
  }

  static NewPipelineSpec fromPb(NewPipelineSpecPb pb) {
    NewPipelineSpec model = new NewPipelineSpec();
    model.setStorageCatalog(pb.getStorageCatalog());
    model.setStorageSchema(pb.getStorageSchema());

    return model;
  }

  public static class NewPipelineSpecSerializer extends JsonSerializer<NewPipelineSpec> {
    @Override
    public void serialize(NewPipelineSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NewPipelineSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NewPipelineSpecDeserializer extends JsonDeserializer<NewPipelineSpec> {
    @Override
    public NewPipelineSpec deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NewPipelineSpecPb pb = mapper.readValue(p, NewPipelineSpecPb.class);
      return NewPipelineSpec.fromPb(pb);
    }
  }
}
