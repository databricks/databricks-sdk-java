// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Which Anthropic subscription tier the relayed OAuth token belongs to. Immutable after Create
 * (switching tiers changes which governance controls the platform enforces). Only MAX and
 * TEAM_ENTERPRISE differ in the governance surface the gateway can enforce, not in how the token is
 * relayed.
 */
@Generated
public enum ModelProviderServiceConfigAnthropicProviderRelayedConfigAnthropicRelayedPlanType {
  ANTHROPIC_RELAYED_PLAN_TYPE_MAX,
  ANTHROPIC_RELAYED_PLAN_TYPE_TEAM_ENTERPRISE,
}
