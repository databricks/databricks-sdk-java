// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = FileEventQueue.FileEventQueueSerializer.class)
@JsonDeserialize(using = FileEventQueue.FileEventQueueDeserializer.class)
public class FileEventQueue {
  /** */
  private AzureQueueStorage managedAqs;

  /** */
  private GcpPubsub managedPubsub;

  /** */
  private AwsSqsQueue managedSqs;

  /** */
  private AzureQueueStorage providedAqs;

  /** */
  private GcpPubsub providedPubsub;

  /** */
  private AwsSqsQueue providedSqs;

  public FileEventQueue setManagedAqs(AzureQueueStorage managedAqs) {
    this.managedAqs = managedAqs;
    return this;
  }

  public AzureQueueStorage getManagedAqs() {
    return managedAqs;
  }

  public FileEventQueue setManagedPubsub(GcpPubsub managedPubsub) {
    this.managedPubsub = managedPubsub;
    return this;
  }

  public GcpPubsub getManagedPubsub() {
    return managedPubsub;
  }

  public FileEventQueue setManagedSqs(AwsSqsQueue managedSqs) {
    this.managedSqs = managedSqs;
    return this;
  }

  public AwsSqsQueue getManagedSqs() {
    return managedSqs;
  }

  public FileEventQueue setProvidedAqs(AzureQueueStorage providedAqs) {
    this.providedAqs = providedAqs;
    return this;
  }

  public AzureQueueStorage getProvidedAqs() {
    return providedAqs;
  }

  public FileEventQueue setProvidedPubsub(GcpPubsub providedPubsub) {
    this.providedPubsub = providedPubsub;
    return this;
  }

  public GcpPubsub getProvidedPubsub() {
    return providedPubsub;
  }

  public FileEventQueue setProvidedSqs(AwsSqsQueue providedSqs) {
    this.providedSqs = providedSqs;
    return this;
  }

  public AwsSqsQueue getProvidedSqs() {
    return providedSqs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FileEventQueue that = (FileEventQueue) o;
    return Objects.equals(managedAqs, that.managedAqs)
        && Objects.equals(managedPubsub, that.managedPubsub)
        && Objects.equals(managedSqs, that.managedSqs)
        && Objects.equals(providedAqs, that.providedAqs)
        && Objects.equals(providedPubsub, that.providedPubsub)
        && Objects.equals(providedSqs, that.providedSqs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        managedAqs, managedPubsub, managedSqs, providedAqs, providedPubsub, providedSqs);
  }

  @Override
  public String toString() {
    return new ToStringer(FileEventQueue.class)
        .add("managedAqs", managedAqs)
        .add("managedPubsub", managedPubsub)
        .add("managedSqs", managedSqs)
        .add("providedAqs", providedAqs)
        .add("providedPubsub", providedPubsub)
        .add("providedSqs", providedSqs)
        .toString();
  }

  FileEventQueuePb toPb() {
    FileEventQueuePb pb = new FileEventQueuePb();
    pb.setManagedAqs(managedAqs);
    pb.setManagedPubsub(managedPubsub);
    pb.setManagedSqs(managedSqs);
    pb.setProvidedAqs(providedAqs);
    pb.setProvidedPubsub(providedPubsub);
    pb.setProvidedSqs(providedSqs);

    return pb;
  }

  static FileEventQueue fromPb(FileEventQueuePb pb) {
    FileEventQueue model = new FileEventQueue();
    model.setManagedAqs(pb.getManagedAqs());
    model.setManagedPubsub(pb.getManagedPubsub());
    model.setManagedSqs(pb.getManagedSqs());
    model.setProvidedAqs(pb.getProvidedAqs());
    model.setProvidedPubsub(pb.getProvidedPubsub());
    model.setProvidedSqs(pb.getProvidedSqs());

    return model;
  }

  public static class FileEventQueueSerializer extends JsonSerializer<FileEventQueue> {
    @Override
    public void serialize(FileEventQueue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      FileEventQueuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class FileEventQueueDeserializer extends JsonDeserializer<FileEventQueue> {
    @Override
    public FileEventQueue deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      FileEventQueuePb pb = mapper.readValue(p, FileEventQueuePb.class);
      return FileEventQueue.fromPb(pb);
    }
  }
}
