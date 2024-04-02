/*
 * Gitea API
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.21.10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GenerateRepoOption options when creating repository using a template
 */
@Schema(description = "GenerateRepoOption options when creating repository using a template")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class GenerateRepoOption {
  @SerializedName("avatar")
  private Boolean avatar = null;

  @SerializedName("default_branch")
  private String defaultBranch = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("git_content")
  private Boolean gitContent = null;

  @SerializedName("git_hooks")
  private Boolean gitHooks = null;

  @SerializedName("labels")
  private Boolean labels = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("private")
  private Boolean _private = null;

  @SerializedName("protected_branch")
  private Boolean protectedBranch = null;

  @SerializedName("topics")
  private Boolean topics = null;

  @SerializedName("webhooks")
  private Boolean webhooks = null;

  public GenerateRepoOption avatar(Boolean avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * include avatar of the template repo
   * @return avatar
  **/
  @Schema(description = "include avatar of the template repo")
  public Boolean isAvatar() {
    return avatar;
  }

  public void setAvatar(Boolean avatar) {
    this.avatar = avatar;
  }

  public GenerateRepoOption defaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

   /**
   * Default branch of the new repository
   * @return defaultBranch
  **/
  @Schema(description = "Default branch of the new repository")
  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public GenerateRepoOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the repository to create
   * @return description
  **/
  @Schema(description = "Description of the repository to create")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GenerateRepoOption gitContent(Boolean gitContent) {
    this.gitContent = gitContent;
    return this;
  }

   /**
   * include git content of default branch in template repo
   * @return gitContent
  **/
  @Schema(description = "include git content of default branch in template repo")
  public Boolean isGitContent() {
    return gitContent;
  }

  public void setGitContent(Boolean gitContent) {
    this.gitContent = gitContent;
  }

  public GenerateRepoOption gitHooks(Boolean gitHooks) {
    this.gitHooks = gitHooks;
    return this;
  }

   /**
   * include git hooks in template repo
   * @return gitHooks
  **/
  @Schema(description = "include git hooks in template repo")
  public Boolean isGitHooks() {
    return gitHooks;
  }

  public void setGitHooks(Boolean gitHooks) {
    this.gitHooks = gitHooks;
  }

  public GenerateRepoOption labels(Boolean labels) {
    this.labels = labels;
    return this;
  }

   /**
   * include labels in template repo
   * @return labels
  **/
  @Schema(description = "include labels in template repo")
  public Boolean isLabels() {
    return labels;
  }

  public void setLabels(Boolean labels) {
    this.labels = labels;
  }

  public GenerateRepoOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the repository to create
   * @return name
  **/
  @Schema(required = true, description = "Name of the repository to create")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GenerateRepoOption owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * The organization or person who will own the new repository
   * @return owner
  **/
  @Schema(required = true, description = "The organization or person who will own the new repository")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public GenerateRepoOption _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether the repository is private
   * @return _private
  **/
  @Schema(description = "Whether the repository is private")
  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public GenerateRepoOption protectedBranch(Boolean protectedBranch) {
    this.protectedBranch = protectedBranch;
    return this;
  }

   /**
   * include protected branches in template repo
   * @return protectedBranch
  **/
  @Schema(description = "include protected branches in template repo")
  public Boolean isProtectedBranch() {
    return protectedBranch;
  }

  public void setProtectedBranch(Boolean protectedBranch) {
    this.protectedBranch = protectedBranch;
  }

  public GenerateRepoOption topics(Boolean topics) {
    this.topics = topics;
    return this;
  }

   /**
   * include topics in template repo
   * @return topics
  **/
  @Schema(description = "include topics in template repo")
  public Boolean isTopics() {
    return topics;
  }

  public void setTopics(Boolean topics) {
    this.topics = topics;
  }

  public GenerateRepoOption webhooks(Boolean webhooks) {
    this.webhooks = webhooks;
    return this;
  }

   /**
   * include webhooks in template repo
   * @return webhooks
  **/
  @Schema(description = "include webhooks in template repo")
  public Boolean isWebhooks() {
    return webhooks;
  }

  public void setWebhooks(Boolean webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateRepoOption generateRepoOption = (GenerateRepoOption) o;
    return Objects.equals(this.avatar, generateRepoOption.avatar) &&
        Objects.equals(this.defaultBranch, generateRepoOption.defaultBranch) &&
        Objects.equals(this.description, generateRepoOption.description) &&
        Objects.equals(this.gitContent, generateRepoOption.gitContent) &&
        Objects.equals(this.gitHooks, generateRepoOption.gitHooks) &&
        Objects.equals(this.labels, generateRepoOption.labels) &&
        Objects.equals(this.name, generateRepoOption.name) &&
        Objects.equals(this.owner, generateRepoOption.owner) &&
        Objects.equals(this._private, generateRepoOption._private) &&
        Objects.equals(this.protectedBranch, generateRepoOption.protectedBranch) &&
        Objects.equals(this.topics, generateRepoOption.topics) &&
        Objects.equals(this.webhooks, generateRepoOption.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatar, defaultBranch, description, gitContent, gitHooks, labels, name, owner, _private, protectedBranch, topics, webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateRepoOption {\n");
    
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gitContent: ").append(toIndentedString(gitContent)).append("\n");
    sb.append("    gitHooks: ").append(toIndentedString(gitHooks)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    protectedBranch: ").append(toIndentedString(protectedBranch)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
