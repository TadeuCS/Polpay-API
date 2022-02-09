package br.com.tcs.polpay.api.infrastructure.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import br.com.tcs.polpay.api.domain.entities.AccountEntity;

@Document
public class AccountMongoModel extends AccountEntity {

	@Id
	private String id;
	@Field(name = "access_mode")
	private String accessMode;
	@Field("dt_creation")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime dtCreation;
	@Field("dt_expiration")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime dtExpiration;

	public AccountMongoModel(String id, String accessMode, LocalDateTime dtCreation, LocalDateTime dtExpiration) {
		super(id, accessMode, dtCreation, dtExpiration);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccessMode() {
		return accessMode;
	}

	public void setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	public LocalDateTime getDtCreation() {
		return dtCreation;
	}

	public void setDtCreation(LocalDateTime dtCreation) {
		this.dtCreation = dtCreation;
	}

	public LocalDateTime getDtExpiration() {
		return dtExpiration;
	}

	public void setDtExpiration(LocalDateTime dtExpiration) {
		this.dtExpiration = dtExpiration;
	}

	@Override
	public String toString() {
		return "AccountMongoModel [id=" + id + ", accessMode=" + accessMode + ", dtCreation=" + dtCreation
				+ ", dtExpiration=" + dtExpiration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountMongoModel other = (AccountMongoModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
