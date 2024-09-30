
package com.hms.controller;

import com.hms.model.*;
import com.hms.view.*;

/**
 *
 * @MD. JOBAYER ISLAM
 */
public class HospitalManagementSoftware {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Home().setVisible(true);
        
//        LabTest labTest = new LabTest();
//        System.out.println(labTest.returnLabTestInfo());
                
        PathologicalTest pT = new PathologicalTest();
        System.out.println(pT.returnLabTestInfo());

        PathologicalTest pTest = new PathologicalTest("CBC",300,true,"chemical");
        System.out.println(pTest.returnLabTestInfo());

        RadiologicalTest rTest = new RadiologicalTest("X-ray",400,true,"2x4");
        System.out.println(rTest.returnLabTestInfo());
    } 
}
