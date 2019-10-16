package com.wronakrystian.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USERS")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userID")
	private Long id;
	
	@Column(name="name")
	@NotNull
	private String name;
	
	@Column(name="lastName")
	@NotNull
	private String lastName;
	
	@Column(name="email")
	@NotNull
	private String email;
	
	@Column(name="password")
	@NotNull
	private String password;
	
	/**
	 * 0 - account active, 1 - account no active
	 */
	@Column(name="active")
	@NotNull
	private int active;
	
	@ManyToMany
	@JoinTable(name = "USERS_ROLES",joinColumns = @JoinColumn(name="userID"),inverseJoinColumns = @JoinColumn(name="roleID"))
	private Set<Role> roles;
	
	/**
	 * update or edit
	 */
	@Transient
	private String operation;
	
	//CONSTRUCTORS
	
	/**
	 * No arguments constructor
	 * 
	 */
	public User() {
		
	}
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param lastName
	 * @param email
	 * @param password
	 * @param active
	 * @param roles
	 * @param operation
	 */
	public User(@NotNull String name, @NotNull String lastName, @NotNull String email, @NotNull String password,
			@NotNull int active, Set<Role> roles, String operation) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.active = active;
		this.roles = roles;
		this.operation = operation;
	}

	//GETTERS AND SETTERS
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
