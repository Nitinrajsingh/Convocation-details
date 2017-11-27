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
class PGstudent extends Student
        {
            private String spe;
            private int cgpa;
            private String thar;
            private String dep;
            PGstudent(String roll,String name,String dep,String spe,int por,int cgpa,int credits,String thar,String courseid)
            {
                super(roll,name,por,credits,courseid);
                this.spe = spe;
                this.cgpa = cgpa;
                this.thar = thar;
                this.dep = dep;  
            }
            public int eligible()
            {
                if(super.getpor()>=2&&super.getpor()<=4&&super.getcredits()>=80)
                    return 1;
                return 0;
            }
            public String getspe()
            {
                return spe;
            }
            public int getcgpa()
            {
                return cgpa;
            }
            public String getthar()
            {
                return thar;
            }
            public String getdep()
            {
                return dep;
            }
        }

