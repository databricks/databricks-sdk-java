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
@JsonSerialize(using = PasswordAccessControlResponse.PasswordAccessControlResponseSerializer.class)
@JsonDeserialize(
    using = PasswordAccessControlResponse.PasswordAccessControlResponseDeserializer.class)
public class PasswordAccessControlResponse {
  /** All permissions. */
  private Collection<PasswordPermission> allPermissions;

  /** Display name of the user or service principal. */
  private String displayName;

  /** name of the group */
  private String groupName;

  /** Name of the service principal. */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public PasswordAccessControlResponse setAllPermissions(
      Collection<PasswordPermission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<PasswordPermission> getAllPermissions() {
    return allPermissions;
  }

  public PasswordAccessControlResponse setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public PasswordAccessControlResponse setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public PasswordAccessControlResponse setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public PasswordAccessControlResponse setUserName(String userName) {
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
    PasswordAccessControlResponse that = (PasswordAccessControlResponse) o;
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
    return new ToStringer(PasswordAccessControlResponse.class)
        .add("allPermissions", allPermissions)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  PasswordAccessControlResponsePb toPb() {
    PasswordAccessControlResponsePb pb = new PasswordAccessControlResponsePb();
    pb.setAllPermissions(allPermissions);
    pb.setDisplayName(displayName);
    pb.setGroupName(groupName);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static PasswordAccessControlResponse fromPb(PasswordAccessControlResponsePb pb) {
    PasswordAccessControlResponse model = new PasswordAccessControlResponse();
    model.setAllPermissions(pb.getAllPermissions());
    model.setDisplayName(pb.getDisplayName());
    model.setGroupName(pb.getGroupName());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class PasswordAccessControlResponseSerializer
      extends JsonSerializer<PasswordAccessControlResponse> {
    @Override
    public void serialize(
        PasswordAccessControlResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PasswordAccessControlResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PasswordAccessControlResponseDeserializer
      extends JsonDeserializer<PasswordAccessControlResponse> {
    @Override
    public PasswordAccessControlResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PasswordAccessControlResponsePb pb =
          mapper.readValue(p, PasswordAccessControlResponsePb.class);
      return PasswordAccessControlResponse.fromPb(pb);
    }
  }
}
