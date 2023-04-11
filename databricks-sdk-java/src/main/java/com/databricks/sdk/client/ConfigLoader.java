package com.databricks.sdk.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.function.Function;
import org.ini4j.Ini;
import org.ini4j.Profile;

import static com.databricks.sdk.client.DatabricksConfig.DEFAULT_CONFIG_FILE;


public class ConfigLoader {
  private static List<ConfigAttributeAccessor> accessors = attributeAccessors();

  private static ArrayList<String> attrsUsed = new ArrayList<>();
  private static ArrayList<String> envsUsed = new ArrayList<>();

  private static HashMap<String, Object> innerConfig = new HashMap<>();

  static List<ConfigAttributeAccessor> attributeAccessors() {
    ArrayList<ConfigAttributeAccessor> attrs = new ArrayList<>();
    for (Field field : DatabricksConfig.class.getDeclaredFields()) {
      ConfigAttribute attribute = field.getAnnotation(ConfigAttribute.class);
      if (attribute != null) {
        attrs.add(new ConfigAttributeAccessor(attribute, field));
      }
    }
    return attrs;
  }

  public static DatabricksConfig resolve(DatabricksConfig cfg, Function<String, String> getEnv) {
    try {
      Object a = cfg.getHost();

      setInnerConfig(cfg, getEnv);
      a = cfg.getHost();

      loadFromEnvironmentVariables(cfg, getEnv);

      a = cfg.getHost();
      loadFromConfig(cfg, getEnv); // TODO: just return new config?..
      a = cfg.getHost();
      a = cfg.getHost();

      a = cfg.getHost();

      knownFileConfigLoader(cfg, getEnv);
      a = cfg.getHost();

      fixHostIfNeeded(cfg);
      checkUsedAttrsAndEnvs(cfg, getEnv);
      a = cfg.getHost();

      validate(cfg, getEnv);
      return cfg;
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create default config", e);
    }
  }

  static boolean objectValueNullEmptyFalseZero(Object objectValue) {
    if(objectValue == null) return true;
    String objectInString = objectValue.toString();
    if(objectInString.isEmpty() || objectInString.equals("false") || objectInString.equals("0")) return true;
    else return false;
  }

  public static void fixHostIfNeeded(DatabricksConfig cfg) {
    if (cfg.getHost() == null || cfg.getHost().isEmpty()) {
      return;
    }

    URL url;
    String host = cfg.getHost();
    try {
      url = new URL(host);
    } catch (MalformedURLException e) {
      // only hostname is specified
      cfg.setHost("https://" + host);
      String a = cfg.getHost();
      return;
    }
    cfg.setHost(url.getProtocol() + "://" + url.getAuthority());
  }

  static void validate(DatabricksConfig cfg, Function<String, String> getEnv) throws IllegalAccessException {
    try {
      HashSet<String> authSet = new HashSet<>();
      Object a = innerConfig;
      for (ConfigAttributeAccessor accessor : accessors) {
        Object objValue = accessor.getValue(cfg);
        if(objectValueNullEmptyFalseZero(objValue)) continue;
        String name = accessor.getName();
        if(innerConfig.get(name) == null) continue;
        String authType = cfg.getAuthType();
        if(objectValueNullEmptyFalseZero(authType)) continue;
        authSet.add(authType);
      }
      if(authSet.size() <= 1) return;
      if(!cfg.getAuthType().isEmpty()) return;
      String names = String.join(" and ", authSet);
      throw new DatabricksException(String.format("validate: more than one authorization method configured: %s", names));
    } catch (IllegalAccessException e) {
      throw new DatabricksException("Cannot create default config", e);
    }
  }

  public static DatabricksException makeNicerError(String message) {
    return makeNicerError(message, 200);
  }

  public static DatabricksException makeNicerError(String message, Integer statusCode) {
    boolean isHttpUnauthorizedOrForbidden =
        true; // TODO - pass status code with exception, default this to false
    if (statusCode == 401 || statusCode == 402) isHttpUnauthorizedOrForbidden = true;
    String debugString = debugString();
    if (!debugString.isEmpty() && isHttpUnauthorizedOrForbidden) {
      message = String.format("%s. %s", message, debugString);
    }
    return new DatabricksException(message);
  }

  public static String debugString() {
    ArrayList<String> buf = new ArrayList<>();
    if (!attrsUsed.isEmpty()) {
      buf.add(String.format("Config: %s", String.join(", ", attrsUsed)));
    }
    if (!envsUsed.isEmpty()) {
      buf.add(String.format("Env: %s", String.join(", ", envsUsed)));
    }
    return String.join(". ", buf);
  }

