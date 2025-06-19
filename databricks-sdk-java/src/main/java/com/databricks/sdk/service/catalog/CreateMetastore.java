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
@JsonSerialize(using = CreateMetastore.CreateMetastoreSerializer.class)
@JsonDeserialize(using = CreateMetastore.CreateMetastoreDeserializer.class)
public class CreateMetastore {
  /** The user-specified name of the metastore. */
  private String name;

  /** Cloud region which the metastore serves (e.g., `us-west-2`, `westus`). */
  private String region;

  /** The storage root URL for metastore */
  private String storageRoot;

  public CreateMetastore setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateMetastore setRegion(String region) {
    this.region = region;
    return this;
  }

  public String getRegion() {
    return region;
  }

  public CreateMetastore setStorageRoot(String storageRoot) {
    this.storageRoot = storageRoot;
    return this;
  }

  public String getStorageRoot() {
    return storageRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateMetastore that = (CreateMetastore) o;
    return Objects.equals(name, that.name)
        && Objects.equals(region, that.region)
        && Objects.equals(storageRoot, that.storageRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, storageRoot);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateMetastore.class)
        .add("name", name)
        .add("region", region)
        .add("storageRoot", storageRoot)
        .toString();
  }

  CreateMetastorePb toPb() {
    CreateMetastorePb pb = new CreateMetastorePb();
    pb.setName(name);
    pb.setRegion(region);
    pb.setStorageRoot(storageRoot);

    return pb;
  }

  static CreateMetastore fromPb(CreateMetastorePb pb) {
    CreateMetastore model = new CreateMetastore();
    model.setName(pb.getName());
    model.setRegion(pb.getRegion());
    model.setStorageRoot(pb.getStorageRoot());

    return model;
  }

  public static class CreateMetastoreSerializer extends JsonSerializer<CreateMetastore> {
    @Override
    public void serialize(CreateMetastore value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateMetastorePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateMetastoreDeserializer extends JsonDeserializer<CreateMetastore> {
    @Override
    public CreateMetastore deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateMetastorePb pb = mapper.readValue(p, CreateMetastorePb.class);
      return CreateMetastore.fromPb(pb);
    }
  }
}
