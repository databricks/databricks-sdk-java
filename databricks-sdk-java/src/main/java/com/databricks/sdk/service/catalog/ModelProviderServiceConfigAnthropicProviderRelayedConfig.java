// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Relayed Anthropic provider configuration. Each inference request supplies the caller's OAuth
 * token, which is forwarded to Anthropic. No Anthropic credential is stored.
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