  public static DatabricksConfig getDefault() {
    DatabricksConfig cfg = new DatabricksConfig();

    // Set Defaults
    cfg.setConfigFile(DEFAULT_CONFIG_FILE);
    cfg.setDebugTruncateBytes(96);
    cfg.setHttpTimeoutSeconds(60);
    cfg.setRateLimit(15);

    return cfg.resolve();
  }


  static void setInnerConfig(DatabricksConfig cfg, Function<String, String> getEnv) throws IllegalAccessException {
    for (ConfigAttributeAccessor accessor : accessors) {
      String name = accessor.getName();
      Object objValue = accessor.getValue(cfg);
      if(objectValueNullEmptyFalseZero(objValue)) continue;
      String value = objValue.toString();
      innerConfig.put(name, value);
      accessor.setValue(cfg, value);
    }
  }

  public static void knownFileConfigLoader(DatabricksConfig cfg, Function<String, String> getEnv) {
    if(cfg.getConfigFile() == "") {
      cfg.setConfigFile(DEFAULT_CONFIG_FILE);
    }
  }

  public static void checkUsedAttrsAndEnvs(DatabricksConfig cfg, Function<String, String> getEnv) {
    try {
      for (ConfigAttributeAccessor accessor : accessors) {
        String envVariable = accessor.getEnvVariable();
        String envValue = accessor.getEnv(getEnv);

        if (!isNullOrEmpty(envValue) && !isNullOrEmpty(envVariable)) {
          envsUsed.add(String.format("%s", envVariable));
        }

        Object foo = cfg.getHost();
        Object objValue = accessor.getValue(cfg);
        if(objectValueNullEmptyFalseZero(objValue)) continue;

        String value = objValue.toString();
        if (accessor.isSensitive()) {
          value = "***";
        }

        String name = accessor.getName();
        attrsUsed.add(String.format("%s=%s", name, value));
      }
    } catch (Exception e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  private static boolean isNullOrEmpty(String target) {
    return target == null || target.isEmpty();
  }

  static void loadFromEnvironmentVariables(DatabricksConfig cfg, Function<String, String> getEnv)
      throws IllegalAccessException {
    for (ConfigAttributeAccessor accessor : accessors) {
      String name = accessor.getName();
      if(innerConfig.get(name) != null) continue;
      String env = accessor.getEnv(getEnv);
      if (env == null || env.isEmpty()) continue;
      accessor.setValue(cfg, env);
    }
  }

  static void loadFromConfig(DatabricksConfig cfg, Function<String, String> getEnv)
      throws IllegalAccessException {
    Ini ini = parseDatabricksCfg(cfg, getEnv);
    if (ini == null) return;
    String profile = cfg.getProfile();
    boolean hasExplicitProfile = !isNullOrEmpty(profile);
    if (!hasExplicitProfile) {
      profile = "DEFAULT";
    }
    Profile.Section section = ini.get(profile);
    if (section == null && !hasExplicitProfile) {
      // logger.Debugf("%s has no %s profile configured", configFile, profile)
      return;
    }
    if (section == null) {
      throw new DatabricksException(
          cfg.getConfigFile() + "has no " + profile + " profile configured");
    }
    for (ConfigAttributeAccessor accessor : accessors) {
      String value = section.get(accessor.getName());
      if (isNullOrEmpty(value)) {
        continue;
      }
      accessor.setValue(cfg, value);
    }
  }

  private static Ini parseDatabricksCfg(DatabricksConfig cfg, Function<String, String> getEnv) {
    String configFile = cfg.getConfigFile();
    if(configFile == null || configFile.isEmpty()) configFile = DEFAULT_CONFIG_FILE;
    boolean isDefaultConfig = configFile.equals(DEFAULT_CONFIG_FILE);
    String userHome = getEnv.apply("HOME");
    if (userHome.isEmpty()) {
      userHome = System.getProperty("user.home");
    }
    configFile = configFile.replaceFirst("^~", userHome);
    Ini ini = new Ini();
    try {
      ini.load(new File(configFile));
    } catch (FileNotFoundException e) {
      if (isDefaultConfig) {
        return null;
      }
      throw new DatabricksException("Cannot find " + configFile, e);
    } catch (IOException e) {
      throw new DatabricksException("Cannot load " + configFile, e);
    }
    return ini;
  }
}
