// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = AuthorizationDetailsGrantRule.AuthorizationDetailsGrantRuleSerializer.class)
@JsonDeserialize(
    using = AuthorizationDetailsGrantRule.AuthorizationDetailsGrantRuleDeserializer.class)
public class AuthorizationDetailsGrantRule {
  /**
   * Permission sets for dashboard are defined in
   * iam-common/rbac-common/permission-sets/definitions/TreeStoreBasePermissionSets Ex:
   * `permissionSets/dashboard.runner`
   */
  private String permissionSet;

  public AuthorizationDetailsGrantRule setPermissionSet(String permissionSet) {
    this.permissionSet = permissionSet;
    return this;
  }

  public String getPermissionSet() {
    return permissionSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuthorizationDetailsGrantRule that = (AuthorizationDetailsGrantRule) o;
    return Objects.equals(permissionSet, that.permissionSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionSet);
  }

  @Override
  public String toString() {
    return new ToStringer(AuthorizationDetailsGrantRule.class)
        .add("permissionSet", permissionSet)
        .toString();
  }

  AuthorizationDetailsGrantRulePb toPb() {
    AuthorizationDetailsGrantRulePb pb = new AuthorizationDetailsGrantRulePb();
    pb.setPermissionSet(permissionSet);

    return pb;
  }

  static AuthorizationDetailsGrantRule fromPb(AuthorizationDetailsGrantRulePb pb) {
    AuthorizationDetailsGrantRule model = new AuthorizationDetailsGrantRule();
    model.setPermissionSet(pb.getPermissionSet());

    return model;
  }

  public static class AuthorizationDetailsGrantRuleSerializer
      extends JsonSerializer<AuthorizationDetailsGrantRule> {
    @Override
    public void serialize(
        AuthorizationDetailsGrantRule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AuthorizationDetailsGrantRulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AuthorizationDetailsGrantRuleDeserializer
      extends JsonDeserializer<AuthorizationDetailsGrantRule> {
    @Override
    public AuthorizationDetailsGrantRule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AuthorizationDetailsGrantRulePb pb =
          mapper.readValue(p, AuthorizationDetailsGrantRulePb.class);
      return AuthorizationDetailsGrantRule.fromPb(pb);
    }
  }
}
