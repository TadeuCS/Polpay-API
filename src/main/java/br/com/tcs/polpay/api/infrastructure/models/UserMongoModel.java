package br.com.tcs.polpay.api.infrastructure.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import br.com.tcs.polpay.api.domain.entities.AccountEntity;
import br.com.tcs.polpay.api.domain.entities.UserEntity;

@Document
public class UserMongoModel extends UserEntity{
	@Id
	private String id;
	private String name;
	private String rule;
	@Field(name = "last_name")
	private String lastName;
	private String email;
	@Field(name = "avatar_url")
	private String avatarUrl;
	@Field(name = "account_id")
	private String accountId;
	
	public UserMongoModel(String id, String name, String rule, String lastName, String email, String avatarUrl,
			AccountEntity account) {
		super(id, name, rule, lastName, email, avatarUrl, account);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "UserMongoModel [id=" + id + ", name=" + name + ", rule=" + rule + ", lastName=" + lastName + ", email="
				+ email + ", avatarUrl=" + avatarUrl + ", accountId=" + accountId + "]";
	}
	
}
