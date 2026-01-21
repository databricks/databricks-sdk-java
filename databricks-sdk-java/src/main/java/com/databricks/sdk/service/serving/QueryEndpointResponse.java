// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Header;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
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

  /** The outputs of the feature serving endpoint. */
  @JsonProperty("outputs")
  private Collection<JsonNode> outputs;

  /** The predictions returned by the serving endpoint. */
  @JsonProperty("predictions")
  private Collection<Object> predictions;

  /**
   * The name of the served model that served the request. This is useful when there are multiple
   * models behind the same endpoint with traffic split.
   */
  @JsonIgnore
  @Header("served-model-name")
  private String servedModelName;

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

  public QueryEndpointResponse setOutputs(Collection<JsonNode> outputs) {
    this.outputs = outputs;
    return this;
  }

  public Collection<JsonNode> getOutputs() {
    return outputs;
  }

  public QueryEndpointResponse setPredictions(Collection<Object> predictions) {
    this.predictions = predictions;
    return this;
  }

  public Collection<Object> getPredictions() {
    return predictions;
  }

  public QueryEndpointResponse setServedModelName(String servedModelName) {
    this.servedModelName = servedModelName;
    return this;
  }

  public String getServedModelName() {
    return servedModelName;
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
        && Objects.equals(outputs, that.outputs)
        && Objects.equals(predictions, that.predictions)
        && Objects.equals(servedModelName, that.servedModelName)
        && Objects.equals(usage, that.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        choices, created, data, id, model, object, outputs, predictions, servedModelName, usage);
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
        .add("outputs", outputs)
        .add("predictions", predictions)
        .add("servedModelName", servedModelName)
        .add("usage", usage)
        .toString();
  }
}
