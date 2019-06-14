/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import tienda.bean.Articulos;
import clinica.conexion.Conexion;

/**
 *
 * @author Intel
 */
public class ArticulosDAO extends Conexion {
    
    public ArrayList<Articulos> listar(){
        ArrayList<Articulos>listArt= new ArrayList<>();
        String sql="Select codArt, descArt FROM ARTICULO";
        Articulos art;
        try{
            stm=cn.prepareStatement(sql);
            rs=stm.executeQuery();
            
            while(rs.next()){
                
                art=new Articulos();
                art.setCodArt(rs.getInt(1));
                art.setDescArt(rs.getString(2));
                
                listArt.add(art);
                
            }
            
        }catch(SQLException ex){
            
            return null;
            
        }
        
        
        return listArt;
        
    }
    
}
