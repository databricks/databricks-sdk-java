// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A secret value supplied as part of an inline provider config. The caller supplies the value as
 * inline `plaintext` on writes; the platform stores it encrypted. The `plaintext` field is
 * `INPUT_ONLY` and never round-trips on reads.
 */
@Generated
public class ModelProviderServiceConfigProviderSecret {
  /**
   * Inline plaintext credential. INPUT_ONLY: the value never round-trips on reads. Get and List
   * responses omit `plaintext`; the field's presence in the read shape only indicates that a secret
   * is configured.
   */
  @JsonProperty("plaintext")
  private String plaintext;

  public ModelProviderServiceConfigProviderSecret setPlaintext(String plaintext) {
    this.plaintext = plaintext;
    return this;
  }

  public String getPlaintext() {
    return plaintext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ModelProviderServiceConfigProviderSecret that = (ModelProviderServiceConfigProviderSecret) o;
    return Objects.equals(plaintext, that.plaintext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plaintext);
  }

  @Override
  public String toString() {
    return new ToStringer(ModelProviderServiceConfigProviderSecret.class)
        .add("plaintext", plaintext)
        .toString();
  }
}
