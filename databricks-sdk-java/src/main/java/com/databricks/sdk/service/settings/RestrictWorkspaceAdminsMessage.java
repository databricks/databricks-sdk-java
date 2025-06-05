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

@Generated
@JsonSerialize(
    using = RestrictWorkspaceAdminsMessage.RestrictWorkspaceAdminsMessageSerializer.class)
@JsonDeserialize(
    using = RestrictWorkspaceAdminsMessage.RestrictWorkspaceAdminsMessageDeserializer.class)
public class RestrictWorkspaceAdminsMessage {
  /** */
  private RestrictWorkspaceAdminsMessageStatus status;

  public RestrictWorkspaceAdminsMessage setStatus(RestrictWorkspaceAdminsMessageStatus status) {
    this.status = status;
    return this;
  }

  public RestrictWorkspaceAdminsMessageStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestrictWorkspaceAdminsMessage that = (RestrictWorkspaceAdminsMessage) o;
    return Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    return new ToStringer(RestrictWorkspaceAdminsMessage.class).add("status", status).toString();
  }

  RestrictWorkspaceAdminsMessagePb toPb() {
    RestrictWorkspaceAdminsMessagePb pb = new RestrictWorkspaceAdminsMessagePb();
    pb.setStatus(status);

    return pb;
  }

  static RestrictWorkspaceAdminsMessage fromPb(RestrictWorkspaceAdminsMessagePb pb) {
    RestrictWorkspaceAdminsMessage model = new RestrictWorkspaceAdminsMessage();
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class RestrictWorkspaceAdminsMessageSerializer
      extends JsonSerializer<RestrictWorkspaceAdminsMessage> {
    @Override
    public void serialize(
        RestrictWorkspaceAdminsMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestrictWorkspaceAdminsMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestrictWorkspaceAdminsMessageDeserializer
      extends JsonDeserializer<RestrictWorkspaceAdminsMessage> {
    @Override
    public RestrictWorkspaceAdminsMessage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestrictWorkspaceAdminsMessagePb pb =
          mapper.readValue(p, RestrictWorkspaceAdminsMessagePb.class);
      return RestrictWorkspaceAdminsMessage.fromPb(pb);
    }
  }
}
