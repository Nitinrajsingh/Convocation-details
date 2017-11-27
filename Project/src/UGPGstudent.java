/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitin
 */
import Student.Student;
class UGPGstudent extends PGstudent
        {
            private String thar;
            UGPGstudent(String roll,String name,String dep,String spe,int por,int cgpa,int credits,String thar,String courseid)
            {
                 super(roll,name,dep,spe,por,cgpa,credits,thar,courseid);
                 this.thar= thar;
            }
            public int eligible()
            {
                if(super.getpor()>=5&&super.getpor()<=8&&super.getcredits()>=265)
                    return 1;
                return 0;
            }
            public String getthar()
            {
                return thar;
            }
        }


