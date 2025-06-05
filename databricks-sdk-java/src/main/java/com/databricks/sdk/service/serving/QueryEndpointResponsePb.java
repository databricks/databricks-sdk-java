// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Header;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class QueryEndpointResponsePb {
  @JsonProperty("choices")
  private Collection<V1ResponseChoiceElement> choices;

  @JsonProperty("created")
  private Long created;

  @JsonProperty("data")
  private Collection<EmbeddingsV1ResponseEmbeddingElement> data;

  @JsonProperty("id")
  private String id;

  @JsonProperty("model")
  private String model;

  @JsonProperty("object")
  private QueryEndpointResponseObject object;

  @JsonProperty("predictions")
  private Collection<Object> predictions;

  @JsonIgnore
  @Header("served-model-name")
  private String servedModelName;

  @JsonProperty("usage")
  private ExternalModelUsageElement usage;

  public QueryEndpointResponsePb setChoices(Collection<V1ResponseChoiceElement> choices) {
    this.choices = choices;
    return this;
  }

  public Collection<V1ResponseChoiceElement> getChoices() {
    return choices;
  }

  public QueryEndpointResponsePb setCreated(Long created) {
    this.created = created;
    return this;
  }

  public Long getCreated() {
    return created;
  }

  public QueryEndpointResponsePb setData(Collection<EmbeddingsV1ResponseEmbeddingElement> data) {
    this.data = data;
    return this;
  }

  public Collection<EmbeddingsV1ResponseEmbeddingElement> getData() {
    return data;
  }

  public QueryEndpointResponsePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public QueryEndpointResponsePb setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public QueryEndpointResponsePb setObject(QueryEndpointResponseObject object) {
    this.object = object;
    return this;
  }

  public QueryEndpointResponseObject getObject() {
    return object;
  }

  public QueryEndpointResponsePb setPredictions(Collection<Object> predictions) {
    this.predictions = predictions;
    return this;
  }

  public Collection<Object> getPredictions() {
    return predictions;
  }

  public QueryEndpointResponsePb setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
  }

  public QueryEndpointResponsePb setUsage(ExternalModelUsageElement usage) {
    this.usage = usage;
    return this;
  }

  public ExternalModelUsageElement getUsage() {
    return usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEndpointResponsePb that = (QueryEndpointResponsePb) o;
    return Objects.equals(choices, that.choices)
        && Objects.equals(created, that.created)
        && Objects.equals(data, that.data)
        && Objects.equals(id, that.id)
        && Objects.equals(model, that.model)
        && Objects.equals(object, that.object)
        && Objects.equals(predictions, that.predictions)
        && Objects.equals(servedModelName, that.servedModelName)
        && Objects.equals(usage, that.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        choices, created, data, id, model, object, predictions, servedModelName, usage);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEndpointResponsePb.class)
        .add("choices", choices)
        .add("created", created)
        .add("data", data)
        .add("id", id)
        .add("model", model)
        .add("object", object)
        .add("predictions", predictions)
        .add("servedModelName", servedModelName)
        .add("usage", usage)
        .toString();
  }
}
