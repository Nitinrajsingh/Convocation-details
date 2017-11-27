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

class PGPhDstudent extends PhDstudent
        {
            private int cgpa;
            PGPhDstudent(String roll,String name,int por,int cgpa,int credits,String thar,String courseid)
            {
                super(roll,name, por,credits,thar,courseid);
                this.cgpa =cgpa;
            }
            public int eligible()
            {
                if(super.getpor()>=4&&super.getpor()<=7&&super.getcredits()>=138)
                    return 1;
                return 0;
            }
            public int getcgpa()
            {
                return cgpa;
            }
        }
