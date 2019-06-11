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

package org.efs.openreports.services;

import org.efs.openreports.services.info.AlertInfo;
import org.efs.openreports.services.input.UserInput;

/**
 * Central Interface for external access into OpenReports alert services.
 * 
 * @author Erik Swenson
 * @see AlertServiceImpl
 */

public interface AlertService
{	
	/**
	 * Get alerts for a given user
	 */	
	public AlertInfo[] getAlerts(UserInput user) throws ServiceException;	
}
