// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateModelVersionRequestPb {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("run_id")
  private String runId;

  @JsonProperty("run_link")
  private String runLink;

  @JsonProperty("source")
  private String source;

  @JsonProperty("tags")
  private Collection<ModelVersionTag> tags;

  public CreateModelVersionRequestPb setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CreateModelVersionRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateModelVersionRequestPb setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  public CreateModelVersionRequestPb setRunLink(String runLink) {
    this.runLink = runLink;
    return this;
  }

  public String getRunLink() {
    return runLink;
  }

  public CreateModelVersionRequestPb setSource(String source) {
    this.source = source;
    return this;
  }

  public String getSource() {
    return source;
  }

  public CreateModelVersionRequestPb setTags(Collection<ModelVersionTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ModelVersionTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateModelVersionRequestPb that = (CreateModelVersionRequestPb) o;
    return Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(runId, that.runId)
        && Objects.equals(runLink, that.runLink)
        && Objects.equals(source, that.source)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, runId, runLink, source, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateModelVersionRequestPb.class)
        .add("description", description)
        .add("name", name)
        .add("runId", runId)
        .add("runLink", runLink)
        .add("source", source)
        .add("tags", tags)
        .toString();
  }
}
