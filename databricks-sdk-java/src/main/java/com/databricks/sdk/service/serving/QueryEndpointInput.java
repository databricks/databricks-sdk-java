// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class QueryEndpointInput {
  /**
   * Optional user-provided request identifier that will be recorded in the inference table and the
   * usage tracking table.
   */
  @JsonProperty("client_request_id")
  private String clientRequestId;

  /** Pandas Dataframe input in the records orientation. */
  @JsonProperty("dataframe_records")
  private Collection<Object> dataframeRecords;

  /** Pandas Dataframe input in the split orientation. */
  @JsonProperty("dataframe_split")
  private DataframeSplitInput dataframeSplit;

  /**
   * The extra parameters field used ONLY for __completions, chat,__ and __embeddings external &
   * foundation model__ serving endpoints. This is a map of strings and should only be used with
   * other external/foundation model query fields.
   */
  @JsonProperty("extra_params")
  private Map<String, String> extraParams;

  /**
   * The input string (or array of strings) field used ONLY for __embeddings external & foundation
   * model__ serving endpoints and is the only field (along with extra_params if needed) used by
   * embeddings queries.
   */
  @JsonProperty("input")
  private Object input;

  /** Tensor-based input in columnar format. */
  @JsonProperty("inputs")
  private Object inputs;

  /** Tensor-based input in row format. */
  @JsonProperty("instances")
  private Collection<Object> instances;

  /**
   * The max tokens field used ONLY for __completions__ and __chat external & foundation model__
   * serving endpoints. This is an integer and should only be used with other chat/completions query
   * fields.
   */
  @JsonProperty("max_tokens")
  private Long maxTokens;

  /**
   * The messages field used ONLY for __chat external & foundation model__ serving endpoints. This
   * is an array of ChatMessage objects and should only be used with other chat query fields.
   */
  @JsonProperty("messages")
  private Collection<ChatMessage> messages;

  /**
   * The n (number of candidates) field used ONLY for __completions__ and __chat external &
   * foundation model__ serving endpoints. This is an integer between 1 and 5 with a default of 1
   * and should only be used with other chat/completions query fields.
   */
  @JsonProperty("n")
  private Long n;

  /**
   * The name of the serving endpoint. This field is required and is provided via the path
   * parameter.
   */
  @JsonIgnore private String name;

  /**
   * The prompt string (or array of strings) field used ONLY for __completions external & foundation
   * model__ serving endpoints and should only be used with other completions query fields.
   */
  @JsonProperty("prompt")
  private Object prompt;

  /**
   * The stop sequences field used ONLY for __completions__ and __chat external & foundation model__
   * serving endpoints. This is a list of strings and should only be used with other
   * chat/completions query fields.
   */
  @JsonProperty("stop")
  private Collection<String> stop;

  /**
   * The stream field used ONLY for __completions__ and __chat external & foundation model__ serving
   * endpoints. This is a boolean defaulting to false and should only be used with other
   * chat/completions query fields.
   */
  @JsonProperty("stream")
  private Boolean stream;

  /**
   * The temperature field used ONLY for __completions__ and __chat external & foundation model__
   * serving endpoints. This is a float between 0.0 and 2.0 with a default of 1.0 and should only be
   * used with other chat/completions query fields.
   */
  @JsonProperty("temperature")
  private Double temperature;

  /** Optional user-provided context that will be recorded in the usage tracking table. */
  @JsonProperty("usage_context")
  private Map<String, String> usageContext;

  public QueryEndpointInput setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

  public String getClientRequestId() {
    return clientRequestId;
  }

  public QueryEndpointInput setDataframeRecords(Collection<Object> dataframeRecords) {
    this.dataframeRecords = dataframeRecords;
    return this;
  }

  public Collection<Object> getDataframeRecords() {
    return dataframeRecords;
  }

  public QueryEndpointInput setDataframeSplit(DataframeSplitInput dataframeSplit) {
    this.dataframeSplit = dataframeSplit;
    return this;
  }

  public DataframeSplitInput getDataframeSplit() {
    return dataframeSplit;
  }

  public QueryEndpointInput setExtraParams(Map<String, String> extraParams) {
    this.extraParams = extraParams;
    return this;
  }

  public Map<String, String> getExtraParams() {
    return extraParams;
  }

  public QueryEndpointInput setInput(Object input) {
    this.input = input;
    return this;
  }

  public Object getInput() {
    return input;
  }

  public QueryEndpointInput setInputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  public Object getInputs() {
    return inputs;
  }

  public QueryEndpointInput setInstances(Collection<Object> instances) {
    this.instances = instances;
    return this;
  }

  public Collection<Object> getInstances() {
    return instances;
  }

  public QueryEndpointInput setMaxTokens(Long maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  public Long getMaxTokens() {
    return maxTokens;
  }

  public QueryEndpointInput setMessages(Collection<ChatMessage> messages) {
    this.messages = messages;
    return this;
  }

  public Collection<ChatMessage> getMessages() {
    return messages;
  }

  public QueryEndpointInput setN(Long n) {
    this.n = n;
    return this;
  }

  public Long getN() {
    return n;
  }

  public QueryEndpointInput setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryEndpointInput setPrompt(Object prompt) {
    this.prompt = prompt;
    return this;
  }

  public Object getPrompt() {
    return prompt;
  }

  public QueryEndpointInput setStop(Collection<String> stop) {
    this.stop = stop;
    return this;
  }

  public Collection<String> getStop() {
    return stop;
  }

  public QueryEndpointInput setStream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  public Boolean getStream() {
    return stream;
  }

  public QueryEndpointInput setTemperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  public Double getTemperature() {
    return temperature;
  }

  public QueryEndpointInput setUsageContext(Map<String, String> usageContext) {
    this.usageContext = usageContext;
    return this;
  }

  public Map<String, String> getUsageContext() {
    return usageContext;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEndpointInput that = (QueryEndpointInput) o;
    return Objects.equals(clientRequestId, that.clientRequestId)
        && Objects.equals(dataframeRecords, that.dataframeRecords)
        && Objects.equals(dataframeSplit, that.dataframeSplit)
        && Objects.equals(extraParams, that.extraParams)
        && Objects.equals(input, that.input)
        && Objects.equals(inputs, that.inputs)
        && Objects.equals(instances, that.instances)
        && Objects.equals(maxTokens, that.maxTokens)
        && Objects.equals(messages, that.messages)
        && Objects.equals(n, that.n)
        && Objects.equals(name, that.name)
        && Objects.equals(prompt, that.prompt)
        && Objects.equals(stop, that.stop)
        && Objects.equals(stream, that.stream)
        && Objects.equals(temperature, that.temperature)
        && Objects.equals(usageContext, that.usageContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientRequestId,
        dataframeRecords,
        dataframeSplit,
        extraParams,
        input,
        inputs,
        instances,
        maxTokens,
        messages,
        n,
        name,
        prompt,
        stop,
        stream,
        temperature,
        usageContext);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEndpointInput.class)
        .add("clientRequestId", clientRequestId)
        .add("dataframeRecords", dataframeRecords)
        .add("dataframeSplit", dataframeSplit)
        .add("extraParams", extraParams)
        .add("input", input)
        .add("inputs", inputs)
        .add("instances", instances)
        .add("maxTokens", maxTokens)
        .add("messages", messages)
        .add("n", n)
        .add("name", name)
        .add("prompt", prompt)
        .add("stop", stop)
        .add("stream", stream)
        .add("temperature", temperature)
        .add("usageContext", usageContext)
        .toString();
  }
}
