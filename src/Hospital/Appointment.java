/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Harjot
 */
package Hospital;
public class Appointment 
{
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient,Doctor doctor,String date)
    {
        this.patient=patient;
        this.doctor=doctor;
        this.date=date;
    }

    @Override
    public String toString()
    {
        return "Appointment :[Patient : "+ patient+" Doctor: "+doctor+" Date: "+ date + "]";
    }
}

