/*
 * Copyright (C) 2009 Erik Swenson - erik@oreports.com
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

package org.efs.openreports.util.displaytag;

import org.displaytag.tags.TableTag;
import org.displaytag.util.RequestHelper;

public class MockDisplayTableTag extends TableTag 
{	 
	private static final long serialVersionUID = 1L;

	// override in order to prevent NullPointer when this method is executed outside of a real PageContext.	
	protected void initHref(RequestHelper requestHelper) {}
}
