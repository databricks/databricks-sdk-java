// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListRulesResponse {
  /**
   * Token to pass as `page_token` in a subsequent `ListRules` call to fetch the next page, or empty
   * when there are no more results.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The rules in this page of results. */
  @JsonProperty("rules")
  private Collection<Rule> rules;

  public ListRulesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRulesResponse setRules(Collection<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public Collection<Rule> getRules() {
    return rules;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRulesResponse that = (ListRulesResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(rules, that.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, rules);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRulesResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("rules", rules)
        .toString();
  }
}
