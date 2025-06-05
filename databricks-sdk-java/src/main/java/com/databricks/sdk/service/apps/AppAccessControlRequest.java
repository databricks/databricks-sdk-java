// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = AppAccessControlRequest.AppAccessControlRequestSerializer.class)
@JsonDeserialize(using = AppAccessControlRequest.AppAccessControlRequestDeserializer.class)
public class AppAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private AppPermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public AppAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public AppAccessControlRequest setPermissionLevel(AppPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public AppPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public AppAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public AppAccessControlRequest setUserName(String userName) {
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
    AppAccessControlRequest that = (AppAccessControlRequest) o;
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
    return new ToStringer(AppAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  AppAccessControlRequestPb toPb() {
    AppAccessControlRequestPb pb = new AppAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static AppAccessControlRequest fromPb(AppAccessControlRequestPb pb) {
    AppAccessControlRequest model = new AppAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class AppAccessControlRequestSerializer
      extends JsonSerializer<AppAccessControlRequest> {
    @Override
    public void serialize(
        AppAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppAccessControlRequestDeserializer
      extends JsonDeserializer<AppAccessControlRequest> {
    @Override
    public AppAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppAccessControlRequestPb pb = mapper.readValue(p, AppAccessControlRequestPb.class);
      return AppAccessControlRequest.fromPb(pb);
    }
  }
}
