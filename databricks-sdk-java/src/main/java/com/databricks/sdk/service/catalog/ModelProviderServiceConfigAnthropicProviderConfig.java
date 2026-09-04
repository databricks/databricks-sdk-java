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
   * Direct authentication with an API key supplied in `direct.api_key.plaintext`. Required unless
   * `relayed` is set.
   */
  @JsonProperty("direct")
  private ModelProviderServiceConfigAnthropicProviderDirectConfig direct;

  /**
   * Relayed authentication. Each inference request supplies the caller's OAuth token, which is
   * forwarded to Anthropic. No Anthropic credential is stored. Mutually exclusive with `direct`.
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
