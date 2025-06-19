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
import java.util.Objects;

/** Get assignable roles for a resource */
@Generated
@JsonSerialize(
    using =
        GetAssignableRolesForResourceRequest.GetAssignableRolesForResourceRequestSerializer.class)
@JsonDeserialize(
    using =
        GetAssignableRolesForResourceRequest.GetAssignableRolesForResourceRequestDeserializer.class)
public class GetAssignableRolesForResourceRequest {
  /**
   * The resource name for which assignable roles will be listed.
   *
   * <p>Examples | Summary :--- | :--- `resource=accounts/<ACCOUNT_ID>` | A resource name for the
   * account. `resource=accounts/<ACCOUNT_ID>/groups/<GROUP_ID>` | A resource name for the group.
   * `resource=accounts/<ACCOUNT_ID>/servicePrincipals/<SP_ID>` | A resource name for the service
   * principal.
   */
  private String resource;

  public GetAssignableRolesForResourceRequest setResource(String resource) {
    this.resource = resource;
    return this;
  }

  public String getResource() {
    return resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAssignableRolesForResourceRequest that = (GetAssignableRolesForResourceRequest) o;
    return Objects.equals(resource, that.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resource);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAssignableRolesForResourceRequest.class)
        .add("resource", resource)
        .toString();
  }

  GetAssignableRolesForResourceRequestPb toPb() {
    GetAssignableRolesForResourceRequestPb pb = new GetAssignableRolesForResourceRequestPb();
    pb.setResource(resource);

    return pb;
  }

  static GetAssignableRolesForResourceRequest fromPb(GetAssignableRolesForResourceRequestPb pb) {
    GetAssignableRolesForResourceRequest model = new GetAssignableRolesForResourceRequest();
    model.setResource(pb.getResource());

    return model;
  }

  public static class GetAssignableRolesForResourceRequestSerializer
      extends JsonSerializer<GetAssignableRolesForResourceRequest> {
    @Override
    public void serialize(
        GetAssignableRolesForResourceRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAssignableRolesForResourceRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAssignableRolesForResourceRequestDeserializer
      extends JsonDeserializer<GetAssignableRolesForResourceRequest> {
    @Override
    public GetAssignableRolesForResourceRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAssignableRolesForResourceRequestPb pb =
          mapper.readValue(p, GetAssignableRolesForResourceRequestPb.class);
      return GetAssignableRolesForResourceRequest.fromPb(pb);
    }
  }
}
