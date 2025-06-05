// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SlackConfigPb {
  @JsonProperty("url")
  private String url;

  @JsonProperty("url_set")
  private Boolean urlSet;

  public SlackConfigPb setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public SlackConfigPb setUrlSet(Boolean urlSet) {
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
    SlackConfigPb that = (SlackConfigPb) o;
    return Objects.equals(url, that.url) && Objects.equals(urlSet, that.urlSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlSet);
  }

  @Override
  public String toString() {
    return new ToStringer(SlackConfigPb.class).add("url", url).add("urlSet", urlSet).toString();
  }
}
