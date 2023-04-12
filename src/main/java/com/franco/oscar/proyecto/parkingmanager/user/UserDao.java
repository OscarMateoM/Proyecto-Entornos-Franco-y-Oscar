package com.franco.oscar.proyecto.parkingmanager.user;

/**
 * @author Franco y Oscar
 * @version 0.1
 * Contiene los datos de usuario para la creacion de usuarios
 */

public class UserDao {
    
    private String firstName;
    private String lastName1;
    private String lastName2;
    private String email;
    private String role;
    

    public UserDao() {
        this("", "", "", "", "");
    }

    public UserDao(String firstName, String lastName1, String lastName2, String email, String role) {
        this.firstName = firstName;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.email = email;
        this.role = role;
    }

    
    /** 
     * Devuelve firstName
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    
    /** 
     * Asigna firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    /** 
     * Devuelve lastName1
     * @return String
     */
    public String getLastName1() {
        return lastName1;
    }

    
    /** 
     * Asigna lastName1
     * @param lastName1
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    
    /** 
     * Devuelve lastName2
     * @return String
     */
    public String getLastName2() {
        return lastName2;
    }

    
    /** 
     * Asigna lastName2
     * @param lastName2
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    
    /** 
     * Devuelve email
     * @return String
     */
    public String getemail() {
        return email;
    }

    
    /** 
     * Asigna email
     * @param email
     */
    public void setemail(String email) {
        this.email = email;
    }

    
    /** 
     * Devuelve role
     * @return String
     */
    public String getRole() {
        return role;
    }

    
    /** 
     * Asigna role
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }


}
