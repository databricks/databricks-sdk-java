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
@JsonSerialize(using = ClusterAccessControlRequest.ClusterAccessControlRequestSerializer.class)
@JsonDeserialize(using = ClusterAccessControlRequest.ClusterAccessControlRequestDeserializer.class)
public class ClusterAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private ClusterPermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public ClusterAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ClusterAccessControlRequest setPermissionLevel(ClusterPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ClusterPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ClusterAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ClusterAccessControlRequest setUserName(String userName) {
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
    ClusterAccessControlRequest that = (ClusterAccessControlRequest) o;
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
    return new ToStringer(ClusterAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  ClusterAccessControlRequestPb toPb() {
    ClusterAccessControlRequestPb pb = new ClusterAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static ClusterAccessControlRequest fromPb(ClusterAccessControlRequestPb pb) {
    ClusterAccessControlRequest model = new ClusterAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class ClusterAccessControlRequestSerializer
      extends JsonSerializer<ClusterAccessControlRequest> {
    @Override
    public void serialize(
        ClusterAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterAccessControlRequestDeserializer
      extends JsonDeserializer<ClusterAccessControlRequest> {
    @Override
    public ClusterAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterAccessControlRequestPb pb = mapper.readValue(p, ClusterAccessControlRequestPb.class);
      return ClusterAccessControlRequest.fromPb(pb);
    }
  }
}
