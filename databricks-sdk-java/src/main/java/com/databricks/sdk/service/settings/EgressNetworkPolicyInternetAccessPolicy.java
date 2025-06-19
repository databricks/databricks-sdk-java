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
        EgressNetworkPolicyInternetAccessPolicy.EgressNetworkPolicyInternetAccessPolicySerializer
            .class)
@JsonDeserialize(
    using =
        EgressNetworkPolicyInternetAccessPolicy.EgressNetworkPolicyInternetAccessPolicyDeserializer
            .class)
public class EgressNetworkPolicyInternetAccessPolicy {
  /** */
  private Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
      allowedInternetDestinations;

  /** */
  private Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
      allowedStorageDestinations;

  /** Optional. If not specified, assume the policy is enforced for all workloads. */
  private EgressNetworkPolicyInternetAccessPolicyLogOnlyMode logOnlyMode;

  /**
   * At which level can Databricks and Databricks managed compute access Internet. FULL_ACCESS:
   * Databricks can access Internet. No blocking rules will apply. RESTRICTED_ACCESS: Databricks can
   * only access explicitly allowed internet and storage destinations, as well as UC connections and
   * external locations. PRIVATE_ACCESS_ONLY (not used): Databricks can only access destinations via
   * private link.
   */
  private EgressNetworkPolicyInternetAccessPolicyRestrictionMode restrictionMode;

  public EgressNetworkPolicyInternetAccessPolicy setAllowedInternetDestinations(
      Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
          allowedInternetDestinations) {
    this.allowedInternetDestinations = allowedInternetDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyInternetDestination>
      getAllowedInternetDestinations() {
    return allowedInternetDestinations;
  }

  public EgressNetworkPolicyInternetAccessPolicy setAllowedStorageDestinations(
      Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
          allowedStorageDestinations) {
    this.allowedStorageDestinations = allowedStorageDestinations;
    return this;
  }

  public Collection<EgressNetworkPolicyInternetAccessPolicyStorageDestination>
      getAllowedStorageDestinations() {
    return allowedStorageDestinations;
  }

  public EgressNetworkPolicyInternetAccessPolicy setLogOnlyMode(
      EgressNetworkPolicyInternetAccessPolicyLogOnlyMode logOnlyMode) {
    this.logOnlyMode = logOnlyMode;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyLogOnlyMode getLogOnlyMode() {
    return logOnlyMode;
  }

  public EgressNetworkPolicyInternetAccessPolicy setRestrictionMode(
      EgressNetworkPolicyInternetAccessPolicyRestrictionMode restrictionMode) {
    this.restrictionMode = restrictionMode;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicyRestrictionMode getRestrictionMode() {
    return restrictionMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicyInternetAccessPolicy that = (EgressNetworkPolicyInternetAccessPolicy) o;
    return Objects.equals(allowedInternetDestinations, that.allowedInternetDestinations)
        && Objects.equals(allowedStorageDestinations, that.allowedStorageDestinations)
        && Objects.equals(logOnlyMode, that.logOnlyMode)
        && Objects.equals(restrictionMode, that.restrictionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        allowedInternetDestinations, allowedStorageDestinations, logOnlyMode, restrictionMode);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicyInternetAccessPolicy.class)
        .add("allowedInternetDestinations", allowedInternetDestinations)
        .add("allowedStorageDestinations", allowedStorageDestinations)
        .add("logOnlyMode", logOnlyMode)
        .add("restrictionMode", restrictionMode)
        .toString();
  }

  EgressNetworkPolicyInternetAccessPolicyPb toPb() {
    EgressNetworkPolicyInternetAccessPolicyPb pb = new EgressNetworkPolicyInternetAccessPolicyPb();
    pb.setAllowedInternetDestinations(allowedInternetDestinations);
    pb.setAllowedStorageDestinations(allowedStorageDestinations);
    pb.setLogOnlyMode(logOnlyMode);
    pb.setRestrictionMode(restrictionMode);

    return pb;
  }

  static EgressNetworkPolicyInternetAccessPolicy fromPb(
      EgressNetworkPolicyInternetAccessPolicyPb pb) {
    EgressNetworkPolicyInternetAccessPolicy model = new EgressNetworkPolicyInternetAccessPolicy();
    model.setAllowedInternetDestinations(pb.getAllowedInternetDestinations());
    model.setAllowedStorageDestinations(pb.getAllowedStorageDestinations());
    model.setLogOnlyMode(pb.getLogOnlyMode());
    model.setRestrictionMode(pb.getRestrictionMode());

    return model;
  }

  public static class EgressNetworkPolicyInternetAccessPolicySerializer
      extends JsonSerializer<EgressNetworkPolicyInternetAccessPolicy> {
    @Override
    public void serialize(
        EgressNetworkPolicyInternetAccessPolicy value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      EgressNetworkPolicyInternetAccessPolicyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EgressNetworkPolicyInternetAccessPolicyDeserializer
      extends JsonDeserializer<EgressNetworkPolicyInternetAccessPolicy> {
    @Override
    public EgressNetworkPolicyInternetAccessPolicy deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EgressNetworkPolicyInternetAccessPolicyPb pb =
          mapper.readValue(p, EgressNetworkPolicyInternetAccessPolicyPb.class);
      return EgressNetworkPolicyInternetAccessPolicy.fromPb(pb);
    }
  }
}
