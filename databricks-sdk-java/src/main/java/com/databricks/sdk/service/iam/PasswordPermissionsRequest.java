// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
@JsonSerialize(using = PasswordPermissionsRequest.PasswordPermissionsRequestSerializer.class)
@JsonDeserialize(using = PasswordPermissionsRequest.PasswordPermissionsRequestDeserializer.class)
public class PasswordPermissionsRequest {
  /** */
  private Collection<PasswordAccessControlRequest> accessControlList;

  public PasswordPermissionsRequest setAccessControlList(
      Collection<PasswordAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<PasswordAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PasswordPermissionsRequest that = (PasswordPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList);
  }

  @Override
  public String toString() {
    return new ToStringer(PasswordPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .toString();
  }

  PasswordPermissionsRequestPb toPb() {
    PasswordPermissionsRequestPb pb = new PasswordPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);

    return pb;
  }

  static PasswordPermissionsRequest fromPb(PasswordPermissionsRequestPb pb) {
    PasswordPermissionsRequest model = new PasswordPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());

    return model;
  }

  public static class PasswordPermissionsRequestSerializer
      extends JsonSerializer<PasswordPermissionsRequest> {
    @Override
    public void serialize(
        PasswordPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PasswordPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PasswordPermissionsRequestDeserializer
      extends JsonDeserializer<PasswordPermissionsRequest> {
    @Override
    public PasswordPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PasswordPermissionsRequestPb pb = mapper.readValue(p, PasswordPermissionsRequestPb.class);
      return PasswordPermissionsRequest.fromPb(pb);
    }
  }
}
