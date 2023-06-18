package com.rushikesh.MailIntegration;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    String name;
    int rollNo;




    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append("\n");
        sb.append(this.rollNo);
        return sb.toString();
    }
}
