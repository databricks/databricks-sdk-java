// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = MavenLibrary.MavenLibrarySerializer.class)
@JsonDeserialize(using = MavenLibrary.MavenLibraryDeserializer.class)
public class MavenLibrary {
  /** Gradle-style maven coordinates. For example: "org.jsoup:jsoup:1.7.2". */
  private String coordinates;

  /**
   * List of dependences to exclude. For example: `["slf4j:slf4j", "*:hadoop-client"]`.
   *
   * <p>Maven dependency exclusions:
   * https://maven.apache.org/guides/introduction/introduction-to-optional-and-excludes-dependencies.html.
   */
  private Collection<String> exclusions;

  /**
   * Maven repo to install the Maven package from. If omitted, both Maven Central Repository and
   * Spark Packages are searched.
   */
  private String repo;

  public MavenLibrary setCoordinates(String coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  public String getCoordinates() {
    return coordinates;
  }

  public MavenLibrary setExclusions(Collection<String> exclusions) {
    this.exclusions = exclusions;
    return this;
  }

  public Collection<String> getExclusions() {
    return exclusions;
  }

  public MavenLibrary setRepo(String repo) {
    this.repo = repo;
    return this;
  }

  public String getRepo() {
    return repo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MavenLibrary that = (MavenLibrary) o;
    return Objects.equals(coordinates, that.coordinates)
        && Objects.equals(exclusions, that.exclusions)
        && Objects.equals(repo, that.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinates, exclusions, repo);
  }

  @Override
  public String toString() {
    return new ToStringer(MavenLibrary.class)
        .add("coordinates", coordinates)
        .add("exclusions", exclusions)
        .add("repo", repo)
        .toString();
  }

  MavenLibraryPb toPb() {
    MavenLibraryPb pb = new MavenLibraryPb();
    pb.setCoordinates(coordinates);
    pb.setExclusions(exclusions);
    pb.setRepo(repo);

    return pb;
  }

  static MavenLibrary fromPb(MavenLibraryPb pb) {
    MavenLibrary model = new MavenLibrary();
    model.setCoordinates(pb.getCoordinates());
    model.setExclusions(pb.getExclusions());
    model.setRepo(pb.getRepo());

    return model;
  }

  public static class MavenLibrarySerializer extends JsonSerializer<MavenLibrary> {
    @Override
    public void serialize(MavenLibrary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MavenLibraryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MavenLibraryDeserializer extends JsonDeserializer<MavenLibrary> {
    @Override
    public MavenLibrary deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MavenLibraryPb pb = mapper.readValue(p, MavenLibraryPb.class);
      return MavenLibrary.fromPb(pb);
    }
  }
}
