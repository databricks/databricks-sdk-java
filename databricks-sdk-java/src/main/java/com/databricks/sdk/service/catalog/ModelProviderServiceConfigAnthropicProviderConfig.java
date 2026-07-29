// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Anthropic provider configuration. Exactly one of `direct` or `relayed` must be set on Create; the
 * two are mutually exclusive.
 */
@Generated
public class ModelProviderServiceConfigAnthropicProviderConfig {
  /**
   * Direct (inline-credentials) form: caller supplies the API key in the request body. Required on
   * Create unless `relayed` is set.
   */
  @JsonProperty("direct")
  private ModelProviderServiceConfigAnthropicProviderDirectConfig direct;

  /**
   * Relayed (credential-less) form: no Anthropic credential is stored. Each inference request
   * instead carries the caller's own OAuth token, which the platform forwards to Anthropic on
   * outbound requests. Mutually exclusive with `direct`; no `api_key` is required or persisted.
   */
  @JsonProperty("relayed")
  private ModelProviderServiceConfigAnthropicProviderRelayedConfig relayed;

  public ModelProviderServiceConfigAnthropicProviderConfig setDirect(
      ModelProviderServiceConfigAnthropicProviderDirectConfig direct) {
    this.direct = direct;
    return this;
  }

  public ModelProviderServiceConfigAnthropicProviderDirectConfig getDirect() {
    return direct;
  }

  public ModelProviderServiceConfigAnthropicProviderConfig setRelayed(
      ModelProviderServiceConfigAnthropicProviderRelayedConfig relayed) {
    this.relayed = relayed;
    return this;
  }

  public ModelProviderServiceConfigAnthropicProviderRelayedConfig getRelayed() {
    return relayed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigAnthropicProviderConfig that =
        (ModelProviderServiceConfigAnthropicProviderConfig) o;
    return Objects.equals(direct, that.direct) && Objects.equals(relayed, that.relayed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direct, relayed);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigAnthropicProviderConfig.class)
        .add("direct", direct)
        .add("relayed", relayed)
        .toString();
  }
}
