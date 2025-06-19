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

/**
 * Contains an information about the enablement status judging (e.g. whether the enterprise tier is
 * enabled) This is only additional information that MUST NOT be used to decide whether the setting
 * is enabled or not. This is intended to use only for purposes like showing an error message to the
 * customer with the additional details. For example, using these details we can check why exactly
 * the feature is disabled for this customer.
 */
@Generated
@JsonSerialize(
    using =
        ClusterAutoRestartMessageEnablementDetails
            .ClusterAutoRestartMessageEnablementDetailsSerializer.class)
@JsonDeserialize(
    using =
        ClusterAutoRestartMessageEnablementDetails
            .ClusterAutoRestartMessageEnablementDetailsDeserializer.class)
public class ClusterAutoRestartMessageEnablementDetails {
  /** The feature is force enabled if compliance mode is active */
  private Boolean forcedForComplianceMode;

  /**
   * The feature is unavailable if the corresponding entitlement disabled (see
   * getShieldEntitlementEnable)
   */
  private Boolean unavailableForDisabledEntitlement;

  /** The feature is unavailable if the customer doesn't have enterprise tier */
  private Boolean unavailableForNonEnterpriseTier;

  public ClusterAutoRestartMessageEnablementDetails setForcedForComplianceMode(
      Boolean forcedForComplianceMode) {
    this.forcedForComplianceMode = forcedForComplianceMode;
    return this;
  }

  public Boolean getForcedForComplianceMode() {
    return forcedForComplianceMode;
  }

  public ClusterAutoRestartMessageEnablementDetails setUnavailableForDisabledEntitlement(
      Boolean unavailableForDisabledEntitlement) {
    this.unavailableForDisabledEntitlement = unavailableForDisabledEntitlement;
    return this;
  }

  public Boolean getUnavailableForDisabledEntitlement() {
    return unavailableForDisabledEntitlement;
  }

  public ClusterAutoRestartMessageEnablementDetails setUnavailableForNonEnterpriseTier(
      Boolean unavailableForNonEnterpriseTier) {
    this.unavailableForNonEnterpriseTier = unavailableForNonEnterpriseTier;
    return this;
  }

  public Boolean getUnavailableForNonEnterpriseTier() {
    return unavailableForNonEnterpriseTier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterAutoRestartMessageEnablementDetails that =
        (ClusterAutoRestartMessageEnablementDetails) o;
    return Objects.equals(forcedForComplianceMode, that.forcedForComplianceMode)
        && Objects.equals(unavailableForDisabledEntitlement, that.unavailableForDisabledEntitlement)
        && Objects.equals(unavailableForNonEnterpriseTier, that.unavailableForNonEnterpriseTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        forcedForComplianceMode,
        unavailableForDisabledEntitlement,
        unavailableForNonEnterpriseTier);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterAutoRestartMessageEnablementDetails.class)
        .add("forcedForComplianceMode", forcedForComplianceMode)
        .add("unavailableForDisabledEntitlement", unavailableForDisabledEntitlement)
        .add("unavailableForNonEnterpriseTier", unavailableForNonEnterpriseTier)
        .toString();
  }

  ClusterAutoRestartMessageEnablementDetailsPb toPb() {
    ClusterAutoRestartMessageEnablementDetailsPb pb =
        new ClusterAutoRestartMessageEnablementDetailsPb();
    pb.setForcedForComplianceMode(forcedForComplianceMode);
    pb.setUnavailableForDisabledEntitlement(unavailableForDisabledEntitlement);
    pb.setUnavailableForNonEnterpriseTier(unavailableForNonEnterpriseTier);

    return pb;
  }

  static ClusterAutoRestartMessageEnablementDetails fromPb(
      ClusterAutoRestartMessageEnablementDetailsPb pb) {
    ClusterAutoRestartMessageEnablementDetails model =
        new ClusterAutoRestartMessageEnablementDetails();
    model.setForcedForComplianceMode(pb.getForcedForComplianceMode());
    model.setUnavailableForDisabledEntitlement(pb.getUnavailableForDisabledEntitlement());
    model.setUnavailableForNonEnterpriseTier(pb.getUnavailableForNonEnterpriseTier());

    return model;
  }

  public static class ClusterAutoRestartMessageEnablementDetailsSerializer
      extends JsonSerializer<ClusterAutoRestartMessageEnablementDetails> {
    @Override
    public void serialize(
        ClusterAutoRestartMessageEnablementDetails value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ClusterAutoRestartMessageEnablementDetailsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterAutoRestartMessageEnablementDetailsDeserializer
      extends JsonDeserializer<ClusterAutoRestartMessageEnablementDetails> {
    @Override
    public ClusterAutoRestartMessageEnablementDetails deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterAutoRestartMessageEnablementDetailsPb pb =
          mapper.readValue(p, ClusterAutoRestartMessageEnablementDetailsPb.class);
      return ClusterAutoRestartMessageEnablementDetails.fromPb(pb);
    }
  }
}
