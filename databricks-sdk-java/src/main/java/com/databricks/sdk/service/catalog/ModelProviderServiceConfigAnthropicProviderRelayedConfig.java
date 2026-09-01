// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Relayed form of Anthropic provider config: no credential is stored. Authentication is the
 * caller's own OAuth token, forwarded to Anthropic on outbound requests, so there is no persisted
 * secret. Presence of this variant is the signal that the provider service uses relayed auth;
 * `plan_type` further distinguishes which Anthropic subscription tier the token belongs to.
 */
@Generated
public class ModelProviderServiceConfigAnthropicProviderRelayedConfig {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAnthropicProviderRelayedConfig.class)
        .toString();
  }
}
