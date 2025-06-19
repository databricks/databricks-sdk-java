// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
    using = ExperimentAccessControlRequest.ExperimentAccessControlRequestSerializer.class)
@JsonDeserialize(
    using = ExperimentAccessControlRequest.ExperimentAccessControlRequestDeserializer.class)
public class ExperimentAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private ExperimentPermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public ExperimentAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ExperimentAccessControlRequest setPermissionLevel(
      ExperimentPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ExperimentPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ExperimentAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ExperimentAccessControlRequest setUserName(String userName) {
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
    ExperimentAccessControlRequest that = (ExperimentAccessControlRequest) o;
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
    return new ToStringer(ExperimentAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  ExperimentAccessControlRequestPb toPb() {
    ExperimentAccessControlRequestPb pb = new ExperimentAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static ExperimentAccessControlRequest fromPb(ExperimentAccessControlRequestPb pb) {
    ExperimentAccessControlRequest model = new ExperimentAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class ExperimentAccessControlRequestSerializer
      extends JsonSerializer<ExperimentAccessControlRequest> {
    @Override
    public void serialize(
        ExperimentAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentAccessControlRequestDeserializer
      extends JsonDeserializer<ExperimentAccessControlRequest> {
    @Override
    public ExperimentAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentAccessControlRequestPb pb =
          mapper.readValue(p, ExperimentAccessControlRequestPb.class);
      return ExperimentAccessControlRequest.fromPb(pb);
    }
  }
}
