// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class MicrosoftTeamsConfigPb {
  @JsonProperty("url")
  private String url;

  @JsonProperty("url_set")
  private Boolean urlSet;

  public MicrosoftTeamsConfigPb setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public MicrosoftTeamsConfigPb setUrlSet(Boolean urlSet) {
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
    MicrosoftTeamsConfigPb that = (MicrosoftTeamsConfigPb) o;
    return Objects.equals(url, that.url) && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(MicrosoftTeamsConfigPb.class)
        .add("url", url)
        .add("urlSet", urlSet)
        .toString();
  }
}
