package com.databricks.sdk;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import com.databricks.sdk.client.http.HttpClient;
import com.databricks.sdk.client.oauth.Consent;
import com.databricks.sdk.client.oauth.OAuthClient;
import com.databricks.sdk.client.oauth.RefreshableCredentials;
import com.databricks.sdk.service.clusters.ClusterInfo;
import com.databricks.sdk.service.oauth2.CreateCustomAppIntegration;
import com.databricks.sdk.service.oauth2.CreateCustomAppIntegrationOutput;
import com.databricks.sdk.service.oauth2.CreateOAuthEnrollment;
import com.databricks.sdk.service.oauth2.OAuthEnrollmentStatus;
import com.databricks.sdk.service.sql.AccessControl;
import com.databricks.sdk.support.QueryParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class HelloController {
  @Autowired
  private HttpClient hc;
  // Initialized by initializeApp()
  private OAuthClient client;
  // Initialized by callback()
  private DatabricksWorkspace workspace;

  @Autowired
  private AppConfig config;

  @Autowired
  private ObjectMapper mapper;

  private String getRedirectUrl() {
    return "http://localhost:" + config.getServerPort() + "/callback";
  }

  @GetMapping("/")
  public String index(HttpSession session, Model model) throws JsonProcessingException {
    if (client != null) {
      model.addAttribute("clientId", client.getClientId());
      model.addAttribute("clientSecret", client.getClientSecret());
      model.addAttribute("hostname", client.getHost());
    }
    RefreshableCredentials sessionCreds = (RefreshableCredentials) session.getAttribute("sessionCreds");
    if (sessionCreds != null) {
      model.addAttribute("sessionCreds", mapper.writeValueAsString(sessionCreds.getToken()));
    }
    return "index";
  }


  @GetMapping("/setup")
  public String setupOAuthApplication(Model model) {
    return "setup";
  }

  @PostMapping("/initialize-app")
  public String initializeApp(
      @RequestParam(name="client_id") String clientId,
      @RequestParam(name="client_secret") String clientSecret,
      @RequestParam(name="hostname") String hostname) throws IOException {
    client = new OAuthClient.Builder()
        .withClientId(clientId)
        .withClientSecret(clientSecret)
        .withHost(hostname)
        .withRedirectUrl(getRedirectUrl())
        .withHttpClient(hc)
        .build();
    return "redirect:/";
  }

  @PostMapping("/make-new-app")
  public String makeNewApp(
      @RequestParam String username,
      @RequestParam String password,
      @RequestParam String hostname) throws IOException {
    DatabricksConfig c = new DatabricksConfig();
    c.setUsername(username);
    c.setPassword(password);
    c.setHost("https://accounts.cloud.databricks.com");
    c.setAccountId("4d9d3bc8-66c3-4e5a-8a0a-551f564257f0");
    c.setDebugHeaders(true);
    c.resolve();
    c.setHttpClient(hc);
    DatabricksAccount account = new DatabricksAccount(c);
    account.oAuthEnrollment().create(new CreateOAuthEnrollment().setEnableAllPublishedApps(true));
    OAuthEnrollmentStatus status = account.oAuthEnrollment().get();
    CreateCustomAppIntegrationOutput result = account.customAppIntegration().create(
        "java-sdk-demo", Collections.singletonList(getRedirectUrl()));

    return initializeApp(result.getClientId(), result.getClientSecret(), hostname);
  }

  @GetMapping("/authenticate")
  public String authenticate(HttpSession session, Model model) throws JsonProcessingException {
    if (client == null) {
      model.addAttribute("authError", "Client is not yet initialized. Please login first.");
      return index(session, model);
    }

    return "forward:/authRedirect";
  }

  @GetMapping("/authRedirect")
  public void authRedirect(HttpSession session, HttpServletResponse resp) throws IOException {
    Consent consent = client.initiateConsent();
    session.setAttribute("consent", consent);
    resp.sendRedirect(consent.getAuthUrl());
  }

  @GetMapping("/callback")
  public String callback(HttpSession session, @RequestParam Map<String, String> allParams) throws IOException {
    Consent consent = (Consent) session.getAttribute("consent");
    RefreshableCredentials creds = consent.exchangeCallbackParameters(allParams);
    session.setAttribute("sessionCreds", creds);
    DatabricksConfig conf = new DatabricksConfig();
    conf.setCredentialsProvider(creds);
    conf.setHost(client.getHost());
    workspace = new DatabricksWorkspace(conf);
    return "redirect:/";
  }

  @GetMapping("/list-clusters")
  public String listClusters(Model model) {
    Iterable<ClusterInfo> clustersIterable = workspace.clusters().list(new com.databricks.sdk.service.clusters.List());
    List<String> clusterStrings = new ArrayList<String>();
    clustersIterable.forEach(c -> clusterStrings.add(c.getClusterName()));
    model.addAttribute("strings", clusterStrings);
    return "list-clusters";
  }
}
