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

package org.efs.openreports.util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.LocaleProvider;
import com.opensymphony.xwork2.TextProvider;
import com.opensymphony.xwork2.TextProviderFactory;
import java.util.Locale;
import org.displaytag.decorator.TableDecorator;
import org.efs.openreports.objects.ReportUserAlert;

public class AlertTableDecorator extends TableDecorator implements LocaleProvider
{
    private final transient TextProvider textProvider;
    
    public AlertTableDecorator()
    {
        textProvider = new TextProviderFactory().createInstance(getClass(), this);
    }
    
    public Locale getLocale()
    {       
        return ActionContext.getContext().getLocale();
    }   

    public String addRowClass() 
    {
        ReportUserAlert userAlert = (ReportUserAlert)getCurrentRowObject();

        if (userAlert.isTriggered()) return "triggered";
        return "nottriggered";
    }

    public Object getStatus()
    {
        ReportUserAlert userAlert = (ReportUserAlert)getCurrentRowObject();

        if (userAlert.isTriggered()) return textProvider.getText(LocalStrings.ALERT_PASSED);
        return textProvider.getText(LocalStrings.ALERT_FAILED);
    }
}
