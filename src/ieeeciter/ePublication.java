/*
 * Copyright (C) 2014 Yu Cheng Gu (Frank)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ieeeciter;

/**
 * 
 * @author Frank
 * This class describes the parent for all the online publications
 */
public class ePublication extends source{
   
    private String mPub = "";
    private int dPub = -1;
    private String edition = "";
    
    public ePublication()
    {
        super();    
    }
    
    public void setDate(int year, String month, int day)
    {
        super.setYear(year);
        this.mPub = month.trim();
        this.dPub = day;
    }

    public void setEdition(String input)
    {
        this.edition = input.trim();
    }
    
    public String getDate()
    {
        String dateStr = "";
        if(super.getYear() > 0)
        {
            dateStr += super.getYear();
            if(!mPub.equals(""))
            {
                dateStr += ", " + mPub;
                if(dPub > 0)
                {
                    dateStr += " " + dPub;
                }
            }
            dateStr = "(" + dateStr + "). ";
        }
        return dateStr;
    }
    
    public String getEdition()
    {
        return "(" + this.edition + " edition) ";
    }
    
    public String toBString()
    {
        return super.toString()   + super.getAuthor() + ", <i>" + super.getTitle() +"</i>"+ this.getDate() + "[Online]. ";
    }
    
    public String toString()
    {
        return super.toString()   + super.getAuthor() + ", <i>" + super.getTitle() + "</i>"+ this.getDate() + this.getEdition() + "[Online]. ";
    }
}
