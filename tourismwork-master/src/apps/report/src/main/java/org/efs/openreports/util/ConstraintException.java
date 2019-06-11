/*
 * Copyright (C) 2003 Erik Swenson - erik@oreports.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have reserved a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package org.efs.openreports.util;

public class ConstraintException extends Exception
{	 	
	private static final long serialVersionUID = 6340722185477233470L;
	
	private Exception exception;
	
	public ConstraintException(String message)
  {
    super(message);
  }  
  
  public ConstraintException(Exception exception)
  {
  	super(exception.getMessage());
  	this.exception = exception;
  }
  
	public Exception getException()
	{
		return exception;
	}
}