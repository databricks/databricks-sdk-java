// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = TokenAccessControlRequest.TokenAccessControlRequestSerializer.class)
@JsonDeserialize(using = TokenAccessControlRequest.TokenAccessControlRequestDeserializer.class)
public class TokenAccessControlRequest {
  /** name of the group */
  private String groupName;

  /** Permission level */
  private TokenPermissionLevel permissionLevel;

  /** application ID of a service principal */
  private String servicePrincipalName;

  /** name of the user */
  private String userName;

  public TokenAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public TokenAccessControlRequest setPermissionLevel(TokenPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public TokenPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public TokenAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public TokenAccessControlRequest setUserName(String userName) {
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
    TokenAccessControlRequest that = (TokenAccessControlRequest) o;
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
    return new ToStringer(TokenAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }

  TokenAccessControlRequestPb toPb() {
    TokenAccessControlRequestPb pb = new TokenAccessControlRequestPb();
    pb.setGroupName(groupName);
    pb.setPermissionLevel(permissionLevel);
    pb.setServicePrincipalName(servicePrincipalName);
    pb.setUserName(userName);

    return pb;
  }

  static TokenAccessControlRequest fromPb(TokenAccessControlRequestPb pb) {
    TokenAccessControlRequest model = new TokenAccessControlRequest();
    model.setGroupName(pb.getGroupName());
    model.setPermissionLevel(pb.getPermissionLevel());
    model.setServicePrincipalName(pb.getServicePrincipalName());
    model.setUserName(pb.getUserName());

    return model;
  }

  public static class TokenAccessControlRequestSerializer
      extends JsonSerializer<TokenAccessControlRequest> {
    @Override
    public void serialize(
        TokenAccessControlRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TokenAccessControlRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TokenAccessControlRequestDeserializer
      extends JsonDeserializer<TokenAccessControlRequest> {
    @Override
    public TokenAccessControlRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TokenAccessControlRequestPb pb = mapper.readValue(p, TokenAccessControlRequestPb.class);
      return TokenAccessControlRequest.fromPb(pb);
    }
  }
}
