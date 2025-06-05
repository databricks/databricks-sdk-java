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

@Generated
@JsonSerialize(using = TransferOwnershipObjectId.TransferOwnershipObjectIdSerializer.class)
@JsonDeserialize(using = TransferOwnershipObjectId.TransferOwnershipObjectIdDeserializer.class)
public class TransferOwnershipObjectId {
  /** Email address for the new owner, who must exist in the workspace. */
  private String newOwner;

  public TransferOwnershipObjectId setNewOwner(String newOwner) {
    this.newOwner = newOwner;
    return this;
  }

  public String getNewOwner() {
    return newOwner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TransferOwnershipObjectId that = (TransferOwnershipObjectId) o;
    return Objects.equals(newOwner, that.newOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newOwner);
  }

  @Override
  public String toString() {
    return new ToStringer(TransferOwnershipObjectId.class).add("newOwner", newOwner).toString();
  }

  TransferOwnershipObjectIdPb toPb() {
    TransferOwnershipObjectIdPb pb = new TransferOwnershipObjectIdPb();
    pb.setNewOwner(newOwner);

    return pb;
  }

  static TransferOwnershipObjectId fromPb(TransferOwnershipObjectIdPb pb) {
    TransferOwnershipObjectId model = new TransferOwnershipObjectId();
    model.setNewOwner(pb.getNewOwner());

    return model;
  }

  public static class TransferOwnershipObjectIdSerializer
      extends JsonSerializer<TransferOwnershipObjectId> {
    @Override
    public void serialize(
        TransferOwnershipObjectId value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TransferOwnershipObjectIdPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TransferOwnershipObjectIdDeserializer
      extends JsonDeserializer<TransferOwnershipObjectId> {
    @Override
    public TransferOwnershipObjectId deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TransferOwnershipObjectIdPb pb = mapper.readValue(p, TransferOwnershipObjectIdPb.class);
      return TransferOwnershipObjectId.fromPb(pb);
    }
  }
}
