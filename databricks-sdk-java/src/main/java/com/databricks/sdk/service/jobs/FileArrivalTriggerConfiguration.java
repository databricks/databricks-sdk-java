// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = FileArrivalTriggerConfiguration.FileArrivalTriggerConfigurationSerializer.class)
@JsonDeserialize(
    using = FileArrivalTriggerConfiguration.FileArrivalTriggerConfigurationDeserializer.class)
public class FileArrivalTriggerConfiguration {
  /**
   * If set, the trigger starts a run only after the specified amount of time passed since the last
   * time the trigger fired. The minimum allowed value is 60 seconds
   */
  private Long minTimeBetweenTriggersSeconds;

  /**
   * URL to be monitored for file arrivals. The path must point to the root or a subpath of the
   * external location.
   */
  private String url;

  /**
   * If set, the trigger starts a run only after no file activity has occurred for the specified
   * amount of time. This makes it possible to wait for a batch of incoming files to arrive before
   * triggering a run. The minimum allowed value is 60 seconds.
   */
  private Long waitAfterLastChangeSeconds;

  public FileArrivalTriggerConfiguration setMinTimeBetweenTriggersSeconds(
      Long minTimeBetweenTriggersSeconds) {
    this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
    return this;
  }

  public Long getMinTimeBetweenTriggersSeconds() {
    return minTimeBetweenTriggersSeconds;
  }

  public FileArrivalTriggerConfiguration setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public FileArrivalTriggerConfiguration setWaitAfterLastChangeSeconds(
      Long waitAfterLastChangeSeconds) {
    this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
    return this;
  }

  public Long getWaitAfterLastChangeSeconds() {
    return waitAfterLastChangeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileArrivalTriggerConfiguration that = (FileArrivalTriggerConfiguration) o;
    return Objects.equals(minTimeBetweenTriggersSeconds, that.minTimeBetweenTriggersSeconds)
        && Objects.equals(url, that.url)
        && Objects.equals(waitAfterLastChangeSeconds, that.waitAfterLastChangeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minTimeBetweenTriggersSeconds, url, waitAfterLastChangeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(FileArrivalTriggerConfiguration.class)
        .add("minTimeBetweenTriggersSeconds", minTimeBetweenTriggersSeconds)
        .add("url", url)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }

  FileArrivalTriggerConfigurationPb toPb() {
    FileArrivalTriggerConfigurationPb pb = new FileArrivalTriggerConfigurationPb();
    pb.setMinTimeBetweenTriggersSeconds(minTimeBetweenTriggersSeconds);
    pb.setUrl(url);
    pb.setWaitAfterLastChangeSeconds(waitAfterLastChangeSeconds);

    return pb;
  }

  static FileArrivalTriggerConfiguration fromPb(FileArrivalTriggerConfigurationPb pb) {
    FileArrivalTriggerConfiguration model = new FileArrivalTriggerConfiguration();
    model.setMinTimeBetweenTriggersSeconds(pb.getMinTimeBetweenTriggersSeconds());
    model.setUrl(pb.getUrl());
    model.setWaitAfterLastChangeSeconds(pb.getWaitAfterLastChangeSeconds());

    return model;
  }

  public static class FileArrivalTriggerConfigurationSerializer
      extends JsonSerializer<FileArrivalTriggerConfiguration> {
    @Override
    public void serialize(
        FileArrivalTriggerConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FileArrivalTriggerConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FileArrivalTriggerConfigurationDeserializer
      extends JsonDeserializer<FileArrivalTriggerConfiguration> {
    @Override
    public FileArrivalTriggerConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FileArrivalTriggerConfigurationPb pb =
          mapper.readValue(p, FileArrivalTriggerConfigurationPb.class);
      return FileArrivalTriggerConfiguration.fromPb(pb);
    }
  }
}
