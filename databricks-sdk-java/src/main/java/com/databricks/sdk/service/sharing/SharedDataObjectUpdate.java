// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

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
@JsonSerialize(using = SharedDataObjectUpdate.SharedDataObjectUpdateSerializer.class)
@JsonDeserialize(using = SharedDataObjectUpdate.SharedDataObjectUpdateDeserializer.class)
public class SharedDataObjectUpdate {
  /** One of: **ADD**, **REMOVE**, **UPDATE**. */
  private SharedDataObjectUpdateAction action;

  /** The data object that is being added, removed, or updated. */
  private SharedDataObject dataObject;

  public SharedDataObjectUpdate setAction(SharedDataObjectUpdateAction action) {
    this.action = action;
    return this;
  }

  public SharedDataObjectUpdateAction getAction() {
    return action;
  }

  public SharedDataObjectUpdate setDataObject(SharedDataObject dataObject) {
    this.dataObject = dataObject;
    return this;
  }

  public SharedDataObject getDataObject() {
    return dataObject;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SharedDataObjectUpdate that = (SharedDataObjectUpdate) o;
    return Objects.equals(action, that.action) && Objects.equals(dataObject, that.dataObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, dataObject);
  }

  @Override
  public String toString() {
    return new ToStringer(SharedDataObjectUpdate.class)
        .add("action", action)
        .add("dataObject", dataObject)
        .toString();
  }

  SharedDataObjectUpdatePb toPb() {
    SharedDataObjectUpdatePb pb = new SharedDataObjectUpdatePb();
    pb.setAction(action);
    pb.setDataObject(dataObject);

    return pb;
  }

  static SharedDataObjectUpdate fromPb(SharedDataObjectUpdatePb pb) {
    SharedDataObjectUpdate model = new SharedDataObjectUpdate();
    model.setAction(pb.getAction());
    model.setDataObject(pb.getDataObject());

    return model;
  }

  public static class SharedDataObjectUpdateSerializer
      extends JsonSerializer<SharedDataObjectUpdate> {
    @Override
    public void serialize(
        SharedDataObjectUpdate value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SharedDataObjectUpdatePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SharedDataObjectUpdateDeserializer
      extends JsonDeserializer<SharedDataObjectUpdate> {
    @Override
    public SharedDataObjectUpdate deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SharedDataObjectUpdatePb pb = mapper.readValue(p, SharedDataObjectUpdatePb.class);
      return SharedDataObjectUpdate.fromPb(pb);
    }
  }
}
