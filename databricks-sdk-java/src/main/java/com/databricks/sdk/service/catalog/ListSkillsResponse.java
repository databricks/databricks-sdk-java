// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response for listing skills. */
@Generated
public class ListSkillsResponse {
  /** Pagination token for retrieving the next page of results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** The list of skills. */
  @JsonProperty("skills")
  private Collection<Skill> skills;

  public ListSkillsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListSkillsResponse setSkills(Collection<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public Collection<Skill> getSkills() {
    return skills;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSkillsResponse that = (ListSkillsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(skills, that.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, skills);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSkillsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("skills", skills)
        .toString();
  }
}
