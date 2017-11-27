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
class PhDstudent extends Student
        {
            private String thar;
            PhDstudent(String roll,String name,int por,int credits,String thar,String courseid)
            {
                super(roll,name,por,credits,courseid);
                this.thar =thar;
            }
            public int eligible()
            {
                if(super.getpor()>=2&&super.getpor()<=6&&super.getcredits()>=64)
                    return 1;
                return 0;
            }
            public String getthar()
            {
                return thar;
            }
        }

