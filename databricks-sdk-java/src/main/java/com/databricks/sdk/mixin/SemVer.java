package com.databricks.sdk.mixin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>SemVer class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class SemVer implements Comparable<SemVer> {
  public final int major;
  public final int minor;
  public final int patch;
  public final String preRelease;
  public final String build;

  private static final Pattern _pattern =
      Pattern.compile(
          "^"
              + "(?<major>0|[1-9]\\d*)\\.(?<minor>x|0|[1-9]\\d*)\\.(?<patch>x|0|[1-9x]\\d*)"
              + "(?:-(?<preRelease>(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)"
              + "(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?"
              + "(?:\\+(?<build>[0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

  /**
   * <p>Constructor for SemVer.</p>
   *
   * @param major a int
   * @param minor a int
   * @param patch a int
   * @param preRelease a {@link java.lang.String} object
   * @param build a {@link java.lang.String} object
   */
  public SemVer(int major, int minor, int patch, String preRelease, String build) {
    this.major = major;
    this.minor = minor;
    this.patch = patch;
    this.preRelease = preRelease;
    this.build = build;
  }

  /**
   * <p>parse.</p>
   *
   * @param v a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.mixin.SemVer} object
   */
  public static SemVer parse(String v) {
    if (v == null || v.isEmpty()) {
      throw new IllegalArgumentException("Not a valid SemVer: " + v);
    }
    if (v.charAt(0) != 'v') {
      v = "v" + v;
    }
    Matcher m = _pattern.matcher(v.substring(1));
    if (!m.matches()) {
      throw new IllegalArgumentException("Not a valid SemVer: " + v);
    }
    String minor = m.group("minor");
    String patch = m.group("patch");
    return new SemVer(
        Integer.parseInt(m.group("major")),
        minor.equals("x") ? 0 : Integer.parseInt(minor),
        patch.equals("x") ? 0 : Integer.parseInt(patch),
        m.group("preRelease"),
        m.group("build"));
  }

  /** {@inheritDoc} */
  @Override
  public int compareTo(SemVer other) {
    if (other == null) {
      return 1;
    }
    if (major != other.major) {
      return Integer.compare(major, other.major);
    }
    if (minor != other.minor) {
      return Integer.compare(minor, other.minor);
    }
    if (patch != other.patch) {
      return Integer.compare(patch, other.patch);
    }
    if (preRelease == null && other.preRelease == null) {
      return 0;
    }
    if (preRelease == null) {
      return 1;
    }
    if (other.preRelease == null) {
      return -1;
    }
    return preRelease.compareTo(other.preRelease);
  }
}
