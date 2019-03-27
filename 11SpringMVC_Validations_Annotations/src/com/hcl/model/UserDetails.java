package com.hcl.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class UserDetails {

	@NotEmpty(message="UserName  must not be blank")
	@Size(min=3,max=30,message="UserName must be between 3 to 30 characters")
    private String userName;
	
	@NotEmpty(message="password  must not be blank")
	@Size(min=5,max=8)
	private String password;
	
	@NotEmpty(message="Confirm password  must not be blank")
	@Size(min=5,max=8)
	private String confirmPassword;
	
	@DateTimeFormat(iso=ISO.DATE ,pattern="dd-MMM-yyyy")
    @NotNull @Past
    private Date birthday;

    @NotEmpty(message="email  must not be blank")
    @Email(message="Please enter a valid email")
    private String email;        

    @NotEmpty(message = "Phone should not be blank.")
    @Size(min = 10,max = 10,message="Phone number must be 10 digit")
    private String phone;

    @NotEmpty(message = "Blog should not be blank")
    @URL(message="Enter your blog URL")
    private String blog;

  

    public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
    
    
	
}
