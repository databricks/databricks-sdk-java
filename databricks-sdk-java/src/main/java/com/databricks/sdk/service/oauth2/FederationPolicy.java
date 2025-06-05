// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(using = FederationPolicy.FederationPolicySerializer.class)
@JsonDeserialize(using = FederationPolicy.FederationPolicyDeserializer.class)
public class FederationPolicy {
  /** Creation time of the federation policy. */
  private String createTime;

  /** Description of the federation policy. */
  private String description;

  /**
   * Resource name for the federation policy. Example values include
   * `accounts/<account-id>/federationPolicies/my-federation-policy` for Account Federation
   * Policies, and
   * `accounts/<account-id>/servicePrincipals/<service-principal-id>/federationPolicies/my-federation-policy`
   * for Service Principal Federation Policies. Typically an output parameter, which does not need
   * to be specified in create or update requests. If specified in a request, must match the value
   * in the request URL.
   */
  private String name;

  /** Specifies the policy to use for validating OIDC claims in your federated tokens. */
  private OidcFederationPolicy oidcPolicy;

  /** The ID of the federation policy. */
  private String policyId;

  /**
   * The service principal ID that this federation policy applies to. Only set for service principal
   * federation policies.
   */
  private Long servicePrincipalId;

  /** Unique, immutable id of the federation policy. */
  private String uid;

  /** Last update time of the federation policy. */
  private String updateTime;

  public FederationPolicy setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public FederationPolicy setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public FederationPolicy setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public FederationPolicy setOidcPolicy(OidcFederationPolicy oidcPolicy) {
    this.oidcPolicy = oidcPolicy;
    return this;
  }

  public OidcFederationPolicy getOidcPolicy() {
    return oidcPolicy;
  }

  public FederationPolicy setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  public FederationPolicy setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public FederationPolicy setUid(String uid) {
    this.uid = uid;
    return this;
  }

  public String getUid() {
    return uid;
  }

  public FederationPolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FederationPolicy that = (FederationPolicy) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(oidcPolicy, that.oidcPolicy)
        && Objects.equals(policyId, that.policyId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(uid, that.uid)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime, description, name, oidcPolicy, policyId, servicePrincipalId, uid, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(FederationPolicy.class)
        .add("createTime", createTime)
        .add("description", description)
        .add("name", name)
        .add("oidcPolicy", oidcPolicy)
        .add("policyId", policyId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("uid", uid)
        .add("updateTime", updateTime)
        .toString();
  }

  FederationPolicyPb toPb() {
    FederationPolicyPb pb = new FederationPolicyPb();
    pb.setCreateTime(createTime);
    pb.setDescription(description);
    pb.setName(name);
    pb.setOidcPolicy(oidcPolicy);
    pb.setPolicyId(policyId);
    pb.setServicePrincipalId(servicePrincipalId);
    pb.setUid(uid);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static FederationPolicy fromPb(FederationPolicyPb pb) {
    FederationPolicy model = new FederationPolicy();
    model.setCreateTime(pb.getCreateTime());
    model.setDescription(pb.getDescription());
    model.setName(pb.getName());
    model.setOidcPolicy(pb.getOidcPolicy());
    model.setPolicyId(pb.getPolicyId());
    model.setServicePrincipalId(pb.getServicePrincipalId());
    model.setUid(pb.getUid());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class FederationPolicySerializer extends JsonSerializer<FederationPolicy> {
    @Override
    public void serialize(FederationPolicy value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FederationPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FederationPolicyDeserializer extends JsonDeserializer<FederationPolicy> {
    @Override
    public FederationPolicy deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FederationPolicyPb pb = mapper.readValue(p, FederationPolicyPb.class);
      return FederationPolicy.fromPb(pb);
    }
  }
}
