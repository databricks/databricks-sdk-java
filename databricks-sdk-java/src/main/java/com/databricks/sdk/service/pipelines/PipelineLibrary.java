// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = PipelineLibrary.PipelineLibrarySerializer.class)
@JsonDeserialize(using = PipelineLibrary.PipelineLibraryDeserializer.class)
public class PipelineLibrary {
  /** The path to a file that defines a pipeline and is stored in the Databricks Repos. */
  private FileLibrary file;

  /**
   * The unified field to include source codes. Each entry can be a notebook path, a file path, or a
   * folder path that ends `/**`. This field cannot be used together with `notebook` or `file`.
   */
  private PathPattern glob;

  /** URI of the jar to be installed. Currently only DBFS is supported. */
  private String jar;

  /** Specification of a maven library to be installed. */
  private com.databricks.sdk.service.compute.MavenLibrary maven;

  /** The path to a notebook that defines a pipeline and is stored in the Databricks workspace. */
  private NotebookLibrary notebook;

  /** URI of the whl to be installed. */
  private String whl;

  public PipelineLibrary setFile(FileLibrary file) {
    this.file = file;
    return this;
  }

  public FileLibrary getFile() {
    return file;
  }

  public PipelineLibrary setGlob(PathPattern glob) {
    this.glob = glob;
    return this;
  }

  public PathPattern getGlob() {
    return glob;
  }

  public PipelineLibrary setJar(String jar) {
    this.jar = jar;
    return this;
  }

  public String getJar() {
    return jar;
  }

  public PipelineLibrary setMaven(com.databricks.sdk.service.compute.MavenLibrary maven) {
    this.maven = maven;
    return this;
  }

  public com.databricks.sdk.service.compute.MavenLibrary getMaven() {
    return maven;
  }

  public PipelineLibrary setNotebook(NotebookLibrary notebook) {
    this.notebook = notebook;
    return this;
  }

  public NotebookLibrary getNotebook() {
    return notebook;
  }

  public PipelineLibrary setWhl(String whl) {
    this.whl = whl;
    return this;
  }

  public String getWhl() {
    return whl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineLibrary that = (PipelineLibrary) o;
    return Objects.equals(file, that.file)
        && Objects.equals(glob, that.glob)
        && Objects.equals(jar, that.jar)
        && Objects.equals(maven, that.maven)
        && Objects.equals(notebook, that.notebook)
        && Objects.equals(whl, that.whl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, glob, jar, maven, notebook, whl);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineLibrary.class)
        .add("file", file)
        .add("glob", glob)
        .add("jar", jar)
        .add("maven", maven)
        .add("notebook", notebook)
        .add("whl", whl)
        .toString();
  }

  PipelineLibraryPb toPb() {
    PipelineLibraryPb pb = new PipelineLibraryPb();
    pb.setFile(file);
    pb.setGlob(glob);
    pb.setJar(jar);
    pb.setMaven(maven);
    pb.setNotebook(notebook);
    pb.setWhl(whl);

    return pb;
  }

  static PipelineLibrary fromPb(PipelineLibraryPb pb) {
    PipelineLibrary model = new PipelineLibrary();
    model.setFile(pb.getFile());
    model.setGlob(pb.getGlob());
    model.setJar(pb.getJar());
    model.setMaven(pb.getMaven());
    model.setNotebook(pb.getNotebook());
    model.setWhl(pb.getWhl());

    return model;
  }

  public static class PipelineLibrarySerializer extends JsonSerializer<PipelineLibrary> {
    @Override
    public void serialize(PipelineLibrary value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineLibraryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineLibraryDeserializer extends JsonDeserializer<PipelineLibrary> {
    @Override
    public PipelineLibrary deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineLibraryPb pb = mapper.readValue(p, PipelineLibraryPb.class);
      return PipelineLibrary.fromPb(pb);
    }
  }
}
