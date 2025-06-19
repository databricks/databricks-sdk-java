// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
@JsonSerialize(
    using = ServingEndpointPermissionsRequest.ServingEndpointPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = ServingEndpointPermissionsRequest.ServingEndpointPermissionsRequestDeserializer.class)
public class ServingEndpointPermissionsRequest {
  /** */
  private Collection<ServingEndpointAccessControlRequest> accessControlList;

  /** The serving endpoint for which to get or manage permissions. */
  private String servingEndpointId;

  public ServingEndpointPermissionsRequest setAccessControlList(
      Collection<ServingEndpointAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ServingEndpointAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ServingEndpointPermissionsRequest setServingEndpointId(String servingEndpointId) {
    this.servingEndpointId = servingEndpointId;
    return this;
  }

  public String getServingEndpointId() {
    return servingEndpointId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpointPermissionsRequest that = (ServingEndpointPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(servingEndpointId, that.servingEndpointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, servingEndpointId);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("servingEndpointId", servingEndpointId)
        .toString();
  }

  ServingEndpointPermissionsRequestPb toPb() {
    ServingEndpointPermissionsRequestPb pb = new ServingEndpointPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setServingEndpointId(servingEndpointId);

    return pb;
  }

  static ServingEndpointPermissionsRequest fromPb(ServingEndpointPermissionsRequestPb pb) {
    ServingEndpointPermissionsRequest model = new ServingEndpointPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setServingEndpointId(pb.getServingEndpointId());

    return model;
  }

  public static class ServingEndpointPermissionsRequestSerializer
      extends JsonSerializer<ServingEndpointPermissionsRequest> {
    @Override
    public void serialize(
        ServingEndpointPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServingEndpointPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServingEndpointPermissionsRequestDeserializer
      extends JsonDeserializer<ServingEndpointPermissionsRequest> {
    @Override
    public ServingEndpointPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServingEndpointPermissionsRequestPb pb =
          mapper.readValue(p, ServingEndpointPermissionsRequestPb.class);
      return ServingEndpointPermissionsRequest.fromPb(pb);
    }
  }
}
