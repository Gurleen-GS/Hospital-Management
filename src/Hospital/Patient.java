/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harjot
 */
package Hospital;
public class Patient
{
    private static int idCounter=1;
    private  int id;
    private String name;
    private  int age;
    private String gender;
    public Patient(String name,String gender,int age)
    {
        this.id=idCounter++;
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public int getId()
    {
        return id;
    }
    @Override
    public String toString()
    {
        return "Patient Id "+id+", Name "+name+", Gender "+ gender+", Age "+age;
    }
}
