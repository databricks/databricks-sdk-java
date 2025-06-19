// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = CreateExperiment.CreateExperimentSerializer.class)
@JsonDeserialize(using = CreateExperiment.CreateExperimentDeserializer.class)
public class CreateExperiment {
  /**
   * Location where all artifacts for the experiment are stored. If not provided, the remote server
   * will select an appropriate default.
   */
  private String artifactLocation;

  /** Experiment name. */
  private String name;

  /**
   * A collection of tags to set on the experiment. Maximum tag size and number of tags per request
   * depends on the storage backend. All storage backends are guaranteed to support tag keys up to
   * 250 bytes in size and tag values up to 5000 bytes in size. All storage backends are also
   * guaranteed to support up to 20 tags per request.
   */
  private Collection<ExperimentTag> tags;

  public CreateExperiment setArtifactLocation(String artifactLocation) {
    this.artifactLocation = artifactLocation;
    return this;
  }

  public String getArtifactLocation() {
    return artifactLocation;
  }

  public CreateExperiment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateExperiment setTags(Collection<ExperimentTag> tags) {
    this.tags = tags;
    return this;
  }

  public Collection<ExperimentTag> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateExperiment that = (CreateExperiment) o;
    return Objects.equals(artifactLocation, that.artifactLocation)
        && Objects.equals(name, that.name)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactLocation, name, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateExperiment.class)
        .add("artifactLocation", artifactLocation)
        .add("name", name)
        .add("tags", tags)
        .toString();
  }

  CreateExperimentPb toPb() {
    CreateExperimentPb pb = new CreateExperimentPb();
    pb.setArtifactLocation(artifactLocation);
    pb.setName(name);
    pb.setTags(tags);

    return pb;
  }

  static CreateExperiment fromPb(CreateExperimentPb pb) {
    CreateExperiment model = new CreateExperiment();
    model.setArtifactLocation(pb.getArtifactLocation());
    model.setName(pb.getName());
    model.setTags(pb.getTags());

    return model;
  }

  public static class CreateExperimentSerializer extends JsonSerializer<CreateExperiment> {
    @Override
    public void serialize(CreateExperiment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateExperimentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateExperimentDeserializer extends JsonDeserializer<CreateExperiment> {
    @Override
    public CreateExperiment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateExperimentPb pb = mapper.readValue(p, CreateExperimentPb.class);
      return CreateExperiment.fromPb(pb);
    }
  }
}
