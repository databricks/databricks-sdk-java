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

@Generated
@JsonSerialize(using = GetResponse.GetResponseSerializer.class)
@JsonDeserialize(using = GetResponse.GetResponseDeserializer.class)
public class GetResponse {
  /** */
  private Collection<AccessControl> accessControlList;

  /** An object's type and UUID, separated by a forward slash (/) character. */
  private String objectId;

  /** A singular noun object type. */
  private ObjectType objectType;

  public GetResponse setAccessControlList(Collection<AccessControl> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<AccessControl> getAccessControlList() {
    return accessControlList;
  }

  public GetResponse setObjectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  public String getObjectId() {
    return objectId;
  }

  public GetResponse setObjectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public ObjectType getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetResponse that = (GetResponse) o;
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
    return new ToStringer(GetResponse.class)
        .add("accessControlList", accessControlList)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  GetResponsePb toPb() {
    GetResponsePb pb = new GetResponsePb();
    pb.setAccessControlList(accessControlList);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static GetResponse fromPb(GetResponsePb pb) {
    GetResponse model = new GetResponse();
    model.setAccessControlList(pb.getAccessControlList());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class GetResponseSerializer extends JsonSerializer<GetResponse> {
    @Override
    public void serialize(GetResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetResponseDeserializer extends JsonDeserializer<GetResponse> {
    @Override
    public GetResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetResponsePb pb = mapper.readValue(p, GetResponsePb.class);
      return GetResponse.fromPb(pb);
    }
  }
}
