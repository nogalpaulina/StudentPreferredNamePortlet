package edu.wisc.portlet.preferred.service;

import edu.wisc.portlet.preferred.form.PreferredName;
import edu.wisc.portlet.preferred.form.PreferredNameExtended;

public interface PreferredNameService {

    /**
     * Get the name preference for the person identified by the given pvi.
     *
     * If the user has no name preference, returns an unpopulated PreferredName object.
     *
     * @param pvi
     * @return a PreferredName object, whether the user prefers or not. Does not return null.
     */
    public PreferredName getPreferredName(String pvi);

    public PreferredName getPreferredName(String pvi, String legalLastName);

    public PreferredNameExtended getPreferredNameAndLegalName(String pvi);

    public PreferredNameExtended getPreferredNameAndLegalName(String pvi, PreferredName pn);

    public String getStatus(PreferredName pn);

    public void setPreferredName(PreferredName pn);

    public void updateHideSource(PreferredName pn);

    public void deletePreferredName(String pvi);

    public void deletePreferredNameAdmin(String pvi);

    public String getPviFromNetId(String netId);

}
