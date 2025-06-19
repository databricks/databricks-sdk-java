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
    using = ClusterPolicyAccessControlRequest.ClusterPolicyAccessControlRequestSerializer.class)
@JsonDeserialize(
    using = ClusterPolicyAccessControlRequest.ClusterPolicyAccessControlRequestDeserializer.class)
public class ClusterPolicyAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private ClusterPolicyPermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public ClusterPolicyAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ClusterPolicyAccessControlRequest setPermissionLevel(
      ClusterPolicyPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ClusterPolicyPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ClusterPolicyAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ClusterPolicyAccessControlRequest setUserName(String userName) {
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
    ClusterPolicyAccessControlRequest that = (ClusterPolicyAccessControlRequest) o;
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
    return new ToStringer(ClusterPolicyAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  ClusterPolicyAccessControlRequestPb toPb() {
    ClusterPolicyAccessControlRequestPb pb = new ClusterPolicyAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static ClusterPolicyAccessControlRequest fromPb(ClusterPolicyAccessControlRequestPb pb) {
    ClusterPolicyAccessControlRequest model = new ClusterPolicyAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class ClusterPolicyAccessControlRequestSerializer
      extends JsonSerializer<ClusterPolicyAccessControlRequest> {
    @Override
    public void serialize(
        ClusterPolicyAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPolicyAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPolicyAccessControlRequestDeserializer
      extends JsonDeserializer<ClusterPolicyAccessControlRequest> {
    @Override
    public ClusterPolicyAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPolicyAccessControlRequestPb pb =
          mapper.readValue(p, ClusterPolicyAccessControlRequestPb.class);
      return ClusterPolicyAccessControlRequest.fromPb(pb);
    }
  }
}
