// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The pricing tier of the workspace. For pricing tier information, see [AWS Pricing].
 *
 * <p>[AWS Pricing]: https://databricks.com/product/aws-pricing
 */
@Generated
public enum PricingTier {
  @JsonProperty("COMMUNITY_EDITION")
  COMMUNITY_EDITION,

  @JsonProperty("DEDICATED")
  DEDICATED,

  @JsonProperty("ENTERPRISE")
  ENTERPRISE,

  @JsonProperty("PREMIUM")
  PREMIUM,

  @JsonProperty("STANDARD")
  STANDARD,

  @JsonProperty("UNKNOWN")
  UNKNOWN,
}
