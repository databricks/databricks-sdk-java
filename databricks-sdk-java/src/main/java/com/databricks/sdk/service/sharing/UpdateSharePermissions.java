// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateSharePermissions {
  /** Array of permission changes. */
  @JsonProperty("changes")
  private Collection<com.databricks.sdk.service.catalog.PermissionsChange> changes;

  /**
   * Maximum number of permissions to return. - when set to 0, the page length is set to a server
   * configured value (recommended); - when set to a value greater than 0, the page length is the
   * minimum of this value and a server configured value; - when set to a value less than 0, an
   * invalid parameter error is returned; - If not set, all valid permissions are returned (not
   * recommended). - Note: The number of returned permissions might be less than the specified
   * max_results size, even zero. The only definitive indication that no further permissions can be
   * fetched is when the next_page_token is unset from the response.
   */
  @QueryParam("max_results")
  private Long maxResults;

  /** The name of the share. */
  private String name;

  /** Opaque pagination token to go to next page based on previous query. */
  @QueryParam("page_token")
  private String pageToken;

  public UpdateSharePermissions setChanges(
      Collection<com.databricks.sdk.service.catalog.PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  public Collection<com.databricks.sdk.service.catalog.PermissionsChange> getChanges() {
    return changes;
  }

  public UpdateSharePermissions setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public UpdateSharePermissions setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateSharePermissions setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSharePermissions that = (UpdateSharePermissions) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(name, that.name)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, maxResults, name, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateSharePermissions.class)
        .add("changes", changes)
        .add("maxResults", maxResults)
        .add("name", name)
        .add("pageToken", pageToken)
        .toString();
  }
}
