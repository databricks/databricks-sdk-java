// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MicrosoftTeamsConfig {
  /** [Input-Only] URL for Microsoft Teams. */
  @JsonProperty("url")
  private String url;

  /** [Output-Only] Whether URL is set. */
  @JsonProperty("url_set")
  private Boolean urlSet;

  public MicrosoftTeamsConfig setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public MicrosoftTeamsConfig setUrlSet(Boolean urlSet) {
    this.urlSet = urlSet;
    return this;
  }

  public Boolean getUrlSet() {
    return urlSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MicrosoftTeamsConfig that = (MicrosoftTeamsConfig) o;
    return Objects.equals(url, that.url) && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(MicrosoftTeamsConfig.class)
        .add("url", url)
        .add("urlSet", urlSet)
        .toString();
  }
}
