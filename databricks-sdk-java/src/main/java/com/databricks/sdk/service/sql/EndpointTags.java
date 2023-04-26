// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>EndpointTags class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EndpointTags {
  /** */
  @JsonProperty("custom_tags")
  private Collection<EndpointTagPair> customTags;

  /**
   * <p>Setter for the field <code>customTags</code>.</p>
   *
   * @param customTags a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sql.EndpointTags} object
   */
  public EndpointTags setCustomTags(Collection<EndpointTagPair> customTags) {
    this.customTags = customTags;
    return this;
  }

  /**
   * <p>Getter for the field <code>customTags</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<EndpointTagPair> getCustomTags() {
    return customTags;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointTags that = (EndpointTags) o;
    return Objects.equals(customTags, that.customTags);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(customTags);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EndpointTags.class).add("customTags", customTags).toString();
  }
}
