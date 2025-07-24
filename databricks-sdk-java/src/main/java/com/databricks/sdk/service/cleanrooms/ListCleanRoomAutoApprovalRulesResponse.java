// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCleanRoomAutoApprovalRulesResponse {
  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * page_token should be set to this value for the next request (for the next page of results).
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("rules")
  private Collection<CleanRoomAutoApprovalRule> rules;

  public ListCleanRoomAutoApprovalRulesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListCleanRoomAutoApprovalRulesResponse setRules(
      Collection<CleanRoomAutoApprovalRule> rules) {
    this.rules = rules;
    return this;
  }

  public Collection<CleanRoomAutoApprovalRule> getRules() {
    return rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCleanRoomAutoApprovalRulesResponse that = (ListCleanRoomAutoApprovalRulesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(rules, that.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, rules);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomAutoApprovalRulesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("rules", rules)
        .toString();
  }
}
