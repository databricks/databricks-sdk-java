// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class KafkaOptions {
  /**
   * Undocumented backdoor mechanism for overriding parameters to pass to the Kafka client. This is
   * not supported and may break at any time.
   */
  @JsonProperty("client_config")
  private Map<String, String> clientConfig;

  /** (Optional) Transformer for the message key. If not specified, the key is left as raw bytes. */
  @JsonProperty("key_transformer")
  private Transformer keyTransformer;

  /** Internal option to control the maximum number of offsets to process per trigger. */
  @JsonProperty("max_offsets_per_trigger")
  private Long maxOffsetsPerTrigger;

  /**
   * (Optional) Where to begin reading when no checkpoint exists. Valid values: "latest" and
   * "earliest". Defaults to "latest".
   */
  @JsonProperty("starting_offset")
  private String startingOffset;

  /**
   * Java regex pattern to subscribe to matching topics. Only one of topics or topic_pattern must be
   * specified.
   */
  @JsonProperty("topic_pattern")
  private String topicPattern;

  /** Topics to subscribe to. Only one of topics or topic_pattern must be specified. */
  @JsonProperty("topics")
  private Collection<String> topics;

  /**
   * (Optional) Transformer for the message value. If not specified, the value is left as raw bytes.
   */
  @JsonProperty("value_transformer")
  private Transformer valueTransformer;

  public KafkaOptions setClientConfig(Map<String, String> clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }

  public Map<String, String> getClientConfig() {
    return clientConfig;
  }

  public KafkaOptions setKeyTransformer(Transformer keyTransformer) {
    this.keyTransformer = keyTransformer;
    return this;
  }

  public Transformer getKeyTransformer() {
    return keyTransformer;
  }

  public KafkaOptions setMaxOffsetsPerTrigger(Long maxOffsetsPerTrigger) {
    this.maxOffsetsPerTrigger = maxOffsetsPerTrigger;
    return this;
  }

  public Long getMaxOffsetsPerTrigger() {
    return maxOffsetsPerTrigger;
  }

  public KafkaOptions setStartingOffset(String startingOffset) {
    this.startingOffset = startingOffset;
    return this;
  }

  public String getStartingOffset() {
    return startingOffset;
  }

  public KafkaOptions setTopicPattern(String topicPattern) {
    this.topicPattern = topicPattern;
    return this;
  }

  public String getTopicPattern() {
    return topicPattern;
  }

  public KafkaOptions setTopics(Collection<String> topics) {
    this.topics = topics;
    return this;
  }

  public Collection<String> getTopics() {
    return topics;
  }

  public KafkaOptions setValueTransformer(Transformer valueTransformer) {
    this.valueTransformer = valueTransformer;
    return this;
  }

  public Transformer getValueTransformer() {
    return valueTransformer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    KafkaOptions that = (KafkaOptions) o;
    return Objects.equals(clientConfig, that.clientConfig)
        && Objects.equals(keyTransformer, that.keyTransformer)
        && Objects.equals(maxOffsetsPerTrigger, that.maxOffsetsPerTrigger)
        && Objects.equals(startingOffset, that.startingOffset)
        && Objects.equals(topicPattern, that.topicPattern)
        && Objects.equals(topics, that.topics)
        && Objects.equals(valueTransformer, that.valueTransformer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        clientConfig,
        keyTransformer,
        maxOffsetsPerTrigger,
        startingOffset,
        topicPattern,
        topics,
        valueTransformer);
  }

  @Override
  public String toString() {
    return new ToStringer(KafkaOptions.class)
        .add("clientConfig", clientConfig)
        .add("keyTransformer", keyTransformer)
        .add("maxOffsetsPerTrigger", maxOffsetsPerTrigger)
        .add("startingOffset", startingOffset)
        .add("topicPattern", topicPattern)
        .add("topics", topics)
        .add("valueTransformer", valueTransformer)
        .toString();
  }
}
