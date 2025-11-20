// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListKafkaConfigsResponse {
  /** List of Kafka configs. Schemas are not included in the response. */
  @JsonProperty("kafka_configs")
  private Collection<KafkaConfig> kafkaConfigs;

  /** Pagination token to request the next page of results for this query. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListKafkaConfigsResponse setKafkaConfigs(Collection<KafkaConfig> kafkaConfigs) {
    this.kafkaConfigs = kafkaConfigs;
    return this;
  }

  public Collection<KafkaConfig> getKafkaConfigs() {
    return kafkaConfigs;
  }

  public ListKafkaConfigsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListKafkaConfigsResponse that = (ListKafkaConfigsResponse) o;
    return Objects.equals(kafkaConfigs, that.kafkaConfigs)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kafkaConfigs, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListKafkaConfigsResponse.class)
        .add("kafkaConfigs", kafkaConfigs)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}
