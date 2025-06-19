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
@JsonSerialize(using = PythonPyPiLibrary.PythonPyPiLibrarySerializer.class)
@JsonDeserialize(using = PythonPyPiLibrary.PythonPyPiLibraryDeserializer.class)
public class PythonPyPiLibrary {
  /**
   * The name of the pypi package to install. An optional exact version specification is also
   * supported. Examples: "simplejson" and "simplejson==3.8.0".
   */
  private String packageValue;

  /**
   * The repository where the package can be found. If not specified, the default pip index is used.
   */
  private String repo;

  public PythonPyPiLibrary setPackage(String packageValue) {
    this.packageValue = packageValue;
    return this;
  }

  public String getPackage() {
    return packageValue;
  }

  public PythonPyPiLibrary setRepo(String repo) {
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
    PythonPyPiLibrary that = (PythonPyPiLibrary) o;
    return Objects.equals(packageValue, that.packageValue) && Objects.equals(repo, that.repo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageValue, repo);
  }

  @Override
  public String toString() {
    return new ToStringer(PythonPyPiLibrary.class)
        .add("packageValue", packageValue)
        .add("repo", repo)
        .toString();
  }

  PythonPyPiLibraryPb toPb() {
    PythonPyPiLibraryPb pb = new PythonPyPiLibraryPb();
    pb.setPackage(packageValue);
    pb.setRepo(repo);

    return pb;
  }

  static PythonPyPiLibrary fromPb(PythonPyPiLibraryPb pb) {
    PythonPyPiLibrary model = new PythonPyPiLibrary();
    model.setPackage(pb.getPackage());
    model.setRepo(pb.getRepo());

    return model;
  }

  public static class PythonPyPiLibrarySerializer extends JsonSerializer<PythonPyPiLibrary> {
    @Override
    public void serialize(PythonPyPiLibrary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PythonPyPiLibraryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PythonPyPiLibraryDeserializer extends JsonDeserializer<PythonPyPiLibrary> {
    @Override
    public PythonPyPiLibrary deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PythonPyPiLibraryPb pb = mapper.readValue(p, PythonPyPiLibraryPb.class);
      return PythonPyPiLibrary.fromPb(pb);
    }
  }
}
