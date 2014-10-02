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
public class Report extends Handbook{

    private String repCode = "";
    
    public Report(int citNum, String title, String company, String city, String state, 
            String repCode, int year)
    {
        super(citNum, title.trim(),"",company.trim(),city.trim(),state.trim(),year, "");
        this.repCode = repCode.trim();
    }
    
    public String toString()
    {
        int tYear = super.getYear();
        super.setYear(-1);
        String output = "["+super.citNum + "] " + super.getAuthor() + ", \"" + super.getTitle() + "\" ";
        super.setYear(tYear);
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
        if(!repCode.equals("")){
            output += ", " + this.repCode;
        }
        if(super.getYear() > 0)
        {
            output += ", " + super.getYear();
        }
        output += ".";
        return output;
    }
}
