// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListAccountUserPreferencesMetadataResponse {
  /**
   * A token that can be sent as `page_token` to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** List of all settings available via public APIs and their metadata */
  @JsonProperty("settings_metadata")
  private Collection<SettingsMetadata> settingsMetadata;

  public ListAccountUserPreferencesMetadataResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAccountUserPreferencesMetadataResponse setSettingsMetadata(
      Collection<SettingsMetadata> settingsMetadata) {
    this.settingsMetadata = settingsMetadata;
    return this;
  }

  public Collection<SettingsMetadata> getSettingsMetadata() {
    return settingsMetadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAccountUserPreferencesMetadataResponse that =
        (ListAccountUserPreferencesMetadataResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(settingsMetadata, that.settingsMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, settingsMetadata);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAccountUserPreferencesMetadataResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("settingsMetadata", settingsMetadata)
        .toString();
  }
}
