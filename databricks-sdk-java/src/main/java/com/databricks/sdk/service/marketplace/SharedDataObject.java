// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = SharedDataObject.SharedDataObjectSerializer.class)
@JsonDeserialize(using = SharedDataObject.SharedDataObjectDeserializer.class)
public class SharedDataObject {
  /** The type of the data object. Could be one of: TABLE, SCHEMA, NOTEBOOK_FILE, MODEL, VOLUME */
  private String dataObjectType;

  /** Name of the shared object */
  private String name;

  public SharedDataObject setDataObjectType(String dataObjectType) {
    this.dataObjectType = dataObjectType;
    return this;
  }

  public String getDataObjectType() {
    return dataObjectType;
  }

  public SharedDataObject setName(String name) {
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
    SharedDataObject that = (SharedDataObject) o;
    return Objects.equals(dataObjectType, that.dataObjectType) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataObjectType, name);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObject.class)
        .add("dataObjectType", dataObjectType)
        .add("name", name)
        .toString();
  }

  SharedDataObjectPb toPb() {
    SharedDataObjectPb pb = new SharedDataObjectPb();
    pb.setDataObjectType(dataObjectType);
    pb.setName(name);

    return pb;
  }

  static SharedDataObject fromPb(SharedDataObjectPb pb) {
    SharedDataObject model = new SharedDataObject();
    model.setDataObjectType(pb.getDataObjectType());
    model.setName(pb.getName());

    return model;
  }

  public static class SharedDataObjectSerializer extends JsonSerializer<SharedDataObject> {
    @Override
    public void serialize(SharedDataObject value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SharedDataObjectPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SharedDataObjectDeserializer extends JsonDeserializer<SharedDataObject> {
    @Override
    public SharedDataObject deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SharedDataObjectPb pb = mapper.readValue(p, SharedDataObjectPb.class);
      return SharedDataObject.fromPb(pb);
    }
  }
}
