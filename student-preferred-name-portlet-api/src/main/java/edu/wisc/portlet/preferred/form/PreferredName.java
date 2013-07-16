package edu.wisc.portlet.preferred.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class PreferredName implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    private String firstName;
    @NotNull
    private String middleName;
    
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getMiddleName() {
		return middleName;
	}



	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}



	public PreferredName() {
		
	}
	
	public PreferredName(String first, String middle) {
		this.firstName = first;
		this.middleName = middle;
	}
	
	

}
