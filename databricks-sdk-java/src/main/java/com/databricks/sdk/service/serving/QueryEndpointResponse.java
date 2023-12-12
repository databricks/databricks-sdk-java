// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class QueryEndpointResponse {
  /**
   * The list of choices returned by the __chat or completions external/foundation model__ serving
   * endpoint.
   */
  @JsonProperty("choices")
  private Collection<V1ResponseChoiceElement> choices;

  /**
   * The timestamp in seconds when the query was created in Unix time returned by a __completions or
   * chat external/foundation model__ serving endpoint.
   */
  @JsonProperty("created")
  private Long created;

  /**
   * The list of the embeddings returned by the __embeddings external/foundation model__ serving
   * endpoint.
   */
  @JsonProperty("data")
  private Collection<EmbeddingsV1ResponseEmbeddingElement> data;

  /**
   * The ID of the query that may be returned by a __completions or chat external/foundation model__
   * serving endpoint.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The name of the __external/foundation model__ used for querying. This is the name of the model
   * that was specified in the endpoint config.
   */
  @JsonProperty("model")
  private String model;

  /**
   * The type of object returned by the __external/foundation model__ serving endpoint, one of
   * [text_completion, chat.completion, list (of embeddings)].
   */
  @JsonProperty("object")
  private QueryEndpointResponseObject object;

  /** The predictions returned by the serving endpoint. */
  @JsonProperty("predictions")
  private Collection<Object> predictions;

  /**
   * The usage object that may be returned by the __external/foundation model__ serving endpoint.
   * This contains information about the number of tokens used in the prompt and response.
   */
  @JsonProperty("usage")
  private ExternalModelUsageElement usage;

  public QueryEndpointResponse setChoices(Collection<V1ResponseChoiceElement> choices) {
    this.choices = choices;
    return this;
  }

  public Collection<V1ResponseChoiceElement> getChoices() {
    return choices;
  }

  public QueryEndpointResponse setCreated(Long created) {
    this.created = created;
    return this;
  }

  public Long getCreated() {
    return created;
  }

  public QueryEndpointResponse setData(Collection<EmbeddingsV1ResponseEmbeddingElement> data) {
    this.data = data;
    return this;
  }

  public Collection<EmbeddingsV1ResponseEmbeddingElement> getData() {
    return data;
  }

  public QueryEndpointResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public QueryEndpointResponse setModel(String model) {
    this.model = model;
    return this;
  }

  public String getModel() {
    return model;
  }

  public QueryEndpointResponse setObject(QueryEndpointResponseObject object) {
    this.object = object;
    return this;
  }

  public QueryEndpointResponseObject getObject() {
    return object;
  }

  public QueryEndpointResponse setPredictions(Collection<Object> predictions) {
    this.predictions = predictions;
    return this;
  }

  public Collection<Object> getPredictions() {
    return predictions;
  }

  public QueryEndpointResponse setUsage(ExternalModelUsageElement usage) {
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
    QueryEndpointResponse that = (QueryEndpointResponse) o;
    return Objects.equals(choices, that.choices)
        && Objects.equals(created, that.created)
        && Objects.equals(data, that.data)
        && Objects.equals(id, that.id)
        && Objects.equals(model, that.model)
        && Objects.equals(object, that.object)
        && Objects.equals(predictions, that.predictions)
        && Objects.equals(usage, that.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(choices, created, data, id, model, object, predictions, usage);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEndpointResponse.class)
        .add("choices", choices)
        .add("created", created)
        .add("data", data)
        .add("id", id)
        .add("model", model)
        .add("object", object)
        .add("predictions", predictions)
        .add("usage", usage)
        .toString();
  }
}
