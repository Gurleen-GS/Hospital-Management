/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harjot
 */
package Hospital;
public class Doctor 
{
    private static int idCounter=1;
    private int id;
    private String name;
    private String speciality;
    public Doctor(String name,String speciality)
    {
        this.id=idCounter++;
        this.name=name;
        this.speciality=speciality;
    }
    public int getId()
    {
        return id;
    }
    @Override
    public String toString()
    {
        return "Doctor Id "+id+", Name "+name +", Speciality " + speciality;
    }
}
