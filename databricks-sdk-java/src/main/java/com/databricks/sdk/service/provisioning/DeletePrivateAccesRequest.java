// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

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

/** Delete a private access settings object */
@Generated
@JsonSerialize(using = DeletePrivateAccesRequest.DeletePrivateAccesRequestSerializer.class)
@JsonDeserialize(using = DeletePrivateAccesRequest.DeletePrivateAccesRequestDeserializer.class)
public class DeletePrivateAccesRequest {
  /** Databricks Account API private access settings ID. */
  private String privateAccessSettingsId;

  public DeletePrivateAccesRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
    this.privateAccessSettingsId = privateAccessSettingsId;
    return this;
  }

  public String getPrivateAccessSettingsId() {
    return privateAccessSettingsId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeletePrivateAccesRequest that = (DeletePrivateAccesRequest) o;
    return Objects.equals(privateAccessSettingsId, that.privateAccessSettingsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateAccessSettingsId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeletePrivateAccesRequest.class)
        .add("privateAccessSettingsId", privateAccessSettingsId)
        .toString();
  }

  DeletePrivateAccesRequestPb toPb() {
    DeletePrivateAccesRequestPb pb = new DeletePrivateAccesRequestPb();
    pb.setPrivateAccessSettingsId(privateAccessSettingsId);

    return pb;
  }

  static DeletePrivateAccesRequest fromPb(DeletePrivateAccesRequestPb pb) {
    DeletePrivateAccesRequest model = new DeletePrivateAccesRequest();
    model.setPrivateAccessSettingsId(pb.getPrivateAccessSettingsId());

    return model;
  }

  public static class DeletePrivateAccesRequestSerializer
      extends JsonSerializer<DeletePrivateAccesRequest> {
    @Override
    public void serialize(
        DeletePrivateAccesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePrivateAccesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePrivateAccesRequestDeserializer
      extends JsonDeserializer<DeletePrivateAccesRequest> {
    @Override
    public DeletePrivateAccesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePrivateAccesRequestPb pb = mapper.readValue(p, DeletePrivateAccesRequestPb.class);
      return DeletePrivateAccesRequest.fromPb(pb);
    }
  }
}
