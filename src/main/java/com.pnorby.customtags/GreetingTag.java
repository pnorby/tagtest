package com.pnorby.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.*;

public class GreetingTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        LocalDateTime theTime = LocalDateTime.now();

        if(theTime.getHour() < 12){
            out.println("Good Morning!");
        } else if (theTime.getHour() < 17){
            out.println("Good Afternoon!");
        } else {
            out.println("Good Evening!");
        }

        if(theTime.getDayOfYear() == 33){
            out.println("Happy Groundhog Day!");
        }
    }

}
