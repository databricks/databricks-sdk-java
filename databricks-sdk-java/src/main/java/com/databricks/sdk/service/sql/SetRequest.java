// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
import java.util.Collection;
import java.util.Objects;

/** Set object ACL */
@Generated
@JsonSerialize(using = SetRequest.SetRequestSerializer.class)
@JsonDeserialize(using = SetRequest.SetRequestDeserializer.class)
public class SetRequest {
  /** */
  private Collection<AccessControl> accessControlList;

  /**
   * Object ID. The ACL for the object with this UUID is overwritten by this request's POST content.
   */
  private String objectId;

  /** The type of object permission to set. */
  private ObjectTypePlural objectType;

  public SetRequest setAccessControlList(Collection<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControl> getAccessControlList() {
    return accessControlList;
  }

  public SetRequest setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public SetRequest setObjectType(ObjectTypePlural objectType) {
    this.objectType = objectType;
    return this;
  }

  public ObjectTypePlural getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetRequest that = (SetRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(SetRequest.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  SetRequestPb toPb() {
    SetRequestPb pb = new SetRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static SetRequest fromPb(SetRequestPb pb) {
    SetRequest model = new SetRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class SetRequestSerializer extends JsonSerializer<SetRequest> {
    @Override
    public void serialize(SetRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetRequestDeserializer extends JsonDeserializer<SetRequest> {
    @Override
    public SetRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetRequestPb pb = mapper.readValue(p, SetRequestPb.class);
      return SetRequest.fromPb(pb);
    }
  }
}
