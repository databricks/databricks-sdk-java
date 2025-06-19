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
@JsonSerialize(using = DeleteIpAccessListRequest.DeleteIpAccessListRequestSerializer.class)
@JsonDeserialize(using = DeleteIpAccessListRequest.DeleteIpAccessListRequestDeserializer.class)
public class DeleteIpAccessListRequest {
  /** The ID for the corresponding IP access list */
  private String ipAccessListId;

  public DeleteIpAccessListRequest setIpAccessListId(String ipAccessListId) {
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
    DeleteIpAccessListRequest that = (DeleteIpAccessListRequest) o;
    return Objects.equals(ipAccessListId, that.ipAccessListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAccessListId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteIpAccessListRequest.class)
        .add("ipAccessListId", ipAccessListId)
        .toString();
  }

  DeleteIpAccessListRequestPb toPb() {
    DeleteIpAccessListRequestPb pb = new DeleteIpAccessListRequestPb();
    pb.setIpAccessListId(ipAccessListId);

    return pb;
  }

  static DeleteIpAccessListRequest fromPb(DeleteIpAccessListRequestPb pb) {
    DeleteIpAccessListRequest model = new DeleteIpAccessListRequest();
    model.setIpAccessListId(pb.getIpAccessListId());

    return model;
  }

  public static class DeleteIpAccessListRequestSerializer
      extends JsonSerializer<DeleteIpAccessListRequest> {
    @Override
    public void serialize(
        DeleteIpAccessListRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteIpAccessListRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteIpAccessListRequestDeserializer
      extends JsonDeserializer<DeleteIpAccessListRequest> {
    @Override
    public DeleteIpAccessListRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteIpAccessListRequestPb pb = mapper.readValue(p, DeleteIpAccessListRequestPb.class);
      return DeleteIpAccessListRequest.fromPb(pb);
    }
  }
}
