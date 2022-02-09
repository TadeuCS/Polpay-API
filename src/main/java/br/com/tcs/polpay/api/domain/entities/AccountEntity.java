package br.com.tcs.polpay.api.domain.entities;

import java.time.LocalDateTime;

public class AccountEntity {
	private String id;
	private String accessMode;
	private LocalDateTime dtCreation;
	private LocalDateTime dtExpiration;

	public AccountEntity(String id, String accessMode, LocalDateTime dtCreation, LocalDateTime dtExpiration) {
		super();
		this.id = id;
		this.accessMode = accessMode;
		this.dtCreation = dtCreation;
		this.dtExpiration = dtExpiration;
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
		return "Account [id=" + id + ", accessMode=" + accessMode + ", dtCreation=" + dtCreation + ", dtExpiration="
				+ dtExpiration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountEntity other = (AccountEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
