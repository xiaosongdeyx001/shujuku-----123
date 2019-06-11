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

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.efs.openreports.providers.DirectoryProvider;

import com.opensymphony.xwork2.ActionSupport;

public class ImageCleanupAction extends ActionSupport  
{	
	private static final long serialVersionUID = -6328918417249571746L;

	protected static Logger log = Logger.getLogger(ImageCleanupAction.class);

	private String submitType;
	
	private DirectoryProvider directoryProvider;
		
	public String execute()
	{
		File imageTempDirectory = new File(directoryProvider.getTempDirectory());
		
		try
		{
			FileUtils.cleanDirectory(imageTempDirectory);
		}
		catch(Exception e)
		{
			addActionError(e.toString());
		}
		
		return SUCCESS;
	}

	public String getSubmitType()
	{
		return submitType;
	}

	public void setSubmitType(String submitType)
	{
		this.submitType = submitType;
	}	
	
	public void setDirectoryProvider(DirectoryProvider directoryProvider)
	{
		this.directoryProvider = directoryProvider;
	}

	
}