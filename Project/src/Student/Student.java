/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Nitin
 */

    public abstract class Student {
            private String roll;
            private String name;
            private int por;
            private int credits;
            private String courseid;
            public Student(String roll,String name,int por,int credits,String courseid)
            {
                this.roll = roll;
                this.name = name;
                this.por = por;
                this.credits = credits;
                this.courseid = courseid;
            }
            public String getroll()
            {
                return roll;
            }
            public String getname()
            {
               return name;   
            }
            public int getpor()
            {
                return por;
            }
            public int getcredits()
            {
                return credits;
            }
            abstract public int eligible();
            public int getcgpa()
            {
                return -1;
            }
            public String getspe()
            {
                return "-";
            }
            public String getthar()
            {
                return "-";
            }
            public void setname(String name)
            {
                this.name = name;
            }
            public void setroll(String roll)
            {
                this.roll = roll;
            }
            public void setcredits(int credits)
            {
                this.credits = credits;
            }
            public void setpor(int por)
            {
                this.por = por;
            }
            public String getcourseid()
            {
                return courseid;
            }
    }
