/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vunx.webservice;

import com.vunx.entity.Student;
import com.vunx.model.StudentModel;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author vunx
 */
@WebService(serviceName = "Mark")
public class Mark {
    StudentModel studentModel = new StudentModel();
    /**
     * Web service operation
     */
    @WebMethod(operationName = "showStudentInformation")
    public Student showStudentInformation(@WebParam(name = "so_bao_danh") String so_bao_danh, @WebParam(name = "ho_va_ten") String ho_va_ten) {
        
        return studentModel.getStudent(so_bao_danh, ho_va_ten);
    }
}
