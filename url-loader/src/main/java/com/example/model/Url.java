package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "URL")
public class Url {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "URL_ID")
	private Long id;

	@Column(name = "SERVIE_NAME")
	private String serviceName;

	@Column(name = "SERVICE_URL")
	private String serviceUrl;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.PERSIST, CascadeType.REFRESH,
			CascadeType.DETACH }, fetch = FetchType.LAZY)
	@JoinColumn(name = "ENV_NAME")
	private Env env;

	public Url() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public Env getEnv() {
		return env;
	}

	public void setEnv(Env env) {
		this.env = env;
	}
}
