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
 */
public class Handbook extends hPublication{
    protected String edition = "";
    protected String company = "";
    protected String city = "";
    protected String state = "";
    private String page = "";
    
    public Handbook(int citNum, String title, String edition, String company, String city, 
            String state, int year, String page)
    {
        super();
        super.setCitNum(citNum);
        super.setTitle(title);
        this.edition = edition.trim();
        this.company = company.trim();
        this.city = city.trim();
        this.state = state.trim();
        super.setYear(year);
        this.page = page;
    }
    
    public String toString()
    {
        //Safety housekeeping operations
        super.setPage("");
        super.setAuthorFlag(false);
        super.clrAuthor();
        
        String output = super.toString() + "<i>" + super.getTitle() + "</i>";
        if(!edition.equals(""))
        {
            output += ", " + edition + " ed.";
        }
        if(!company.equals(""))
        {
            output += ", " + company;
        }
        if(!city.equals(""))
        {
            output += ", " + city;
        }
        if(!state.equals(""))
        {
            output += ", " + state;
        }
        if(super.getYear() > 0)
        {
            output += ", " + super.getYear();
        }
        if(!this.page.equals(""))
        {
            output += ", pp. " + this.page + ".";
        }
        return output;
    }
            
    
}
