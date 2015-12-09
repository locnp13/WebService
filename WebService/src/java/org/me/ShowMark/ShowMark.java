/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.ShowMark;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import org.me.entity.Student;
import org.me.model.StudentModel;

/**
 *
 * @author locnp
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class ShowMark {
    StudentModel studentModel = new StudentModel();

    /**
     * Web service operation
     * @param so_bao_danh
     * @param ho_va_ten
     * @return 
     */
    @WebMethod(operationName = "get_Student_Information")
    public Student get_Student_Information(@WebParam(name = "so_bao_danh") final String so_bao_danh, @WebParam(name = "ho_va_ten") final String ho_va_ten) {
        return studentModel.getStudent(so_bao_danh, ho_va_ten);
    }



}
