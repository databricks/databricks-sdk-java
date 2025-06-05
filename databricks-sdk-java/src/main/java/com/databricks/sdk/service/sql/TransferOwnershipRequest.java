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
import java.util.Objects;

/** Transfer object ownership */
@Generated
@JsonSerialize(using = TransferOwnershipRequest.TransferOwnershipRequestSerializer.class)
@JsonDeserialize(using = TransferOwnershipRequest.TransferOwnershipRequestDeserializer.class)
public class TransferOwnershipRequest {
  /** Email address for the new owner, who must exist in the workspace. */
  private String newOwner;

  /** The ID of the object on which to change ownership. */
  private TransferOwnershipObjectId objectId;

  /** The type of object on which to change ownership. */
  private OwnableObjectType objectType;

  public TransferOwnershipRequest setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  public String getNewOwner() {
    return newOwner;
  }

  public TransferOwnershipRequest setObjectId(TransferOwnershipObjectId objectId) {
    this.objectId = objectId;
    return this;
  }

  public TransferOwnershipObjectId getObjectId() {
    return objectId;
  }

  public TransferOwnershipRequest setObjectType(OwnableObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  public OwnableObjectType getObjectType() {
    return objectType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipRequest that = (TransferOwnershipRequest) o;
    return Objects.equals(newOwner, that.newOwner)
        && Objects.equals(objectId, that.objectId)
        && Objects.equals(objectType, that.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner, objectId, objectType);
  }

  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipRequest.class)
        .add("newOwner", newOwner)
        .add("objectId", objectId)
        .add("objectType", objectType)
        .toString();
  }

  TransferOwnershipRequestPb toPb() {
    TransferOwnershipRequestPb pb = new TransferOwnershipRequestPb();
    pb.setNewOwner(newOwner);
    pb.setObjectId(objectId);
    pb.setObjectType(objectType);

    return pb;
  }

  static TransferOwnershipRequest fromPb(TransferOwnershipRequestPb pb) {
    TransferOwnershipRequest model = new TransferOwnershipRequest();
    model.setNewOwner(pb.getNewOwner());
    model.setObjectId(pb.getObjectId());
    model.setObjectType(pb.getObjectType());

    return model;
  }

  public static class TransferOwnershipRequestSerializer
      extends JsonSerializer<TransferOwnershipRequest> {
    @Override
    public void serialize(
        TransferOwnershipRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TransferOwnershipRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TransferOwnershipRequestDeserializer
      extends JsonDeserializer<TransferOwnershipRequest> {
    @Override
    public TransferOwnershipRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TransferOwnershipRequestPb pb = mapper.readValue(p, TransferOwnershipRequestPb.class);
      return TransferOwnershipRequest.fromPb(pb);
    }
  }
}
