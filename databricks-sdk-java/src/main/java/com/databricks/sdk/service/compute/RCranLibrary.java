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
import java.util.Objects;

@Generated
@JsonSerialize(using = RCranLibrary.RCranLibrarySerializer.class)
@JsonDeserialize(using = RCranLibrary.RCranLibraryDeserializer.class)
public class RCranLibrary {
  /** The name of the CRAN package to install. */
  private String packageValue;

  /**
   * The repository where the package can be found. If not specified, the default CRAN repo is used.
   */
  private String repo;

  public RCranLibrary setPackage(String packageValue) {
    this.packageValue = packageValue;
    return this;
  }

  public String getPackage() {
    return packageValue;
  }

  public RCranLibrary setRepo(String repo) {
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
    RCranLibrary that = (RCranLibrary) o;
    return Objects.equals(packageValue, that.packageValue) && Objects.equals(repo, that.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageValue, repo);
  }

  @Override
  public String toString() {
    return new ToStringer(RCranLibrary.class)
        .add("packageValue", packageValue)
        .add("repo", repo)
        .toString();
  }

  RCranLibraryPb toPb() {
    RCranLibraryPb pb = new RCranLibraryPb();
    pb.setPackage(packageValue);
    pb.setRepo(repo);

    return pb;
  }

  static RCranLibrary fromPb(RCranLibraryPb pb) {
    RCranLibrary model = new RCranLibrary();
    model.setPackage(pb.getPackage());
    model.setRepo(pb.getRepo());

    return model;
  }

  public static class RCranLibrarySerializer extends JsonSerializer<RCranLibrary> {
    @Override
    public void serialize(RCranLibrary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RCranLibraryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RCranLibraryDeserializer extends JsonDeserializer<RCranLibrary> {
    @Override
    public RCranLibrary deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RCranLibraryPb pb = mapper.readValue(p, RCranLibraryPb.class);
      return RCranLibrary.fromPb(pb);
    }
  }
}
