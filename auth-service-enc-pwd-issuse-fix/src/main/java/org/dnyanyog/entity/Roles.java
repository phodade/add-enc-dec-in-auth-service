package org.dnyanyog.entity;


import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table
@Entity
@Component
public class Roles {
	
	@Id
	@GeneratedValue
	@Column
	private long roleId;
	
	@Column
	private String roleName;
	
	public static Roles getInstance()
	{
		return new Roles();
	}

	public long getRoleId() {
		return roleId;
	}

	public Roles setRoleId(long roleId) {
		this.roleId = roleId;
		return this;
	}

	public String getRoleName() {
		return roleName;
	}

	public Roles setRoleName(String roleName) {
		this.roleName = roleName;
		return this;
	}

}
