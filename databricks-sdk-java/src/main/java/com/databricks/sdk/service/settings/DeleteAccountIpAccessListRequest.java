// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** Delete access list */
@Generated
@JsonSerialize(
    using = DeleteAccountIpAccessListRequest.DeleteAccountIpAccessListRequestSerializer.class)
@JsonDeserialize(
    using = DeleteAccountIpAccessListRequest.DeleteAccountIpAccessListRequestDeserializer.class)
public class DeleteAccountIpAccessListRequest {
  /** The ID for the corresponding IP access list */
  private String ipAccessListId;

  public DeleteAccountIpAccessListRequest setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteAccountIpAccessListRequest that = (DeleteAccountIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }

  DeleteAccountIpAccessListRequestPb toPb() {
    DeleteAccountIpAccessListRequestPb pb = new DeleteAccountIpAccessListRequestPb();
    pb.setIpAccessListId(ipAccessListId);

    return pb;
  }

  static DeleteAccountIpAccessListRequest fromPb(DeleteAccountIpAccessListRequestPb pb) {
    DeleteAccountIpAccessListRequest model = new DeleteAccountIpAccessListRequest();
    model.setIpAccessListId(pb.getIpAccessListId());

    return model;
  }

  public static class DeleteAccountIpAccessListRequestSerializer
      extends JsonSerializer<DeleteAccountIpAccessListRequest> {
    @Override
    public void serialize(
        DeleteAccountIpAccessListRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAccountIpAccessListRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAccountIpAccessListRequestDeserializer
      extends JsonDeserializer<DeleteAccountIpAccessListRequest> {
    @Override
    public DeleteAccountIpAccessListRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAccountIpAccessListRequestPb pb =
          mapper.readValue(p, DeleteAccountIpAccessListRequestPb.class);
      return DeleteAccountIpAccessListRequest.fromPb(pb);
    }
  }
}
