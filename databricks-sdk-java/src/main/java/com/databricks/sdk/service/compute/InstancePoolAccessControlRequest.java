// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
    using = InstancePoolAccessControlRequest.InstancePoolAccessControlRequestSerializer.class)
@JsonDeserialize(
    using = InstancePoolAccessControlRequest.InstancePoolAccessControlRequestDeserializer.class)
public class InstancePoolAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private InstancePoolPermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public InstancePoolAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public InstancePoolAccessControlRequest setPermissionLevel(
      InstancePoolPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public InstancePoolPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public InstancePoolAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public InstancePoolAccessControlRequest setUserName(String userName) {
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
    InstancePoolAccessControlRequest that = (InstancePoolAccessControlRequest) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  InstancePoolAccessControlRequestPb toPb() {
    InstancePoolAccessControlRequestPb pb = new InstancePoolAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static InstancePoolAccessControlRequest fromPb(InstancePoolAccessControlRequestPb pb) {
    InstancePoolAccessControlRequest model = new InstancePoolAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class InstancePoolAccessControlRequestSerializer
      extends JsonSerializer<InstancePoolAccessControlRequest> {
    @Override
    public void serialize(
        InstancePoolAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolAccessControlRequestDeserializer
      extends JsonDeserializer<InstancePoolAccessControlRequest> {
    @Override
    public InstancePoolAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolAccessControlRequestPb pb =
          mapper.readValue(p, InstancePoolAccessControlRequestPb.class);
      return InstancePoolAccessControlRequest.fromPb(pb);
    }
  }
}
