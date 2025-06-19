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
    using =
        ServingEndpointAccessControlResponse.ServingEndpointAccessControlResponseSerializer.class)
@JsonDeserialize(
    using =
        ServingEndpointAccessControlResponse.ServingEndpointAccessControlResponseDeserializer.class)
public class ServingEndpointAccessControlResponse {
  /** All permissions. */
  private Collection<ServingEndpointPermission> allPermissions;

  /** Display name of the user or service principal. */
  private String displayName;

  /** name of the group */
  private String groupName;

  /** Name of the service principal. */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public ServingEndpointAccessControlResponse setAllPermissions(
      Collection<ServingEndpointPermission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<ServingEndpointPermission> getAllPermissions() {
    return allPermissions;
  }

  public ServingEndpointAccessControlResponse setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ServingEndpointAccessControlResponse setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ServingEndpointAccessControlResponse setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ServingEndpointAccessControlResponse setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpointAccessControlResponse that = (ServingEndpointAccessControlResponse) o;
    return Objects.equals(allPermissions, that.allPermissions)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPermissions, displayName, groupName, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointAccessControlResponse.class)
        .add("allPermissions", allPermissions)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  ServingEndpointAccessControlResponsePb toPb() {
    ServingEndpointAccessControlResponsePb pb = new ServingEndpointAccessControlResponsePb();
    pb.setAllPermissions(allPermissions);
    pb.setDisplayName(displayName);
    pb.setGroupName(groupName);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static ServingEndpointAccessControlResponse fromPb(ServingEndpointAccessControlResponsePb pb) {
    ServingEndpointAccessControlResponse model = new ServingEndpointAccessControlResponse();
    model.setAllPermissions(pb.getAllPermissions());
    model.setDisplayName(pb.getDisplayName());
    model.setGroupName(pb.getGroupName());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class ServingEndpointAccessControlResponseSerializer
      extends JsonSerializer<ServingEndpointAccessControlResponse> {
    @Override
    public void serialize(
        ServingEndpointAccessControlResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServingEndpointAccessControlResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServingEndpointAccessControlResponseDeserializer
      extends JsonDeserializer<ServingEndpointAccessControlResponse> {
    @Override
    public ServingEndpointAccessControlResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServingEndpointAccessControlResponsePb pb =
          mapper.readValue(p, ServingEndpointAccessControlResponsePb.class);
      return ServingEndpointAccessControlResponse.fromPb(pb);
    }
  }
}
