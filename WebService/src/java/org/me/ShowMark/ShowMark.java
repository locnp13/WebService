/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.ShowMark;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import org.me.entity.Student;

/**
 *
 * @author locnp
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class ShowMark {



    /**
     * Web service operation
     */
    @WebMethod(operationName = "show_Student")
    public Student show_Student() {
        Student student= new Student();
        student.setSo_bao_danh("011111");
        student.setHo_va_ten("Nguyen Phuc Loc ");
        student.setKhoi_nganh("A");
        student.setDiem_mon_1(10);
        student.setDiem_mon_2(10);
        student.setDiem_mon_3(10);
        return student;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "get_Student_Information")
    public Student get_Student_Information(String so_bao_danh) {
        //TODO write your implementation code here:
        return null;
    }
}
