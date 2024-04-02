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
import org.threeten.bp.OffsetDateTime;
/**
 * CreateUserOption create user options
 */
@Schema(description = "CreateUserOption create user options")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-04-02T21:57:57.853188500+08:00[Asia/Hong_Kong]")

public class CreateUserOption {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("login_name")
  private String loginName = null;

  @SerializedName("must_change_password")
  private Boolean mustChangePassword = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("restricted")
  private Boolean restricted = null;

  @SerializedName("send_notify")
  private Boolean sendNotify = null;

  @SerializedName("source_id")
  private Long sourceId = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("visibility")
  private String visibility = null;

  public CreateUserOption createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * For explicitly setting the user creation timestamp. Useful when users are migrated from other systems. When omitted, the user&#x27;s creation timestamp will be set to \&quot;now\&quot;.
   * @return createdAt
  **/
  @Schema(description = "For explicitly setting the user creation timestamp. Useful when users are migrated from other systems. When omitted, the user's creation timestamp will be set to \"now\".")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CreateUserOption email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateUserOption fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @Schema(description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public CreateUserOption loginName(String loginName) {
    this.loginName = loginName;
    return this;
  }

   /**
   * Get loginName
   * @return loginName
  **/
  @Schema(description = "")
  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public CreateUserOption mustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
    return this;
  }

   /**
   * Get mustChangePassword
   * @return mustChangePassword
  **/
  @Schema(description = "")
  public Boolean isMustChangePassword() {
    return mustChangePassword;
  }

  public void setMustChangePassword(Boolean mustChangePassword) {
    this.mustChangePassword = mustChangePassword;
  }

  public CreateUserOption password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CreateUserOption restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }

   /**
   * Get restricted
   * @return restricted
  **/
  @Schema(description = "")
  public Boolean isRestricted() {
    return restricted;
  }

  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  public CreateUserOption sendNotify(Boolean sendNotify) {
    this.sendNotify = sendNotify;
    return this;
  }

   /**
   * Get sendNotify
   * @return sendNotify
  **/
  @Schema(description = "")
  public Boolean isSendNotify() {
    return sendNotify;
  }

  public void setSendNotify(Boolean sendNotify) {
    this.sendNotify = sendNotify;
  }

  public CreateUserOption sourceId(Long sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @Schema(description = "")
  public Long getSourceId() {
    return sourceId;
  }

  public void setSourceId(Long sourceId) {
    this.sourceId = sourceId;
  }

  public CreateUserOption username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(required = true, description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CreateUserOption visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @Schema(description = "")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUserOption createUserOption = (CreateUserOption) o;
    return Objects.equals(this.createdAt, createUserOption.createdAt) &&
        Objects.equals(this.email, createUserOption.email) &&
        Objects.equals(this.fullName, createUserOption.fullName) &&
        Objects.equals(this.loginName, createUserOption.loginName) &&
        Objects.equals(this.mustChangePassword, createUserOption.mustChangePassword) &&
        Objects.equals(this.password, createUserOption.password) &&
        Objects.equals(this.restricted, createUserOption.restricted) &&
        Objects.equals(this.sendNotify, createUserOption.sendNotify) &&
        Objects.equals(this.sourceId, createUserOption.sourceId) &&
        Objects.equals(this.username, createUserOption.username) &&
        Objects.equals(this.visibility, createUserOption.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, email, fullName, loginName, mustChangePassword, password, restricted, sendNotify, sourceId, username, visibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserOption {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    loginName: ").append(toIndentedString(loginName)).append("\n");
    sb.append("    mustChangePassword: ").append(toIndentedString(mustChangePassword)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    sendNotify: ").append(toIndentedString(sendNotify)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
