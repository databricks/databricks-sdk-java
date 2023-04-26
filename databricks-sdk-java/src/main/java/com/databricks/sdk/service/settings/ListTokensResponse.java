// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListTokensResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListTokensResponse {
  /** The information for each token. */
  @JsonProperty("token_infos")
  private Collection<PublicTokenInfo> tokenInfos;

  /**
   * <p>Setter for the field <code>tokenInfos</code>.</p>
   *
   * @param tokenInfos a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.settings.ListTokensResponse} object
   */
  public ListTokensResponse setTokenInfos(Collection<PublicTokenInfo> tokenInfos) {
    this.tokenInfos = tokenInfos;
    return this;
  }

  /**
   * <p>Getter for the field <code>tokenInfos</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PublicTokenInfo> getTokenInfos() {
    return tokenInfos;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTokensResponse that = (ListTokensResponse) o;
    return Objects.equals(tokenInfos, that.tokenInfos);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(tokenInfos);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListTokensResponse.class).add("tokenInfos", tokenInfos).toString();
  }
}
