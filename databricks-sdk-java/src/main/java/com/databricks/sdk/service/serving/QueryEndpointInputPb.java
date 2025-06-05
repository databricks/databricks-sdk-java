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
class QueryEndpointInputPb {
  @JsonProperty("dataframe_records")
  private Collection<Object> dataframeRecords;

  @JsonProperty("dataframe_split")
  private DataframeSplitInput dataframeSplit;

  @JsonProperty("extra_params")
  private Map<String, String> extraParams;

  @JsonProperty("input")
  private Object input;

  @JsonProperty("inputs")
  private Object inputs;

  @JsonProperty("instances")
  private Collection<Object> instances;

  @JsonProperty("max_tokens")
  private Long maxTokens;

  @JsonProperty("messages")
  private Collection<ChatMessage> messages;

  @JsonProperty("n")
  private Long n;

  @JsonIgnore private String name;

  @JsonProperty("prompt")
  private Object prompt;

  @JsonProperty("stop")
  private Collection<String> stop;

  @JsonProperty("stream")
  private Boolean stream;

  @JsonProperty("temperature")
  private Double temperature;

  public QueryEndpointInputPb setDataframeRecords(Collection<Object> dataframeRecords) {
    this.dataframeRecords = dataframeRecords;
    return this;
  }

  public Collection<Object> getDataframeRecords() {
    return dataframeRecords;
  }

  public QueryEndpointInputPb setDataframeSplit(DataframeSplitInput dataframeSplit) {
    this.dataframeSplit = dataframeSplit;
    return this;
  }

  public DataframeSplitInput getDataframeSplit() {
    return dataframeSplit;
  }

  public QueryEndpointInputPb setExtraParams(Map<String, String> extraParams) {
    this.extraParams = extraParams;
    return this;
  }

  public Map<String, String> getExtraParams() {
    return extraParams;
  }

  public QueryEndpointInputPb setInput(Object input) {
    this.input = input;
    return this;
  }

  public Object getInput() {
    return input;
  }

  public QueryEndpointInputPb setInputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  public Object getInputs() {
    return inputs;
  }

  public QueryEndpointInputPb setInstances(Collection<Object> instances) {
    this.instances = instances;
    return this;
  }

  public Collection<Object> getInstances() {
    return instances;
  }

  public QueryEndpointInputPb setMaxTokens(Long maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  public Long getMaxTokens() {
    return maxTokens;
  }

  public QueryEndpointInputPb setMessages(Collection<ChatMessage> messages) {
    this.messages = messages;
    return this;
  }

  public Collection<ChatMessage> getMessages() {
    return messages;
  }

  public QueryEndpointInputPb setN(Long n) {
    this.n = n;
    return this;
  }

  public Long getN() {
    return n;
  }

  public QueryEndpointInputPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public QueryEndpointInputPb setPrompt(Object prompt) {
    this.prompt = prompt;
    return this;
  }

  public Object getPrompt() {
    return prompt;
  }

  public QueryEndpointInputPb setStop(Collection<String> stop) {
    this.stop = stop;
    return this;
  }

  public Collection<String> getStop() {
    return stop;
  }

  public QueryEndpointInputPb setStream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  public Boolean getStream() {
    return stream;
  }

  public QueryEndpointInputPb setTemperature(Double temperature) {
    this.temperature = temperature;
    return this;
  }

  public Double getTemperature() {
    return temperature;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    QueryEndpointInputPb that = (QueryEndpointInputPb) o;
    return Objects.equals(dataframeRecords, that.dataframeRecords)
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
        && Objects.equals(temperature, that.temperature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
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
        temperature);
  }

  @Override
  public String toString() {
    return new ToStringer(QueryEndpointInputPb.class)
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
        .toString();
  }
}
