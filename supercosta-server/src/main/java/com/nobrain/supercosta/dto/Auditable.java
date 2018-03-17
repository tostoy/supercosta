package com.nobrain.supercosta.dto;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@ToString
public abstract class Auditable<U> {
	
	@CreatedBy
	@Getter
	@Setter
	protected U createdBy;
	
	@CreatedDate
	@Temporal(TemporalType.DATE)
	@Getter
	@Setter
	protected Date creationDate;
	
	@LastModifiedBy
	@Getter
	@Setter
	protected U lastModifiedBy;
	
	@LastModifiedDate
	@Temporal(TemporalType.DATE)
	@Getter
	@Setter
	protected Date lastModifiedDate;
}
