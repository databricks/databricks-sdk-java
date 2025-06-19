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
@JsonSerialize(
    using =
        GetAssignableRolesForResourceResponse.GetAssignableRolesForResourceResponseSerializer.class)
@JsonDeserialize(
    using =
        GetAssignableRolesForResourceResponse.GetAssignableRolesForResourceResponseDeserializer
            .class)
public class GetAssignableRolesForResourceResponse {
  /** */
  private Collection<Role> roles;

  public GetAssignableRolesForResourceResponse setRoles(Collection<Role> roles) {
    this.roles = roles;
    return this;
  }

  public Collection<Role> getRoles() {
    return roles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAssignableRolesForResourceResponse that = (GetAssignableRolesForResourceResponse) o;
    return Objects.equals(roles, that.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAssignableRolesForResourceResponse.class)
        .add("roles", roles)
        .toString();
  }

  GetAssignableRolesForResourceResponsePb toPb() {
    GetAssignableRolesForResourceResponsePb pb = new GetAssignableRolesForResourceResponsePb();
    pb.setRoles(roles);

    return pb;
  }

  static GetAssignableRolesForResourceResponse fromPb(GetAssignableRolesForResourceResponsePb pb) {
    GetAssignableRolesForResourceResponse model = new GetAssignableRolesForResourceResponse();
    model.setRoles(pb.getRoles());

    return model;
  }

  public static class GetAssignableRolesForResourceResponseSerializer
      extends JsonSerializer<GetAssignableRolesForResourceResponse> {
    @Override
    public void serialize(
        GetAssignableRolesForResourceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAssignableRolesForResourceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAssignableRolesForResourceResponseDeserializer
      extends JsonDeserializer<GetAssignableRolesForResourceResponse> {
    @Override
    public GetAssignableRolesForResourceResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAssignableRolesForResourceResponsePb pb =
          mapper.readValue(p, GetAssignableRolesForResourceResponsePb.class);
      return GetAssignableRolesForResourceResponse.fromPb(pb);
    }
  }
}
