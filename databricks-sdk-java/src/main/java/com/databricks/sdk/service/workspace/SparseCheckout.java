// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Sparse checkout configuration, it contains options like cone patterns. */
@Generated
public class SparseCheckout {
  /**
   * List of sparse checkout cone patterns, see [cone mode handling] for details.
   *
   * <p>[cone mode handling]:
   * https://git-scm.com/docs/git-sparse-checkout#_internalscone_mode_handling
   */
  @JsonProperty("patterns")
  private Collection<String> patterns;

  public SparseCheckout setPatterns(Collection<String> patterns) {
    this.patterns = patterns;
    return this;
  }

  public Collection<String> getPatterns() {
    return patterns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SparseCheckout that = (SparseCheckout) o;
    return Objects.equals(patterns, that.patterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patterns);
  }

  @Override
  public String toString() {
    return new ToStringer(SparseCheckout.class).add("patterns", patterns).toString();
  }
}
