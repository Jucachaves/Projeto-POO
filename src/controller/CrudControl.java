/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Juliano, Mauricio, Tamara
 */
interface CrudControl {
    
    public ArrayList buscar() throws SQLException, Exception;
}
