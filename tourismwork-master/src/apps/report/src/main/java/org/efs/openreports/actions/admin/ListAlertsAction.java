/*
 * Copyright (C) 2006 Erik Swenson - erik@oreports.com
 * 
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 * 
 * You should have reserved a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 *  
 */

package org.efs.openreports.actions.admin;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import org.efs.openreports.providers.AlertProvider;
import org.efs.openreports.providers.ProviderException;

public class ListAlertsAction extends ActionSupport  
{	
    private static final long serialVersionUID = 6825530119216289580L;

    private List reportAlerts;

	private AlertProvider alertProvider;

	public List getReportAlerts()
	{		
		return reportAlerts;		
	}

	public String execute()
	{
		try
		{			
			reportAlerts = alertProvider.getReportAlerts();
		}
		catch(ProviderException pe)
		{
			addActionError(pe.getMessage());
			return ERROR;	
		}	

		return SUCCESS;
	}	

	public void setAlertProvider(AlertProvider alertProvider)
	{
		this.alertProvider = alertProvider;
	}

}