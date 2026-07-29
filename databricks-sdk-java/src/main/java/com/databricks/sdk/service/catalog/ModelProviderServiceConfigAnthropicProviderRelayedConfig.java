// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Relayed form of Anthropic provider config: no credential is stored. Authentication is the
 * caller's own OAuth token, forwarded to Anthropic on outbound requests, so there is no persisted
 * secret. Presence of this variant is the signal that the provider service uses relayed auth;
 * `plan_type` further distinguishes which Anthropic subscription tier the token belongs to.
 */
@Generated
public class ModelProviderServiceConfigAnthropicProviderRelayedConfig {
  /**
   * Which Anthropic subscription tier the relayed token belongs to. Optional; when unset the MPS
   * gets the full governance surface (see TEAM_ENTERPRISE). Immutable after Create, so the tier
   * cannot be flipped in place.
   */
  @JsonProperty("plan_type")
  private ModelProviderServiceConfigAnthropicProviderRelayedConfigAnthropicRelayedPlanType planType;

  public ModelProviderServiceConfigAnthropicProviderRelayedConfig setPlanType(
      ModelProviderServiceConfigAnthropicProviderRelayedConfigAnthropicRelayedPlanType planType) {
    this.planType = planType;
    return this;
  }

  public ModelProviderServiceConfigAnthropicProviderRelayedConfigAnthropicRelayedPlanType
      getPlanType() {
    return planType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAnthropicProviderRelayedConfig that =
        (ModelProviderServiceConfigAnthropicProviderRelayedConfig) o;
    return Objects.equals(planType, that.planType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planType);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAnthropicProviderRelayedConfig.class)
        .add("planType", planType)
        .toString();
  }
}
