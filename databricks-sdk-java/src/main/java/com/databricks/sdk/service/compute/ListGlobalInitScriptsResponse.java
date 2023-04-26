// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListGlobalInitScriptsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListGlobalInitScriptsResponse {
  /** */
  @JsonProperty("scripts")
  private Collection<GlobalInitScriptDetails> scripts;

  /**
   * <p>Setter for the field <code>scripts</code>.</p>
   *
   * @param scripts a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.compute.ListGlobalInitScriptsResponse} object
   */
  public ListGlobalInitScriptsResponse setScripts(Collection<GlobalInitScriptDetails> scripts) {
    this.scripts = scripts;
    return this;
  }

  /**
   * <p>Getter for the field <code>scripts</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<GlobalInitScriptDetails> getScripts() {
    return scripts;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListGlobalInitScriptsResponse that = (ListGlobalInitScriptsResponse) o;
    return Objects.equals(scripts, that.scripts);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(scripts);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListGlobalInitScriptsResponse.class).add("scripts", scripts).toString();
  }
}
