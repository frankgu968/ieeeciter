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
public class Book extends hPublication{
    private String chapter = "";
    private String edition = "";
    private String pCity = "";
    private String country = "";
    private String publisher = "";
    private int cNum = -1;  //Chapter number
    private int sNum = -1;  //Section number
    
    public Book(int citNum, String chap, String title, String ed, String pCity,
            String country, String publisher,int yPub, int cNum, int sNum, String page)
    {
        super();
        super.setCitNum(citNum);
        super.setTitle(title);
        super.setYear(yPub);
        this.chapter = chap.trim();
        this.edition = ed.trim();
        this.pCity = pCity.trim();
        this.country = country.trim();
        this.publisher = publisher.trim();
        this.cNum = cNum;
        this.sNum = sNum;
        this.page = page;
    }
    
    //Usage: have the text area put superToString output first
    //then call the book object's getTitle()
    //finally concat the toString() 
    
    public String toString()
    {
        String output = super.toString() + ", ";
        if(chapter != "")
        {
            output += "\"" + chapter + ",\" in ";
        }
        output += "<i>"+super.getTitle()+"</i>";
        if(!edition.equals(""))
        {
            output += " (" + edition + ")";
        }
        output += ". ";
        if(!pCity.equals(""))
        {
            output += pCity + ", ";
        }
        if(!country.equals(""))
        {
            output += country;
        }
        if(!publisher.equals(""))
        {
            output += ": " + publisher + ", ";
        }
        else
        {
            output += ". ";
        }
        if(super.getYear() > 0)
        {
            output += super.getYear()+", ";
        }
        if(cNum > 0)
        {
            output += "ch. " + cNum + ", ";
        }
        if(sNum > 0)
        {
            output += "sec. " + sNum + ", ";
        }
        if(!super.page.equals(""))
        {
            output += "pp. " + page + ".";
        }
        return output;
    }
}
