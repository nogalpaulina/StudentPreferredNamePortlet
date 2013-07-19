package edu.wisc.portlet.preferred.dao;

import edu.wisc.portlet.preferred.form.PreferredName;

public interface PreferredNameDao {
	public PreferredName getPreferredName();
	
	public boolean isPending();
	
	public void setPreferredName(PreferredName pn);
}
