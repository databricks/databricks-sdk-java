// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** TODO: Write description later when this method is implemented */
@Generated
public class ListUsersResponse {
  /**
   * A token, which can be sent as page_token to retrieve the next page. If this field is omitted,
   * there are no subsequent pages.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("users")
  private Collection<User> users;

  public ListUsersResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListUsersResponse setUsers(Collection<User> users) {
    this.users = users;
    return this;
  }

  public Collection<User> getUsers() {
    return users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListUsersResponse that = (ListUsersResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(users, that.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, users);
  }

  @Override
  public String toString() {
    return new ToStringer(ListUsersResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("users", users)
        .toString();
  }
}
