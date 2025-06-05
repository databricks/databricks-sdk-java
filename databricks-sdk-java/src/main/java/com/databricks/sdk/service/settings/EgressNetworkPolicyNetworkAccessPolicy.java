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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicy.EgressNetworkPolicyNetworkAccessPolicySerializer
            .class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyNetworkAccessPolicy.EgressNetworkPolicyNetworkAccessPolicyDeserializer
            .class)
public class EgressNetworkPolicyNetworkAccessPolicy {
  /**
   * List of internet destinations that serverless workloads are allowed to access when in
   * RESTRICTED_ACCESS mode.
   */
  private Collection<EgressNetworkPolicyNetworkAccessPolicyInternetDestination>
      allowedInternetDestinations;

  /**
   * List of storage destinations that serverless workloads are allowed to access when in
   * RESTRICTED_ACCESS mode.
   */
  private Collection<EgressNetworkPolicyNetworkAccessPolicyStorageDestination>
      allowedStorageDestinations;

  /** Optional. When policy_enforcement is not provided, we default to ENFORCE_MODE_ALL_SERVICES */
  private EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement policyEnforcement;

  /** The restriction mode that controls how serverless workloads can access the internet. */
  private EgressNetworkPolicyNetworkAccessPolicyRestrictionMode restrictionMode;

  public EgressNetworkPolicyNetworkAccessPolicy setAllowedInternetDestinations(
      Collection<EgressNetworkPolicyNetworkAccessPolicyInternetDestination>
          allowedInternetDestinations) {
    this.allowedInternetDestinations = allowedInternetDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyNetworkAccessPolicyInternetDestination>
      getAllowedInternetDestinations() {
    return allowedInternetDestinations;
  }

  public EgressNetworkPolicyNetworkAccessPolicy setAllowedStorageDestinations(
      Collection<EgressNetworkPolicyNetworkAccessPolicyStorageDestination>
          allowedStorageDestinations) {
    this.allowedStorageDestinations = allowedStorageDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyNetworkAccessPolicyStorageDestination>
      getAllowedStorageDestinations() {
    return allowedStorageDestinations;
  }

  public EgressNetworkPolicyNetworkAccessPolicy setPolicyEnforcement(
      EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement policyEnforcement) {
    this.policyEnforcement = policyEnforcement;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyPolicyEnforcement getPolicyEnforcement() {
    return policyEnforcement;
  }

  public EgressNetworkPolicyNetworkAccessPolicy setRestrictionMode(
      EgressNetworkPolicyNetworkAccessPolicyRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicyRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyNetworkAccessPolicy that = (EgressNetworkPolicyNetworkAccessPolicy) o;
    return Objects.equals(allowedInternetDestinations, that.allowedInternetDestinations)
        && Objects.equals(allowedStorageDestinations, that.allowedStorageDestinations)
        && Objects.equals(policyEnforcement, that.policyEnforcement)
        && Objects.equals(restrictionMode, that.restrictionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedInternetDestinations,
        allowedStorageDestinations,
        policyEnforcement,
        restrictionMode);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyNetworkAccessPolicy.class)
        .add("allowedInternetDestinations", allowedInternetDestinations)
        .add("allowedStorageDestinations", allowedStorageDestinations)
        .add("policyEnforcement", policyEnforcement)
        .add("restrictionMode", restrictionMode)
        .toString();
  }

  EgressNetworkPolicyNetworkAccessPolicyPb toPb() {
    EgressNetworkPolicyNetworkAccessPolicyPb pb = new EgressNetworkPolicyNetworkAccessPolicyPb();
    pb.setAllowedInternetDestinations(allowedInternetDestinations);
    pb.setAllowedStorageDestinations(allowedStorageDestinations);
    pb.setPolicyEnforcement(policyEnforcement);
    pb.setRestrictionMode(restrictionMode);

    return pb;
  }

  static EgressNetworkPolicyNetworkAccessPolicy fromPb(
      EgressNetworkPolicyNetworkAccessPolicyPb pb) {
    EgressNetworkPolicyNetworkAccessPolicy model = new EgressNetworkPolicyNetworkAccessPolicy();
    model.setAllowedInternetDestinations(pb.getAllowedInternetDestinations());
    model.setAllowedStorageDestinations(pb.getAllowedStorageDestinations());
    model.setPolicyEnforcement(pb.getPolicyEnforcement());
    model.setRestrictionMode(pb.getRestrictionMode());

    return model;
  }

  public static class EgressNetworkPolicyNetworkAccessPolicySerializer
      extends JsonSerializer<EgressNetworkPolicyNetworkAccessPolicy> {
    @Override
    public void serialize(
        EgressNetworkPolicyNetworkAccessPolicy value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyNetworkAccessPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyNetworkAccessPolicyDeserializer
      extends JsonDeserializer<EgressNetworkPolicyNetworkAccessPolicy> {
    @Override
    public EgressNetworkPolicyNetworkAccessPolicy deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyNetworkAccessPolicyPb pb =
          mapper.readValue(p, EgressNetworkPolicyNetworkAccessPolicyPb.class);
      return EgressNetworkPolicyNetworkAccessPolicy.fromPb(pb);
    }
  }
}
